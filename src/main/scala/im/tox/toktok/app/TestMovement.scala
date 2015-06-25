package im.tox.toktok.app

import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.helper.ItemTouchHelper
import android.util.Log


class TestMovement(cal : ItemTouchHelper.Callback) extends ItemTouchHelper( cal ){

  override def startSwipe(viewHolder: RecyclerView.ViewHolder) = {
    viewHolder.itemView.setBackgroundColor(Color.BLACK)
  }

}
