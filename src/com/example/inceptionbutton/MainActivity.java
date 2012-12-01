package com.example.inceptionbutton;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	MediaPlayer mPlay;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton inception = (ImageButton) findViewById(R.id.imageButton1);
        mPlay = MediaPlayer.create(this, R.raw.inceptionbuttonsound);
        inception.setOnClickListener(new OnClickListener(){
        	
			public void onClick(View v) {
				mPlay.start();
			}
        	
        });
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
