import { Component , OnInit} from '@angular/core';
import { FormBuilder, FormGroup, Validators,FormControl } from '@angular/forms';
import { Router } from '@angular/router';
import { SeguridadService } from '../../Servicios/seguridad.service';
import { Usuarios } from '../../Models/usuarios';
import {Login} from '../../Models/login'

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit{
  email: string ="";
  password: string ="";

  userdata:any;

  constructor(private builder: FormBuilder,private api:SeguridadService,private router:Router){}

  loginform=this.builder.group({
    username:this.builder.control('',[Validators.required,Validators.email]),
    password:this.builder.control('',[Validators.required])
  });

  ngOnInit():void{
    this.checkLocalStorage();
 }

 checkLocalStorage(){
  if(localStorage.getItem("token")){
  this.router.navigate(['home']);
  }
}

onSubmit()
{
  console.log(this.loginform.value);

 if(this.loginform.valid){

  console.log(this.loginform.value);

       this.api.login(this.loginform.value).subscribe(
       res=>{
             this.userdata = res;
             console.log(this.userdata);

             if(this.userdata === true){
              this.email = this.loginform.get('username')?.value || '';
              console.log('dato del usario ' +  this.email); // Recuperar el username
                          sessionStorage.setItem('username',this.email);
                          console.log('Usuario guardado:', sessionStorage.getItem('username')); // Verifica que el dato se guarde
                          this.router.navigate(['/home']);

             }else{
               alert('Clave Invalidad');
             }
            }

        );
  }else{
    alert('Porfavor ingrese  Informacion  valida.')
  }

}

}
