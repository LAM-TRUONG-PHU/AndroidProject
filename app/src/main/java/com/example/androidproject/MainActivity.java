package com.example.androidproject;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextPaint;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        TextView textView = (TextView) findViewById(R.id.textViewLogin);
        textView.setText("Login");

        TextPaint paint = textView.getPaint();
        float width = paint.measureText("Login");

        Shader textShader = new LinearGradient(0, 0, width, textView.getTextSize(),
                new int[]{
                        Color.parseColor("#2B2E30"),
                        Color.parseColor("#B77A37"),
                        Color.parseColor("#C68935"),
                        Color.parseColor("#D59833"),
                        Color.parseColor("#E5A832"),

                }, null, Shader.TileMode.CLAMP);
        textView.getPaint().setShader(textShader);
    }
}