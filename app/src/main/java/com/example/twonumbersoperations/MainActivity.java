package com.example.twonumbersoperations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1;
    EditText number2;
    TextView result;
    int ans=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = (EditText) findViewById(R.id.firstNumber);
        number2 = (EditText) findViewById(R.id.secondNumber);
        result =  (TextView) findViewById(R.id.result);

    }

    public void add(View view)
    {
        double res;
        double num1 , num2;
        num1 = Double.parseDouble(number1.getText().toString());
        num2 = Double.parseDouble(number2.getText().toString());
        res = num1 + num2;
        TextView result = findViewById(R.id.result);
        result.setText(Double.toString(res));

    }
    public void subtract(View view) {
        double res;
        double num1, num2;
        num1 = Double.parseDouble(number1.getText().toString());
        num2 = Double.parseDouble(number2.getText().toString());
        res = num1 - num2;
        TextView result = findViewById(R.id.result);
        result.setText(Double.toString(res));
    }
    public void multiply(View view) {
        double res;
        double num1, num2;
        num1 = Double.parseDouble(number1.getText().toString());
        num2 = Double.parseDouble(number2.getText().toString());
        res = num1 * num2;
        TextView result = findViewById(R.id.result);
        result.setText(Double.toString(res));
    }
    public void divide(View view) {
        double res;
        double num1, num2;
        num1 = Double.parseDouble(number1.getText().toString());
        num2 = Double.parseDouble(number2.getText().toString());
        res = num1 / num2;
        TextView result = findViewById(R.id.result);
        result.setText(Double.toString(res));
    }
}