package ru.mirea.zhalyaletdinov_f_n.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView studNumTV = findViewById(R.id.StudNumTextView);
        String studNum = String.valueOf(studNumTV.getText().toString()
                .charAt(studNumTV.getText().toString().length() - 1));

        TextView dtTV = findViewById(R.id.DateTimeTextView);
        long dateInMillis = System.currentTimeMillis();
        String format = "yyyy-MM-dd HH:mm:ss";
        final SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.getDefault());
        String dateString = sdf.format(new Date(dateInMillis));
        dtTV.setText(dateString);

        Button sendDataBT = findViewById(R.id.dataSendButton);
        sendDataBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sendIntent = new Intent(MainActivity.this, SecondActivity.class);
                sendIntent.putExtra("number", studNum);
                sendIntent.putExtra("date", dateString);
                startActivity(sendIntent);
            }
        });
    }
}