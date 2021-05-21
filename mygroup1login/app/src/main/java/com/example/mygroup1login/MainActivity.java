package com.example.mygroup1login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);

    }

    public void verifydata(View view) {
        String strusername = username.getText().toString();
        String strpassword = password.getText().toString();


        if (strusername.equals("edwin") && strpassword.equals("edwin123")){

            Intent intent = new Intent(this, EdwinData.class);
            startActivity(intent);

        }else if (strusername.equals("richmond") && strpassword.equals("richmond123")){

            Intent intent = new Intent(this, RichData.class);
            startActivity(intent);

        }else if (strusername.equals("arn") && strpassword.equals("arn123")){

            Intent intent = new Intent(this, ArnData.class);
            startActivity(intent);

        }else if (strusername.equals("raffy") && strpassword.equals("raffy123")){

            Intent intent = new Intent(this, RaffyData.class);
            startActivity(intent);

        }else{

            Toast.makeText(this, "Username or Password is Incorrect!", Toast.LENGTH_SHORT).show();

        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}