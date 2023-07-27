package com.example.quizapp;

import static com.example.quizapp.R.id.textView7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScorePage extends AppCompatActivity {
int Text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_page);

        TextView Right;
        Right=(TextView)findViewById(R.id.textView6);
        Intent intent=getIntent();
        Text= intent.getIntExtra("Correct answer:",Text);
        Right.setText("Correct answer: "+Text);

        TextView Final;
        Final=(TextView)findViewById(R.id.textView8) ;
        int Fin=Text;

        Final.setText("Final score: "+Fin);

        TextView Wrong;
        Wrong=(TextView)findViewById(R.id.textView7) ;
        int Wro=5-Text;
        Wrong.setText("Wrong Answer: "+Wro);



        Button restart;
        restart=(Button) findViewById(R.id.button6);
        restart.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
               openFirstpage();
            }

            private void openFirstpage() {
                Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
