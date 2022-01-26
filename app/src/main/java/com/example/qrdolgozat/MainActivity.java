package com.example.qrdolgozat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.google.zxing.integration.android.IntentIntegrator;

public class MainActivity extends AppCompatActivity {
    private TextView qrTextView;
    private Button buttonScan, buttonKiir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        buttonScan.setOnClickListener(view -> {
            IntentIntegrator intentIntegrator = new IntentIntegrator(MainActivity.this);
            intentIntegrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE);
            intentIntegrator.setBeepEnabled(false);

            intentIntegrator.initiateScan();
        });
    }

    public void init() {
            qrTextView = findViewById(R.id.qrTextView);
            buttonScan = findViewById(R.id.buttonScan);
            buttonKiir = findViewById(R.id.buttonKiir);
    }
}