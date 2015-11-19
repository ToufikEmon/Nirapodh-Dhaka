package nirapodDhaka;

import homeFragment.Ambulence;
import homeFragment.Embassi;
import homeFragment.FireService;
import homeFragment.NGO;
import homeFragment.Police;
import homeFragment.RAB;
import homeFragment.VictimSupportCenter;
import android.annotation.SuppressLint;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.emon.nirapodthdhaka.R;

@SuppressLint("NewApi")
public class HomeFragment extends Fragment implements OnClickListener {

	Button btnVictimSupportCenter, btnEmbassi, btnPolice, btnRAB,
			btnFireService, btnNGO, btnAmbulence,btnPoliceHotline,btnWomenSafety;

	public HomeFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fragment_home, container, false);

		// Button initialise in a fragment

		btnVictimSupportCenter = (Button) view
				.findViewById(R.id.btnVictimSupportCenter);
		btnEmbassi = (Button) view.findViewById(R.id.btnEmbassi);
		btnPolice = (Button) view.findViewById(R.id.btnPolice);
		btnRAB = (Button) view.findViewById(R.id.btnRAB);
		btnFireService = (Button) view.findViewById(R.id.btnFireService);
		btnNGO = (Button) view.findViewById(R.id.btnNGO);
		btnAmbulence = (Button) view.findViewById(R.id.btnAmbulance);
		btnPoliceHotline= (Button) view.findViewById(R.id.btnPoliceHotline);
		btnWomenSafety= (Button) view.findViewById(R.id.btnNariSurokkha);

		btnVictimSupportCenter.setOnClickListener(this);
		btnEmbassi.setOnClickListener(this);
		btnPolice.setOnClickListener(this);
		btnRAB.setOnClickListener(this);
		btnFireService.setOnClickListener(this);
		btnNGO.setOnClickListener(this);
		btnAmbulence.setOnClickListener(this);
		btnPoliceHotline.setOnClickListener(this);
		btnWomenSafety.setOnClickListener(this);
		

		return view;
	}

	@Override
	public void onClick(View v) {
		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();
		switch (v.getId()) {

		case R.id.btnVictimSupportCenter:
			VictimSupportCenter center = new VictimSupportCenter();
			ft.replace(R.id.frame_container, center);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnEmbassi:
			Embassi embassi = new Embassi();
			ft.replace(R.id.frame_container, embassi);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnPolice:
			Police police = new Police();
			ft.replace(R.id.frame_container, police);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnRAB:
			RAB rab = new RAB();
			ft.replace(R.id.frame_container, rab);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnFireService:
			FireService fireService = new FireService();
			ft.replace(R.id.frame_container, fireService);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnNGO:
			NGO ngo = new NGO();
			ft.replace(R.id.frame_container, ngo);
			ft.addToBackStack(null);
			ft.commit();
			break;

		case R.id.btnAmbulance:
			Ambulence ambulence = new Ambulence();
			ft.replace(R.id.frame_container, ambulence);
			ft.addToBackStack(null);
			ft.commit();
			break;
		case R.id.btnPoliceHotline:
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:999"));
			startActivity(callIntent);
			break;
		case R.id.btnNariSurokkha:
			Intent callIntent1 = new Intent(Intent.ACTION_CALL);
			callIntent1.setData(Uri.parse("tel:10921"));
			startActivity(callIntent1);
			break;

		default:
			break;

		}
	}
}
