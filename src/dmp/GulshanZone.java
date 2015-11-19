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

public class GulshanZone extends Fragment implements OnClickListener {

	Button btnBaddaControlRoom, btnBaddaDeutyOfficer, btnBananiControlRoom,
			btnBananiDeutyOfficer, btnCantonmentControlRoom,
			btnCantonmentDeutyOfficer, btnGulshanControlRoom,
			btnGulshanDeutyOfficer, btnKhilkhetControlRoom,
			btnKhilkhetDeutyOfficer, btnVatarControlRoom,
			btnVataraDeutyOfficer, btnGulshanACPetrol,
			btnGulshanDeputyComissionar;

	public GulshanZone() {
		// TODO Auto-generated constructor stub
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.gulshan_zone_fragment, container,
				false);

		btnBaddaControlRoom = (Button) view
				.findViewById(R.id.btnBaddaThanaControlRoom);
		btnBaddaDeutyOfficer = (Button) view
				.findViewById(R.id.btnBaddaThanaDeutyOfficer);
		btnBananiControlRoom = (Button) view
				.findViewById(R.id.btnBananiThanaControlRoom);
		btnBananiDeutyOfficer = (Button) view
				.findViewById(R.id.btnBananiThanaDeutyOfficer);
		btnCantonmentControlRoom = (Button) view
				.findViewById(R.id.btnCantonmentThanaControlRoom);
		btnCantonmentDeutyOfficer = (Button) view
				.findViewById(R.id.btnCantonmetThanaDeutyOfficer);
		btnGulshanControlRoom = (Button) view
				.findViewById(R.id.btnGulshanThanaControlRoom);
		btnGulshanDeutyOfficer = (Button) view
				.findViewById(R.id.btnGulshanThanaDeutyOfficer);
		btnKhilkhetControlRoom = (Button) view
				.findViewById(R.id.btnKhilkhetThanaControlRoom);
		btnKhilkhetDeutyOfficer = (Button) view
				.findViewById(R.id.btnKhilkhetThanaDeutyOfficer);
		btnVatarControlRoom = (Button) view
				.findViewById(R.id.btnVataraThanaControlRoom);
		btnVataraDeutyOfficer = (Button) view
				.findViewById(R.id.btnVataraThanaDeutyOfficer);
		

		btnBaddaControlRoom.setOnClickListener(this);
		btnBaddaDeutyOfficer.setOnClickListener(this);
		btnBananiControlRoom.setOnClickListener(this);
		btnBananiDeutyOfficer.setOnClickListener(this);
		btnCantonmentControlRoom.setOnClickListener(this);
		btnCantonmentDeutyOfficer.setOnClickListener(this);
		btnGulshanControlRoom.setOnClickListener(this);
		btnGulshanDeutyOfficer.setOnClickListener(this);
		btnKhilkhetControlRoom.setOnClickListener(this);
		btnKhilkhetDeutyOfficer.setOnClickListener(this);
		btnVatarControlRoom.setOnClickListener(this);
		btnVataraDeutyOfficer.setOnClickListener(this);
		

		return view;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnBaddaThanaControlRoom:
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:+88029882625"));
			startActivity(callIntent);
			break;
		case R.id.btnBaddaThanaDeutyOfficer:
			Intent callIntent1 = new Intent(Intent.ACTION_CALL);
			callIntent1.setData(Uri.parse("tel:+8801713373173"));
			startActivity(callIntent1);
			break;
		case R.id.btnBananiThanaControlRoom:
			Intent callIntent2 = new Intent(Intent.ACTION_CALL);
			callIntent2.setData(Uri.parse("tel:+88029894032"));
			startActivity(callIntent2);
			break;
		case R.id.btnBananiThanaDeutyOfficer:
			Intent callIntent3 = new Intent(Intent.ACTION_CALL);
			callIntent3.setData(Uri.parse("tel:+8801769058053"));
			startActivity(callIntent3);
			break;
		case R.id.btnCantonmentThanaControlRoom:
			Intent callIntent4 = new Intent(Intent.ACTION_CALL);
			callIntent4.setData(Uri.parse("tel:+88028712350"));
			startActivity(callIntent4);
			break;
		case R.id.btnCantonmetThanaDeutyOfficer:
			Intent callIntent5 = new Intent(Intent.ACTION_CALL);
			callIntent5.setData(Uri.parse("tel:+8801713373172"));
			startActivity(callIntent5);
			break;

		case R.id.btnGulshanThanaControlRoom:
			Intent callIntent6 = new Intent(Intent.ACTION_CALL);
			callIntent6.setData(Uri.parse("tel:+88029895826"));
			startActivity(callIntent6);
			break;
		case R.id.btnGulshanThanaDeutyOfficer:
			Intent callIntent7 = new Intent(Intent.ACTION_CALL);
			callIntent7.setData(Uri.parse("tel:+8801713373171"));
			startActivity(callIntent7);
			break;
		case R.id.btnKhilkhetThanaControlRoom:
			Intent callIntent8 = new Intent(Intent.ACTION_CALL);
			callIntent8.setData(Uri.parse("tel:+88028911786"));
			startActivity(callIntent8);
			break;
		case R.id.btnKhilkhetThanaDeutyOfficer:
			Intent callIntent9 = new Intent(Intent.ACTION_CALL);
			callIntent9.setData(Uri.parse("tel:+8801713373174"));
			startActivity(callIntent9);
			break;
		case R.id.btnVataraThanaControlRoom:
			Intent callIntent10 = new Intent(Intent.ACTION_CALL);
			callIntent10.setData(Uri.parse("tel:+88029897438"));
			startActivity(callIntent10);
			break;
		case R.id.btnVataraThanaDeutyOfficer:
			Intent callIntent11 = new Intent(Intent.ACTION_CALL);
			callIntent11.setData(Uri.parse("tel:+8801769050855"));
			startActivity(callIntent11);
			break;
		

		default:
			break;

		}
	}
}
