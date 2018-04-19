package com.example.subhojit.visualtest;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sum_ClickEvent(View v){
        Button sum_button = findViewById(R.id.sum);
        EditText e1 = (EditText)findViewById(R.id.editText);
        EditText e2 = (EditText)findViewById(R.id.editText2);
        TextView tv = (TextView)findViewById(R.id.result_textView);
        int n1= Integer.parseInt(e1.getText().toString());
        int n2= Integer.parseInt(e2.getText().toString());
        tv.setText(Integer.toString(n1 + n2));
    }

    public void substract_ClickEvent(View v){
        Button sum_button = findViewById(R.id.sum);
        EditText e1 = (EditText)findViewById(R.id.editText);
        EditText e2 = (EditText)findViewById(R.id.editText2);
        TextView tv = (TextView)findViewById(R.id.result_textView);
        int n1= Integer.parseInt(e1.getText().toString());
        int n2= Integer.parseInt(e2.getText().toString());
        tv.setText(Integer.toString(n1 - n2));
    }

    public void multiply_ClickEvent(View v){
        Button sum_button = findViewById(R.id.sum);
        EditText e1 = (EditText)findViewById(R.id.editText);
        EditText e2 = (EditText)findViewById(R.id.editText2);
        TextView tv = (TextView)findViewById(R.id.result_textView);
        int n1= Integer.parseInt(e1.getText().toString());
        int n2= Integer.parseInt(e2.getText().toString());
        tv.setText(Integer.toString(n1 * n2));
    }

    public void power_ClickEvent(View v){
        Button sum_button = findViewById(R.id.sum);
        EditText e1 = (EditText)findViewById(R.id.editText);
        EditText e2 = (EditText)findViewById(R.id.editText2);
        TextView tv = (TextView)findViewById(R.id.result_textView);
        Double n1= Double.parseDouble(e1.getText().toString());
        Double n2= Double.parseDouble(e2.getText().toString());
        tv.setText(String.valueOf(Math.pow(n1, n2)));
    }

    public void division_ClickEvent(View v){
        Button sum_button = findViewById(R.id.sum);
        EditText e1 = (EditText)findViewById(R.id.editText);
        EditText e2 = (EditText)findViewById(R.id.editText2);
        TextView tv = (TextView)findViewById(R.id.result_textView);
        int n1= Integer.parseInt(e1.getText().toString());
        int n2= Integer.parseInt(e2.getText().toString());

        if(n1 ==0 )
            tv.setText("0");
        else if (n2 ==0 )
            tv.setText("Infinity");
        else
            tv.setText(Integer.toString(n1 / n2));
    }

    public void mod_ClickEvent(View v){
        Button sum_button = findViewById(R.id.sum);
        EditText e1 = (EditText)findViewById(R.id.editText);
        EditText e2 = (EditText)findViewById(R.id.editText2);
        TextView tv = (TextView)findViewById(R.id.result_textView);
        int n1= Integer.parseInt(e1.getText().toString());
        int n2= Integer.parseInt(e2.getText().toString());
        tv.setText(Integer.toString(n1 + n2));
    }

}
