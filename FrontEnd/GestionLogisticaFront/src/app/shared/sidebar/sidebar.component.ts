import { Component , Inject,OnInit} from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';


import { SeguridadService } from '../../Servicios/seguridad.service';

import { UsuarioService } from '../../Servicios/usuario.service';
@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})
export class SidebarComponent  implements OnInit {



  public estado: number | undefined;
  public nombre: string | undefined;
  public rol: boolean = false;
  public menuItems: any[] = [];
  public secciontems: any[] = [];
  usuario: string | null = '';

  constructor(
    private _fb:FormBuilder,
    private api:SeguridadService,private router:Router,private uapi:UsuarioService ) {
    }

    ngOnInit() {

      this.usuario = sessionStorage.getItem('username');
      console.log('Usuario recuperado dasboard:', this.usuario);

    }




     logout() {
       location.href = 'login'; // Redirige al login
     }
}
