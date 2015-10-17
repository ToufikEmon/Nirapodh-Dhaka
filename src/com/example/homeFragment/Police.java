package com.example.homeFragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.dmp.GulshanZone;
import com.example.dmp.LalbaghZone;
import com.example.dmp.MirpurZone;
import com.example.dmp.MotijhilZone;
import com.example.dmp.OwariZone;
import com.example.dmp.RomnaZone;
import com.example.dmp.TejgaonZone;
import com.example.dmp.UttraZone;
import com.example.nirapodthakun.R;

public class Police extends Fragment implements OnClickListener {

	Button btnGulshanZone, btnLalbaghZone, btnMirpurZone, btnMotijhilZone,
			btnOwariZone, btnRomnaZone, btnTejgaonZone, btnUttraZone;

	public Police() {
		// TODO Auto-generated constructor stub
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater
				.inflate(R.layout.police_fragment, container, false);

		btnGulshanZone = (Button) view.findViewById(R.id.btnGulshan);
		btnLalbaghZone = (Button) view.findViewById(R.id.btnLalbag);

		btnMirpurZone = (Button) view.findViewById(R.id.btnMirpur);
		btnMotijhilZone = (Button) view.findViewById(R.id.btnMothijheel);
		btnOwariZone = (Button) view.findViewById(R.id.btnWari);

		btnRomnaZone = (Button) view.findViewById(R.id.btnRamna);

		btnTejgaonZone = (Button) view.findViewById(R.id.btnTejgaon);

		btnUttraZone = (Button) view.findViewById(R.id.btnUttra);

		btnGulshanZone.setOnClickListener(this);
		btnLalbaghZone.setOnClickListener(this);
		btnMirpurZone.setOnClickListener(this);
		btnMotijhilZone.setOnClickListener(this);
		btnOwariZone.setOnClickListener(this);
		btnRomnaZone.setOnClickListener(this);
		btnTejgaonZone.setOnClickListener(this);
		btnUttraZone.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {
		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnGulshan:
			GulshanZone gulshan = new GulshanZone();
			ft.replace(R.id.frame_container, gulshan);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnLalbag:
			LalbaghZone lalbaghZone = new LalbaghZone();
			ft.replace(R.id.frame_container, lalbaghZone);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnMirpur:
			MirpurZone mirpurZone = new MirpurZone();
			ft.replace(R.id.frame_container, mirpurZone);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnMothijheel:
			MotijhilZone motijhilZone = new MotijhilZone();
			ft.replace(R.id.frame_container, motijhilZone);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnWari:
			OwariZone owariZone = new OwariZone();
			ft.replace(R.id.frame_container, owariZone);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnRamna:
			RomnaZone romna = new RomnaZone();
			ft.replace(R.id.frame_container, romna);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnTejgaon:
			TejgaonZone tejgaonZone = new TejgaonZone();
			ft.replace(R.id.frame_container, tejgaonZone);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnUttra:
			UttraZone uttra = new UttraZone();
			ft.replace(R.id.frame_container, uttra);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}

}
