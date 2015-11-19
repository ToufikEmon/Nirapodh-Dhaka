package dmp;

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

public class TejgaonZone extends Fragment implements OnClickListener {

	Button btnAdabarControlRoom, btnAdabarDeutyOfficer,
			btnMohammadpurControlRoom, btnMohammadpurDeutyOfficer,
			btnSherEBanglaControlRoom, btnSherEBanglaDeutyOfficer,
			btnTejgaonControlRoom, btnTejgaonDeutyOfficer,
			btnTejgaonSilpanchalControlRoom, btnTejgaonSilpanchalDeutyOfficer,
			btnTejgaonACPetrol, btnTejgaonDeputyComissionar;

	public TejgaonZone() {
		// TODO Auto-generated constructor stub
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.tejgaon_zone_fragment, container,
				false);

		btnAdabarControlRoom = (Button) view
				.findViewById(R.id.btnAdabarThanaControlRoom);
		btnAdabarDeutyOfficer = (Button) view
				.findViewById(R.id.btnAdabarThanaDutyOfficer);
		btnMohammadpurControlRoom = (Button) view
				.findViewById(R.id.btnMohammadpurThanaControlRoom);
		btnMohammadpurDeutyOfficer = (Button) view
				.findViewById(R.id.btnMohammadpurThanaDutyOfficer);
		btnSherEBanglaControlRoom = (Button) view
				.findViewById(R.id.btnShereBanglaNagarThanaControlRoom);
		btnSherEBanglaDeutyOfficer = (Button) view
				.findViewById(R.id.btnShereBanglaNagarThanaDutyOfficer);
		btnTejgaonControlRoom = (Button) view
				.findViewById(R.id.btnTejgaonThanaControlRoom);
		btnTejgaonDeutyOfficer = (Button) view
				.findViewById(R.id.btnTejgaonThanaDutyOfficer);
		btnTejgaonSilpanchalControlRoom = (Button) view
				.findViewById(R.id.btnTegaonShilpanchalThanaControlRoom);
		btnTejgaonSilpanchalDeutyOfficer = (Button) view
				.findViewById(R.id.btnTegaonShilpanchalThanaDutyOfficer);
		

		btnAdabarControlRoom.setOnClickListener(this);
		btnAdabarDeutyOfficer.setOnClickListener(this);
		btnMohammadpurControlRoom.setOnClickListener(this);
		btnMohammadpurDeutyOfficer.setOnClickListener(this);
		btnSherEBanglaControlRoom.setOnClickListener(this);
		btnSherEBanglaDeutyOfficer.setOnClickListener(this);
		btnTejgaonControlRoom.setOnClickListener(this);
		btnTejgaonDeutyOfficer.setOnClickListener(this);
		btnTejgaonSilpanchalControlRoom.setOnClickListener(this);
		btnTejgaonSilpanchalDeutyOfficer.setOnClickListener(this);
		

		return view;
	}

	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.btnAdabarThanaControlRoom:
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:+88029133265"));
			startActivity(callIntent);
			break;
		case R.id.btnAdabarThanaDutyOfficer:
			Intent callIntent1 = new Intent(Intent.ACTION_CALL);
			callIntent1.setData(Uri.parse("tel:+8801713373183"));
			startActivity(callIntent1);
			break;
		case R.id.btnMohammadpurThanaControlRoom:
			Intent callIntent2 = new Intent(Intent.ACTION_CALL);
			callIntent2.setData(Uri.parse("tel:+88029119943"));
			startActivity(callIntent2);
			break;
		case R.id.btnMohammadpurThanaDutyOfficer:
			Intent callIntent3 = new Intent(Intent.ACTION_CALL);
			callIntent3.setData(Uri.parse("tel:+8801713373182"));
			startActivity(callIntent3);
			break;
		case R.id.btnShereBanglaNagarThanaControlRoom:
			Intent callIntent4 = new Intent(Intent.ACTION_CALL);
			callIntent4.setData(Uri.parse("tel:+88029124154"));
			startActivity(callIntent4);
			break;
		case R.id.btnShereBanglaNagarThanaDutyOfficer:
			Intent callIntent5 = new Intent(Intent.ACTION_CALL);
			callIntent5.setData(Uri.parse("tel:+8801713398335"));
			startActivity(callIntent5);
			break;
		case R.id.btnTejgaonThanaControlRoom:
			Intent callIntent6 = new Intent(Intent.ACTION_CALL);
			callIntent6.setData(Uri.parse("tel:+88029119444"));
			startActivity(callIntent6);
			break;
		case R.id.btnTejgaonThanaDutyOfficer:
			Intent callIntent7 = new Intent(Intent.ACTION_CALL);
			callIntent7.setData(Uri.parse("tel:+8801713373180"));
			startActivity(callIntent7);
			break;
		case R.id.btnTegaonShilpanchalThanaControlRoom:
			Intent callIntent8 = new Intent(Intent.ACTION_CALL);
			callIntent8.setData(Uri.parse("tel:+88028870309"));
			startActivity(callIntent8);
			break;
		case R.id.btnTegaonShilpanchalThanaDutyOfficer:
			Intent callIntent9 = new Intent(Intent.ACTION_CALL);
			callIntent9.setData(Uri.parse("tel:+8801713373181"));
			startActivity(callIntent9);
			break;
		

		default:
			break;
		}

	}
}
