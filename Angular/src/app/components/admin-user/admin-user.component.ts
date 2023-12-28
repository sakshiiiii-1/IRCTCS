import { Component } from '@angular/core'
import { User } from '../../classes/user'
import { AdminUserService } from '../../services/adminUser/admin-user.service'
import { CommonModule } from '@angular/common'
import { FormsModule } from '@angular/forms'

@Component({
  selector: 'app-admin-user',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './admin-user.component.html',
  styleUrl: './admin-user.component.css',
})
export class AdminUserComponent {
  UserList: User[] = []

  user = new User(0, '', '', '', 0, '', '', '')
  constructor(private userAdminService: AdminUserService) {}
  ngOnInit(): void {
    this.getAllUsers()
  }
  getAllUsers(): void {
    this.userAdminService
      .getUser()
      .subscribe((data) => [(this.UserList = data), console.log(data)]),
      (error: any) => {
        console.error('Error loading User data:', error)
      }
  }

  DeleteUser(userId: number) {
    this.userAdminService
      .deleteUser(userId)
      .subscribe(() => [alert('Deleted User'), this.getAllUsers()]),
      (error: any) => {
        console.error('Error loading User data:', error)
      }
  }
}
