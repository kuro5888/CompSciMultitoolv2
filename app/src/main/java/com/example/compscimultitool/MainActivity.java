package com.example.compscimultitool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button toDoBtn, binaryBtn, hexBtn, primeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assign Buttons from GUI to actual code
        toDoBtn = findViewById(R.id.toDo_btn);
        binaryBtn = findViewById(R.id.binCalc_btn);
        hexBtn = findViewById(R.id.hexCalc_btn);
        primeBtn = findViewById(R.id.primeNum_btn);

        //Set on click listeners

        toDoBtn.setOnClickListener(this);
        binaryBtn.setOnClickListener(this);
        hexBtn.setOnClickListener(this);
        primeBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
        case R.id.toDo_btn:
            Intent intent0 = new Intent(MainActivity.this, ToDoList.class);
            startActivity(intent0);
            break;

        case R.id.binCalc_btn:
            Intent intent1 = new Intent(MainActivity.this, BinaryCalc.class);
            startActivity(intent1);
            break;

        case R.id.hexCalc_btn:
            Intent intent2 = new Intent(MainActivity.this, HexCalc.class);
            startActivity(intent2);
            break;

        case R.id.primeNum_btn:
            Intent intent3 = new Intent(MainActivity.this, PrimeNumber.class);
            startActivity(intent3);
            break;
    }}
}
