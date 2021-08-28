package com.bolu.PayXant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    ImageView sendView;
//    ImageView withdrawView;
    ImageView airtimeView;
    ImageView loansView;
    ImageView transactionView;
    ImageView settingsView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        sendView = findViewById(R.id.sendView);
//        withdrawView = findViewById(R.id.withdrawView);
        airtimeView = findViewById(R.id.airtimeView);
        loansView = findViewById(R.id.loansView);
        transactionView = findViewById(R.id.transactionView);
        settingsView = findViewById(R.id.settingsView);

        sendView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendViewActivity();
            }
        });

        loansView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loansViewActivity();
            }
        });

        airtimeView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                airtimeViewActivity();
            }
        });

        transactionView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transactionViewActivity();
            }
        });

        settingsView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                settingsViewActivity();
            }
        });

    }

    private void sendViewActivity() {
        Intent intent = new Intent(this, SendActivity.class);
        startActivity(intent);
    }

    private void loansViewActivity() {
        Intent intent = new Intent(this, LoansActivity.class);
        startActivity(intent);
    }
    private void airtimeViewActivity() {
        Intent intent = new Intent(this, AirtimeActivity.class);
        startActivity(intent);
    }
    private void transactionViewActivity() {
        Intent intent = new Intent(this, ActivityActivity.class);
        startActivity(intent);
    }
    private void settingsViewActivity() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

}
