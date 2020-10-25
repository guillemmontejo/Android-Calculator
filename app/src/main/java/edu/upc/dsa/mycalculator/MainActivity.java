package edu.upc.dsa.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView operation;
    TextView currenNum;
    double numbers[];
    int num = 0;
    String opSymbols[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currenNum = (TextView) findViewById(R.id.currentNumber);
        operation = (TextView) findViewById(R.id.completeOperation);
        numbers = new double[15];
        opSymbols = new String[15];
    }

    public void pressButton1(View v) {
        operation.setText(String.format("%s1",operation.getText()));
        currenNum.setText(String.format("%s1",currenNum.getText()));
    }
    public void pressButton2(View v) {
        currenNum.setText(String.format("%s2",currenNum.getText()));
        operation.setText(String.format("%s2",operation.getText()));
    }
    public void pressButton3(View v) {
        currenNum.setText(String.format("%s3",currenNum.getText()));
        operation.setText(String.format("%s3",operation.getText()));
    }
    public void pressButton4(View v) {
        currenNum.setText(String.format("%s4",currenNum.getText()));
        operation.setText(String.format("%s4",operation.getText()));
    }
    public void pressButton5(View v) {
        currenNum.setText(String.format("%s5",currenNum.getText()));
        operation.setText(String.format("%s5",operation.getText()));
    }
    public void pressButton6(View v) {
        currenNum.setText(String.format("%s6",currenNum.getText()));
        operation.setText(String.format("%s6",operation.getText()));
    }
    public void pressButton7(View v) {
        currenNum.setText(String.format("%s7",currenNum.getText()));
        operation.setText(String.format("%s7",operation.getText()));
    }
    public void pressButton8(View v) {
        currenNum.setText(String.format("%s8",currenNum.getText()));
        operation.setText(String.format("%s8",operation.getText()));
    }
    public void pressButton9(View v) {
        currenNum.setText(String.format("%s9",currenNum.getText()));
        operation.setText(String.format("%s9",operation.getText()));
    }
    public void pressButton0(View v) {
        currenNum.setText(String.format("%s0",currenNum.getText()));
        operation.setText(String.format("%s0",operation.getText()));
    }
    public void pressButtonAdd(View v) {
        numbers[num] = Double.parseDouble(currenNum.getText().toString());
        opSymbols[num] = "+";
        num +=1;
        operation.setText(String.format("%s+",operation.getText()));
        currenNum.setText((""));
    }
    public void pressButtonSub(View v) {
        numbers[num] = Double.parseDouble(currenNum.getText().toString());
        opSymbols[num] = "-";
        num +=1;
        operation.setText(String.format("%s-",operation.getText()));
        currenNum.setText("");
    }
    public void pressButtonMult(View v) {
        numbers[num] = Double.parseDouble(currenNum.getText().toString());
        opSymbols[num] = "x";
        num +=1;
        operation.setText(String.format("%sx",operation.getText()));
        currenNum.setText("");
    }
    public void pressButtonDiv(View v) {
        numbers[num] = Double.parseDouble(currenNum.getText().toString());
        opSymbols[num] = "/";
        num +=1;
        operation.setText(String.format("%s/",operation.getText()));
        currenNum.setText("");
    }
    public void pressButtonClear(View v) {
        operation.setText("");
        currenNum.setText("");
        num = 0;
        numbers = new double[15];
        opSymbols = new String[15];
    }


    public void pressButtonEqual(View v) {
        numbers[num] = Double.parseDouble(currenNum.getText().toString());
        int i;
        double currentResult = 0;
        if (opSymbols[0] == "+")
            currentResult = numbers[0] + numbers[1];
        else if (opSymbols[0] == "-")
            currentResult = numbers[0] - numbers[1];
        else if (opSymbols[0] == "x")
            currentResult = numbers[0] * numbers[1];
        else if (opSymbols[0] == "/")
            currentResult = numbers[0] / numbers[1];

        for (i=1; i < num; i++) {
            if (opSymbols[i] == "+")
                currentResult +=  numbers[i+1];
            else if (opSymbols[i] == "-")
                currentResult -= numbers[i+1];
            else if (opSymbols[i] == "x")
                currentResult *= numbers[i+1];
            else if (opSymbols[i] == "/")
                currentResult /= numbers[i+1];
        }
        operation.setText(Double.toString(currentResult));
        currenNum.setText(Double.toString(currentResult));
        num = 0;
        numbers = new double[15];
        opSymbols = new String[15];
    }
}
