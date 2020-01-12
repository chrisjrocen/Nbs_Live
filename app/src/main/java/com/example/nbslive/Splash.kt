package com.example.nbslive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed ({
            //start activity
            startActivity(Intent( this@Splash, NewsSplash::class.java))
            //finish this activity
            finish()
        },  4000)//4seconds
    }
}
