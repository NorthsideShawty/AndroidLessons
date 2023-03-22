package ru.mirea.zhalyaletdinov_f_n.notificationapp;

import static android.Manifest.permission.POST_NOTIFICATIONS;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String CHANNEL_ID = "ru.mirea.zhalyaletdinov_f_n.notificationapp.ANDROID";

    private final int PermissionCode = 200;
    @RequiresApi(api = Build.VERSION_CODES.TIRAMISU)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (ContextCompat.checkSelfPermission(this, POST_NOTIFICATIONS) == PackageManager.PERMISSION_GRANTED) {
            Log.d(MainActivity.class.getSimpleName(), "Разрешения получены");
        }
        else {
            Log.d(MainActivity.class.getSimpleName(), "Нет разрешений!");
            ActivityCompat.requestPermissions(this,
                    new String[]{POST_NOTIFICATIONS},
                    PermissionCode);
        }
    }

    public void onClickNewMessageNotification(View view) {
        NotificationManager notificationManager = (NotificationManager) getApplicationContext()
                .getSystemService(Context.NOTIFICATION_SERVICE);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID)
                .setContentText("Я разбираюсь в следующих отраслях IT: перечислил в голове :)")
                .setSmallIcon(com.google.android.material.R.drawable.notification_bg_low)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setContentTitle("БСБО-17-20 – Группа, 8 – номер по списку");
        if (ActivityCompat.checkSelfPermission(this, POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        NotificationChannel channel = new NotificationChannel(CHANNEL_ID, CHANNEL_ID, NotificationManager.IMPORTANCE_LOW);
        notificationManager.createNotificationChannel(channel);
        notificationManager.notify(1, builder.build());
    }
}