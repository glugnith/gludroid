package com.example.glug;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class glug_activity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.glug_layout);
		
		Button button1 = (Button) findViewById(R.id.button1);
		Button button2 = (Button) findViewById(R.id.button2);
		Button button3 = (Button) findViewById(R.id.button3);
		Button button4 = (Button) findViewById(R.id.button4);
		Button button5 = (Button) findViewById(R.id.button5);
		
		button1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String page = "http://www.glug.nith.ac.in/";
				Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse(page));
				startActivity(in);
				
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String page = "http://www.glug.nith.ac.in/~wiki/";
				Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse(page));
				startActivity(in);
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String page = "http://www.glug.nith.ac.in/paste/";
				Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse(page));
				startActivity(in);
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent in = new Intent(getApplicationContext(), member_activity.class);
				startActivity(in);
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String str_link = "http://www.glug.nith.ac.in/blog";
				Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse(str_link));
				startActivity(in);
			}
		});
	}
}
