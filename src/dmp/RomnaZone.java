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

public class RomnaZone extends Fragment implements OnClickListener {

	Button btnDhanmondiControlRoom, btnDhanmondiDeutyOfficer,
			btnHazaribaghControlRoom, btnHazaribaghDeutyOfficer,
			btnKolabaganControlRoom, btnKolabaganDeutyOfficer,
			btnNewMarketControlRoom, btnNewMarketDeutyOfficer,
			btnRamnaThanaControlRoom, btnRamnaDeutyOfficer,
			btnShabagControlRoom, btnShabagDeutyOfficer, btnRomnaACPetrol,
			btnRomnaDeputyComissionar;

	public RomnaZone() {
		// TODO Auto-generated constructor stub
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.romna_zone_fragment, container,
				false);

		btnDhanmondiControlRoom = (Button) view
				.findViewById(R.id.btnDhanmondiThanaControRoom);
		btnDhanmondiDeutyOfficer = (Button) view
				.findViewById(R.id.btnDhanmondiThanaDutyOfficer);
		btnHazaribaghControlRoom = (Button) view
				.findViewById(R.id.btnHazaribagThanaControlRoom);
		btnHazaribaghDeutyOfficer = (Button) view
				.findViewById(R.id.btnHazaribagThanaDutyOfficer);
		btnKolabaganControlRoom = (Button) view
				.findViewById(R.id.btnKolabaganThanaControlRoom);
		btnKolabaganDeutyOfficer = (Button) view
				.findViewById(R.id.btnKolabaganThanaDutyOfiicer);
		btnNewMarketControlRoom = (Button) view
				.findViewById(R.id.btnNewMarketThanaControlRoom);
		btnNewMarketDeutyOfficer = (Button) view
				.findViewById(R.id.btnNewMarketThanaDutyOfficer);
		btnRamnaThanaControlRoom = (Button) view
				.findViewById(R.id.btnRamnaThanaControlRoom);
		btnRamnaDeutyOfficer = (Button) view
				.findViewById(R.id.btnRamnaThanaDutyOfficer);
		btnShabagControlRoom = (Button) view
				.findViewById(R.id.btnShahbagThanaControlRoom);
		btnShabagDeutyOfficer = (Button) view
				.findViewById(R.id.btnShahbagThanaDutyOfficer);
	

		btnDhanmondiControlRoom.setOnClickListener(this);
		btnDhanmondiDeutyOfficer.setOnClickListener(this);
		btnHazaribaghControlRoom.setOnClickListener(this);
		btnHazaribaghDeutyOfficer.setOnClickListener(this);
		btnKolabaganControlRoom.setOnClickListener(this);
		btnKolabaganDeutyOfficer.setOnClickListener(this);
		btnNewMarketControlRoom.setOnClickListener(this);
		btnNewMarketDeutyOfficer.setOnClickListener(this);
		btnRamnaThanaControlRoom.setOnClickListener(this);
		btnRamnaDeutyOfficer.setOnClickListener(this);
		btnShabagControlRoom.setOnClickListener(this);
		btnShabagDeutyOfficer.setOnClickListener(this);
		

		return view;
	}

	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.btnDhanmondiThanaControRoom:
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:+88028631941"));
			startActivity(callIntent);
			break;
		case R.id.btnDhanmondiThanaDutyOfficer:
			Intent callIntent1 = new Intent(Intent.ACTION_CALL);
			callIntent1.setData(Uri.parse("tel:+8801713373126"));
			startActivity(callIntent1);
			break;
		case R.id.btnHazaribagThanaControlRoom:
			Intent callIntent2 = new Intent(Intent.ACTION_CALL);
			callIntent2.setData(Uri.parse("tel:+88029669900"));
			startActivity(callIntent2);
			break;
		case R.id.btnHazaribagThanaDutyOfficer:
			Intent callIntent3 = new Intent(Intent.ACTION_CALL);
			callIntent3.setData(Uri.parse("tel:+8801713373136"));
			startActivity(callIntent3);
			break;
		case R.id.btnKolabaganThanaControlRoom:
			Intent callIntent4 = new Intent(Intent.ACTION_CALL);
			callIntent4.setData(Uri.parse("tel:+88029665254"));
			startActivity(callIntent4);
			break;
		case R.id.btnKolabaganThanaDutyOfiicer:
			Intent callIntent5 = new Intent(Intent.ACTION_CALL);
			callIntent5.setData(Uri.parse("tel:+8801713398339"));
			startActivity(callIntent5);
			break;
		case R.id.btnNewMarketThanaControlRoom:
			Intent callIntent6 = new Intent(Intent.ACTION_CALL);
			callIntent6.setData(Uri.parse("tel:+88028631942"));
			startActivity(callIntent6);
			break;
		case R.id.btnNewMarketThanaDutyOfficer:
			Intent callIntent7 = new Intent(Intent.ACTION_CALL);
			callIntent7.setData(Uri.parse("tel:+8801713373128"));
			startActivity(callIntent7);
			break;
		case R.id.btnRamnaThanaControlRoom:
			Intent callIntent8 = new Intent(Intent.ACTION_CALL);
			callIntent8.setData(Uri.parse("tel:+88029350468"));
			startActivity(callIntent8);
			break;
		case R.id.btnRamnaThanaDutyOfficer:
			Intent callIntent9 = new Intent(Intent.ACTION_CALL);
			callIntent9.setData(Uri.parse("tel:+8801713373125"));
			startActivity(callIntent9);
			break;
		case R.id.btnShahbagThanaControlRoom:
			Intent callIntent10 = new Intent(Intent.ACTION_CALL);
			callIntent10.setData(Uri.parse("tel:+88029676699"));
			startActivity(callIntent10);
			break;
		case R.id.btnShahbagThanaDutyOfficer:
			Intent callIntent11 = new Intent(Intent.ACTION_CALL);
			callIntent11.setData(Uri.parse("tel:+8801713373127"));
			startActivity(callIntent11);
			break;
		

		default:
			break;
		}
	}

}
