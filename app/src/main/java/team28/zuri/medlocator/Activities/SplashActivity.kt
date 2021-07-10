package team28.zuri.medlocator.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import team28.zuri.medlocator.R
import team28.zuri.medlocator.StartUpLink

class SplashActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT:Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            startActivity(Intent(this,StartUpLink::class.java))
            finish()
        }, SPLASH_TIME_OUT)
    }
}