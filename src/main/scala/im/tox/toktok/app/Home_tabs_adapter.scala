package im.tox.toktok.app

import android.support.v4.app.{Fragment, FragmentManager, FragmentPagerAdapter}

class Home_tabs_adapter (fm : FragmentManager) extends FragmentPagerAdapter (fm) {

  override def getItem(i : Int): Fragment ={

    i match {
      case 1 => return new ChatsFragment()
      case 0 => return new FriendsFragment()
    }

    return null

  }

  override def getCount(): Int = {
    return 2
  }

}
