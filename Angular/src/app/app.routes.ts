import { Routes } from '@angular/router'
import { HomeComponent } from './components/home/home.component'
import { TrainComponent } from './components/train/train.component'
import { UpdateTrainComponent } from './components/train/update-train/update-train.component'
import { AdminLoginComponent } from './components/admin-login/admin-login.component'
import { AdminPanelComponent } from './components/admin-panel/admin-panel.component'
import { UserLoginComponent } from './components/user-login/user-login.component'
import { UserRegisterComponent } from './components/user-register/user-register.component'
import { SearchTrainsComponent } from './components/search-trains/search-trains.component'
import { PassengersComponent } from './components/passengers/passengers.component'
import { CartComponent } from './components/cart/cart.component'
import { PaymentComponent } from './components/payment/payment.component'
import { AdminPassengerComponent } from './components/admin-passenger/admin-passenger.component'
import { AdminUserComponent } from './components/admin-user/admin-user.component'
import { AdminStationComponent } from './components/admin-station/admin-station.component'
import { AboutUsComponent } from './components/about-us/about-us.component'

export const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'trainOperation', component: TrainComponent },
  { path: 'updateTrain', component: UpdateTrainComponent },
  { path: 'adminLogin', component: AdminLoginComponent },
  { path: 'adminPanel', component: AdminPanelComponent },
  { path: 'userLogin', component: UserLoginComponent },
  { path: 'userRegister', component: UserRegisterComponent },
  { path: 'searchTrains', component: SearchTrainsComponent },
  { path: 'passengers', component: PassengersComponent },
  { path: 'cart', component: CartComponent },
  { path: 'payment', component: PaymentComponent },
  { path: 'adminPassenger', component: AdminPassengerComponent },
  { path: 'adminUser', component: AdminUserComponent },
  { path: 'adminStation', component: AdminStationComponent },
  { path: 'aboutUs', component: AboutUsComponent },




]
