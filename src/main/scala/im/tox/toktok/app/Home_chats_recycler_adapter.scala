package im.tox.toktok.app

import android.support.v7.widget.RecyclerView
import android.view.{LayoutInflater, View, ViewGroup}
import im.tox.toktok.R

import scala.collection.mutable.ListBuffer


class Home_chats_recycler_adapter(list : ListBuffer[Chats_message]) extends RecyclerView.Adapter[ListItemViewHolder] {

  private val items : ListBuffer[Chats_message] = list

  def onCreateViewHolder(viewGroup : ViewGroup, viewType : Int) : ListItemViewHolder = {
    val itemView : View = LayoutInflater.from(viewGroup.getContext).inflate(R.layout.home_chats_item,viewGroup,false)
    return new ListItemViewHolder(itemView)
  }

  def onBindViewHolder(viewHolder: ListItemViewHolder,position : Int) = {
    val item : Chats_message = items(position)
    viewHolder.mUserName.setText(item.getUserName())
    viewHolder.mUserStatus.setText(item.getUserStatus())
    viewHolder.mLastMessage.setText(item.getLastMessage())
  }

  def getItemCount() : Int = {
    return items.length
  }


}
