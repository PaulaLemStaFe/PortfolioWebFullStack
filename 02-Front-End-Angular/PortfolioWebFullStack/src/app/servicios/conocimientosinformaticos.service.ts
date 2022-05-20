import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { ComputerSkill } from '../models/conocimientosinformaticos';

@Injectable({
  providedIn: 'root'
})
export class ConocimientosinformaticosService {

  private apiServerUrl=environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public getConocimientosInformaticos():Observable<ComputerSkill[]>{
    return this.http.get<ComputerSkill[]>(`${this.apiServerUrl}/computerskill/all`);
  }

  public addConocimientosInformaticos(conocinfor: ComputerSkill):Observable<ComputerSkill>{
    return this.http.post<ComputerSkill>(`${this.apiServerUrl}/computerskill/add`, conocinfor);
  }

  public updateConocimientosInformaticos(conoinfo: ComputerSkill):Observable<ComputerSkill>{
    return this.http.put<ComputerSkill>(`${this.apiServerUrl}/computerskill/update`, conoinfo);
  }

  public deleteConocimientosInformaticos(conoinfoId: number):Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/computerskill/delete/${conoinfoId}`);
  }
}
