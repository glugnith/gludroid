package com.example.glug;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		LinearLayout button1 = (LinearLayout) findViewById(R.id.button1);
		LinearLayout button2 = (LinearLayout) findViewById(R.id.button2);
		LinearLayout button3 = (LinearLayout) findViewById(R.id.button3);
		LinearLayout button4 = (LinearLayout) findViewById(R.id.button4);
		
		button1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(MainActivity.this, os_activity.class);
				startActivity(in);
				
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(MainActivity.this, foss_activity.class);
				startActivity(in);
				
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(MainActivity.this, sfd_activity.class);
				startActivity(in);
				
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(MainActivity.this, glug_activity.class);
				startActivity(in);
			}
		});
		
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId()){
			case R.id.action_develop: 
				Intent in = new Intent(getApplicationContext(), develop_activity.class);
				startActivity(in);
				return true;
			case R.id.action_feedback:
				Intent sendIntent = new Intent(Intent.ACTION_VIEW);
				sendIntent.setType("plain/text");
				sendIntent.setData(Uri.parse("shubhamchaudhary376@gmail.com"));
				sendIntent.setClassName("com.google.android.gm", "com.google.android.gm.ComposeActivityGmail");
				sendIntent.putExtra(Intent.EXTRA_EMAIL, new String[] { "mayankbansal933@gmail.com" });
				sendIntent.putExtra(Intent.EXTRA_SUBJECT, "Feedback");
				sendIntent.putExtra(Intent.EXTRA_TEXT, "If you have any suggestions, please do mail us. :-)");
				startActivity(sendIntent);
				return true;
			default: 
				return super.onMenuItemSelected(featureId, item);
		}
		
	}

}
