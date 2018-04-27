package com.zwang58.powercalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText power2,power3,power4,power5;
    Button button2, button3, button4, button5;
    TextView answer2, answer3, answer4, answer5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        power2 = findViewById(R.id.power2);
        power3 = findViewById(R.id.power3);
        power4 = findViewById(R.id.power4);
        power5 = findViewById(R.id.power5);

        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);

        answer2 = findViewById(R.id.base2Answer);
        answer3 = findViewById(R.id.base3Answer);
        answer4 = findViewById(R.id.base4Answer);
        answer5 = findViewById(R.id.base5Answer);

        power2.setText("0");
        power3.setText("0");
        power4.setText("0");
        power5.setText("0");

        answer2.setText("1.00");
        answer3.setText("1.00");
        answer4.setText("1.00");
        answer5.setText("1.00");

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!power2.getText().toString().isEmpty()) {
                    String p = power2.getText().toString();
                    double ans2 = Math.pow(2, Float.parseFloat(p));
                    answer2.setText(String.format("%.2f", ans2));
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!power3.getText().toString().isEmpty()) {
                    String p = power3.getText().toString();
                    double ans3 = Math.pow(3, Float.parseFloat(p));
                    answer3.setText(String.format("%.2f", ans3));
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!power4.getText().toString().isEmpty()) {
                    String p = power4.getText().toString();
                    double ans4 = Math.pow(4, Float.parseFloat(p));
                    answer4.setText(String.format("%.2f", ans4));
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!power5.getText().toString().isEmpty()) {
                    String p = power5.getText().toString();
                    double ans5 = Math.pow(5, Float.parseFloat(p));
                    answer5.setText(String.format("%.2f", ans5));
                }
            }
        });




    }
}
