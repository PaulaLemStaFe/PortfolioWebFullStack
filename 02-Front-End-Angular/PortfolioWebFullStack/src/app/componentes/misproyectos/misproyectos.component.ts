import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Project } from 'src/app/models/misproyectos';
import { MisproyectosService } from 'src/app/servicios/misproyectos.service';
import { PortfolioApService } from 'src/app/servicios/portfolio-ap.service';

@Component({
  selector: 'app-misproyectos',
  templateUrl: './misproyectos.component.html',
  styleUrls: ['./misproyectos.component.css']
})
export class MisproyectosComponent implements OnInit {
  miPortfolio: any;

  constructor(private datosPortfolio:PortfolioApService) { }

  ngOnInit(): void {
    this.datosPortfolio.obtenerDatos().subscribe(data => {
      console.log(data);
      this.miPortfolio=data;
    });
  }

//  public misproyectos: Project[]=[];

//  constructor(private misproyectosService: MisproyectosService) { }

//  ngOnInit(): void {
//    this.getMisProyectos();
//  }

//  public getMisProyectos():void{
//    this.misproyectosService.getMisProyectos().subscribe({
//      next:(Response: Project[])=> {
//        this.misproyectos=Response;
//      },
//      error:(error:HttpErrorResponse)=>{
//        alert(error.message);
//      }
//    })
//  }

}