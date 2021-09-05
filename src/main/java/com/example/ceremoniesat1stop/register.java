package com.example.ceremoniesat1stop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class register extends AppCompatActivity {
    EditText edit2, edit3, edit4;
    TextInputEditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button btnsend;

        btnsend = findViewById(R.id.btnsend);
     btnsend.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                edit2.setText("");
                edit3.setText("");
                edit4.setText("");
                text.setText("");

            }
        });

    }
}


