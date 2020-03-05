package com.example.compscimultitool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class HexCalc extends AppCompatActivity implements View.OnClickListener {

    private String insert;
    private int number;
    private int digit1;
    private int digit2;
    private String char1;
    private String char2;
    private TextView outputTV;
    private Button submit;
    private EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hex_calc);

        submit = findViewById(R.id.hexBtn);
        outputTV = findViewById(R.id.hexTV);
        input = findViewById(R.id.hexET);

        submit.setOnClickListener(this);

    }
    public String checkDigit(int i)
    {
        String out = "";
        if (i < 10) {
            out = Integer.toString(i);
        }
        else
        {
            switch(i){
                case 10:
                    out = "a";
                    break;

                case 11:
                    out = "b";
                    break;

                case 12:
                    out = "c";
                    break;

                case 13:
                    out = "d";
                    break;

                case 14:
                    out = "e";
                    break;

                case 15:
                    out = "f";
                    break;
            }
        }
        return out;
    }
    public void clear(){
        insert = "";
        number = 0;
        digit1 = 0;
        digit2 = 0;
        char1 = "";
        char2 = "";
    }

    @Override
    public void onClick(View v) {
        try {
            insert = input.getText().toString();
            number = Integer.parseInt(insert);
            if (number >= 0 && number <= 255) {
                digit1 = number / 16;
                digit2 = number % 16;
                char1 = checkDigit(digit1);
                char2 = checkDigit(digit2);
                outputTV.setText(char1 + char2);
            }
            else
            {
                outputTV.setText("Number outside of range!");
            }
        } catch (NumberFormatException e) {
            clear();
            outputTV.setText("Invalid Entry, please try again.");
        }

    }
}