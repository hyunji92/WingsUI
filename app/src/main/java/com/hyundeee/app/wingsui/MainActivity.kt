package com.hyundeee.app.wingsui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.util.Linkify
import kotlinx.android.synthetic.main.activity_main_coordinator.*
import kotlinx.android.synthetic.main.faq_card_view.*
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_coordinator)
        collapsing_toolbar.apply {
            title = "이스타" //TODO : 기존 플레이윙즈 UI와 같이 항공사 이름이 보이도록 한다
            setExpandedTitleColor(resources.getColor(android.R.color.transparent))

            val mTransform:Linkify.TransformFilter = Linkify.TransformFilter { _, _ -> "" }
            val pattern = Pattern.compile(resources.getString(R.string.beginner_reservation))

            Linkify.addLinks(beginner_reservation_text,Linkify.WEB_URLS)
        }
    }
}
