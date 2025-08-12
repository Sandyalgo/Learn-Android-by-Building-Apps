package com.example.ch4practice;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Button yes;
    Button no;
    TextView text;
    private final String[] questions = {"Java is Introduced int 1883?","Java is a Language?","Java has Abstraction?","Java support fully OOPS concept?","Java is used for Developer?"};
    private final boolean[] answers = {false,false,true,false,true};
    int index = 0;
    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        text = findViewById(R.id.textView);
        text.setText(questions[index]);
        yes.setOnClickListener(v -> {
            if(index<questions.length){
                if(answers[index]){
                    score++;
                }
                index++;
                if(index<questions.length){
                    text.setText(questions[index]);
                }else{
                    Toast.makeText(MainActivity.this, "Score is :"+ score + "/"+questions.length, Toast.LENGTH_SHORT).show();
                }
            }
            else{
                Toast.makeText(MainActivity.this, "Restart app to play again", Toast.LENGTH_SHORT).show();
            }
        });
        no.setOnClickListener(v -> {
            if(index<questions.length){
                if(!answers[index]){
                    score++;
                }
                index++;
                if(index<questions.length){
                    text.setText(questions[index]);
                }else{
                    Toast.makeText(MainActivity.this, "Score is :"+ score + "/" +questions.length, Toast.LENGTH_SHORT).show();
                }
            }
            else{
                Toast.makeText(MainActivity.this, "Restart app to play again", Toast.LENGTH_SHORT).show();
            }
        });
    }
}