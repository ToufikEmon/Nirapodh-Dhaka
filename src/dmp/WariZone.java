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

public class WariZone extends Fragment implements OnClickListener {

	Button btnDemraControlRoom, btnDemraDeutyOfficer,
			btnGandariaThanaControlRoom, btnGandariaThanaDeutyOfficer,
			btnJatrabariControlRoom, btnJatrabariDeutyOfficer,
			btnKodomtaliControlRoom, btnKadamtaliDeutyOfficer,
			btnShampurControlRoom, btnShamppurDeutyOfficer,
			btnSutrappurControlRoom, btnSutrapurDeutyOfficer,
			btnWariControlRoom, btnWariDeutyOfficer, btnWariACPetrol,
			btnWariDeputyComissionar;

	public WariZone() {
		// TODO Auto-generated constructor stub
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.wari_zone_fragment, container,
				false);

		btnDemraControlRoom = (Button) view
				.findViewById(R.id.btnDemraThanaControlRoom);
		btnDemraDeutyOfficer = (Button) view
				.findViewById(R.id.btnDemraThanaDutyOfficer);
		btnGandariaThanaControlRoom = (Button) view
				.findViewById(R.id.btnGandariaThanaControlRoom);
		btnGandariaThanaDeutyOfficer = (Button) view
				.findViewById(R.id.btnGandariaThanaDutyOfficer);
		btnJatrabariControlRoom = (Button) view
				.findViewById(R.id.btnJatrabariThanaControlRoom);
		btnJatrabariDeutyOfficer = (Button) view
				.findViewById(R.id.btnJatrabariThanaDutyOfficer);
		btnKodomtaliControlRoom = (Button) view
				.findViewById(R.id.btnKadomtaliThanaControlRoom);
		btnKadamtaliDeutyOfficer = (Button) view
				.findViewById(R.id.btnKadomtaliThanaDutyOfficer);
		btnShampurControlRoom = (Button) view
				.findViewById(R.id.btnShampurThanaControlRoom);
		btnShamppurDeutyOfficer = (Button) view
				.findViewById(R.id.btnShampurThanaDutyOfficer);
		btnSutrappurControlRoom = (Button) view
				.findViewById(R.id.btnSutrapurThanaControlRoom);
		btnSutrapurDeutyOfficer = (Button) view
				.findViewById(R.id.btnSutrapurThanaDutyOfficer);
		btnWariControlRoom = (Button) view
				.findViewById(R.id.btnWariThanaControlRoom);
		btnWariDeutyOfficer = (Button) view
				.findViewById(R.id.btnWariThanaDutyOfficer);

		btnDemraControlRoom.setOnClickListener(this);
		btnDemraDeutyOfficer.setOnClickListener(this);
		btnGandariaThanaControlRoom.setOnClickListener(this);
		btnGandariaThanaDeutyOfficer.setOnClickListener(this);
		btnJatrabariControlRoom.setOnClickListener(this);
		btnJatrabariDeutyOfficer.setOnClickListener(this);
		btnKodomtaliControlRoom.setOnClickListener(this);
		btnKadamtaliDeutyOfficer.setOnClickListener(this);
		btnShampurControlRoom.setOnClickListener(this);
		btnShamppurDeutyOfficer.setOnClickListener(this);
		btnSutrappurControlRoom.setOnClickListener(this);
		btnSutrapurDeutyOfficer.setOnClickListener(this);
		btnWariControlRoom.setOnClickListener(this);
		btnWariDeutyOfficer.setOnClickListener(this);
		

		return view;
	}

	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.btnDemraThanaControlRoom:
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:+88027501155"));
			startActivity(callIntent);
			break;
		case R.id.btnDemraThanaDutyOfficer:
			Intent callIntent1 = new Intent(Intent.ACTION_CALL);
			callIntent1.setData(Uri.parse("tel:+8801713373144"));
			startActivity(callIntent1);
			break;
		case R.id.btnGandariaThanaControlRoom:
			Intent callIntent2 = new Intent(Intent.ACTION_CALL);
			callIntent2.setData(Uri.parse("tel:+88027453294"));
			startActivity(callIntent2);
			break;
		case R.id.btnGandariaThanaDutyOfficer:
			Intent callIntent3 = new Intent(Intent.ACTION_CALL);
			callIntent3.setData(Uri.parse("tel:+8801713398331"));
			startActivity(callIntent3);
			break;
		case R.id.btnJatrabariThanaControlRoom:
			Intent callIntent4 = new Intent(Intent.ACTION_CALL);
			callIntent4.setData(Uri.parse("tel:+88027546244"));
			startActivity(callIntent4);
			break;
		case R.id.btnJatrabariThanaDutyOfficer:
			Intent callIntent5 = new Intent(Intent.ACTION_CALL);
			callIntent5.setData(Uri.parse("tel:+8801713373146"));
			startActivity(callIntent5);
			break;
		case R.id.btnKadomtaliThanaControlRoom:
			Intent callIntent6 = new Intent(Intent.ACTION_CALL);
			callIntent6.setData(Uri.parse("tel:+88027547755"));
			startActivity(callIntent6);
			break;
		case R.id.btnKadomtaliThanaDutyOfficer:
			Intent callIntent7 = new Intent(Intent.ACTION_CALL);
			callIntent7.setData(Uri.parse("tel:+8801713398333"));
			startActivity(callIntent7);
			break;
		case R.id.btnShampurThanaControlRoom:
			Intent callIntent8 = new Intent(Intent.ACTION_CALL);
			callIntent8.setData(Uri.parse("tel:+88027440691"));
			startActivity(callIntent8);
			break;
		case R.id.btnShampurThanaDutyOfficer:
			Intent callIntent9 = new Intent(Intent.ACTION_CALL);
			callIntent9.setData(Uri.parse("tel:+8801713373145"));
			startActivity(callIntent9);
			break;
		case R.id.btnSutrapurThanaControlRoom:
			Intent callIntent10 = new Intent(Intent.ACTION_CALL);
			callIntent10.setData(Uri.parse("tel:+88027116233"));
			startActivity(callIntent10);
			break;
		case R.id.btnSutrapurThanaDutyOfficer:
			Intent callIntent11 = new Intent(Intent.ACTION_CALL);
			callIntent11.setData(Uri.parse("tel:+8801713373143"));
			startActivity(callIntent11);
			break;
		case R.id.btnWariThanaControlRoom:
			Intent callIntent12 = new Intent(Intent.ACTION_CALL);
			callIntent12.setData(Uri.parse("tel:+88029553377"));
			startActivity(callIntent12);
			break;
		case R.id.btnWariThanaDutyOfficer:
			Intent callIntent13 = new Intent(Intent.ACTION_CALL);
			callIntent13.setData(Uri.parse("tel:+8801769058051"));
			startActivity(callIntent13);
			break;

		default:
			break;
		}
	}
}
