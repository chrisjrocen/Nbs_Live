package com.example.nbslive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MusicSplash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_music_splash)

        Handler().postDelayed ({
            //start activity
            startActivity(Intent( this@MusicSplash, MainActivity::class.java))
            //finish this activity
            finish()
        },  2500)



    }
}
