package ru.mirea.zhalyaletdinov_f_n.sharer;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Intent intent = new Intent(Intent.ACTION_PICK);
//        intent.setType("*/*");
//        ActivityResultCallback<ActivityResult> callback = new ActivityResultCallback<ActivityResult>()
//        {
//            @Override
//            public void onActivityResult(ActivityResult result) {
//                if (result.getResultCode() == Activity.RESULT_OK) {
//                    Intent data = result.getData();
//                    Log.d(MainActivity.class.getSimpleName(), "Data:" + data.getDataString());
//                }
//            }
//        };
//        ActivityResultLauncher<Intent> imageActivityResultLauncher = registerForActivityResult(
//                new ActivityResultContracts.StartActivityForResult(),
//                callback);
//        imageActivityResultLauncher.launch(intent);
    }
}