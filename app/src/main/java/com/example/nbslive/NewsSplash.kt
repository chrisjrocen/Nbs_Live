package com.example.nbslive

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class NewsSplash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_splash)

        Handler().postDelayed ({
            //start activity
            startActivity(Intent( this@NewsSplash, MovieSplash::class.java))
            //finish this activity
            finish()
        },  2500)
    }
}
