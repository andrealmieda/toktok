package im.tox.toktok.app

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.{ View, ViewGroup, LayoutInflater }
import im.tox.toktok.R

class FriendsFragment extends Fragment {

  override def onCreateView(inflater: LayoutInflater, container: ViewGroup, savedState: Bundle): View = {
    return inflater.inflate(R.layout.home_friends, container, false)
  }

}
