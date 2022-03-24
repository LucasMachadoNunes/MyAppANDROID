package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editNome;
    EditText editTextNum;
    EditText editTextNum2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNome = findViewById(R.id.editNome);
        editTextNum = findViewById(R.id.editTextNum);
        editTextNum2 = findViewById(R.id.editTextNum2);
    }
    public void showName(View v){
        String nome = editNome.getText().toString();
        Toast.makeText(this, nome, Toast.LENGTH_SHORT).show();

    }
    public void soma(View v) {
        int editN1 = Integer.parseInt(editTextNum.getText().toString());
        int editN2 = Integer.parseInt(editTextNum2.getText().toString());
        int editN3 = editN1 + editN2;
        Toast.makeText(this, String.valueOf(editN3), Toast.LENGTH_LONG).show();
        if(editN3 > editN2){
            Toast.makeText(this, "N3 > N2", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "N3 > N1", Toast.LENGTH_LONG).show();
        }
    }
}