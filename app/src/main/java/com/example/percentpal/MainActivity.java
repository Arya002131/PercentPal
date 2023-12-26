package com.example.percentpal;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumber;
    private EditText editTextNumber2;
    private TextView textview4;
    private Button Calculate;


    




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTextNumber = findViewById(R.id.editTextNumber);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        textview4 = findViewById(R.id.textView4);
        Calculate = findViewById(R.id.button);
        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateDiscountedPrice();
            }
        });
    }

    private void calculateDiscountedPrice() {
        // Get the original price and discount percentage from the EditText fields
        double originalPrice = Double.parseDouble(editTextNumber.getText().toString());
        double discountPercentage = Double.parseDouble(editTextNumber2.getText().toString());

        // Calculate the discounted price
        double discountAmount = (originalPrice * discountPercentage) / 100;
        double discountedPrice = originalPrice - discountAmount;

        // Display the discounted price in the TextView
        textview4.setText(getString(R.string.discounted_price_format,discountedPrice));
    }



}