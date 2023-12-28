export class User {
  userId: number
  firstName: String
  lastName: String
  userGender: String
  userAge: number
  userCity: String
  userEmail: String
  userPassword: String

  constructor(
    userId: number,
    firstName: String,
    lastName: String,
    userGender: String,
    userAge: number,
    userCity: String,
    userEmail: String,
    userPassword: String,
  ) {
    this.userId = userId
    this.firstName = firstName
    this.lastName = lastName
    this.userGender = userGender
    this.userAge = userAge
    this.userCity = userCity
    this.userEmail = userEmail
    this.userPassword = userPassword
  }
}
