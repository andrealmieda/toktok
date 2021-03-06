package im.tox.toktok.app

import android.graphics.Color
import im.tox.toktok.R

class Friend(id: Int,userName: String, userMessage: String, userStatus: Int, color: Int, secondColor: Int, photo: Int) {

  def getUserName(): String = {
    return userName
  }

  def getUserMessage(): String = {
    return userMessage
  }

  def getUserStatus(): Int = {
    return userStatus
  }

  def getColor(): Int = {
    return color
  }

  def getSecondColor(): Int = {
    return secondColor
  }

  def getPhotoReference(): Int = {
    return photo
  }

  def getID():Int = {
    return id
  }

}

object Friend {

  val lorem = new Friend(1,"Lorem Ipsum", "Trying to TokTok", 0, Color.parseColor("#E91E63"), Color.parseColor("#C2185B"),R.drawable.lorem)
  val john = new Friend(2,"John Doe", "Up!", 0, Color.parseColor("#3F51B5"), Color.parseColor("#303F9F"), R.drawable.john)
  val jane = new Friend(3,"Jane Norman", "New Photo!", 0, Color.parseColor("#CDDC39"), Color.parseColor("#AFB42B"),R.drawable.jane)
  val bart = new Friend(4,"Bart Simpson", "In vacation \uD83D\uDEA2", 0, Color.parseColor("#FF9800"), Color.parseColor("#F57C00"), R.drawable.bart)

}