package com.example.embassiFragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nirapodthakun.R;

public class T extends Fragment{
	
	public T() {
		// TODO Auto-generated constructor stub
	}
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

View view = inflater.inflate(R.layout.t, container,false );
		return view;
	}

}
