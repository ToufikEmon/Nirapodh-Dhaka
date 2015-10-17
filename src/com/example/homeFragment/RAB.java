package com.example.homeFragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nirapodthakun.R;

public class RAB extends Fragment{

	public RAB() {
		
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.rab_fragment, container,
				false);

		return rootView;
	}

}
