package im.tox.toktok.app

import android.os.Bundle
import android.support.v4.app.{Fragment, FragmentActivity}
import android.support.v7.widget.RecyclerView.LayoutManager
import android.support.v7.widget.{LinearLayoutManager, RecyclerView}
import android.view.{LayoutInflater, View, ViewGroup}
import com.melnykov.fab.FloatingActionButton
import im.tox.toktok.R

import scala.collection.mutable.ListBuffer

class ChatsFragment extends Fragment {

  override def onCreateView(inflater: LayoutInflater, container: ViewGroup, savedState: Bundle): View = {

    // Recycler View

    val view: View = inflater.inflate(R.layout.home_chats, container, false)
    val activity: FragmentActivity = getActivity

    val mChats_Recycler: RecyclerView = view.findViewById(R.id.home_chats_recycler).asInstanceOf[RecyclerView]
    val mLayoutManager: LayoutManager = new LinearLayoutManager(activity)
    mChats_Recycler.setLayoutManager(mLayoutManager)
    var a = ListBuffer[Chats_message]()

    for (b <- 1 to 10) {
      a += new Chats_message("Lorem Ipsum", "Hello Tox !!!!!", "Hello, how are you?")
    }
    val mChats_Recycler_Adapter: Home_chats_recycler_adapter = new Home_chats_recycler_adapter(a)
    mChats_Recycler.setAdapter(mChats_Recycler_Adapter)

    // FAB

    val fab: FloatingActionButton = view.findViewById(R.id.home_chats_fab).asInstanceOf[FloatingActionButton]
    fab.attachToRecyclerView(mChats_Recycler)

    return view

  }

}
