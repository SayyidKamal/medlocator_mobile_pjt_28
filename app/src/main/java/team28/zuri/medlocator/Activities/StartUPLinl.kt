package team28.zuri.medlocator

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import team28.zuri.medlocator.Activities.WelcomeScreen

class StartUpLink : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_startup_link)
    }

    fun btnSignUp(view: View?) {

    }

    fun btnFindMyMeds(view: View) {
        val myIntent = Intent(applicationContext, WelcomeScreen::class.java)
        startActivity(myIntent)}
    fun btnRegisterMyMeds(view: View) {
        val myIntent = Intent(applicationContext, SignUpGuide::class.java)
        startActivity(myIntent)
    }
}