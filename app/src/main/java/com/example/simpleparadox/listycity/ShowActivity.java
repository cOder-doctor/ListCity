package com.example.simpleparadox.listycity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {
    TextView textview;
    Button btn;
    protected  void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_activity);
        textview = findViewById(R.id.cityname);
        btn = findViewById(R.id.button);

        Bundle bundle = getIntent().getExtras();

        textview.setText(bundle.getString("cityname"));

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowActivity.this.finish();
            }
        });

    }
}