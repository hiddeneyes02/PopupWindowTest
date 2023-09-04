# PopupWindowTest

Test for bad behaviour of PopupWindows.

According to documentation [PopupWindows.showAsDropDown(anchor: View)](https://developer.android.com/reference/android/widget/PopupWindow#showAsDropDown(android.view.View)) tries to show the PopupWindow in the screen. 
That means, if for example, the anchor is at the bottom of the screen, the system will try to show PopupWindow above the anchor, since there is no space below the anchor.
