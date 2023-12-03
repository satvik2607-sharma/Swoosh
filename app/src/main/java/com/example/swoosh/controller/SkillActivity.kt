package com.example.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.R
import com.example.swoosh.utilities.EXTRA_LEAGUE
import com.example.swoosh.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.ballerSkillBtn
import kotlinx.android.synthetic.main.activity_skill.beginnerSkillBtn

class SkillActivity : BaseActivity() {

    var league=""
    var skill=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

    }

    fun onSkillFinishClick(view: View){
        if (skill != ""){
            val finishactivity=Intent(this, FinishActivity::class.java)
            finishactivity.putExtra(EXTRA_SKILL, skill)
            finishactivity.putExtra(EXTRA_LEAGUE, league)
            startActivity(finishactivity)
        }
        else{
            Toast.makeText(this, "Please select a skill.", Toast.LENGTH_SHORT).show()
        }

    }

    fun onBeginnerClick(view: View){
        ballerSkillBtn.isChecked=false
        skill="beginner"
    }
    fun onBallerClick(view: View){
        beginnerSkillBtn.isChecked=false
        skill="baller"
    }


}