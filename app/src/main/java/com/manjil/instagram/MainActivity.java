package com.manjil.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView tvPostDesc = findViewById(R.id.tvPostDesc);
//        String postDesc = "islingtoncollege Today we celebrate the 3rd year of Chiya Chautari";
//
//        SpannableString spannableString = new SpannableString(postDesc);
//        spannableString.setSpan(new StyleSpan(Typeface.BOLD),0,16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
    }
}