import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit {
  logInData = {
    username: '',
    password: '',
  };

  constructor(private snack: MatSnackBar, private loginService: LoginService) {}

  ngOnInit(): void {}

  formSubmit() {
    if (
      this.logInData.username.trim() == '' ||
      this.logInData.username.trim() == null
    ) {
      this.snack.open('El nombre de usuario es requerido!!', 'Aceptar', {
        duration: 3000,
      });
      return;
    }

    if (
      this.logInData.password.trim() == '' ||
      this.logInData.password.trim() == null
    ) {
      this.snack.open('La Contraseña es requerida!!', 'Aceptar', {
        duration: 3000,
      });
      return;
    }

    this.loginService.generateToken(this.logInData).subscribe(
      (data: any) => {
        console.log(data);
        this.loginService.loginUser(data.token);
        this.loginService.getCurrentUser().subscribe((user: any) => {
          console.log(user);
        });
      },
      (error) => {
        console.log(error);
      }
    );
  }
}
