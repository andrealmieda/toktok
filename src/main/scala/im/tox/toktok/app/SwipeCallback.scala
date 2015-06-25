package im.tox.toktok.app

import android.graphics.{ Color, Canvas }
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.ViewHolder
import android.support.v7.widget.helper.ItemTouchHelper
import android.support.v7.widget.helper.ItemTouchHelper.Callback
import android.util.Log
import android.widget.RelativeLayout
import im.tox.toktok.R

class SwipeCallback(movimentAdapter: MovimentAdapter) extends ItemTouchHelper.Callback {

  private final val mMoviment: MovimentAdapter = movimentAdapter

  def onSwiped(recyclerView: RecyclerView.ViewHolder, position: Int): Unit = {
    mMoviment.onItemDismiss(recyclerView.getAdapterPosition)
  }

  def onMove(recyclerView: RecyclerView, viewHolder: ViewHolder, target: ViewHolder): Boolean = {
    mMoviment.onItemMove(viewHolder.getAdapterPosition, target.getAdapterPosition)
    return true;
  }

  override def isItemViewSwipeEnabled(): Boolean = {

    return true
  }

  override def isLongPressDragEnabled(): Boolean = {
    return false
  }

  def getMovementFlags(recyclerView: RecyclerView, viewHolder: ViewHolder): Int = {
    var dragFlags: Int = ItemTouchHelper.UP | ItemTouchHelper.DOWN;
    var swipeFlags: Int = ItemTouchHelper.START | ItemTouchHelper.END;
    return Callback.makeMovementFlags(dragFlags, swipeFlags)

  }

  override def onChildDrawOver(c: Canvas, recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder, dX: Float, dY: Float, actionState: Int, isCurrentlyActive: Boolean): Unit = {
    val view: HomeChatsRecyclerViewHolder = viewHolder.asInstanceOf[HomeChatsRecyclerViewHolder]
    viewHolder.itemView.setTranslationX(0)
    view.mLayout.setTranslationX(dX)
  }
}
