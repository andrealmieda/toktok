package im.tox.toktok.app

trait MovimentAdapter {

  def onItemDismiss(position: Int)

  def onItemMove(fromPosition: Int, toPosition: Int)

}