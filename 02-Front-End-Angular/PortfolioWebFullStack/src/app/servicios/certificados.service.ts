import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Certificate } from '../models/certificados';

@Injectable({
  providedIn: 'root'
})
export class CertificadosService {

  private apiServerUrl = environment.apiBaseUrl;

  constructor(private http: HttpClient) { }

  public getCertificados():Observable<Certificate[]>{
    return this.http.get<Certificate[]>(`${this.apiServerUrl}/certificate/all`);
  }

  public addCertificados(certificado: Certificate):Observable<Certificate>{
    return this.http.post<Certificate>(`${this.apiServerUrl}/certificate/add`, certificado);
  }

  public editCertificate(certificaId: number, certificad: Certificate):Observable<Certificate>{
    return this.http.put<Certificate>(`${this.apiServerUrl}/certificate/edit/${certificaId}`, certificad);
  }

  public deleteCertificados(certificaId: number):Observable<void>{
    return this.http.delete<void>(`${this.apiServerUrl}/certificate/delete/${certificaId}`);
  }
}
