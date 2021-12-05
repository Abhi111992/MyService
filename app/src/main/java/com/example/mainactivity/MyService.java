package com.example.mainactivity;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;

public class MyService extends Service {
    private MediaPlayer player;
 public IBinder onBind(Intent intent)
 return null;
}
public int onStartCommand(Intent intent,int flags,int startId)
{
    player= MediaPlayer.create(this, Settings.System.DEFAULT_ALARM_ALERT_URI);
    player.setLooping(true);
    player.start();
    return START_STICKY;

}
public void onDestroy()
{
    super.onDestroy();
    player.stop();
}