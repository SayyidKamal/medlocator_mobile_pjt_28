package team28.zuri.medlocator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpGuide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_guide);
    }

    public void toSignUp(View view) {
        Intent myIntent = new Intent(getApplicationContext(), SignUp.class);
        startActivity(myIntent);
    }
}