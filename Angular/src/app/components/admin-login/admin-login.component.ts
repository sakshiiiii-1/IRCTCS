import { Component } from '@angular/core';
import { Router, RouterLink } from '@angular/router';
import { Admin } from '../../classes/Admin';
import { AdminLoginService } from '../../services/admin/admin-login.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-admin-login',
  standalone: true,
  imports: [RouterLink, CommonModule, FormsModule],
  templateUrl: './admin-login.component.html',
  styleUrl: './admin-login.component.css'
})
export class AdminLoginComponent {

  constructor(private adminService : AdminLoginService, private router: Router){}
  Admin = new Admin('', ''); 

  authenticateAdmin() {
    this.adminService.authenAdmin(this.Admin).subscribe(
      (data) => {
        console.log(data);
        if (data === true) {
          this.router.navigate(['/adminPanel']);
          
        } else {
          alert("Authentication failed.");
          console.error('Authentication failed.');
        }
      },
      (error) => console.error('Error in authentication:', error)
    );
  }

  // Call the authentication method when needed (e.g., on button click)
  onLoginButtonClick() {
    this.authenticateAdmin();
  }
  
  
  // return this.adminService.authenAdmin(this.Admin).subscribe(
  //   (data) => console.log(data),
  //   (error) => console.error('Error in authentication:', error)
  // );

}
