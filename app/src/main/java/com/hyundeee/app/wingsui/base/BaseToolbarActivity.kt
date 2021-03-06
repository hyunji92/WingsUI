package com.hyundeee.app.wingsui.base

import android.os.Build
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.content.res.ResourcesCompat
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.WindowManager
import com.hyundeee.app.wingsui.R
import kotlinx.android.synthetic.main.activity_main_coordinator.*


/**
 * Created by ${hyundee} on 2017. 12. 1..
 */
open class BaseToolbarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        // 상단바 설정
        this.initStatusBarColor()
    }

    override fun setContentView(layoutResID: Int) {
        if (layoutResID != -1) super.setContentView(layoutResID)

        initToolbar()
    }

    private fun initToolbar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            setSupportActionBar(toolbar)
        }
    }

    private fun initStatusBarColor() {
        val window = window

        // 롤리팝 이상인 OS를 사용할 경우 상단바의 색상을 변경한다
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = ResourcesCompat.getColor(resources, R.color.white, theme)
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        }

        // 마시멜로우 이상일때 상단바 아이템의 색상을 어두운 색으로 변경한다
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }
    }

}