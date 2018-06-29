package com.example.komal.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AllActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);

        Button sufi = findViewById(R.id.button1);
        sufi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sufiIntent = new Intent(AllActivity.this, SufiActivity.class);

                startActivity(sufiIntent);
            }
        });
        Button pop = findViewById(R.id.button2);
        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent popIntent = new Intent(AllActivity.this, PopActivity.class);

                startActivity(popIntent);
            }
        });

        Button gazal = findViewById(R.id.button3);
        gazal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gazalIntent = new Intent(AllActivity.this, GazalActivity.class);

                startActivity(gazalIntent);
            }
        });

        Button all = findViewById(R.id.button4);
        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent allIntent = new Intent(AllActivity.this, AllActivity.class);

                startActivity(allIntent);
            }
        });

        Button pay = findViewById(R.id.pay1);
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent allIntent = new Intent(AllActivity.this, PaymentActivity.class);

                startActivity(allIntent);
            }
        });
    }
}
