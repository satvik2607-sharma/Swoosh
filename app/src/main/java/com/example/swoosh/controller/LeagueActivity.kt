package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.R
import com.example.swoosh.utilities.EXTRA_LEAGUE
import kotlinx.android.synthetic.main.activity_league.coedLeagueBtn
import kotlinx.android.synthetic.main.activity_league.mensLeagueBtn
import kotlinx.android.synthetic.main.activity_league.womenLeagueBtn

class LeagueActivity : BaseActivity() {

    var selectedLeague=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View){
        womenLeagueBtn.isChecked=false
        coedLeagueBtn.isChecked=false

        selectedLeague="mens"
    }

    fun onWomensClicked(view: View){
        mensLeagueBtn.isChecked=false
        coedLeagueBtn.isChecked=false

        selectedLeague="women"
    }

    fun onCoedClicked(view: View){
        mensLeagueBtn.isChecked=false
        womenLeagueBtn.isChecked=false
        selectedLeague="coed"
    }
    fun leagueNextClicked(view: View){

        if(selectedLeague != ""){
            val skillactivity= Intent(this, SkillActivity::class.java)
            startActivity(skillactivity)
            skillactivity.putExtra(EXTRA_LEAGUE, selectedLeague)
        }
        else{
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }

    }
}