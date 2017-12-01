package com.hyundeee.app.wingsui

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_coordinator.*

class MainActivity : BaseToolbarActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_coordinator)
        collapsing_toolbar.apply {
            title = "이스타" //TODO : 기존 플레이윙즈 UI와 같이 항공사 이름이 보이도록 한다
            setExpandedTitleColor(resources.getColor(android.R.color.transparent))

        }
    }
}
