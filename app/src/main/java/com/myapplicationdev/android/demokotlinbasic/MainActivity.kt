package com.myapplicationdev.android.demokotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetAge.setOnClickListener {
            val userDOB = etDOB.text.toString()
            if(userDOB.isNotEmpty()){
                val year = Calendar.getInstance().get(Calendar.YEAR)
                val age = year - userDOB.toInt()
                tvShowAge.text = "Your age is $age"
//                if(age < 18){
//                    tvCriteria.text = "Underage"
//                }else if(age in 18..65){
//                    tvCriteria.text = "Youth/ Young people"
//                }else if(age in 66..79){
//                    tvCriteria.text = "Middle-aged"
//                }
//                else if(age in 80..99){
//                    tvCriteria.text = "Elderly / Senior"
//                }else{
//                    tvCriteria.text = "Long - lived elderly"
//                }
                when (age){
                    in 0..17 -> tvCriteria.text = "Underage"
                    in 18..65 -> tvCriteria.text = "Young People"
                    in 66..79 -> tvCriteria.text = "Middle-aged"
                    in 80..99 -> tvCriteria.text = "Elderly"
                    else ->{
                        tvCriteria.text = "Long-lived elderly"
                    }

                }

            }else{
                Toast.makeText(this, "Please enter your birth year", Toast.LENGTH_SHORT).show()
            }

        }
    }
}
