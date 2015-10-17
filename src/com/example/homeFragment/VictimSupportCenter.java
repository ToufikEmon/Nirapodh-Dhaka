package com.example.homeFragment;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.nirapodthakun.R;

@SuppressLint("NewApi")
public class VictimSupportCenter extends Fragment implements OnClickListener {

	Button btnVictim1, btnVictim2, btnVictim3, btnVictim4;

	public VictimSupportCenter() {
		// TODO Auto-generated constructor stub
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.victim_support_center,
				container, false);

		btnVictim1 = (Button) rootView.findViewById(R.id.btnVictimNumber1);
		btnVictim2 = (Button) rootView.findViewById(R.id.btnVictimNumber2);
		btnVictim3 = (Button) rootView.findViewById(R.id.btnVictimNumber3);
		btnVictim4 = (Button) rootView.findViewById(R.id.btnVictimNumber4);

		btnVictim1.setOnClickListener(this);
		btnVictim2.setOnClickListener(this);
		btnVictim3.setOnClickListener(this);
		btnVictim4.setOnClickListener(this);

		return rootView;
	}

	@Override
	public void onClick(View v) {
		Intent callIntent = new Intent(Intent.ACTION_CALL);
		switch (v.getId()) {
		case R.id.btnVictimNumber1:

			callIntent.setData(Uri.parse("tel:8801755556644"));
			startActivity(callIntent);

			break;
		case R.id.btnVictimNumber2:

			callIntent.setData(Uri.parse("tel:8801733219030"));
			startActivity(callIntent);
			break;
		case R.id.btnVictimNumber3:

			callIntent.setData(Uri.parse("tel:8801755556645"));
			startActivity(callIntent);
			break;
		case R.id.btnVictimNumber4:

			callIntent.setData(Uri.parse("tel:8801733219005"));
			startActivity(callIntent);
			break;

		default:
			break;
		}
	}
}
