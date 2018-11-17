package com.example.jp.muistutusappi;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import static com.example.jp.muistutusappi.R.id.textView;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar = Calendar.getInstance();
        System.out.println("aika =>" + calendar.getTime());

        SimpleDateFormat pvma = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String yhdistettyaika = pvma.format(calendar.getTime());
        //Toast.makeText(this, yhdistettyaika, Toast.LENGTH_LONG).show();

        TextView tekstinäkymä = new TextView(this);
        tekstinäkymä.setText("Tämänhetkinen aika: " + yhdistettyaika);
        tekstinäkymä.setGravity(Gravity.CENTER);
        tekstinäkymä.setTextSize(20);
        //setContentView(tekstinäkymä);
    }

    public void Muistutus(View View) {
    Intent intent = new Intent(this, AlertDetails.class);
        Button button5 = (Button) findViewById(R.id.button5);
        startActivity(intent);


    }

    public void Asetukset (View View) {
        Intent intent = new Intent(this, ThirdActivity.class);
        ImageButton imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
        startActivity(intent);
    }
}
    /*private void createNotificationChannel() {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = getString(R.string.channel_name);
            String description = getString(R.string.channel_description);
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel(CId, name, importance);
            channel.setDescription(description);
            // Register the channel with the system; you can't change the importance
            // or other notification behaviors after this
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }


    final String CId = "my_channel_01";

    //Intent intent = new Intent(this, AlertDetails.class);
    //PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);


    NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this, CId)
            .setSmallIcon(R.drawable.mittari)
            .setContentTitle("My notification")
            .setContentText("Hello World!")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)
            .setContentIntent(pendingIntent)
            .setAutoCancel(true);



}*/



