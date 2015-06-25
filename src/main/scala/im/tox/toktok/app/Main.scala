package im.tox.toktok.app

import android.os.Bundle
import android.support.v4.view.{ ViewPager }
import android.support.v7.app.{ ActionBarActivity }
import android.support.v7.widget.{ Toolbar }
import android.view.{ View, Menu }
import im.tox.toktok.{ R }
import it.neokree.materialtabs.{ MaterialTabListener, MaterialTabHost, MaterialTab }

class Main extends ActionBarActivity with MaterialTabListener {

  var mViewPaper: ViewPager = null
  var mMenu: Menu = null

  protected override def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    //Main toolbar Initialization

    val mToolbar: Toolbar = findViewById(R.id.home_toolbar).asInstanceOf[Toolbar]
    mToolbar.setPadding(0, getStatusBarHeight(), 0, 0);
    setSupportActionBar(mToolbar)
    getSupportActionBar().setTitle("TokTok")

    //ViewPaper and Tabs Management

    mViewPaper = findViewById(R.id.home_tab_holder).asInstanceOf[ViewPager]
    val mViewAdapter: HomeTabsAdapter = new HomeTabsAdapter(getSupportFragmentManager())
    mViewPaper.setAdapter(mViewAdapter)
    mViewPaper.setCurrentItem(1)

    val mTabs: MaterialTabHost = findViewById(R.id.home_tabs_strip).asInstanceOf[MaterialTabHost]

    mViewPaper.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener {
      override def onPageSelected(position: Int): Unit = {
        mTabs.setSelectedNavigationItem(position)
        if (position == 0) {
          mMenu.findItem(R.id.action_add_friend).setVisible(true)
          findViewById(R.id.home_friends_request).setVisibility(View.VISIBLE)
        } else {
          mMenu.findItem(R.id.action_add_friend).setVisible(false)
          findViewById(R.id.home_friends_request).setVisibility(View.GONE)
        }
      }
    })

    mTabs.addTab(mTabs.newTab().setText("Friends").setTabListener(this))
    mTabs.addTab(mTabs.newTab().setText("Chats").setTabListener(this))
    mTabs.setSelectedNavigationItem(1)

  }

  override def onCreateOptionsMenu(menu: Menu): Boolean = {
    mMenu = menu
    getMenuInflater.inflate(R.menu.menu_main, menu)
    super.onCreateOptionsMenu(menu)
  }

  override def onTabSelected(tab: MaterialTab): Unit = {

    mViewPaper.setCurrentItem(tab.getPosition)

  }

  override def onTabReselected(tab: MaterialTab): Unit = {

  }

  override def onTabUnselected(tab: MaterialTab): Unit = {

  }

  // Set the bar color below the status bar

  def getStatusBarHeight(): Int = {
    var result: Int = 0;
    val resourceId: Int = getResources().getIdentifier("status_bar_height", "dimen", "android");
    if (resourceId > 0) {
      result = getResources().getDimensionPixelSize(resourceId);
    }
    return result;
  }

}
