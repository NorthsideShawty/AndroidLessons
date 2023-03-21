package ru.mirea.zhalyaletdinov_f_n.activitylifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView2 = findViewById(R.id.textView2);
        textView2.setText("onCreate()");
        Log.i(TAG, "onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();

        textView2 = findViewById(R.id.textView2);
        textView2.setText("onStart()");
        Log.i(TAG, "onStart()");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        textView2 = findViewById(R.id.textView2);
        textView2.setText("onRestoreInstanceState()");
        Log.i(TAG, "onRestoreInstanceState()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        textView2 = findViewById(R.id.textView2);
        textView2.setText("onRestart()");
        Log.i(TAG, "onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        textView2 = findViewById(R.id.textView2);
        textView2.setText("onResume()");
        Log.i(TAG, "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();

        textView2 = findViewById(R.id.textView2);
        textView2.setText("onPause()");
        Log.i(TAG, "onPause()");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        textView2 = findViewById(R.id.textView2);
        textView2.setText("onSaveInstanceState()");
        Log.i(TAG, "onSaveInstanceState()");
    }

    @Override
    protected void onStop() {
        super.onStop();

        textView2 = findViewById(R.id.textView2);
        textView2.setText("onStop()");
        Log.i(TAG, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        textView2 = findViewById(R.id.textView2);
        textView2.setText("onDestroy()");
        Log.i(TAG, "onDestroy()");
    }
}