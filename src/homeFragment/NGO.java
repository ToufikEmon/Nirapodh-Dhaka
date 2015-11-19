package homeFragment;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.emon.nirapodthdhaka.R;

public class NGO extends Fragment implements OnClickListener {

	Button btnAinOSalisKendro, btnAmnestyInternationBangladesh,
			btnBangladeshHumnaRights, btnBangladeshMohilaParishadh,
			btnMohilaAinjibiSomiti, btnBRAC, btnDemocracyWatch, btnOdhikar,
			btnUSEP;

	public NGO() {
		// TODO Auto-generated constructor stub
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.ngo_fragment, container, false);

		btnAinOSalisKendro = (Button) view
				.findViewById(R.id.btnAinOSaliskendro);
		btnAmnestyInternationBangladesh = (Button) view
				.findViewById(R.id.btnAmnestyinternational);
		btnBangladeshHumnaRights = (Button) view
				.findViewById(R.id.btnBangladeshHumanRight);
		btnBangladeshMohilaParishadh = (Button) view
				.findViewById(R.id.btnBangladeshMohilaParishadh);
		btnMohilaAinjibiSomiti = (Button) view
				.findViewById(R.id.btnBangladeshNationalWomenLawerAssociations);
		btnBRAC = (Button) view.findViewById(R.id.btnBRAC);
		btnDemocracyWatch = (Button) view.findViewById(R.id.btnDemocracyWatch);
		btnOdhikar = (Button) view.findViewById(R.id.btnOdhikar);
		btnUSEP = (Button) view.findViewById(R.id.btnUCEP);

		btnAinOSalisKendro.setOnClickListener(this);
		btnAmnestyInternationBangladesh.setOnClickListener(this);
		btnBangladeshHumnaRights.setOnClickListener(this);
		btnBangladeshMohilaParishadh.setOnClickListener(this);
		btnMohilaAinjibiSomiti.setOnClickListener(this);
		btnBRAC.setOnClickListener(this);
		btnDemocracyWatch.setOnClickListener(this);
		btnOdhikar.setOnClickListener(this);
		btnUSEP.setOnClickListener(this);

		return view;
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnAinOSaliskendro:
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:8802316247"));
			startActivity(callIntent);
			break;
		case R.id.btnAmnestyinternational:
			Intent callIntent1 = new Intent(Intent.ACTION_CALL);
			callIntent1.setData(Uri.parse("tel:8802505901"));
			startActivity(callIntent1);
			break;
		case R.id.btnBangladeshHumanRight:
			Intent callIntent2 = new Intent(Intent.ACTION_CALL);
			callIntent2.setData(Uri.parse("tel:8802409597"));
			startActivity(callIntent2);
			break;
		case R.id.btnBangladeshMohilaParishadh:
			Intent callIntent3 = new Intent(Intent.ACTION_CALL);
			callIntent3.setData(Uri.parse("tel:8802245049"));
			startActivity(callIntent3);
			break;
		case R.id.btnBangladeshNationalWomenLawerAssociations:
			Intent callIntent4 = new Intent(Intent.ACTION_CALL);
			callIntent4.setData(Uri.parse("tel:8802863689"));
			startActivity(callIntent4);
			break;
		case R.id.btnBRAC:
			Intent callIntent5 = new Intent(Intent.ACTION_CALL);
			callIntent5.setData(Uri.parse("tel:8802)883614"));
			startActivity(callIntent5);
			break;

		case R.id.btnDemocracyWatch:
			Intent callIntent6 = new Intent(Intent.ACTION_CALL);
			callIntent6.setData(Uri.parse("tel:88029344225"));
			startActivity(callIntent6);
			break;
		case R.id.btnOdhikar:
			Intent callIntent7 = new Intent(Intent.ACTION_CALL);
			callIntent7.setData(Uri.parse("tel:88029560173"));
			startActivity(callIntent7);
			break;
		case R.id.btnUCEP:
			Intent callIntent8 = new Intent(Intent.ACTION_CALL);
			callIntent8.setData(Uri.parse("tel:88028011014"));
			startActivity(callIntent8);
			break;

		default:
			break;

		}
	}
}