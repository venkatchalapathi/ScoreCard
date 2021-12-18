package com.venkat.scorecard

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences

object UtilStoreFile {
    lateinit var sharedPreferences: SharedPreferences;
    val PREF_APP="score_card"
    val MATCH_TEAM_1="team_1"
    val MATCH_TEAM_2="team_2"
    val MATCH_TOSS_WON="toss_won"
    val MATCH_IS_BATTING="is_batting"
    val MATCH_IS_BOWLING="is_bowling"
    val MATCH_IS_WIDEBALL="is_wideball"
    val MATCH_IS_NOBALL="is_noball"

    fun Initization(context: Context){
        sharedPreferences=context.getSharedPreferences(PREF_APP,Context.MODE_PRIVATE)
    }

    @SuppressLint("CommitPrefEdits")
    fun setMatchPreferences(team_1:String, team_2:String, toss_Won:String, isBating:String, isBowling:String, isWideBall:Boolean, isNoBall:Boolean){
        sharedPreferences.edit()
            .putString(MATCH_TEAM_1,team_1)
            .putString(MATCH_TEAM_2,team_2)
            .putString(MATCH_TOSS_WON,toss_Won)
            .putString(MATCH_IS_BATTING,isBating)
            .putString(MATCH_IS_BOWLING,isBowling)
            .putBoolean(MATCH_IS_WIDEBALL,isWideBall)
            .putBoolean(MATCH_IS_NOBALL, isNoBall)
            .apply()
    }
}