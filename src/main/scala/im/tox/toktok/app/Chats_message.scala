package im.tox.toktok.app

class Chats_message(userName : String, userStatus : String, lastMessage : String) {

  def getUserName(): String ={
    return userName
  }

  def getUserStatus(): String ={
    return userStatus
  }

  def getLastMessage(): String ={
    return lastMessage
  }

}
