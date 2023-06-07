package com.example.mstu1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class LanguageAdapter extends ArrayAdapter<String> {
    private TextView languageTextView;
    private ImageView checkImageView;
    private int selectedItemPosition = -1; // 记录当前选中的项的位置

    public LanguageAdapter(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_language, parent, false);
        }

        languageTextView = convertView.findViewById(R.id.text_lang);
        checkImageView = convertView.findViewById(R.id.image_check);

        String language = getItem(position);
        languageTextView.setText(language);

        if (position == selectedItemPosition) {
            checkImageView.setVisibility(View.VISIBLE);
        } else {
            checkImageView.setVisibility(View.INVISIBLE);
        }

        return convertView;
    }

    // 设置选中项的位置
    public void setSelectedItemPosition(int position) {
        selectedItemPosition = position;
        notifyDataSetChanged();
    }
}