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

public class FireService extends Fragment implements OnClickListener {

	Button btnTejgaonFireStation, btnMohammadpurFireStation,
			btnMirpurFireStation, btnKurmitolaFireStation,
			btnBaridharaFireStation, btnSiddikBazarFireStation,
			btnSodoghatFireStaion, btnPostogolaFireStation,
			btnLalbaghFireStation, btnPolashiBarakFireStaiton,
			btnKhilgaonFireStation;

	public FireService() {
		// TODO Auto-generated constructor stub
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.fire_service_fragment, container,
				false);

		btnTejgaonFireStation = (Button) view
				.findViewById(R.id.btnTejgaonStation);
		btnMohammadpurFireStation = (Button) view
				.findViewById(R.id.btnMohammadpurStation);
		btnMirpurFireStation = (Button) view
				.findViewById(R.id.btnMirpurStation);
		btnKurmitolaFireStation = (Button) view
				.findViewById(R.id.btnKurmitolaStation);
		btnBaridharaFireStation = (Button) view
				.findViewById(R.id.btnBaridharaStation);
		btnSiddikBazarFireStation = (Button) view
				.findViewById(R.id.btnSiddikBazarStation);
		btnSodoghatFireStaion = (Button) view
				.findViewById(R.id.btnSodorghatStation);
		btnPostogolaFireStation = (Button) view
				.findViewById(R.id.btnPostogolaStation);
		btnLalbaghFireStation = (Button) view
				.findViewById(R.id.btnLalbaghStation);
		btnPolashiBarakFireStaiton = (Button) view
				.findViewById(R.id.btnPolasiStation);
		btnKhilgaonFireStation = (Button) view
				.findViewById(R.id.btnKhilgaoanStation);

		btnTejgaonFireStation.setOnClickListener(this);
		btnMohammadpurFireStation.setOnClickListener(this);
		btnMirpurFireStation.setOnClickListener(this);
		btnKurmitolaFireStation.setOnClickListener(this);
		btnBaridharaFireStation.setOnClickListener(this);
		btnSiddikBazarFireStation.setOnClickListener(this);
		btnSodoghatFireStaion.setOnClickListener(this);
		btnPostogolaFireStation.setOnClickListener(this);
		btnLalbaghFireStation.setOnClickListener(this);
		btnPolashiBarakFireStaiton.setOnClickListener(this);
		btnKhilgaonFireStation.setOnClickListener(this);

		return view;
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnTejgaonStation:
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:88029898187"));
			startActivity(callIntent);
			break;
		case R.id.btnMohammadpurStation:
			Intent callIntent1 = new Intent(Intent.ACTION_CALL);
			callIntent1.setData(Uri.parse("tel:88029112078"));
			startActivity(callIntent1);
			break;
		case R.id.btnMirpurStation:
			Intent callIntent2 = new Intent(Intent.ACTION_CALL);
			callIntent2.setData(Uri.parse("tel:88029001055"));
			startActivity(callIntent2);
			break;
		case R.id.btnKurmitolaStation:
			Intent callIntent3 = new Intent(Intent.ACTION_CALL);
			callIntent3.setData(Uri.parse("tel:88029860762"));
			startActivity(callIntent3);
			break;
		case R.id.btnBaridharaStation:
			Intent callIntent4 = new Intent(Intent.ACTION_CALL);
			callIntent4.setData(Uri.parse("tel:88028827397"));
			startActivity(callIntent4);
			break;
		case R.id.btnSiddikBazarStation:
			Intent callIntent5 = new Intent(Intent.ACTION_CALL);
			callIntent5.setData(Uri.parse("tel:88029555555"));
			startActivity(callIntent5);
			break;

		case R.id.btnSodorghatStation:
			Intent callIntent6 = new Intent(Intent.ACTION_CALL);
			callIntent6.setData(Uri.parse("tel:88027119759"));
			startActivity(callIntent6);
			break;
		case R.id.btnPostogolaStation:
			Intent callIntent7 = new Intent(Intent.ACTION_CALL);
			callIntent7.setData(Uri.parse("tel:88027410771"));
			startActivity(callIntent7);
			break;
		case R.id.btnLalbaghStation:
			Intent callIntent8 = new Intent(Intent.ACTION_CALL);
			callIntent8.setData(Uri.parse("tel:88028619981"));
			startActivity(callIntent8);
			break;
		case R.id.btnPolasiStation:
			Intent callIntent9 = new Intent(Intent.ACTION_CALL);
			callIntent9.setData(Uri.parse("tel:88028628688"));
			startActivity(callIntent9);
			break;
		case R.id.btnKhilgaoanStation:
			Intent callIntent10 = new Intent(Intent.ACTION_CALL);
			callIntent10.setData(Uri.parse("tel:88027218329"));
			startActivity(callIntent10);
			break;

		default:
			break;

		}
	}
}
