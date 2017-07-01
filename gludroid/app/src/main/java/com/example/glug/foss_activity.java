package com.example.glug;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class foss_activity extends Activity {
	ListView list;
	
	String[] names={
		"VLC", "Gimp", "Docky", "Chromium", "Wine", "Vi/Vim", "Mozilla Firefox", "Audacity", "Blender", "FileZilla", "Open Office", "ThunderBird"
	};
	
	int[] imageid={
		R.drawable.vlc, R.drawable.gimp, R.drawable.docky, R.drawable.chrome, R.drawable.wine2, R.drawable.vim, R.drawable.mozilla, R.drawable.audacity, R.drawable.blender, R.drawable.fz, R.drawable.openoffice, R.drawable.thunder
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_view);
		
		custom_list adapter = new custom_list(foss_activity.this, names, imageid);
		
		list = (ListView) findViewById(R.id.list);
			
		list.setAdapter(adapter);
		
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long id) {
				// TODO Auto-generated method stub
				Intent in = new Intent(getApplicationContext(), show_info.class);
				in.putExtra("value", names[position]);
				in.putExtra("image", imageid[position]);
				startActivity(in);
				
			}
		});
		
	}
}


