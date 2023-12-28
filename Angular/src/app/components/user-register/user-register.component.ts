import { CommonModule } from '@angular/common'
import { Component } from '@angular/core'
import { FormsModule } from '@angular/forms'
import { User } from '../../classes/user'
import { UserService } from '../../services/user/user.service'
import { error } from 'console'
import { Router } from '@angular/router'

@Component({
  selector: 'app-user-register',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './user-register.component.html',
  styleUrl: './user-register.component.css',
})
export class UserRegisterComponent {
  User = new User(0,'', '', '', 0, '', '', '')

  constructor(private userService: UserService, private router: Router) {}

  confirmPassword: string = ''

  userRegister() {
    return this.userService.userRegister(this.User).subscribe(
      (data) => {
        console.log(data), this.router.navigate(['/'])
      },
      (error) => console.error('authentication error'),
    )
  }
}
