package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText p1;
    Button btn;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (TextView) findViewById(R.id.textView);
        p1 = (EditText) findViewById(R.id.nombre);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);
    }

    public void onClick(View view) {
        String n1;
n1=p1.getText().toString();

    txt.setText("Hola mundo "+n1);
    }
}

