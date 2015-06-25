package im.tox.toktok.app

import android.support.v7.widget.RecyclerView
import android.support.v7.widget.helper.ItemTouchHelper
import android.util.Log
import android.view.{ LayoutInflater, View, ViewGroup }
import im.tox.toktok.R

import scala.collection.mutable.ListBuffer

class HomeChatsRecyclerAdapter(list: ListBuffer[ChatsMessage]) extends RecyclerView.Adapter[ListItemViewHolder] with MovimentAdapter {

  private val items: ListBuffer[ChatsMessage] = list

  def onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListItemViewHolder = {
    val itemView: View = LayoutInflater.from(viewGroup.getContext).inflate(R.layout.home_chats_item, viewGroup, false)
    return new ListItemViewHolder(itemView)
  }

  def onBindViewHolder(viewHolder: ListItemViewHolder, position: Int) = {
    val item: ChatsMessage = items(position)
    viewHolder.mUserName.setText(item.getUserName())
    viewHolder.mUserStatus.setText(item.getUserStatus())
    viewHolder.mLastMessage.setText(item.getLastMessage())
  }

  def getItemCount(): Int = {
    return items.length
  }

  def onItemDismiss(position: Int): Unit = {
    items.remove(position)
    notifyItemRemoved(position)
  }

  def onItemMove(from: Int, to: Int): Unit = {

  }

}
