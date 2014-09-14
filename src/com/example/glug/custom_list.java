package com.example.glug;



import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class custom_list extends ArrayAdapter<String>{

	private final Context context;
	private final String[] web;
	private final int[] imageId;
	
	public custom_list(Context c, String[] web, int[] imageId) {
		super(c, R.layout.list_item, web);
		context = c;
		this.web = web;
		this.imageId = imageId;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return web.length;
	}
	
	@Override
	public String getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View list;
		LayoutInflater inflator = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		if(convertView == null){
			list = new View(context);
			list = inflator.inflate(R.layout.list_item, null, true);		
		} else{
			list = (View) convertView;
		}
		
		TextView text = (TextView) list.findViewById(R.id.list_text);
		ImageView image = (ImageView) list.findViewById(R.id.imageView1);
		Log.d("Custom_list", "before list");
		text.setText(web[position]);
		Log.d("Custom_list", "in between");
		image.setImageResource(imageId[position]);
		Log.d("Custom_list", "list is created");
		
		return list;
	}

}
