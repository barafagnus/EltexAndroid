package ru.eltex.calculatore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Integer firstNum;
    private Integer secondNum;
    Integer result;
    private String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().
                setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                         WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        TextView output = (TextView) findViewById(R.id.output);
        TextView output1 = (TextView) findViewById(R.id.output1);
        Button nul = (Button) findViewById(R.id.btn0);
        nul.setOnClickListener((view -> {
            output.setText((output.getText()) + "0");

        }));

        Button one = (Button) findViewById(R.id.btn1);
        one.setOnClickListener(view -> {
            output.setText(output.getText() + "1");
        });

        Button two = (Button) findViewById(R.id.btn2);
        two.setOnClickListener(view -> {
            output.setText(output.getText() + "2");
        });

        Button three = (Button) findViewById(R.id.btn3);
        three.setOnClickListener(view -> {
            output.setText(output.getText() + "3");
        });

        Button four = (Button) findViewById(R.id.btn4);
        four.setOnClickListener(view -> {
            output.setText(output.getText() + "4");
        });

        Button five = (Button) findViewById(R.id.btn5);
        five.setOnClickListener(view -> {
            output.setText(output.getText() + "5");
        });

        Button six = (Button) findViewById(R.id.btn6);
        six.setOnClickListener(view -> {
            output.setText(output.getText() + "6");
        });

        Button seven = (Button) findViewById(R.id.btn7);
        seven.setOnClickListener(view -> {
            output.setText(output.getText() + "7");
        });

        Button eight = (Button) findViewById(R.id.btn8);
        eight.setOnClickListener(view -> {
            output.setText(output.getText() + "8");
        });

        Button nine = (Button) findViewById(R.id.btn9);
        nine.setOnClickListener(view -> {
            output.setText(output.getText() + "9");
        });

        Button clean = (Button) findViewById(R.id.btnC);
        clean.setOnClickListener(view -> {
            output.setText(null);
            output1.setText(null);
            result = null;
        });

        Button plus = (Button) findViewById(R.id.btnPlus);
        plus.setOnClickListener(view -> {
            firstNum = Integer.valueOf(String.valueOf(output.getText()));
            output1.setText(output.getText() + " + ");
            output.setText(null);
            operation = "plus";
        });

        Button minus = (Button) findViewById(R.id.btnMinus);
        minus.setOnClickListener(view -> {
            firstNum = Integer.valueOf(String.valueOf(output.getText()));
            output1.setText(output.getText() + " - ");
            output.setText(null);
            operation = "minus";
        });

        Button division = (Button) findViewById(R.id.btnDivision);
        division.setOnClickListener(view -> {
            firstNum = Integer.valueOf(String.valueOf(output.getText()));
            output1.setText(output.getText() + " / ");
            output.setText(null);
            operation = "division";
        });

        Button multiplexing = (Button) findViewById(R.id.btnMultiplexing);
        multiplexing.setOnClickListener(view -> {
            firstNum = Integer.valueOf(String.valueOf(output.getText()));
            output1.setText(output.getText() + " x ");
            output.setText(null);
            operation = "multiplexing";
        });

        Button equals = (Button) findViewById(R.id.btnEquals);
        equals.setOnClickListener(view -> {
            secondNum = Integer.valueOf(String.valueOf(output.getText()));
            switch (operation) {
                case ("plus") :
                    result = firstNum + secondNum;
                    output1.setText(output1.getText() + secondNum.toString());
                    break;
                case ("minus") : result = firstNum - secondNum;
                    output1.setText(output1.getText() + secondNum.toString());
                    break;
                case ("division") : result = firstNum / secondNum;
                    output1.setText(output1.getText() + secondNum.toString());
                    break;
                case ("multiplexing") : result = firstNum * secondNum;
                    output1.setText(output1.getText() + secondNum.toString());
                    break;
            }
            output.setText(null);
            output1.setText(output1.getText() + " = " + result.toString());
        });
    }
}