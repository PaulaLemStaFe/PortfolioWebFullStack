import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Certificate } from 'src/app/models/certificados';
import { CertificadosService } from 'src/app/servicios/certificados.service';

@Component({
  selector: 'app-editioncertificates',
  templateUrl: './editioncertificates.component.html',
  styleUrls: ['./editioncertificates.component.css']
})
export class EditioncertificatesComponent implements OnInit {

  public certifi: Certificate[]=[];
  public editCertificate: Certificate | undefined;
  public deleteCertificate: Certificate | undefined;

  constructor(private certificadosService: CertificadosService) { }

  ngOnInit(): void {
    this.getCertificados();
  }

  public getCertificados():void{
    this.certificadosService.getCertificados().subscribe({
      next:(Response: Certificate[]) => {
        this.certifi=Response;
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }

  public onOpenModal(mode: String, certificado?: Certificate): void {
    const container = document.getElementById('main-container');
    const button = document.createElement('buttoon');
    //button.type = 'button';
    button.style.display = 'none';
    button.setAttribute('data-toggle', 'modal');
    if (mode === 'add') {
      button.setAttribute('data-target', '#addCertificateModal');
    } else if (mode === 'delete') {
      this.deleteCertificate = certificado;
      button.setAttribute('data-target', '#deleteCertificateModal');
    } else if (mode==='edit') {
      this.editCertificate = certificado;
      button.setAttribute('data-target', '#editCertificateModal');
    }
    container?.appendChild(button);
    button.click();
  }

  public onAddCertificate(addForm: NgForm): void {
    document.getElementById('addCertificateModal')?.click();
    this.certificadosService.addCertificados(addForm.value).subscribe({
      next: (response:Certificate) => {
        console.log(response);
        this.getCertificados();
        addForm.reset();
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
        addForm.reset();
      }
    })
  }

  public onEditCertificate(certificaId: number, certificate: Certificate){
    this.editCertificate=certificate;
    document.getElementById('editCertificateModal')?.click();
    this.certificadosService.editCertificate(certificaId, certificate).subscribe({
      next: (response:Certificate) => {
        console.log(response);
        this.getCertificados();
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }

  public onDeleteCertificate(idCertificate:number):void{
    this.certificadosService.deleteCertificados(idCertificate).subscribe({
      next: (response:void)=>{
        console.log(response);
        this.getCertificados();
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }

}
