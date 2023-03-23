package ru.mirea.zhalyaletdinov_f_n.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @SuppressLint("DefaultLocale")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView getDataTV = findViewById(R.id.GetDataTextView);
        Intent getIntent = getIntent();
        String getStudNum = getIntent.getStringExtra("number");
        int stN = Integer.parseInt(getStudNum);
        String getDateTime = getIntent.getStringExtra("date");
        getDataTV.setText(String.format("Квадрат значения моего номера по списку в группе составляет: %d\n" +
                "Текущее время: %s", (int) Math.pow(stN, 2), getDateTime));
    }
}