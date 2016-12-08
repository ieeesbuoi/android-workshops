package com.example.konstantinos.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstNum;
    EditText secondNum;
    TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNum = (EditText) findViewById(R.id.FirstNum);
        secondNum = (EditText) findViewById(R.id.SecondNum);
        total = (TextView) findViewById(R.id.TotalTextView);

        Button plusBtn = (Button) findViewById(R.id.PlusBtn);
        plusBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                float num1 = Float.parseFloat(firstNum.getText().toString());
                float num2 = Float.parseFloat(secondNum.getText().toString());

                float result = num1 + num2;
                total.setText(Float.toString(result));
            }
        });


        Button multiplyBtn = (Button) findViewById(R.id.MultiplyBtn);
        multiplyBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                float num1 = Float.parseFloat(firstNum.getText().toString());
                float num2 = Float.parseFloat(secondNum.getText().toString());

                float result = num1 * num2;
                total.setText(Float.toString(result));
            }
        });
    }
}
