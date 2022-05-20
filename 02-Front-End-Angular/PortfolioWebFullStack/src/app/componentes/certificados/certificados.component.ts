import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Certificate } from 'src/app/models/certificados';
import { CertificadosService } from 'src/app/servicios/certificados.service';
import { PortfolioApService } from 'src/app/servicios/portfolio-ap.service';

@Component({
  selector: 'app-certificados',
  templateUrl: './certificados.component.html',
  styleUrls: ['./certificados.component.css']
})
export class CertificadosComponent implements OnInit {

  public certifi: Certificate[]=[];

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

}