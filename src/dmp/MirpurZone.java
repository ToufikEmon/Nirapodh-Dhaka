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

public class MirpurZone extends Fragment implements OnClickListener {

	Button btnDarusSalamControlRoom, btnDarusSalamDeutyOfficer,
			btnKafrulControlRoom, btnKafrulDeutyOfficer, btnMirpurControlRoom,
			btnMirpurDeutyOfficer, btnPollobiControlRoom,
			btnPollobiDeutyOfficer, btnRupnagarControlRoom,
			btnRupnagarDeutyOfficer, btnShahAlirControlRoom,
			btnShahAliDeutyOfficer, btnVasantekControlRoom,
			btnVasantekDeutyOfficer, btnMirpurACPetrol,
			btnMirpurDeputyComissionar;

	public MirpurZone() {
		// TODO Auto-generated constructor stub
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.mirpur_zone_fragment, container,
				false);

		btnDarusSalamControlRoom = (Button) view
				.findViewById(R.id.btnDarusSalamThanaControlRoom);
		btnDarusSalamDeutyOfficer = (Button) view
				.findViewById(R.id.btnDarusSalamThanaDutyOfficer);
		btnKafrulControlRoom = (Button) view
				.findViewById(R.id.btnKafrulThanaControlRoom);
		btnKafrulDeutyOfficer = (Button) view
				.findViewById(R.id.btnKafrulThanaDutyOfficer);
		btnMirpurControlRoom = (Button) view
				.findViewById(R.id.btnMirpurThanaControlRoom);
		btnMirpurDeutyOfficer = (Button) view
				.findViewById(R.id.btnMirpurThanaDutyOfficer);
		btnPollobiControlRoom = (Button) view
				.findViewById(R.id.btnPallabiThanaControlRoom);
		btnPollobiDeutyOfficer = (Button) view
				.findViewById(R.id.btnPallabiThanaDutyOfficer);
		btnRupnagarControlRoom = (Button) view
				.findViewById(R.id.btnRupnagarThanaControlRoom);
		btnRupnagarDeutyOfficer = (Button) view
				.findViewById(R.id.btnRupnagarThanaDutyOfficer);
		btnShahAlirControlRoom = (Button) view
				.findViewById(R.id.btnShahAliThanaControlRoom);
		btnShahAliDeutyOfficer = (Button) view
				.findViewById(R.id.btnShahAliThanaDutyOfficer);
		btnVasantekControlRoom = (Button) view
				.findViewById(R.id.btnVashantekThanaControlRoom);
		btnVasantekDeutyOfficer = (Button) view
				.findViewById(R.id.btnVashantekThanaDutyOfficer);
		

		btnDarusSalamControlRoom.setOnClickListener(this);
		btnDarusSalamDeutyOfficer.setOnClickListener(this);
		btnKafrulControlRoom.setOnClickListener(this);
		btnKafrulDeutyOfficer.setOnClickListener(this);
		btnMirpurControlRoom.setOnClickListener(this);
		btnMirpurDeutyOfficer.setOnClickListener(this);
		btnPollobiControlRoom.setOnClickListener(this);
		btnPollobiDeutyOfficer.setOnClickListener(this);
		btnRupnagarControlRoom.setOnClickListener(this);
		btnRupnagarDeutyOfficer.setOnClickListener(this);
		btnShahAlirControlRoom.setOnClickListener(this);
		btnShahAliDeutyOfficer.setOnClickListener(this);
		btnVasantekControlRoom.setOnClickListener(this);
		btnVasantekDeutyOfficer.setOnClickListener(this);
		

		return view;
	}

	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.btnDarusSalamThanaControlRoom:
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:+88028032333"));
			startActivity(callIntent);
			break;
		case R.id.btnDarusSalamThanaDutyOfficer:
			Intent callIntent1 = new Intent(Intent.ACTION_CALL);
			callIntent1.setData(Uri.parse("tel:+8801713398334"));
			startActivity(callIntent1);
			break;
		case R.id.btnKafrulThanaControlRoom:
			Intent callIntent2 = new Intent(Intent.ACTION_CALL);
			callIntent2.setData(Uri.parse("tel:+88029001061"));
			startActivity(callIntent2);
			break;
		case R.id.btnKafrulThanaDutyOfficer:
			Intent callIntent3 = new Intent(Intent.ACTION_CALL);
			callIntent3.setData(Uri.parse("tel:+8801713373191"));
			startActivity(callIntent3);
			break;
		case R.id.btnMirpurThanaControlRoom:
			Intent callIntent4 = new Intent(Intent.ACTION_CALL);
			callIntent4.setData(Uri.parse("tel:+88029001001"));
			startActivity(callIntent4);
			break;
		case R.id.btnMirpurThanaDutyOfficer:
			Intent callIntent5 = new Intent(Intent.ACTION_CALL);
			callIntent5.setData(Uri.parse("tel:+8801713373189"));
			startActivity(callIntent5);
			break;
		case R.id.btnPallabiThanaControlRoom:
			Intent callIntent6 = new Intent(Intent.ACTION_CALL);
			callIntent6.setData(Uri.parse("tel:+88029015922"));
			startActivity(callIntent6);
			break;
		case R.id.btnPallabiThanaDutyOfficer:
			Intent callIntent7 = new Intent(Intent.ACTION_CALL);
			callIntent7.setData(Uri.parse("tel:+8801713373190"));
			startActivity(callIntent7);
			break;
		case R.id.btnRupnagarThanaControlRoom:
			Intent callIntent8 = new Intent(Intent.ACTION_CALL);
			callIntent8.setData(Uri.parse("tel:+88029002177"));
			startActivity(callIntent8);
			break;
		case R.id.btnRupnagarThanaDutyOfficer:
			Intent callIntent9 = new Intent(Intent.ACTION_CALL);
			callIntent9.setData(Uri.parse("tel:+8801769058059"));
			startActivity(callIntent9);
			break;
		case R.id.btnShahAliThanaControlRoom:
			Intent callIntent10 = new Intent(Intent.ACTION_CALL);
			callIntent10.setData(Uri.parse("tel:+88029002777"));
			startActivity(callIntent10);
			break;
		case R.id.btnShahAliThanaDutyOfficer:
			Intent callIntent11 = new Intent(Intent.ACTION_CALL);
			callIntent11.setData(Uri.parse("tel:+8801713373192"));
			startActivity(callIntent11);
			break;
		case R.id.btnVashantekThanaControlRoom:
			Intent callIntent12 = new Intent(Intent.ACTION_CALL);
			callIntent12.setData(Uri.parse("tel:+88028713023"));
			startActivity(callIntent12);
			break;
		case R.id.btnVashantekThanaDutyOfficer:
			Intent callIntent13 = new Intent(Intent.ACTION_CALL);
			callIntent13.setData(Uri.parse("tel:+8801769058057"));
			startActivity(callIntent13);
			break;

		

		default:
			break;
		}
	}
}
