import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ComputerSkill } from 'src/app/models/conocimientosinformaticos';
import { ConocimientosinformaticosService } from 'src/app/servicios/conocimientosinformaticos.service';
import { PortfolioApService } from 'src/app/servicios/portfolio-ap.service';

@Component({
  selector: 'app-conocimientosinformaticos',
  templateUrl: './conocimientosinformaticos.component.html',
  styleUrls: ['./conocimientosinformaticos.component.css']
})
export class ConocimientosinformaticosComponent implements OnInit {
  miPortfolio: any;

  constructor(private datosPortfolio:PortfolioApService) { }

  ngOnInit(): void {
    this.datosPortfolio.obtenerDatos().subscribe(data => {
      console.log(data);
      this.miPortfolio=data;
    });
  }

//  public conocimientosinformaticos: ComputerSkill[]=[];

//  constructor(private conocimientosinformaticosService: ConocimientosinformaticosService) { }

//  ngOnInit(): void {
//    this.getConocimientosInformaticos();
//  }

//  public getConocimientosInformaticos():void{
//    this.conocimientosinformaticosService.getConocimientosInformaticos().subscribe({
//      next:(Response: ComputerSkill[]) => {
//        this.conocimientosinformaticos=Response;
//      },
//      error:(error:HttpErrorResponse)=>{
//        alert(error.message);
//      }
//    })
//  }

}