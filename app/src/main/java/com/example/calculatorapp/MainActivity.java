package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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
        EditText editText = findViewById(R.id.editTextNumber);
        String temp =  editText.getText().toString();
        if(temp.contains("/"))
        {
           int opInd =  temp.indexOf('/');
           Double firstOp = Double.parseDouble(temp.substring(0,opInd-1));
            Double secondOp = Double.parseDouble(temp.substring(opInd+1));
            Double result = firstOp/secondOp;

        }

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
             editText.setText("0");
    }
}