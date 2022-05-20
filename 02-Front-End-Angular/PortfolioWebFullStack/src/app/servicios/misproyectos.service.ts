import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Project } from '../models/misproyectos';

@Injectable({
  providedIn: 'root'
})
export class MisproyectosService {

  private apiServerUrl=environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public getMisProyectos():Observable<Project[]>{
    return this.http.get<Project[]>(`${this.apiServerUrl}/project/all`);
  }

  public addProyectos(proyecto: Project):Observable<Project>{
    return this.http.post<Project>(`${this.apiServerUrl}/project/add`, proyecto);
  }

  public updateProyectos(proyect: Project):Observable<Project>{
    return this.http.put<Project>(`${this.apiServerUrl}/project/update`, proyect);
  }

  public deleteProyectos(proyectId: number):Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/project/delete/${proyectId}`);
  }
}
