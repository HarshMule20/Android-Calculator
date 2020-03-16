package com.example.scical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ast.Scope;


public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnplus, btnminus, btnmulti,
            btndivide, btnC, btndecimal, btnans;
    TextView input, output;
    String process;
//    Boolean Check_Bracket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn_zero);
        btn1 = findViewById(R.id.btn_one);
        btn2 = findViewById(R.id.btn_two);
        btn3 = findViewById(R.id.btn_three);
        btn4 = findViewById(R.id.btn_four);
        btn5 = findViewById(R.id.btn_five);
        btn6 = findViewById(R.id.btn_six);
        btn7 = findViewById(R.id.btn_seven);
        btn8 = findViewById(R.id.btn_eight);
        btn9 = findViewById(R.id.btn_nine);

//        Operation_Buttons
        btnplus = findViewById(R.id.btn_plus);
        btnminus = findViewById(R.id.btn_minus);
        btnmulti = findViewById(R.id.btn_multiply);
        btndivide = findViewById(R.id.btn_divide);

        btnans = findViewById(R.id.btn_answer);

//        Extras

        btndecimal = findViewById(R.id.btn_decimal);
        btnC = findViewById(R.id.btn_C);
//        btnpercent = findViewById(R.id.btn_percent);
//        btnbracket = findViewById(R.id.btn_bracket);

//        Input and Output
        input = findViewById(R.id.input_tv);
        output = findViewById(R.id.output_tv);
//
//        btnC.setOnClickListener(this);
//        btndecimal.setOnClickListener(this);
//        btnpercent.setOnClickListener(this);
//        btndivide.setOnClickListener(this);
//        btnmulti.setOnClickListener(this);
//        btnminus.setOnClickListener(this);
//        btn9.setOnClickListener(this);
//        btn8.setOnClickListener(this);
//        btn7.setOnClickListener(this);
//        btn6.setOnClickListener(this);
//        btn5.setOnClickListener(this);
//        btn4.setOnClickListener(this);
//        btn3.setOnClickListener(this);
//        btn2.setOnClickListener(this);
//        btn1.setOnClickListener(this);
//        btn0.setOnClickListener(this);
//        btnbracket.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (Check_Bracket){
//                    process = input.getText().toString();
//                    input.setText(process + ")");
//                    Check_Bracket = false;
//                }else{
//                    process = input.getText().toString();
//                    input.setText(process + "(");
//                    Check_Bracket = true;
//                }
//            }
//        });
//
//        btnans.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                process = input.getText().toString();
//
//                process = process.replaceAll("×","*");
//                process = process.replaceAll("%","/100");
//                process = process.replaceAll("÷","/");
//
//                Context rhino = Context.enter();
//
//                rhino.setOptimizationLevel(-1);
//
//                String finalResult = "";
//
//                try {
//                    Scriptable scriptable = rhino.initStandardObjects();
//                    finalResult = rhino.evaluateString(scriptable,process,"javascript",1,null).toString();
//                }catch (Exception e){
//                    finalResult="0";
//                }
//
//                tvOutput.setText(finalResult);
//            }
//        });
//    }
//
//    @Override
//    public void onClick(View v) {
//        switch (v.getId()){
//            case R.id.btn_C:{
//                input.setText("");
//                output.setText("");
//                break;
//            }
//            case R.id.btn_zero:{
//                process = input.getText().toString();
//                input.setText(process + "0");
//                break;
//            }
//
//            case R.id.btn_one:{
//                process = input.getText().toString();
//                input.setText(process + "1");
//                break;
//            }
//            case R.id.btn_two:{
//                process = input.getText().toString();
//                input.setText(process + "2");
//                break;
//            }
//            case R.id.btn_three:{
//                process = input.getText().toString();
//                input.setText(process + "3");
//                break;
//            }
//            case R.id.btn_four:{
//                process = input.getText().toString();
//                input.setText(process + "4");
//                break;
//            }
//            case R.id.btn_five:{
//                process = input.getText().toString();
//                input.setText(process + "5");
//                break;
//            }
//            case R.id.btn_six:{
//                process = input.getText().toString();
//                input.setText(process + "6");
//                break;
//            }
//            case R.id.btn_seven:{
//                process = input.getText().toString();
//                input.setText(process + "7");
//                break;
//            }
//            case R.id.btn_eight:{
//                process = input.getText().toString();
//                input.setText(process + "8");
//                break;
//            }
//            case R.id.btn_nine:{
//                process = input.getText().toString();
//                input.setText(process + "9");
//                break;
//            }
//            case R.id.btn_decimal:{
//                process = input.getText().toString();
//                input.setText(process + ".");
//                break;
//            }
//            case R.id.btn_plus:{
//                process = input.getText().toString();
//                input.setText(process + "+");
//                break;
//            }
//            case R.id.btn_minus:{
//                process = input.getText().toString();
//                input.setText(process + "-");
//                break;
//            }
//            case R.id.btn_multiply:{
//                process = input.getText().toString();
//                input.setText(process + "x");
//                break;
//            }
//            case R.id.btn_divide:{
//                process = input.getText().toString();
//                input.setText(process + "/");
//                break;
//            }
//            case R.id.btn_percent:{
//                process = input.getText().toString();
//                input.setText(process + "%");
//                break;
//            }
//        }
//    };
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                output.setText("");
            }
        });


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + "6");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + "9");
            }
        });

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + "+");
            }
        });


        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + "-");
            }
        });

        btnmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + "×");
            }
        });

        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + "÷");
            }
        });

        btndecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();
                input.setText(process + ".");
            }
        });

//        btnpercent.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                process = input.getText().toString();
//                input.setText(process + "%");
//            }
//        });

//        btnbracket.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                if (Check_Bracket) {
//                    process = input.getText().toString();
//                    input.setText(process + ")");
//                    Check_Bracket = false;
//                } else {
//                    process = input.getText().toString();
//                    input.setText(process + "(");
//                    Check_Bracket = true;
//                }
//
//            }
//        });

        btnans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = input.getText().toString();

                process = process.replaceAll("×", "*");
                process = process.replaceAll("÷", "/");

                Context rhino = Context.enter();

                rhino.setOptimizationLevel(-1);

                String finalResult = "";

                try {
                    Scriptable scriptable = rhino.initStandardObjects();
                    finalResult = rhino.evaluateString(scriptable, process, "javascript", 1, null).toString();
                } catch (Exception e) {
                    finalResult = "0";
                }
                String modified_finalResult = finalResult.substring(0, finalResult.indexOf('.') + 5);

                output.setText(modified_finalResult);
            }
        });

    }
}
