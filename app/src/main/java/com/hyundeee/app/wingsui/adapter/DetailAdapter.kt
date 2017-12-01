package com.hyundeee.app.wingsui.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hyundeee.app.wingsui.R

/**
 * Created by ${hyundee} on 2017. 12. 2..
 */
class DetailAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        val TYPE_HEADER = 0
        val TYPE_RECOMMEND = 1
        val TYPE_TAG = 2
        val TYPE_TIP = 3
        val TYPE_PAY = 4
        val TYPE_FAQ = 5
        val TYPE_FOOTER = 6
    }

    override fun getItemViewType(position: Int): Int {
        return when (position) {
            0 -> TYPE_HEADER
            1 -> TYPE_RECOMMEND // TODO : ex) if(getType == "point") TYPE_RECOMMEND
            2 -> TYPE_TAG
            3 -> TYPE_TIP
            4 -> TYPE_PAY
            5 -> TYPE_FAQ
            else -> TYPE_FOOTER
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        when (viewType) {
            TYPE_HEADER -> {
                val view = LayoutInflater.from(parent?.context).inflate(R.layout.special_title_card_view, parent, false)
                return RecommendViewHolder(view)
            }
            TYPE_RECOMMEND -> {
                val view = LayoutInflater.from(parent?.context).inflate(R.layout.recommend_card_view, parent, false)
                return RecommendViewHolder(view)
            }
            TYPE_TAG -> {
                val view = LayoutInflater.from(parent?.context).inflate(R.layout.tag_card_view, parent, false)
                return RecommendViewHolder(view)
            }
            TYPE_TIP -> {
                val view = LayoutInflater.from(parent?.context).inflate(R.layout.tip_card_view, parent, false)
                return RecommendViewHolder(view)
            }
            TYPE_PAY -> {
                val view = LayoutInflater.from(parent?.context).inflate(R.layout.pay_card_view, parent, false)
                return RecommendViewHolder(view)
            }
            TYPE_FAQ -> {
                val view = LayoutInflater.from(parent?.context).inflate(R.layout.faq_card_view, parent, false)
                return RecommendViewHolder(view)
            }
            else -> {
                val view = LayoutInflater.from(parent?.context).inflate(R.layout.useful_card_view, parent, false)
                return RecommendViewHolder(view)
            }
        }
    }
    override fun getItemCount(): Int  = 7 //TODO : data의 유무에 따른 viewtype 개수

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {}

    inner class RecommendViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //TODO : 각 ViewType에 따른 viewHolder 정의해서 사용하도록 한다.
    }


}