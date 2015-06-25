package im.tox.toktok.app

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.widget.{ RelativeLayout, TextView }
import im.tox.toktok.R

final class HomeChatsRecyclerViewHolder(itemView: View) extends RecyclerView.ViewHolder(itemView) with View.OnClickListener {

  itemView.setOnClickListener(this)

  var mUserName: TextView = itemView.findViewById(R.id.home_item_name).asInstanceOf[TextView]
  var mUserStatus: TextView = itemView.findViewById(R.id.home_item_status).asInstanceOf[TextView]
  var mLastMessage: TextView = itemView.findViewById(R.id.home_item_last_message).asInstanceOf[TextView]
  var mLayout: RelativeLayout = itemView.findViewById(R.id.home_item_view_front).asInstanceOf[RelativeLayout]
  //var mUserImage : TextView
  //var mUnreadCounter : TextView

  def onClick(view: View) = {

  }

}
