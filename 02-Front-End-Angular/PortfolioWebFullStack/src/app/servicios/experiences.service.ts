import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Experience } from '../models/experienciaslaborales';

@Injectable({
  providedIn: 'root'
})
export class ExperiencesService {

  private apiServerUrl=environment.apiBaseUrl;

  constructor(private http:HttpClient) { }

  public getExperience():Observable<Experience[]>{
    return this.http.get<Experience[]>(`${this.apiServerUrl}/experience/all`);
  }

  public createExperience(experience: Experience):Observable<Experience>{
    return this.http.post<Experience>(`${this.apiServerUrl}/experience/add`, experience);
  }

  public editExperience(experienc: Experience):Observable<Experience>{
    return this.http.put<Experience>(`${this.apiServerUrl}/experience/update`, experienc);
  }

  public deleteExperience(experienId: number):Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/experience/delete/${experienId}`);
  }
}
