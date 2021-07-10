package team28.zuri.medlocator.Pharmacist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import team28.zuri.medlocator.R;

public class Privacy_Security extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy__security);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Privacy & Security");
        toolbar.setNavigationIcon(R.drawable.back);
        
    }
}