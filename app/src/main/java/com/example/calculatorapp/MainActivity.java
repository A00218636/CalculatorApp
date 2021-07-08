package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.*;

public class MainActivity extends AppCompatActivity {

    //Declare a global variable for the display screen output
    String operationText="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //For calculating the result
    public void Calculate(View view) {
        Double result =0.00;
        EditText editText = findViewById(R.id.editTextNumber);
        String temp =  editText.getText().toString();
        if(temp.contains("/"))
        {
           int opInd =  temp.indexOf('/');
           Double firstOp = Double.parseDouble(temp.substring(0,opInd));
            Double secondOp = Double.parseDouble(temp.substring(opInd+1));
             result = firstOp/secondOp;

        }
        if(temp.contains("x"))
        {
            int opInd =  temp.indexOf('x');
            Double firstOp = Double.parseDouble(temp.substring(0,opInd));
            Double secondOp = Double.parseDouble(temp.substring(opInd+1));
             result = firstOp*secondOp;

        }
        if(temp.contains("+"))
        {
            int opInd =  temp.indexOf('+');
            Double firstOp = Double.parseDouble(temp.substring(0,opInd));
            Double secondOp = Double.parseDouble(temp.substring(opInd+1));
             result = firstOp+secondOp;

        }
        if(temp.contains("-"))
        {
            int opInd =  temp.indexOf('-');
            Double firstOp = Double.parseDouble(temp.substring(0,opInd));
            Double secondOp = Double.parseDouble(temp.substring(opInd+1));
             result = firstOp-secondOp;

        }
        //EditText editText = findViewById(R.id.editTextNumber);
        //operationText = operationText + operand.toString();
       // operationText = operationText + tv.getText();
//         editText.setText(operand.toString());
        editText.setText(result.toString());



    }

    //For displaying the numbers when button is pressed
    public void printBtnValue(View v) {

        TextView tv = findViewById(v.getId());
       // Double operand = Double.parseDouble((String) tv.getText());

        EditText editText = findViewById(R.id.editTextNumber);
        //operationText = operationText + operand.toString();
        operationText = operationText + tv.getText();
//         editText.setText(operand.toString());
        editText.setText(operationText); 
    }

    //Clear values when CLR pressed
    public void clearValues(View view) {
         EditText editText = findViewById(R.id.editTextNumber);
        operationText ="";
             editText.setText("0");
    }

    public void backSpace(View view){
        EditText editText = findViewById(R.id.editTextNumber);
        if(editText.length() >= 1) {
            operationText = operationText.substring(0, operationText.length() - 1);

            editText.setText(operationText);

        }

    }

    public void calSin(View view)
    {
        EditText editText = findViewById(R.id.editTextNumber);
        Double operand =  Double.parseDouble(editText.getText().toString());
        operationText ="";
        editText.setText("0");


        double b = Math.toRadians(operand);
        editText.setText(String.valueOf(Math.sin(b)));
    }

    public void calCos(View view)
    {
        EditText editText = findViewById(R.id.editTextNumber);
        Double operand =  Double.parseDouble(editText.getText().toString());
        operationText ="";
        editText.setText("0");


        double b = Math.toRadians(operand);
        editText.setText(String.valueOf(Math.cos(b)));
    }

    public void calTan(View view)
    {
        EditText editText = findViewById(R.id.editTextNumber);
        Double operand =  Double.parseDouble(editText.getText().toString());
        operationText ="";
        editText.setText("0");


        double b = Math.toRadians(operand);
        editText.setText(String.valueOf(Math.tan(b)));
    }


    public void calCubeRoot(View view)
    {
        EditText editText = findViewById(R.id.editTextNumber);
        Double operand =  Double.parseDouble(editText.getText().toString());
        operationText ="";
        editText.setText("0");


        //double b = Math.cbrt(operand);
        String b = String.valueOf(Math.cbrt(operand));
        editText.setText(b);
    }

    public void calSqRoot(View view) {
        EditText editText = findViewById(R.id.editTextNumber);
        Double operand =  Double.parseDouble(editText.getText().toString());
        operationText ="";
        editText.setText("0");

        String b = String.valueOf(Math.sqrt(operand));
       // String b1 = (String) b;
        editText.setText(b);
    }
}