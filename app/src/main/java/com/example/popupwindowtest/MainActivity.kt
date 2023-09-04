package com.example.popupwindowtest

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.PopupWindow
import androidx.appcompat.app.AppCompatActivity
import com.example.popupwindowtest.databinding.ActivityMainBinding
import com.example.popupwindowtest.databinding.PopupWindowMenuBinding

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		val binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(binding.root)

		binding.top.setOnClickListener { showPopupWindow(it) }
		binding.bottom.setOnClickListener { showPopupWindow(it) }
	}

	private fun showPopupWindow(anchor: View) {
		val binding = PopupWindowMenuBinding.inflate(layoutInflater, null, false)

		val popupWindow =
			PopupWindow(binding.root, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, true)

		popupWindow.showAsDropDown(anchor)

		//dim behind
		with(popupWindow.contentView.rootView) {
			val layoutParams = layoutParams as WindowManager.LayoutParams
			layoutParams.flags = layoutParams.flags or WindowManager.LayoutParams.FLAG_DIM_BEHIND
			layoutParams.dimAmount = 0.3f
			(getSystemService(WINDOW_SERVICE) as WindowManager).updateViewLayout(this, layoutParams)
		}
	}
}