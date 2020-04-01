package com.example.mycaculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double input1 =0, input2 =0;
    TextView txt1;
    boolean Add, Sub, Mul, Div, decimal, reset, del;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnAdd, btnSub, btnMul, btnDiv, btnDel, btnDot, btnReset, btnEqual, btnCE, btnOp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = (Button) findViewById(R.id.btn18);
        btn1 = (Button) findViewById(R.id.btn13);
        btn2 = (Button) findViewById(R.id.btn14);
        btn3 = (Button) findViewById(R.id.btn15);
        btn4 = (Button) findViewById(R.id.btn9);
        btn5 = (Button) findViewById(R.id.btn10);
        btn6 = (Button) findViewById(R.id.btn11);
        btn7 = (Button) findViewById(R.id.btn5);
        btn8 = (Button) findViewById(R.id.btn6);
        btn9 = (Button) findViewById(R.id.btn7);
        btnAdd = (Button) findViewById(R.id.btn16);
        btnSub = (Button) findViewById(R.id.btn12);
        btnMul = (Button) findViewById(R.id.btn8);
        btnDiv = (Button) findViewById(R.id.btn4);
        btnDel = (Button) findViewById(R.id.btn3);
        btnDot = (Button) findViewById(R.id.btn19);
        btnReset = (Button) findViewById(R.id.btn2);
        btnEqual = (Button) findViewById(R.id.btn20);
        btnCE = (Button) findViewById(R.id.btn1);
        btnOp = (Button) findViewById(R.id.btn17);

        txt1 = (TextView) findViewById(R.id.txt1);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "9");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt1.getText().length() != 0) {
                    input1 = Float.parseFloat(txt1.getText() + "");
                    Add = true;
                    decimal = false;
                    txt1.setText(null);
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt1.getText().length() != 0) {
                    input1 = Float.parseFloat(txt1.getText() + "");
                    Sub = true;
                    decimal = false;
                    txt1.setText(null);
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt1.getText().length() != 0) {
                    input1 = Float.parseFloat(txt1.getText() + "");
                    Mul = true;
                    decimal = false;
                    txt1.setText(null);
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txt1.getText().length() != 0) {
                    input1 = Float.parseFloat(txt1.getText() + "");
                    Div = true;
                    decimal = false;
                    txt1.setText(null);
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Add||Sub||Mul||Div){
                    input2 = Float.parseFloat(txt1.getText() + "");
                }
                if(Add){
                    txt1.setText(input1+input2+"");
                    Add = false;
                }
                if(Sub){
                    txt1.setText(input1+input2+"");
                    Sub = false;
                }
                if(Mul){
                    txt1.setText(input1*input2+"");
                    Mul = false;
                }
                if(Div){
                    txt1.setText(input1/input2+"");
                    Div = false;
                }
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(decimal){

                }
                else{
                    txt1.setText(txt1.getText()+".");
                    decimal = true;
                }
            }
        });
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(null);
            }
        });
        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
