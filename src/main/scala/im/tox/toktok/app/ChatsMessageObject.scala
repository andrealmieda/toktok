package im.tox.toktok.app

class ChatsMessageObject() {

  var typeMessage: Int = 0
  var lastMessage: String = ""
  var user: Friend = null
  var group: Group = null
  var color: Int = 0
  var colorStatus: Int = 0
  var active: Boolean = false

  def getUser(): Friend = {
    return user
  }

  def getType(): Int = {
    return typeMessage
  }

  def getGroup(): Group = {
    return group
  }

  def getLastMessage(): String = {
    return lastMessage
  }

  def getPrimaryColor(): Int = {
    return color
  }

  def getStatusColor(): Int = {
    return colorStatus
  }

  def isActive(): Boolean = {
    return active
  }

  def setActive(state: Boolean): Unit = {
    active = state
  }

  def this(group: Group, lastMessage: String) {
    this
    typeMessage = 1
    this.group = group
    this.lastMessage = lastMessage
    this.color = group.getPrimaryColor()
    this.colorStatus = group.getStatusColor()
  }

  def this(friend: Friend, lastMessage: String) {
    this
    typeMessage = 0
    this.user = friend
    this.lastMessage = lastMessage
    this.color = user.getColor()
    this.colorStatus = user.getSecondColor()
  }

}

object ChatsMessageObject {
  val loremMessage = new ChatsMessageObject(Friend.lorem, "Hello, how are you?")
  val johnMessage = new ChatsMessageObject(Friend.john, "Hello, how are you?")
  val groupMessage = new ChatsMessageObject(Group.group, "Let's Go!")
}