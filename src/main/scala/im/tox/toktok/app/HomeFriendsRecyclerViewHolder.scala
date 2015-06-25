package im.tox.toktok.app

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.{ TextView }
import im.tox.toktok.R

final class HomeFriendsRecyclerViewHolder(itemView: View) extends RecyclerView.ViewHolder(itemView) with View.OnClickListener {

  itemView.setOnClickListener(this)

  var mUserName: TextView = itemView.findViewById(R.id.home_friends_name).asInstanceOf[TextView]
  //var mUserStatus: TextView = itemView.findViewById(R.id.home_friends_status).asInstanceOf[TextView]
  //var mUserImage : TextView

  def onClick(view: View) = {

  }

}

