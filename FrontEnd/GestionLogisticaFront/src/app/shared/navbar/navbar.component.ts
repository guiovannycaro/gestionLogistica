import { Component , Inject,OnInit } from '@angular/core';
import { ActivatedRoute,Router } from '@angular/router';
import { FormBuilder, FormGroup } from '@angular/forms';



@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

    usuario: string | null = '';

    constructor(
      private _fb:FormBuilder,
private router:Router,) {
      }

      ngOnInit() {
        this.usuario = sessionStorage.getItem('username');
        console.log('Usuario recuperado dasboard:', this.usuario);


       }



      logout() {
        localStorage.removeItem('username');
        this.router.navigate(['/index']);
      }
}
