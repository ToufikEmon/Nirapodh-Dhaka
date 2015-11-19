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

public class UttraZone extends Fragment implements OnClickListener {

	Button btnAirportControlRoom, btnAirportDeutyOfficer,
			btnDaskinKhanControlRoom, btnDaskinKhanDeutyOfficer,
			btnTuragControlRoom, btnTuragDeutyOfficer, btnUttarKhanControlRoom,
			btnUttarKhanDeutyOfficer, btnUttraWestControlRoom,
			btnUttraWestDeutyOfficer, btnUttraEastControlRoom,
			btnUttraEastDeutyOfficer, btnUttraACPetrol,
			btnUttraDeputyComissionar;

	public UttraZone() {
		// TODO Auto-generated constructor stub
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.uttra_zone_fragment, container,
				false);

		btnAirportControlRoom = (Button) view
				.findViewById(R.id.btnAirportThanaControlRoom);

		btnAirportDeutyOfficer = (Button) view
				.findViewById(R.id.btnAirportThanaDutyOfficer);

		btnDaskinKhanControlRoom = (Button) view
				.findViewById(R.id.btnDakshinKhanThanaControlRoom);

		btnDaskinKhanDeutyOfficer = (Button) view
				.findViewById(R.id.btnDakshinKhanThanaDutyOfficer);

		btnTuragControlRoom = (Button) view
				.findViewById(R.id.btnTuragThanaControlRoom);

		btnTuragDeutyOfficer = (Button) view
				.findViewById(R.id.btnTuragThanaDutyOfficer);

		btnUttarKhanControlRoom = (Button) view
				.findViewById(R.id.btnUttorKhanControlRoom);

		btnUttarKhanDeutyOfficer = (Button) view
				.findViewById(R.id.btnUttorKhanThanaDutyOfficer);

		btnUttraWestControlRoom = (Button) view
				.findViewById(R.id.btnUttraWestThanaControlRoom);

		btnUttraWestDeutyOfficer = (Button) view
				.findViewById(R.id.btnUttraWestThanaDutyOfficer);

		btnUttraEastControlRoom = (Button) view
				.findViewById(R.id.btnUttraEastThanaControlRoom);

		btnUttraEastDeutyOfficer = (Button) view
				.findViewById(R.id.btnUttraEastThanaDutyOfficer);

		

		btnAirportControlRoom.setOnClickListener(this);
		btnAirportDeutyOfficer.setOnClickListener(this);
		btnDaskinKhanControlRoom.setOnClickListener(this);
		btnDaskinKhanDeutyOfficer.setOnClickListener(this);
		btnTuragControlRoom.setOnClickListener(this);
		btnTuragDeutyOfficer.setOnClickListener(this);
		btnUttarKhanControlRoom.setOnClickListener(this);
		btnUttarKhanDeutyOfficer.setOnClickListener(this);
		btnUttraWestControlRoom.setOnClickListener(this);
		btnUttraWestDeutyOfficer.setOnClickListener(this);
		btnUttraEastControlRoom.setOnClickListener(this);
		btnUttraEastDeutyOfficer.setOnClickListener(this);
		

		return view;
	}

	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.btnAirportThanaControlRoom:
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:+88028901853"));
			startActivity(callIntent);
			break;
		case R.id.btnAirportThanaDutyOfficer:
			Intent callIntent1 = new Intent(Intent.ACTION_CALL);
			callIntent1.setData(Uri.parse("tel:+8801713373162"));
			startActivity(callIntent1);
			break;
		case R.id.btnDakshinKhanThanaControlRoom:
			Intent callIntent2 = new Intent(Intent.ACTION_CALL);
			callIntent2.setData(Uri.parse("tel:+88028931777"));
			startActivity(callIntent2);
			break;
		case R.id.btnDakshinKhanThanaDutyOfficer:
			Intent callIntent3 = new Intent(Intent.ACTION_CALL);
			callIntent3.setData(Uri.parse("tel:+8801713373165"));
			startActivity(callIntent3);
			break;
		case R.id.btnTuragThanaControlRoom:
			Intent callIntent4 = new Intent(Intent.ACTION_CALL);
			callIntent4.setData(Uri.parse("tel:+88028981247"));
			startActivity(callIntent4);
			break;
		case R.id.btnTuragThanaDutyOfficer:
			Intent callIntent5 = new Intent(Intent.ACTION_CALL);
			callIntent5.setData(Uri.parse("tel:+8801713373163"));
			startActivity(callIntent5);
			break;
		case R.id.btnUttorKhanControlRoom:
			Intent callIntent6 = new Intent(Intent.ACTION_CALL);
			callIntent6.setData(Uri.parse("tel:+88028931888"));
			startActivity(callIntent6);
			break;
		case R.id.btnUttorKhanThanaDutyOfficer:
			Intent callIntent7 = new Intent(Intent.ACTION_CALL);
			callIntent7.setData(Uri.parse("tel:+8801713373164"));
			startActivity(callIntent7);
			break;
		case R.id.btnUttraWestThanaControlRoom:
			Intent callIntent8 = new Intent(Intent.ACTION_CALL);
			callIntent8.setData(Uri.parse("tel:+88028991315"));
			startActivity(callIntent8);
			break;
		case R.id.btnUttraWestThanaDutyOfficer:
			Intent callIntent9 = new Intent(Intent.ACTION_CALL);
			callIntent9.setData(Uri.parse("tel:+8801769058065"));
			startActivity(callIntent9);
			break;
		case R.id.btnUttraEastThanaControlRoom:
			Intent callIntent10 = new Intent(Intent.ACTION_CALL);
			callIntent10.setData(Uri.parse("tel:+880258954126"));
			startActivity(callIntent10);
			break;
		case R.id.btnUttraEastThanaDutyOfficer:
			Intent callIntent11 = new Intent(Intent.ACTION_CALL);
			callIntent11.setData(Uri.parse("tel:+8801713373161"));
			startActivity(callIntent11);
			break;
		

		default:
			break;
		}
	}
}
