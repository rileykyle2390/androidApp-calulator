package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, btn_Add, btn_Sub, btn_Mul, btn_Div, btn_equal, btn_dec, btn_clear;
    EditText ed1, prev;
    double Value1 = 0.0, Value2 = 0.0;
    boolean add = false, sub = false, mul = false, div = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0 = (Button) findViewById(R.id.button0);
        btn_1 = (Button) findViewById(R.id.button1);
        btn_2 = (Button) findViewById(R.id.button2);
        btn_3 = (Button) findViewById(R.id.button3);
        btn_4 = (Button) findViewById(R.id.button4);
        btn_5 = (Button) findViewById(R.id.button5);
        btn_6 = (Button) findViewById(R.id.button6);
        btn_7 = (Button) findViewById(R.id.button7);
        btn_8 = (Button) findViewById(R.id.button8);
        btn_9 = (Button) findViewById(R.id.button9);
        btn_Add = (Button) findViewById(R.id.buttonPlus);
        btn_Sub = (Button) findViewById(R.id.buttonMinus);
        btn_Mul = (Button) findViewById(R.id.buttonMult);
        btn_Div = (Button) findViewById(R.id.buttonDiv);
        btn_equal = (Button) findViewById(R.id.buttonEqual);
        btn_dec = (Button) findViewById(R.id.buttonDec);
        btn_clear = (Button) findViewById(R.id.buttonClear);
        ed1 = (EditText) findViewById(R.id.textEdit);
        prev = (EditText) findViewById(R.id.prevInput);



        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"9");
            }
        });

        btn_dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + ".");
            }
        });


        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
                prev.setText("");
                if (add == true) {
                    add = false;
                }
                if (sub == true) {
                    sub = false;
                }
                if (mul == true) {
                    mul = false;
                }
                if (div == true) {
                    div = false;
                }
                Value1 = 0.0;
            }
        });


        btn_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Value1 = Double.parseDouble(String.valueOf(ed1.getText()));
                }
                catch(Exception ex){
                    ed1.setText(String.valueOf(Value1));
                }
                prev.setText(ed1.getText() + " + ");
                ed1.setText("");
                add = true;
                if (sub == true || mul == true || div == true) {
                    sub = false;
                    mul = false;
                    div = false;
                }
            }
        });

        btn_Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Value1 = Double.parseDouble(String.valueOf(ed1.getText()));
                }
                catch(Exception ex){
                    ed1.setText(String.valueOf(Value1));
                }
                prev.setText(ed1.getText() + " - ");
                ed1.setText("");
                sub = true;
                if (add == true || mul == true || div == true) {
                    add = false;
                    mul = false;
                    div = false;
                }
            }
        });

        btn_Mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Value1 = Double.parseDouble(String.valueOf(ed1.getText()));
                }
                catch(Exception ex){
                    ed1.setText(String.valueOf(Value1));
                }
                prev.setText(ed1.getText() + " * ");
                ed1.setText("");
                mul = true;
                if (sub == true || add == true || div == true) {
                    sub = false;
                    add = false;
                    div = false;
                }
            }
        });

        btn_Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Value1 = Double.parseDouble(String.valueOf(ed1.getText()));
                }
                catch(Exception ex){
                    ed1.setText(String.valueOf(Value1));
                }
                prev.setText(ed1.getText() + " / ");
                ed1.setText("");
                div = true;
                if (sub == true || mul == true || add == true) {
                    sub = false;
                    mul = false;
                    add = false;
                }
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Value2 = Double.parseDouble(String.valueOf(ed1.getText()));
                }
                catch(Exception ex){
                    ed1.setText(String.valueOf(Value1));
                }
                prev.setText(prev.getText() + String.valueOf(ed1.getText()));
                if (add == true) {
                    ed1.setText(String.valueOf((double)(Value1 + Value2)));
                    add = false;
                }
                else if (sub == true) {
                    ed1.setText(String.valueOf((double)(Value1 - Value2)));
                    sub = false;
                }
                else if (mul == true) {
                    ed1.setText(String.valueOf((double) (Value1 * Value2)));
                    mul = false;
                }
                else if (div == true) {
                    ed1.setText(String.valueOf((double) (Value1 / (Value2 * 1.0))));
                    div = false;
                }
                else {
                    ed1.setText(String.valueOf(Value2));
                }
                Value1 = 0.0;
                Value2 = 0.0;
            }
        });

    }

}