package com.example.mstu1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ChoiceLanguageActivity extends AppCompatActivity {
    private ListView languageListView;
    private LanguageAdapter languageAdapter;
    private Locale selectedLocale;

    private Button save_button,back_button;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_language);

        languageListView = findViewById(R.id.languageListView);
        List<String> languageList = Arrays.asList(getResources().getStringArray(R.array.language_array));
        languageAdapter = new LanguageAdapter(this, R.layout.list_item_language, languageList);
        languageListView.setAdapter(languageAdapter);
        languageListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                languageAdapter.setSelectedItemPosition(position);
                String selectedLanguage = languageAdapter.getItem(position);
                selectedLocale = getLocaleFromLanguage(selectedLanguage);
            }
        });
        save_button = findViewById(R.id.saveButton);
        save_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LocaleHelper.setLocale(ChoiceLanguageActivity.this, selectedLocale);
                recreate();
            }
        });
        back_button = findViewById(R.id.backButton);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChoiceLanguageActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }

    // 根据语言字符串获取对应的Locale对象
    private Locale getLocaleFromLanguage(String language) {
        switch (language) {
            case "简体中文":
                return Locale.SIMPLIFIED_CHINESE;
            case "繁體中文(台灣)":
                return Locale.TRADITIONAL_CHINESE;
            case "繁體中文(香港)":
                return new Locale("zh", "HK");
            case "English":
                return Locale.ENGLISH;
            case "日本語":
                return Locale.JAPANESE;
            default:
                return null;
        }
    }

// 设置应用程序的语言
}