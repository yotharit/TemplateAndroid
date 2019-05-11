package com.yotharit.foodstorystock.template

import android.content.Context

import com.yotharit.templateandroid.manager.Contextor


class SingletonTemplate private constructor() {

    private val mContext: Context

    init {
        mContext = Contextor.getInstance().context!!
    }

    companion object {

        private var instance: SingletonTemplate? = null

        fun getInstance(): SingletonTemplate {
            if (instance == null)
                instance = SingletonTemplate()
            return instance!!
        }
    }

}
