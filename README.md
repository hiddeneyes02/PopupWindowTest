# PopupWindowTest

Test for bad behaviour of PopupWindows.

According to documentation [PopupWindows.showAsDropDown(anchor: View)](https://developer.android.com/reference/android/widget/PopupWindow#showAsDropDown(android.view.View)) tries to show the PopupWindow in the screen. 
That means, if for example, the anchor is at the bottom of the screen, the system will try to show PopupWindow above the anchor, since there is no space below the anchor.
![top](https://github.com/hiddeneyes02/PopupWindowTest/assets/9453054/b5d56fd7-92e9-4bae-9a70-d9f2914469fb)
![bottom](https://github.com/hiddeneyes02/PopupWindowTest/assets/9453054/8c28e36a-b15e-4768-9987-f82fd3c92285)
