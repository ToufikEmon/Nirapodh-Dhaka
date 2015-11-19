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

public class MotijhilZone extends Fragment implements OnClickListener {

	Button btnKhilgaonControlRoom, btnKhilgaonDeutyOfficer,
			btnMothijhilControlRoom, btnMothijhilDeutyOfficer,
			btnMukdaControlRoom, btnMukdaDeutyOfficer, btnPoltonControlRoom,
			btnPoltonDeutyOfficer, btnRampuraControlRoom,
			btnRampuraDeutyOfficer, btnSabujbaghControlRoom,
			btnSabujbaghDeutyOfficer, btnShahjahanpurThanaConrtrolRoom,
			btnShahjahanpurDutyOfficer, btnMotijhilACPetrol,
			btnMotijhilDeputyComissionar;

	public MotijhilZone() {
		// TODO Auto-generated constructor stub
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.motijhil_zone_fragment,
				container, false);

		btnKhilgaonControlRoom = (Button) view
				.findViewById(R.id.btnKhilgaonThanaControlRoom);
		btnKhilgaonDeutyOfficer = (Button) view
				.findViewById(R.id.btnKhilgaonThanaDutyOfficer);
		btnMothijhilControlRoom = (Button) view
				.findViewById(R.id.btnMotijheelThanaControlRoom);
		btnMothijhilDeutyOfficer = (Button) view
				.findViewById(R.id.btnMotijheelThanaDutyOfficer);
		btnMukdaControlRoom = (Button) view
				.findViewById(R.id.btnMukdaThanaControlRoom);
		btnMukdaDeutyOfficer = (Button) view
				.findViewById(R.id.btnMukdaThanaDutyOfficer);
		btnPoltonControlRoom = (Button) view
				.findViewById(R.id.btnPaltanThanaControlRoom);
		btnPoltonDeutyOfficer = (Button) view
				.findViewById(R.id.btnPaltanThanaDutyOfficer);
		btnRampuraControlRoom = (Button) view
				.findViewById(R.id.btnRampuraThanaControlRoom);
		btnRampuraDeutyOfficer = (Button) view
				.findViewById(R.id.btnRampuraDutyOfficer);
		btnSabujbaghControlRoom = (Button) view
				.findViewById(R.id.btnSabujbagThanaControlRoom);
		btnSabujbaghDeutyOfficer = (Button) view
				.findViewById(R.id.btnSabujbagThanaDutyOfficer);
		btnShahjahanpurThanaConrtrolRoom = (Button) view
				.findViewById(R.id.btnShazanpurThanaControlRoom);
		btnShahjahanpurDutyOfficer = (Button) view
				.findViewById(R.id.btnShazanpurThanaDutyOfficer);
		

		btnKhilgaonControlRoom.setOnClickListener(this);
		btnKhilgaonDeutyOfficer.setOnClickListener(this);
		btnMothijhilControlRoom.setOnClickListener(this);
		btnMothijhilDeutyOfficer.setOnClickListener(this);
		btnMukdaControlRoom.setOnClickListener(this);
		btnMukdaDeutyOfficer.setOnClickListener(this);
		btnPoltonControlRoom.setOnClickListener(this);
		btnPoltonDeutyOfficer.setOnClickListener(this);
		btnRampuraControlRoom.setOnClickListener(this);
		btnRampuraDeutyOfficer.setOnClickListener(this);
		btnSabujbaghControlRoom.setOnClickListener(this);
		btnSabujbaghDeutyOfficer.setOnClickListener(this);
		btnShahjahanpurThanaConrtrolRoom.setOnClickListener(this);
		btnShahjahanpurDutyOfficer.setOnClickListener(this);
		

		return view;
	}

	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.btnKhilgaonThanaControlRoom:
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:+88027219090"));
			startActivity(callIntent);
			break;
		case R.id.btnKhilgaonThanaDutyOfficer:
			Intent callIntent1 = new Intent(Intent.ACTION_CALL);
			callIntent1.setData(Uri.parse("tel:+8801713373154"));
			startActivity(callIntent1);
			break;
		case R.id.btnMotijheelThanaControlRoom:
			Intent callIntent2 = new Intent(Intent.ACTION_CALL);
			callIntent2.setData(Uri.parse("tel:+88029571000"));
			startActivity(callIntent2);
			break;
		case R.id.btnMotijheelThanaDutyOfficer:
			Intent callIntent3 = new Intent(Intent.ACTION_CALL);
			callIntent3.setData(Uri.parse("tel:+8801713373152"));
			startActivity(callIntent3);
			break;
		case R.id.btnMukdaThanaControlRoom:
			Intent callIntent4 = new Intent(Intent.ACTION_CALL);
			callIntent4.setData(Uri.parse("tel:+88027549722"));
			startActivity(callIntent4);
			break;
		case R.id.btnMukdaThanaDutyOfficer:
			Intent callIntent5 = new Intent(Intent.ACTION_CALL);
			callIntent5.setData(Uri.parse("tel:+8801769058061"));
			startActivity(callIntent5);
			break;
		case R.id.btnPaltanThanaControlRoom:
			Intent callIntent6 = new Intent(Intent.ACTION_CALL);
			callIntent6.setData(Uri.parse("tel:+88029360802"));
			startActivity(callIntent6);
			break;
		case R.id.btnPaltanThanaDutyOfficer:
			Intent callIntent7 = new Intent(Intent.ACTION_CALL);
			callIntent7.setData(Uri.parse("tel:+8801713373155"));
			startActivity(callIntent7);
			break;
		case R.id.btnRampuraThanaControlRoom:
			Intent callIntent8 = new Intent(Intent.ACTION_CALL);
			callIntent8.setData(Uri.parse("tel:+88027290999"));
			startActivity(callIntent8);
			break;
		case R.id.btnRampuraDutyOfficer:
			Intent callIntent9 = new Intent(Intent.ACTION_CALL);
			callIntent9.setData(Uri.parse("tel:+8801713398526"));
			startActivity(callIntent9);
			break;
		case R.id.btnSabujbagThanaControlRoom:
			Intent callIntent10 = new Intent(Intent.ACTION_CALL);
			callIntent10.setData(Uri.parse("tel:+88027219988"));
			startActivity(callIntent10);
			break;
		case R.id.btnSabujbagThanaDutyOfficer:
			Intent callIntent11 = new Intent(Intent.ACTION_CALL);
			callIntent11.setData(Uri.parse("tel:+8801713373153"));
			startActivity(callIntent11);
			break;
		case R.id.btnShazanpurThanaControlRoom:
			Intent callIntent12 = new Intent(Intent.ACTION_CALL);
			callIntent12.setData(Uri.parse("tel:+88029360535"));
			startActivity(callIntent12);
			break;
		case R.id.btnShazanpurThanaDutyOfficer:
			Intent callIntent13 = new Intent(Intent.ACTION_CALL);
			callIntent13.setData(Uri.parse("tel:+8801769058063"));
			startActivity(callIntent13);
			break;

		

		default:
			break;
		}
	}
}
