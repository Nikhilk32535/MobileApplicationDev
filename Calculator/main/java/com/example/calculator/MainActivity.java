package com.example.calculator;

import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity  extends AppCompatActivity {

    private AppCompatButton buttoncut, button1, button2, button3, button4, button5, button6, button7, button8,
            button9, button0, buttoncl, buttonequal, buttonadd, buttonminus, buttondivide, buttonmulti, buttonsqr,buttondot;
    private TextView text1, textres;
    private String data, result;
    private Vibrator viberator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = (TextView) findViewById(R.id.textVie);
        textres = (TextView) findViewById(R.id.textViewresult);
        button0 = (AppCompatButton) findViewById(R.id.button0);
        button1 = (AppCompatButton) findViewById(R.id.button1);
        button2 = (AppCompatButton) findViewById(R.id.button2);
        button3 = (AppCompatButton) findViewById(R.id.button3);
        button4 = (AppCompatButton) findViewById(R.id.button4);
        button5 = (AppCompatButton) findViewById(R.id.button5);
        button6 = (AppCompatButton) findViewById(R.id.button6);
        button7 = (AppCompatButton) findViewById(R.id.button7);
        button8 = (AppCompatButton) findViewById(R.id.button8);
        button9 = (AppCompatButton) findViewById(R.id.button9);
        buttoncl = (AppCompatButton) findViewById(R.id.buttoncl);
        buttonequal = (AppCompatButton) findViewById(R.id.buttonequal);
        buttonadd = (AppCompatButton) findViewById(R.id.buttonadd);
        buttonminus = (AppCompatButton) findViewById(R.id.buttonminus);
        buttondivide = (AppCompatButton) findViewById(R.id.buttondivide);
        buttonmulti = (AppCompatButton) findViewById(R.id.buttonmulti);
        buttoncut = (AppCompatButton) findViewById(R.id.buttoncut);
        buttonsqr = (AppCompatButton) findViewById(R.id.buttonsqr);
        buttondot=(AppCompatButton) findViewById(R.id.buttondot);
        viberator=(Vibrator)getSystemService(VIBRATOR_SERVICE);

        buttonsqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viberator.vibrate(50);
                data = text1.getText().toString();

                if (data.length() > 0) {
                    if (data.contains("+") || data.contains("-") ||
                            data.contains("/") || data.contains("*")) {
                        text1.setText("");
                        textres.setText("Invalid");
                    } else {
                        int a = Integer.parseInt(data);
                        int b = a * a;
                        text1.setText("" + b);
                    }
                }
            }
        });

        buttoncut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viberator.vibrate(50);
                data = text1.getText().toString();
                if (data.length() > 0) {
                    data = data.substring(0, data.length() - 1);
                    text1.setText(data);
                }
                data = text1.getText().toString();
                res(data);
            }
        });

        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text1.getText().toString();
                text1.setText(data + ".");
                data = text1.getText().toString();
                data = text1.getText().toString();
                res(data);
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text1.getText().toString();
                text1.setText(data + "0");
                data = text1.getText().toString();
                data = text1.getText().toString();
                res(data);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text1.getText().toString();
                text1.setText(data + "1");
                data = text1.getText().toString();
                res(data);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text1.getText().toString();
                text1.setText(data + "2");
                data = text1.getText().toString();
                res(data);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text1.getText().toString();
                text1.setText(data + "3");
                data = text1.getText().toString();
                res(data);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text1.getText().toString();
                text1.setText(data + "4");
                data = text1.getText().toString();
                res(data);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text1.getText().toString();
                text1.setText(data + "5");
                data = text1.getText().toString();
                res(data);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text1.getText().toString();
                text1.setText(data + "6");
                data = text1.getText().toString();
                res(data);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text1.getText().toString();
                text1.setText(data + "7");
                data = text1.getText().toString();
                res(data);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text1.getText().toString();
                text1.setText(data + "8");
                data = text1.getText().toString();
                res(data);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = text1.getText().toString();
                text1.setText(data + "9");
                data = text1.getText().toString();
                res(data);
            }
        });
        // oprators
        buttoncl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viberator.vibrate(50);
                textres.setText("");
                text1.setText("");
            }
        });

        buttonmulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viberator.vibrate(50);
                data = text1.getText().toString();
                if (data.length() > 0) {
                    if (data.endsWith("+") || data.endsWith("-") ||
                            data.endsWith("*") || data.endsWith("/")
                    ) {
                        data = data.substring(0, data.length() - 1);
                        text1.setText(data + "*");
                    } else {
                        text1.setText(data + "*");
                    }
                }
            }
        });

        buttondivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viberator.vibrate(50);
                data = text1.getText().toString();
                if (data.length() > 0) {
                    if (data.endsWith("+") || data.endsWith("-") ||
                            data.endsWith("*") || data.endsWith("/")
                    ) {
                        data = data.substring(0, data.length() - 1);
                        text1.setText(data + "/");
                    } else {
                        text1.setText(data + "/");
                    }
                }
            }
        });

        buttonminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viberator.vibrate(50);
                data = text1.getText().toString();
                if (data.length() > 0) {
                    if (data.endsWith("+") || data.endsWith("-") ||
                            data.endsWith("*") || data.endsWith("/")
                    ) {
                        data = data.substring(0, data.length() - 1);
                        text1.setText(data + "-");
                    } else {
                        text1.setText(data + "-");
                    }
                }
            }
        });

        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viberator.vibrate(50);
                data = text1.getText().toString();
                if (data.length() > 0) {

                    if (data.endsWith("+") || data.endsWith("-") ||
                            data.endsWith("*") || data.endsWith("/")
                    ) {
                        data = data.substring(0, data.length() - 1);
                        text1.setText(data + "+");
                    } else {
                        text1.setText(data + "+");
                    }
                } else {
                    text1.setText(data);
                }
            }
        });

        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viberator.vibrate(50);
                data = textres.getText().toString();
                    if (data.length() > 0) {
                        if (data.contains("Invalid") || data.contains("NaN")  || data.contains("Infinity")) {
                            text1.setText("");
                            textres.setText("");
                        } else {
                            text1.setText(data);
                            textres.setText("");
                        }
                    }
            }
        });
    }

    String getres(String data4) {
        try {
            Context context = Context.enter();
            context.setOptimizationLevel(-1);
            Scriptable scriptable = context.initStandardObjects();
            String fresult = context.evaluateString(scriptable, data4, "Javascript", 1, null).toString();
            if (fresult.endsWith(".0")) {
                fresult = fresult.replace(".0", "");
            }
            return fresult;
        } catch (Exception e) {
            System.out.println(e);
            return "err";
        }
    }

    String res(String data1) {
        viberator.vibrate(50);
        if (data1.length() > 0) {
            if (data1.contains("+") || data1.contains("-") ||
                    data1.contains("*") || data1.contains("/")
            ) {
                result = getres(data1);
                if (!result.equals("err")) {
                    textres.setText(result);
                }
                else{
                    textres.setText("");
                }
            }
        }
        return result;
    }
}

