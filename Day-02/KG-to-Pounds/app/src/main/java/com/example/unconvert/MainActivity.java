package com.example.unconvert;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        button  = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //Toast.makeText(MainActivity.this, "I'm working on the value.", Toast.LENGTH_SHORT).show();
//                String s = editText.getText().toString();
//                int kg = Integer.parseInt(s);
//                double pound = kg*2.202;
//                textView.setText("The pound value :" + pound);
//            }
//        });
        }
    public void calculate(View view){
        String s = editText.getText().toString();
        int kg = Integer.parseInt(s);
        double pound = kg*2.205;
        textView.setText("The pound value :" + pound);
        Toast.makeText(this, "Thanks for using App!", Toast.LENGTH_SHORT).show();
    }
}