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

public class LalbaghZone extends Fragment implements OnClickListener {
	Button btnBongshalControlRoom, btnBongshalDeutyOfficer,
			btnChakBazarControlRoom, btnChhakBazarDeutyOfficer,
			btnKamrangircharControlRoom, btnKamrangircharDeutyOfficer,
			btnKotowaliControlRoom, btnKotowaliDeutyOfficer,
			btnLalbaghControlRoom, btnLalbaghDeutyOfficer, btnLalbaghACPetrol,
			btnLalbaghDeputyComissionar;

	public LalbaghZone() {
		// TODO Auto-generated constructor stub
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.lalbagh_zone_fragment, container,
				false);

		btnBongshalControlRoom = (Button) view
				.findViewById(R.id.btnBongshalThanaControlRoom);
		btnBongshalDeutyOfficer = (Button) view
				.findViewById(R.id.btnBongshalThanaDeutyOfficer);
		btnChakBazarControlRoom = (Button) view
				.findViewById(R.id.btnChakBazarThanaControlRoom);
		btnChhakBazarDeutyOfficer = (Button) view
				.findViewById(R.id.btnChakBazarThanaDeutyOfficer);
		btnKamrangircharControlRoom = (Button) view
				.findViewById(R.id.btnKamrangircharThanaControlRoom);
		btnKamrangircharDeutyOfficer = (Button) view
				.findViewById(R.id.btnKamrangircharThanaDeutyOfficer);
		btnKotowaliControlRoom = (Button) view
				.findViewById(R.id.btnKotoaliThanaControlRoom);
		btnKotowaliDeutyOfficer = (Button) view
				.findViewById(R.id.btnKotoaliThanaDeutyOfficer);
		btnLalbaghControlRoom = (Button) view
				.findViewById(R.id.btnLalbagThanaControlRoom);
		btnLalbaghDeutyOfficer = (Button) view
				.findViewById(R.id.btnLalbagThanaDutyOfficer);
		
		btnBongshalControlRoom.setOnClickListener(this);
		btnBongshalDeutyOfficer.setOnClickListener(this);
		btnChakBazarControlRoom.setOnClickListener(this);
		btnChhakBazarDeutyOfficer.setOnClickListener(this);
		btnKamrangircharControlRoom.setOnClickListener(this);
		btnKamrangircharDeutyOfficer.setOnClickListener(this);
		btnKotowaliControlRoom.setOnClickListener(this);
		btnKotowaliDeutyOfficer.setOnClickListener(this);
		btnLalbaghControlRoom.setOnClickListener(this);
		btnLalbaghDeutyOfficer.setOnClickListener(this);
		

		return view;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnBongshalThanaControlRoom:
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:+88029565700"));
			startActivity(callIntent);
			break;
		case R.id.btnBongshalThanaDeutyOfficer:
			Intent callIntent1 = new Intent(Intent.ACTION_CALL);
			callIntent1.setData(Uri.parse("tel:+8801713398336"));
			startActivity(callIntent1);
			break;
		case R.id.btnChakBazarThanaControlRoom:
			Intent callIntent2 = new Intent(Intent.ACTION_CALL);
			callIntent2.setData(Uri.parse("tel:+88027313966"));
			startActivity(callIntent2);
			break;
		case R.id.btnChakBazarThanaDeutyOfficer:
			Intent callIntent3 = new Intent(Intent.ACTION_CALL);
			callIntent3.setData(Uri.parse("tel:+8801713398337"));
			startActivity(callIntent3);
			break;
		case R.id.btnKamrangircharThanaControlRoom:
			Intent callIntent4 = new Intent(Intent.ACTION_CALL);
			callIntent4.setData(Uri.parse("tel:+88027320323"));
			startActivity(callIntent4);
			break;
		case R.id.btnKamrangircharThanaDeutyOfficer:
			Intent callIntent5 = new Intent(Intent.ACTION_CALL);
			callIntent5.setData(Uri.parse("tel:+8801713373137"));
			startActivity(callIntent5);
			break;
		case R.id.btnKotoaliThanaControlRoom:
			Intent callIntent6 = new Intent(Intent.ACTION_CALL);
			callIntent6.setData(Uri.parse("tel:+88027116255"));
			startActivity(callIntent6);
			break;
		case R.id.btnKotoaliThanaDeutyOfficer:
			Intent callIntent7 = new Intent(Intent.ACTION_CALL);
			callIntent7.setData(Uri.parse("tel:+8801713373135"));
			startActivity(callIntent7);
			break;
		case R.id.btnLalbagThanaControlRoom:
			Intent callIntent8 = new Intent(Intent.ACTION_CALL);
			callIntent8.setData(Uri.parse("tel:+88029660105"));
			startActivity(callIntent8);
			break;
		case R.id.btnLalbagThanaDutyOfficer:
			Intent callIntent9 = new Intent(Intent.ACTION_CALL);
			callIntent9.setData(Uri.parse("tel:+8801713373134"));
			startActivity(callIntent9);
			break;
		

		default:
			break;
		}
	}

}
