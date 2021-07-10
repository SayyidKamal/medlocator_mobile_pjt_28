package team28.zuri.medlocator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import team28.zuri.medlocator.Activities.PharmacyActivity;

public class SignUp extends AppCompatActivity {

    TextInputEditText txtFullName;
    TextInputEditText txtNameOfStore;
    TextInputEditText txtStoreAddress;
    TextInputEditText txtEmail;
    TextInputEditText txtPassword;
    TextInputEditText txtConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        txtFullName        = findViewById(R.id.txtFullName);
        txtNameOfStore    = findViewById(R.id.txtNameOfStore);
        txtStoreAddress   = findViewById(R.id.txtStoreAddress);
        txtEmail          = findViewById(R.id.txtEmail);
        txtPassword       = findViewById(R.id.txtPassword);
        txtConfirmPassword= findViewById(R.id.txtConfirmPassword);
    }

    public void btnSignUp(View view) {
        Intent myIntent = new Intent(getApplicationContext(), PharmacyActivity.class);
        startActivity(myIntent);
    }
}