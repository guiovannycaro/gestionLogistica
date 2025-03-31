import { NgModule } from '@angular/core';
import { AuthRoutingModule } from './auth/auth-routing.module';
import { RouterModule, Routes } from '@angular/router';

import { NopageFoundComponent } from './nopage-found/nopage-found.component';

import { DashboardComponent } from './Vistas/dashboard/dashboard.component';
import { UsuariosComponent } from './Vistas/usuarios/usuarios.component';
import { ClientesComponent } from './Vistas/clientes/clientes.component';
import { EnviosComponent } from './Vistas/envios/envios.component';
import { ProductosComponent } from './Vistas/productos/productos.component';



const routes: Routes = [
  {path: '' , redirectTo:'login' , pathMatch:'full'},
  {path:'Usuarios' , component: UsuariosComponent},
  {path:'Clientes' , component: ClientesComponent},
  {path:'Envios' , component: EnviosComponent },
  {path:'Productos' , component: ProductosComponent},
  {path:'home' , component: DashboardComponent},

  {path:'**' , component: NopageFoundComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes),
    AuthRoutingModule
  ],


  exports: [RouterModule]
})
export class AppRoutingModule { }


