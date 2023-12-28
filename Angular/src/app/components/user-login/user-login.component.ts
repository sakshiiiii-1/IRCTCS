import { CommonModule } from '@angular/common'
import { Component } from '@angular/core'
import { FormsModule } from '@angular/forms'
import { User } from '../../classes/user'
import { userLogin } from '../../classes/userLogin'
import { UserService } from '../../services/user/user.service'
import { Router } from '@angular/router'
import { error } from 'console'

@Component({
  selector: 'app-user-login',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './user-login.component.html',
  styleUrl: './user-login.component.css',
})
export class UserLoginComponent {
  User = new userLogin('', '')

  constructor(private userService: UserService, private router: Router) {}

  onLoginButtonClick() {
    return this.userService.userAuthenticate(this.User).subscribe(
      (data) => {
        console.log(data)
        if (data == true) {
          this.router.navigate(['/searchTrains'])
        } else {
          alert('User Authentication failed')
          console.error('authentication failed')
        }
      },

      (error) => console.error('Error in authentication:', error),
    )
  }
}
