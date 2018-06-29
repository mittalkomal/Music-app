package com.example.komal.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView sufi = findViewById(R.id.sufi);
        sufi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sufiIntent = new Intent(MainActivity.this, SufiActivity.class);

                startActivity(sufiIntent);
            }
        });

        TextView pop = findViewById(R.id.pop);
        pop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent popIntent = new Intent(MainActivity.this, PopActivity.class);

                startActivity(popIntent);
            }
        });

        TextView gazal = findViewById(R.id.gazal);
        gazal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gazalIntent = new Intent(MainActivity.this, GazalActivity.class);

                startActivity(gazalIntent);
            }
        });

        TextView all = findViewById(R.id.all);
        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent allIntent = new Intent(MainActivity.this, AllActivity.class);

                startActivity(allIntent);
            }
        });

        TextView pay = findViewById(R.id.pay);
        pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent payIntent = new Intent(MainActivity.this, PaymentActivity.class);

                startActivity(payIntent);
            }
        });
    }
}
