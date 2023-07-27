package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        Button btn2;
        Button btn;
        EditText text;
        text=(EditText)findViewById(R.id.editTextText) ;
        btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String Text = text.getText().toString().trim();
                if(Text.isEmpty()||Text.length()==0||text==null)
                {
                    Toast.makeText(getApplicationContext(),"First Enter Your Name to Start a Quiz",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Intent intent=new Intent(MainActivity.this, QuizPage2.class);
                    intent.putExtra("Name",Text);
                    startActivity(intent);
                }
            }
        });

        btn2=(Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openDeveloperspage();
            }


        });
    }
    public void openDeveloperspage() {
        Intent intent=new Intent(MainActivity.this, DevelopersPage.class);
                startActivity(intent);
    }
}