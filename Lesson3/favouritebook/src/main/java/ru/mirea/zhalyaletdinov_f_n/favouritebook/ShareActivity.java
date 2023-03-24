package ru.mirea.zhalyaletdinov_f_n.favouritebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView favBookTV = findViewById(R.id.FavBookTV);
            String university = extras.getString(MainActivity.KEY);
            String baseTV = favBookTV.getText().toString();
            favBookTV.setText(String.format("%s\n%s", baseTV, university));
        }
    }

    public void onClickSendData(View view) {
        EditText myFavBookET = findViewById(R.id.editTextTextPersonName);
        String text = myFavBookET.getText().toString();
        Intent data = new Intent();
        data.putExtra(MainActivity.USER_MESSAGE, text);
        setResult(Activity.RESULT_OK, data);
        finish();
    }
}