package com.example.glug;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class events_activity extends Activity {
	ListView list;
	String url = "http://14.139.56.19/gludroid/index.php";
	ArrayList<String> events = new ArrayList<String>();
	ProgressDialog pDialog;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_view);
		
		list = (ListView) findViewById(R.id.list);
		final ArrayAdapter<String> evn = new ArrayAdapter<String>(getApplicationContext(), R.layout.event_item_layout, R.id.event_item ,events);
		list.setAdapter(evn);
		
		pDialog = new ProgressDialog(events_activity.this);
		pDialog.setMessage("Loading...");
		new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				pDialog.show();
				
			}
		}, 1);
			
		
		RequestQueue rq = Volley.newRequestQueue(getApplicationContext());
		JsonObjectRequest jsonrequest = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {

			@Override
			public void onResponse(JSONObject response) {
				// TODO Auto-generated method stub
				try{
					int success = response.getInt("success");
					if(success==1){
						JSONArray quest = (JSONArray) response.getJSONArray("events");
						for(int i=0;i<quest.length();i++){
					/*		String name = quest.getJSONObject(i).getString("name");
							String time = quest.getJSONObject(i).getString("e_name");
							String ans = name + " - " + time;
							events.add(ans); */
						//	int pid = response.getInt("pid");
						//	if(pid<200){
								events.add(quest.getJSONObject(i).getString("name"));
						//	}
							
							hidepDialog();
						} 
						
					} else{
						hidepDialog();
					}
				} catch(JSONException e){
					Toast.makeText(getApplicationContext(), "ERROR!!", Toast.LENGTH_SHORT).show();
					hidepDialog();
				}
				evn.notifyDataSetChanged();
				
			}
		}, new Response.ErrorListener() {

			@Override
			public void onErrorResponse(VolleyError arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "No Internet Connection", Toast.LENGTH_SHORT).show();
				hidepDialog();
				
			}
		});
		
		rq.add(jsonrequest);
		
		
	}
	private void hidepDialog(){
		if(pDialog!=null){
			pDialog.dismiss();
			pDialog=null;
		}
	}
}


