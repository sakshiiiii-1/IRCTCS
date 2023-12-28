import { Component } from '@angular/core'
import { Router, RouterLink } from '@angular/router'
import { userLogin } from '../../classes/userLogin'
import { UserService } from '../../services/user/user.service'

import { CommonModule } from '@angular/common'
import { FormsModule } from '@angular/forms'

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [RouterLink, CommonModule, FormsModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css',
})
export class HomeComponent {
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
