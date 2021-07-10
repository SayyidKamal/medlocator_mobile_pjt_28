package team28.zuri.medlocator;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class SignIn extends AppCompatActivity {
    TextInputEditText txtNameOfStore;
    TextInputEditText txtEmail;
    TextInputEditText txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        txtNameOfStore    = findViewById(R.id.txtNameOfStore);
        txtEmail          = findViewById(R.id.txtEmail);
        txtPassword       = findViewById(R.id.txtPassword);
    }

    public void btnSignup(View view) {

    }

    public void btnSignIn(View view) {
    }
}