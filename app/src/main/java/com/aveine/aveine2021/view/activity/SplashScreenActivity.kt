package com.aveine.aveine2021.view.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.aveine.aveine2021.R

class SplashScreenActivity : AppCompatActivity() {

    // Variables
    lateinit var topAnimation: Animation
    lateinit var bottomAnimation: Animation
    lateinit var logo_image: ImageView
    private val SPLASH_SCREEN: Long = 5000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        setContentView(R.layout.activity_splash_screen)

        //Animations
        topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)

        // Hooks
        logo_image = findViewById<ImageView>(R.id.aveine_logo)

        // set Animation
        logo_image.animation = topAnimation

        Handler().postDelayed({
            val intent = Intent(this@SplashScreenActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_SCREEN)

    }
}