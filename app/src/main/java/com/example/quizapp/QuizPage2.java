package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class QuizPage2 extends AppCompatActivity implements View.OnClickListener {
    Button Next,Quit;
    public static int score =0;
   TextView Score;


    Fragment fragment;
    int count=1;

    TextView received;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page2);
        received = (TextView) findViewById(R.id.textView10);
        Score=(TextView) findViewById(R.id.textscore);
        Intent intent = getIntent();
        String Text = intent.getStringExtra("Name");
        received.setText("Hi "+Text);
        Log.d("QuizPageName", Text);
        Quit=(Button) findViewById(R.id.button8);
        Quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(QuizPage2.this, ScorePage.class);
                startActivity(intent);
            }
        });
        fragment=new Fragment1();
        transit(fragment);
        Next=findViewById(R.id.next);
        Next.setOnClickListener(this);





    }
    void transit(Fragment fragment)
    {
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction= manager.beginTransaction();
        transaction.replace(R.id.framelayoutid,fragment);
        transaction.commit();
    }



    @Override
    public void onClick(View v)
    {

            count++;
            if (count == 2) {
                fragment = new Fragment2();
                transit(fragment);
                score += Fragment1.t;
                if(Fragment1.t==1)
                {
                    Toast.makeText(QuizPage2.this,"Right",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(QuizPage2.this,"wrong",Toast.LENGTH_SHORT).show();
                }

                Score.setText(String.valueOf(score));
            } else if (count == 3) {
                fragment = new Fragment3();
                transit(fragment);
                score += Fragment2.t2;
                if(Fragment2.t2==1)
                {
                    Toast.makeText(QuizPage2.this,"Right",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(QuizPage2.this,"wrong",Toast.LENGTH_SHORT).show();
                }
                Score.setText(String.valueOf(score));
//                Score.setText(score);
            } else if (count == 4) {
                fragment = new Fragment4();
                transit(fragment);
                score += Fragment3.t3;
                if(Fragment3.t3==1)
                {
                    Toast.makeText(QuizPage2.this,"Right",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(QuizPage2.this,"wrong",Toast.LENGTH_SHORT).show();
                }
                Score.setText(String.valueOf(score));
//                 Score.setText(score);
            } else if (count == 5) {
                fragment = new Fragment5();
                transit(fragment);
                score += Fragment4.t4;
                Next.setText("Submit");
                if(Fragment4.t4==1)
                {
                    Toast.makeText(QuizPage2.this,"Right",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(QuizPage2.this,"wrong",Toast.LENGTH_SHORT).show();
                }
                Score.setText(String.valueOf(score));
//                Score.setText(score);
            } else if(count==6)
            {
                score += Fragment5.t5;
                if(Fragment5.t5==1)
                {
                    Toast.makeText(QuizPage2.this,"Right",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(QuizPage2.this,"wrong",Toast.LENGTH_SHORT).show();
                }


                Intent intent=new Intent(QuizPage2.this, ScorePage.class);
                intent.putExtra("Correct answer:",score);
                startActivity(intent);

            }




    }
}


