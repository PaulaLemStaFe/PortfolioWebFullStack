import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Persona } from 'src/app/models/persona';
import { BanneryquiensoyService } from 'src/app/servicios/banneryquiensoy.service';

@Component({
  selector: 'app-editionbanner',
  templateUrl: './editionbanner.component.html',
  styleUrls: ['./editionbanner.component.css']
})
export class EditionbannerComponent implements OnInit {
  miPortfolio: any;

  public persona: Persona | undefined;

  public editPersona: Persona | undefined;

  constructor(private banneryquiensoyService: BanneryquiensoyService) { }

  ngOnInit(): void {
    this.getPersona();
  }

  public getPersona():void{
    this.banneryquiensoyService.getPersona().subscribe({
      next: (response: Persona) => {
        this.persona=response;
      },
      error:(error:HttpErrorResponse)=>{
        alert(error.message);
      }
    })
  }

}
