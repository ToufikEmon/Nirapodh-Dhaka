package com.example.nirapodDhaka;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nirapodthakun.R;

@SuppressLint("NewApi")
public class FragmentAboutMe extends Fragment{
	
	public FragmentAboutMe() {
		// TODO Auto-generated constructor stub
	}
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
	  
	        View rootView = inflater.inflate(R.layout.fragment_about_me, container, false);
	          
	        return rootView;
	    }

}
