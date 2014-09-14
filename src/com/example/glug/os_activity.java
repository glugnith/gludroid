package com.example.glug;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class os_activity extends Activity{
	ListView list;

	String[] values={
			"Ubuntu", "Fedora", "Linux Mint", "Kali Linux", "Kubuntu", "Gnome", "Backtrack", "Deepin", "Debian", "Slackware"
	};
	
	int[] imageid={
		R.drawable.ubuntu, R.drawable.fedora, R.drawable.linuxmint, R.drawable.kalilinux, R.drawable.kubuntu, R.drawable.gnome, R.drawable.backtrack, R.drawable.deepin, R.drawable.debian, R.drawable.slackware
	};
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_view);

		list = (ListView) findViewById(R.id.list);

		custom_list adapter = new custom_list(os_activity.this, values, imageid);

		list.setAdapter(adapter);

		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) {
				// TODO Auto-generated method stub
				Intent in = new Intent(getApplicationContext(), show_info.class);
				in.putExtra("value", values[position]);
				startActivity(in);
			}
		});
		
		
	}
}
