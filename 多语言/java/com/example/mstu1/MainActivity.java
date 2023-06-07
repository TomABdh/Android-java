package com.example.mstu1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text_account,text_language;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_account = findViewById(R.id.text_account);
        text_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onAccountSecurityClick(view);
            }
        });
        text_language = findViewById(R.id.text_language);
        text_language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onLanguageClick(view);
            }
        });
    }
    public void onAccountSecurityClick(View view) {
        Intent intent = new Intent(MainActivity.this,DetailAccountActivity.class);
        startActivity(intent);
    }
    public void onLanguageClick(View view){
        Intent intent = new Intent(MainActivity.this,ChoiceLanguageActivity.class);
        startActivity(intent);
    }

}