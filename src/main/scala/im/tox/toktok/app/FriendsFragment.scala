package im.tox.toktok.app

import android.os.Bundle
import android.support.v4.app.{ FragmentActivity, Fragment }
import android.support.v7.widget.{ LinearLayoutManager, RecyclerView }
import android.support.v7.widget.RecyclerView.LayoutManager
import android.view.{ View, ViewGroup, LayoutInflater }
import im.tox.toktok.R

import scala.collection.mutable.ListBuffer

class FriendsFragment extends Fragment {

  override def onCreateView(inflater: LayoutInflater, container: ViewGroup, savedState: Bundle): View = {
    val view: View = inflater.inflate(R.layout.home_friends, container, false)
    val activity: FragmentActivity = getActivity

    //Recycler View

    val mFriends_Recycler: RecyclerView = view.findViewById(R.id.home_friends_recycler).asInstanceOf[RecyclerView]
    val mLayoutManager: LayoutManager = new LinearLayoutManager(activity)
    mFriends_Recycler.setLayoutManager(mLayoutManager)
    var a = ListBuffer[Friends]()

    for (b <- 1 to 6) {
      a += new Friends("Lorem Ipsum", 1)
    }

    val mFriends_Recycler_Adapter: HomeFriendsRecyclerAdapter = new HomeFriendsRecyclerAdapter(a)
    mFriends_Recycler.setAdapter(mFriends_Recycler_Adapter)
    mFriends_Recycler.setLayoutManager(new LinearLayoutManager(activity))

    return view
  }

}
