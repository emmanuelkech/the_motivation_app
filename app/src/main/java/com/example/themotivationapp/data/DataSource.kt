package com.example.themotivationapp.data

import com.example.themotivationapp.R
import com.example.themotivationapp.model.Motivation

class DataSource {

    fun loadMotivations() : List<Motivation>{
        return listOf<Motivation>(
            Motivation(R.string.motivate1, R.drawable.never_give_up),
            Motivation(R.string.motivate2, R.drawable.tough),
            Motivation(R.string.motivate3, R.drawable.believe),
            Motivation(R.string.motivate4, R.drawable.i_can),
            Motivation(R.string.motivate5, R.drawable.never_give_up),
            Motivation(R.string.motivate6, R.drawable.tough),
            Motivation(R.string.motivate7, R.drawable.i_can),
            Motivation(R.string.motivate8, R.drawable.believe),
            Motivation(R.string.motivate9, R.drawable.never_give_up)
                )
    }
}