package com.example.calculator3;

import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
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

import java.util.Stack;


public class MainActivity extends AppCompatActivity {
    Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9;
    Button btn_add, btn_sub, btn_mul, btn_div, btn_sin, btn_cos, btn_sq;
    Button btn_pt, btn_eq, btn_clr, btn_del, btn_left, btn_right, btn_zh;
    boolean clr_flag;   //判断et文本框中是否清空
    Stack<Double> numberStack = null;
    Stack<Character> symbolStack = null;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        btn_add = (Button) findViewById(R.id.btn_add);
        btn_sub = (Button) findViewById(R.id.btn_sub);
        btn_mul = (Button) findViewById(R.id.btn_mul);
        btn_div = (Button) findViewById(R.id.btn_div);
        btn_sin = (Button) findViewById(R.id.btn_sin);
        btn_cos = (Button) findViewById(R.id.btn_cos);
        btn_sq = (Button) findViewById(R.id.btn_sq);
        btn_pt = (Button) findViewById(R.id.btn_pt);
        btn_eq = (Button) findViewById(R.id.btn_eq);
        btn_clr = (Button) findViewById(R.id.btn_clr);
        btn_del = (Button) findViewById(R.id.btn_del);
        btn_left = (Button) findViewById(R.id.btn_left);
        btn_right = (Button) findViewById(R.id.btn_right);
        btn_zh = (Button) findViewById(R.id.btn_zh);
        textView = (TextView) findViewById(R.id.textView);

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "0");
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "1");
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "2");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "3");
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "4");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "5");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "6");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "7");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "8");
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "9");
            }
        });

        btn_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = textView.getText().toString();
                double num = Double.parseDouble(a);
                double b = Math.toRadians(num);
                double c = Math.sin(b);
                textView.setText(String.valueOf(c));
            }
        });

        btn_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num = Integer.parseInt(textView.getText().toString());
                double b = Math.toRadians(num);
                double a = Math.cos(b);
                textView.setText(String.valueOf(a));
            }
        });
        btn_clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
            }
        });
        btn_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = textView.getText().toString();
                if (a == null || a.equals("")) {
                    a = "";
                } else {
                    a = a.substring(0, a.length() - 1);
                }
                textView.setText(a);
            }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "/");
            }
        });
        btn_eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    getResult();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        btn_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "(");
            }
        });
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "-");
            }
        });
        btn_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + ")");
            }
        });
        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "*");
            }
        });
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "+");
            }
        });
        btn_pt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + ".");
            }
        });
        btn_sq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText().toString() + "²");
            }
        });
        //弹出转换界面
        btn_zh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });


    }

    private boolean isNumber(char n) {
        if (n >= '0' && n <= '9' || n == 'Π' || n == '.') {
            return true;
        }
        return false;
    }

    private boolean comparePri(char symbol) {
        if (symbolStack.empty()) {
            return true;
        }
        char top = (char) symbolStack.peek(); // 查看堆栈顶部的对象，注意不是出栈
        if (top == '(') {
            return true;
        }
        // 比较优先级
        switch (symbol) {
            case '(': // 优先级最高
                return true;
            case '*': {
                if (top == '+' || top == '-') // 优先级比+和-高
                    return true;
                else
                    return false;
            }
            case '²': {
                if (top == '+' || top == '-')
                    return true;
                else
                    return false;
            }
            case '/': {
                if (top == '+' || top == '-') // 优先级比+和-高
                    return true;
                else
                    return false;
            }
            case '+':
                return false;
            case '-':
                return false;
            case ')': // 优先级最低
                return false;
            case '=': // 结束符
                return false;
            default:
                break;
        }
        return true;
    }


    private void getResult() throws Exception {
        String s = textView.getText().toString();//获取文本框的内容
        s = s + "=";
        numberStack = new Stack<Double>();
        symbolStack = new Stack<Character>();
        StringBuffer temp = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isNumber(ch)) {
                temp.append(ch);
            } else {
                String tempStr = temp.toString();
                if (!tempStr.isEmpty()) {
                    if (tempStr.equals("Π")) {
                        double num = 3.14;
                        numberStack.push(num);
                        temp = new StringBuffer();
                    } else {
                        double num = Double.parseDouble(tempStr);
                        numberStack.push(num);
                        temp = new StringBuffer();
                    }
                }
                while (!comparePri(ch) && !symbolStack.empty()) {
                    Double b = numberStack.pop(); // 出栈，取出数字，后进先出
                    Double a = numberStack.pop();
                    // 取出运算符进行相应运算，并把结果压栈进行下一次运算
                    switch ((char) symbolStack.pop()) {
                        case '+':
                            numberStack.push(a + b);
                            break;
                        case '-':
                            numberStack.push(a - b);
                            break;
                        case '*':
                            numberStack.push(a * b);
                            break;
                        case '/':
                            numberStack.push(a / b);
                            break;
                        case '²':
                            numberStack.push(a * a);
                            break;
                        default:
                            break;
                    }
                } // while循环结束
                if (ch != '=') {
                    symbolStack.push(new Character(ch)); // 符号入栈
                    if (ch == ')') { // 去括号
                        symbolStack.pop();
                        symbolStack.pop();
                    }
                }
            }
        }
        String a = String.valueOf(numberStack.pop());
        textView.setText(a);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.help_item:
                Toast.makeText(this, "you clicked help", Toast.LENGTH_SHORT).show();
                break;
            case R.id.exit_item:
                Toast.makeText(this, "you clicked exit", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }

}