import { NgModule } from '@angular/core';
import { AuthRoutingModule } from './auth/auth-routing.module';
import { RouterModule, Routes } from '@angular/router';

import { NopageFoundComponent } from './nopage-found/nopage-found.component';

import { DashboardComponent } from './Vistas/dashboard/dashboard.component';
import { UsuariosComponent } from './Vistas/usuarios/usuarios.component';
import { ClientesComponent } from './Vistas/clientes/clientes.component';
import { EnviosComponent } from './Vistas/envios/envios.component';
import { ProductosComponent } from './Vistas/productos/productos.component';
import { BodegaComponent } from './Vistas/bodega/bodega.component';
import { TipoBodegaComponent } from './Vistas/tipo-bodega/tipo-bodega.component';
import { TipoDocumentoComponent } from './Vistas/tipo-documento/tipo-documento.component';
import { TipoProductoComponent } from './Vistas/tipo-producto/tipo-producto.component';
import { ZonasComponent } from './Vistas/zonas/zonas.component';
import { RolesComponent } from './Vistas/roles/roles.component';
import { TrasportadoresComponent } from './Vistas/trasportadores/trasportadores.component';
import { OperacionComponent } from './Vistas/operacion/operacion.component';
import { SolicitudesComponent } from './Vistas/solicitudes/solicitudes.component';
import { ReportesComponent } from './Vistas/reportes/reportes.component';
import { SegimientoComponent } from './Vistas/segimiento/segimiento.component';
import { VehiculosComponent } from './Vistas/vehiculos/vehiculos.component';
import { MercanciasComponent } from './Vistas/mercancias/mercancias.component';



const routes: Routes = [
  {path: '' , redirectTo:'login' , pathMatch:'full'},
  {path:'dashboard' , component: DashboardComponent},
  {path:'dashboard/Usuarios' , component: UsuariosComponent},
  {path:'dashboard/Clientes' , component: ClientesComponent},
  {path:'dashboard/Envios' , component: EnviosComponent },
  {path:'dashboard/Productos' , component: ProductosComponent},
  {path:'dashboard/Bodega' , component: BodegaComponent},
  {path:'dashboard/Tipobodega' , component: TipoBodegaComponent},
  {path:'dashboard/Tipodocumento' , component: TipoDocumentoComponent},
  {path:'dashboard/Tipoproducto' , component: TipoProductoComponent},
  {path:'dashboard/sonas' , component: ZonasComponent},
  {path:'dashboard/Roles' , component: RolesComponent},
  {path:'dashboard/trasportadores' , component: TrasportadoresComponent},
  {path:'dashboard/Operacion' , component: OperacionComponent},
  {path:'dashboard/Solicitudes' , component: SolicitudesComponent},
  {path:'dashboard/Reportes' , component: ReportesComponent},
  {path:'dashboard/Segimiento' , component: SegimientoComponent},
  { path:'dashboard/vehiculos' , component: VehiculosComponent},
  { path:'dashboard/Mercancias' , component:   MercanciasComponent  },


  {path:'**' , component: NopageFoundComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes),
    AuthRoutingModule
  ],


  exports: [RouterModule]
})
export class AppRoutingModule { }


