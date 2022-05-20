import { HttpErrorResponse } from '@angular/common/http';
import { Component, ComponentFactoryResolver, OnInit } from '@angular/core';
import { Experience } from 'src/app/models/experienciaslaborales';
import { ExperiencesService } from 'src/app/servicios/experiences.service';
import { PortfolioApService } from 'src/app/servicios/portfolio-ap.service';

@Component({
  selector: 'app-experienciaslaborales',
  templateUrl: './experienciaslaborales.component.html',
  styleUrls: ['./experienciaslaborales.component.css']
})
export class ExperienciaslaboralesComponent implements OnInit {
  miPortfolio: any;

//  constructor(private datosPortfolio:PortfolioApService, private experiencesService: ExperiencesService) { }

//  ngOnInit(): void {
//    this.datosPortfolio.obtenerDatos().subscribe(data => {
//      this.miPortfolio=data;
//    });
//    this.getExperiences();
//  }

  public experien: Experience[]=[];

  constructor(private experiencesService: ExperiencesService) { }

  ngOnInit(): void {
    this.getExperiences();
  }

  public getExperiences():void{
    this.experiencesService.getExperience().subscribe({
      next:(Response: Experience[])=> {
        this.experien=Response;
        console.log(Response);
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }

}