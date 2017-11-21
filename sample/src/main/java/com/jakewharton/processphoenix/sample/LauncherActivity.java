package com.jakewharton.processphoenix.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class LauncherActivity extends Activity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_launcher);
    final Intent mainIntent = new Intent(this, MainActivity.class);
    //mainIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    if (getIntent().getExtras() != null)
      mainIntent.putExtra("text", getIntent().getExtras().getString("text"));

    startActivity(mainIntent);
  }
}
