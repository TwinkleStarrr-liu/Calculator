package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import android.os.Bundle;

public class huansuanActivity extends AppCompatActivity {
    Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9;
    Button  btn_eq, btn_clr, btn_del;
    Button btn_m,btn_dm,btn_cm,btn_m3,btn_dm3,btn_cm3,btn_D,btn_B,btn_H,btn_O;
    private EditText et_m,et_dm,et_cm,et_m3,et_dm3,et_cm3,et_B,et_O,et_D,et_H;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.huansuan_layout);
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_eq = (Button) findViewById(R.id.btn_eq);
        btn_clr = (Button) findViewById(R.id.btn_clr);
        btn_del = (Button) findViewById(R.id.btn_del);
        btn_m=(Button)findViewById(R.id.btn_m);
        btn_m.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String s = et_m.getText().toString();
                double b=Double.parseDouble(s);
                double c=b*0.1;
                double d=b*0.01;
                et_dm.setText(String.valueOf(c));
                et_cm.setText(String.valueOf(d));



            }
        });
        btn_dm=(Button)findViewById(R.id.btn_dm);
        btn_dm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String s = et_dm.getText().toString();
                double b=Double.parseDouble(s);
                double c=b*10;
                double d=b*0.1;
                et_m.setText(String.valueOf(c));
                et_cm.setText(String.valueOf(d));



            }
        });
        btn_cm=(Button)findViewById(R.id.btn_cm);
        btn_cm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String s = et_cm.getText().toString();
                double b=Double.parseDouble(s);
                double c=b*100;
                double d=b*10;
                et_m.setText(String.valueOf(c));
                et_dm.setText(String.valueOf(d));



            }
        });
        btn_m3=(Button)findViewById(R.id.btn_m3);
        btn_m3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String s = et_m3.getText().toString();
                double b=Double.parseDouble(s);
                double c=b*0.001;
                double d=b*0.000001;
                et_dm3.setText(String.valueOf(c));
                et_cm3.setText(String.valueOf(d));



            }
        });
        btn_dm3=(Button)findViewById(R.id.btn_dm3);
        btn_dm3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String s = et_dm3.getText().toString();
                double b=Double.parseDouble(s);
                double c=b*1000;
                double d=b*0.001;
                et_m3.setText(String.valueOf(c));
                et_cm3.setText(String.valueOf(d));



            }
        });
        btn_cm3=(Button)findViewById(R.id.btn_cm3);
        btn_cm3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String s = et_cm3.getText().toString();
                double b=Double.parseDouble(s);
                double c=b*1000000;
                double d=b*1000;
                et_m3.setText(String.valueOf(c));
                et_dm3.setText(String.valueOf(d));



            }
        });
        btn_B=(Button)findViewById(R.id.btn_B);
        btn_B.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String s = et_B.getText().toString();
                String b=Integer.valueOf(s,2).toString();//2转10
                int c=Integer.parseInt(b);
                String d=Integer.toOctalString(c);//10->8
                String e=Integer.toHexString(c);//10->16

                et_O.setText(String.valueOf(d));
                et_D.setText(String.valueOf(b));
                et_H.setText(String.valueOf(e));



            }
        });
        btn_O=(Button)findViewById(R.id.btn_O);
        btn_O.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String s = et_O.getText().toString();
                String b=Integer.valueOf(s,8).toString();//8->10
                int c=Integer.parseInt(b);
                String d=Integer.toBinaryString(c);      //10进制转2进制
                String e=Integer.toHexString(c);        //10进制转16进制
                et_B.setText(String.valueOf(d));
                et_D.setText(String.valueOf(b));
                et_H.setText(String.valueOf(e));



            }
        });

        btn_D=(Button)findViewById(R.id.btn_D);
        btn_D.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String s = et_D.getText().toString();
                int a=Integer.parseInt(s);
                String b=Integer.toBinaryString(a);//10->2
                String c=Integer.toOctalString(a);      //10进制转8进制
                String d=Integer.toHexString(a);        //10进制转16进制

                et_B.setText(String.valueOf(b));
                et_O.setText(String.valueOf(c));
                et_H.setText(String.valueOf(d));



            }
        });
        btn_H=(Button)findViewById(R.id.btn_H);
        btn_H.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String s = et_H.getText().toString();
                String b=Integer.valueOf(s,16).toString();   //16进制转10进制
                int c=Integer.parseInt(b);
                String d=Integer.toBinaryString(c);     //10进制转2进制
                String e=Integer.toOctalString(c);      //10进制转8进制
                et_B.setText(String.valueOf(d));
                et_O.setText(String.valueOf(e));
                et_D.setText(String.valueOf(b));



            }
        });
        et_m=(EditText)findViewById(R.id.et_m);
        et_dm=(EditText)findViewById(R.id.et_dm);
        et_cm=(EditText)findViewById(R.id.et_cm);
        et_m3=(EditText)findViewById(R.id.et_m3);
        et_dm3=(EditText)findViewById(R.id.et_dm3);
        et_cm3=(EditText)findViewById(R.id.et_cm3);
        et_B=(EditText)findViewById(R.id.et_B);
        et_O=(EditText)findViewById(R.id.et_O);
        et_D=(EditText)findViewById(R.id.et_D);
        et_H=(EditText)findViewById(R.id.et_H);


    }
}
