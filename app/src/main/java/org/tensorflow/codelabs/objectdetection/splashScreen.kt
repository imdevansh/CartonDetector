package org.tensorflow.codelabs.objectdetection

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi

class splashScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
//        @Suppress("DEPRECATION")
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
//            window.insetsController?.hide(WindowInsets.Type.statusBars())
//        } else {
//            window.setFlags(
//                WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN
//            )
//        }
//        Handler().postDelayed({
//            startActivity(Intent(this, MainActivity::class.java))
//            finish()
//        },2000)
//    }
        val ivBolt: ImageView = findViewById(R.id.appLogo)
        ivBolt.alpha = 0f
        ivBolt.animate().setDuration(2500).alpha(1f).withEndAction() {
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)

        }
        val tvBolt: TextView = findViewById(R.id.appname)
        tvBolt.alpha = 0f
        tvBolt.animate().setDuration(3000).alpha(1f).withEndAction() {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}