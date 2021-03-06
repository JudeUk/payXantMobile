package com.payx.PayXant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoansActivity extends AppCompatActivity {

    TextView sendBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loans);

        sendBackButton = findViewById(R.id.sendBackButton);

        sendBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendBackButtonActivity();
            }
        });
    }

    private void sendBackButtonActivity() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
