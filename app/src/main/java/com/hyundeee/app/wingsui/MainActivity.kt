package com.hyundeee.app.wingsui

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.hyundeee.app.wingsui.adapter.DetailAdapter
import com.hyundeee.app.wingsui.base.BaseToolbarActivity
import kotlinx.android.synthetic.main.activity_main_coordinator.*

class MainActivity : BaseToolbarActivity() {

    private val detailAdapter = DetailAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_coordinator)

        collapsing_toolbar.apply {
            title = "이스타" //TODO : 기존 플레이윙즈 UI와 같이 항공사 이름이 보이도록 한다
            setExpandedTitleColor(resources.getColor(android.R.color.transparent))

            recycler_view.apply {
                layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
                adapter = detailAdapter
            }

        }
    }
}
