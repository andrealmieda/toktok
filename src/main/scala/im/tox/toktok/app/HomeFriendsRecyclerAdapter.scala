package im.tox.toktok.app

import android.support.v7.widget.RecyclerView
import android.view.{ LayoutInflater, View, ViewGroup }
import im.tox.toktok.R

import scala.collection.mutable.ListBuffer

class HomeFriendsRecyclerAdapter(list: ListBuffer[Friends]) extends RecyclerView.Adapter[HomeFriendsRecyclerViewHolder]{

  private val items: ListBuffer[Friends] = list

  def onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): HomeFriendsRecyclerViewHolder = {
    val itemView: View = LayoutInflater.from(viewGroup.getContext).inflate(R.layout.home_friends_item, viewGroup, false)
    return new HomeFriendsRecyclerViewHolder(itemView)
  }

  def onBindViewHolder(viewHolder: HomeFriendsRecyclerViewHolder, position: Int) = {
    val item: Friends = items(position)
    viewHolder.mUserName.setText(item.getUserName())
  }

  def getItemCount(): Int = {
    return items.length
  }

}
