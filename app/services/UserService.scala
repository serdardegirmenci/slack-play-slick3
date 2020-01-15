package services

import com.google.inject.Inject
import models.{User, Users}

import scala.concurrent.Future

class UserService @Inject() (users: Users) {

  def addUser(user: User): Future[String] = {
    users.add(user)
  }

  def updateUserAllCoumn(user: User): Future[Int] = {
    users.updateAllColumn(user)
  }

  def updateUser(user: User): Future[Int] = {
    users.update(user)
  }

  def deleteUser(id: Long): Future[Int] = {
    users.delete(id)
  }

  def getUser(id: Long): Future[Option[User]] = {
    users.get(id)
  }

  def listAllUsers: Future[Seq[User]] = {
    users.listAll
  }
}
