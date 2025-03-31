import { Injectable } from '@angular/core';
import {HttpClient,HttpHeaders} from '@angular/common/http';
import { BehaviorSubject, Observable , throwError} from 'rxjs';
import { map } from 'rxjs/operators';

import { catchError } from 'rxjs/operators';

import { Usuarios } from 'src/app/Models/usuarios';

@Injectable({
  providedIn: 'root'
})
export class SeguridadService {
  private url = "http://localhost:8080/tcc/gestion/";

  constructor(private http: HttpClient) {}


  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }



login(datos: any): Observable<any> {
  console.log("Enviando datos al servicio de autenticación:", datos);
  const direccion = `${this.url}GestionUsuarios/validarUsuarios`;

  return this.http.post<any>(direccion, datos).pipe(
    catchError((error) => {
      console.error("Error en la solicitud de login:", error);
      return throwError(() => new Error("Error en la autenticación."));
    })
  );
}


}

