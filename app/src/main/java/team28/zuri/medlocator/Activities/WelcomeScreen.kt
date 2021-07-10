package team28.zuri.medlocator.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import team28.zuri.medlocator.R
import team28.zuri.medlocator.StartUpLink

class WelcomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)
    }

    fun btnNext(view: View) {
        startActivity(Intent(this, StartUpLink::class.java))
        finish()
    }
}
