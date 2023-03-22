package ru.mirea.zhalyaletdinov_f_n.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickGetToast(View view) {
        editText = findViewById(R.id.editTextTextPersonName);
        String text = editText.getText().toString();

        Toast toast = Toast.makeText(getApplicationContext(),
                text + "\nКоличество символов: " + text.length(),
                Toast.LENGTH_LONG);
        toast.show();
    }
}