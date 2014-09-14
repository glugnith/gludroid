package com.example.glug;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class about_sfd extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about_sfd_layout);
		
		TextView text = (TextView) findViewById(R.id.textView3);
		text.setText("Software Freedom Day (SFD) is an annual worldwide celebration of Free Software. SFD is a public education effort with the" +
				" aim of increasing awareness of Free Software and its virtues, and encouraging its use. Software Freedom Day was established in 2004" +
				" and was first observed on 28 August of that year. About 12 teams participated in the first Software Freedom Day. Since that time" +
				" it has grown in popularity.");
		
		TextView text2 = (TextView) findViewById(R.id.textView5);
		text2.setText("\"Software Freedom International\" (SFI) is a non-profit organisation that acts " +
				"as the official organiser of Software Freedom Day, and is the legal body that handles donations," +
				" sponsorship contracts, and accounting. The name Software Freedom International was chosen to distinguish the " +
				"organisational body from the event of Software Freedom Day itself.");
		
		TextView text3 = (TextView) findViewById(R.id.textView7);
		text3.setText("The primary sponsor from the start was Canonical Ltd., the company behind Ubuntu, a Linux distribution. Then IBM, " +
				"Sun Microsystems, DKUUG, Google, Red Hat, Linode, Nokia and now MakerBot Industries have joined the supporting organisations as" +
				" well as the FSF and the FSFE.");
	}
}
