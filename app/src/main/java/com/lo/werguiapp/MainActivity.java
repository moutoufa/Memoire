package com.lo.werguiapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText Cin,Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cin=(EditText)findViewById(R.id.edCin);
        Password=(EditText)findViewById(R.id.edMdp);

    }

    public void Login(View view){
        String password=Password.getText().toString();
        String cin=Cin.getText().toString();
        Background background=new Background(this);
        background.execute(cin,password);

    }
}
