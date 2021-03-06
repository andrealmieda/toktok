// General settings
organization := "im.tox"
name := "toktok"
scalaVersion := "2.11.7"

import sbt.tox4j.lint._

Scalastyle.moduleSettings


// Dependencies.
libraryDependencies ++= Seq(
  "com.tonicartos" % "superslim"%"0.4.13",
  "com.android.support" % "appcompat-v7" % "22.2.1",
  "com.android.support" % "recyclerview-v7" % "22.2.1",
  "com.android.support" % "cardview-v7" % "22.2.1",
  "com.android.support" % "palette-v7" % "22.2.1",
  "com.android.support" % "design" % "22.2.1",
  "de.hdodenhof" % "circleimageview" % "1.3.0",
  "com.timehop.stickyheadersrecyclerview" % "library" % "0.4.1",
  "com.sothree.slidinguppanel" % "library" % "3.0.0"

  //organization.value %% "tox4j" % version.value
)

proguardOptions in Android ++= Seq(
  "-keep class * extends android.support.design.widget.CoordinatorLayout$Behavior { <init>(...); }",

  "-optimizationpasses 5",
  "-allowaccessmodification",

  "-dontwarn org.xmlpull.v1.**"
)