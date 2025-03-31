import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ReactiveFormsModule,FormsModule} from  '@angular/forms';

import { NgxPaginationModule } from 'ngx-pagination';
import { AuthModule } from './auth/auth.module';


import { MatDialogModule } from '@angular/material/dialog';
import { MatAutocompleteModule } from '@angular/material/autocomplete';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatTableModule } from '@angular/material/table';
import { MatSortModule } from '@angular/material/sort';
import { MatPaginatorModule } from '@angular/material/paginator';

import { BreadcrumbsComponent } from './shared/breadcrumbs/breadcrumbs.component';
import { FooterComponent } from './shared/footer/footer.component';
import { HeaderComponent } from './Plantillas/header/header/header.component';
import { NavbarComponent } from './shared/navbar/navbar.component';
import { SidebarComponent } from './shared/sidebar/sidebar.component';

import { BodegaComponent } from './Vistas/bodega/bodega.component';
import { ClientesComponent } from './Vistas/clientes/clientes.component';
import { EnviosComponent } from './Vistas/envios/envios.component';
import { ProductosComponent } from './Vistas/productos/productos.component';
import { RolesComponent } from './Vistas/roles/roles.component';
import { TipoBodegaComponent } from './Vistas/tipo-bodega/tipo-bodega.component';
import { TipoDocumentoComponent } from './Vistas/tipo-documento/tipo-documento.component';
import { TipoProductoComponent } from './Vistas/tipo-producto/tipo-producto.component';
import { UsuariosComponent } from './Vistas/usuarios/usuarios.component';
import { ZonasComponent } from './Vistas/zonas/zonas.component';



import { DashboardComponent } from './Vistas/dashboard/dashboard.component';

import { NuevoUsuarioComponent } from './Vistas/usuarios/nuevo-usuario/nuevo-usuario.component';
import { EditarUsuarioComponent } from './Vistas/usuarios/editar-usuario/editar-usuario.component';
import { EditarEnvioComponent } from './Vistas/envios/editar-envio/editar-envio.component';
import { NuevoEnvioComponent } from './Vistas/envios/nuevo-envio/nuevo-envio.component';
import { NuevoclienteComponent } from './Vistas/clientes/nuevocliente/nuevocliente.component';
import { EditarclienteComponent } from './Vistas/clientes/editarcliente/editarcliente.component';
import { NuevoProductoComponent } from './Vistas/productos/nuevo-producto/nuevo-producto.component';
import { EditarProductoComponent } from './Vistas/productos/editar-producto/editar-producto.component';
import { NopageFoundComponent } from './nopage-found/nopage-found.component';

@NgModule({
  declarations: [
    AppComponent,

    NopageFoundComponent,

    BreadcrumbsComponent,
    FooterComponent,


    HeaderComponent,




    BodegaComponent,
    ClientesComponent,
    EnviosComponent,
    ProductosComponent,
    RolesComponent,
    TipoBodegaComponent,
    TipoDocumentoComponent,
    TipoProductoComponent,
    UsuariosComponent,
    ZonasComponent,

    DashboardComponent,
    NuevoUsuarioComponent,
    EditarUsuarioComponent,
    EditarEnvioComponent,
    NuevoEnvioComponent,
    NuevoclienteComponent,
    EditarclienteComponent,
    NuevoProductoComponent,
    EditarProductoComponent,


  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
MatFormFieldModule,
 MatInputModule,
  MatTableModule,
   MatSortModule,
    MatPaginatorModule,
    FormsModule,
    HttpClientModule,
    MatDialogModule,
    NgxPaginationModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
