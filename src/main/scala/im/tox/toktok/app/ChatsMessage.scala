package im.tox.toktok.app

class ChatsMessage(userName: String, userStatus: String, lastMessage: String) {

  def getUserName(): String = {
    return userName
  }

  def getUserStatus(): String = {
    return userStatus
  }

  def getLastMessage(): String = {
    return lastMessage
  }

}
