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

public class RAB extends Fragment implements OnClickListener {

	Button btnBatalianSadar1, btnControlRoom1, btnDeautyOfficer1,
			btnBatalianSadar2, btnControlRoom2, btnDeautyOfficer2,
			btnBatalianSadar3, btnControlRoom3, btnDeautyOfficer3,
			btnBatalianSadar4, btnControlRoom4, btnDeautyOfficer4;

	public RAB() {

	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.rab_fragment, container, false);

		btnBatalianSadar1 = (Button) view
				.findViewById(R.id.btnrab_batalian_sadar_1);
		btnControlRoom1 = (Button) view.findViewById(R.id.btnrab_contro_room_1);
		btnDeautyOfficer1 = (Button) view
				.findViewById(R.id.btnrab_duty_officer_1);
		btnBatalianSadar2 = (Button) view
				.findViewById(R.id.btnrab_batalian_sadar_2);
		btnControlRoom2 = (Button) view.findViewById(R.id.btnrab_contro_room_2);
		btnDeautyOfficer2 = (Button) view
				.findViewById(R.id.btnrab_duty_officer_2);
		btnBatalianSadar3 = (Button) view
				.findViewById(R.id.btnrab_batalian_sadar_3);
		btnControlRoom3 = (Button) view.findViewById(R.id.btnrab_contro_room_3);
		btnDeautyOfficer3 = (Button) view
				.findViewById(R.id.btnrab_duty_officer_3);

		btnBatalianSadar4 = (Button) view
				.findViewById(R.id.btnrab_batalian_sadar_4);
		btnControlRoom4 = (Button) view.findViewById(R.id.btnrab_contro_room_4);
		btnDeautyOfficer4 = (Button) view
				.findViewById(R.id.btnrab_duty_officer_4);

		btnBatalianSadar1.setOnClickListener(this);
		btnControlRoom1.setOnClickListener(this);
		btnDeautyOfficer1.setOnClickListener(this);
		btnBatalianSadar2.setOnClickListener(this);
		btnControlRoom2.setOnClickListener(this);
		btnDeautyOfficer2.setOnClickListener(this);
		btnBatalianSadar3.setOnClickListener(this);
		btnControlRoom3.setOnClickListener(this);
		btnDeautyOfficer3.setOnClickListener(this);
		btnBatalianSadar4.setOnClickListener(this);
		btnControlRoom4.setOnClickListener(this);
		btnDeautyOfficer4.setOnClickListener(this);

		return view;
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnrab_batalian_sadar_1:
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:+8801777710144"));
			startActivity(callIntent);
			break;
		case R.id.btnrab_contro_room_1:
			Intent callIntent1 = new Intent(Intent.ACTION_CALL);
			callIntent1.setData(Uri.parse("tel:+8801777710199"));
			startActivity(callIntent1);
			break;
		case R.id.btnrab_duty_officer_1:
			Intent callIntent2 = new Intent(Intent.ACTION_CALL);
			callIntent2.setData(Uri.parse("tel:+8801777710110"));
			startActivity(callIntent2);
			break;
		case R.id.btnrab_batalian_sadar_2:
			Intent callIntent3 = new Intent(Intent.ACTION_CALL);
			callIntent3.setData(Uri.parse("tel:+88001777710244"));
			startActivity(callIntent3);
			break;
		case R.id.btnrab_contro_room_2:
			Intent callIntent4 = new Intent(Intent.ACTION_CALL);
			callIntent4.setData(Uri.parse("tel:+8801777710299"));
			startActivity(callIntent4);
			break;
		case R.id.btnrab_duty_officer_2:
			Intent callIntent5 = new Intent(Intent.ACTION_CALL);
			callIntent5.setData(Uri.parse("tel:+8801777710210"));
			startActivity(callIntent5);
			break;

		case R.id.btnrab_batalian_sadar_3:
			Intent callIntent6 = new Intent(Intent.ACTION_CALL);
			callIntent6.setData(Uri.parse("tel:+8801777710344"));
			startActivity(callIntent6);
			break;
		case R.id.btnrab_contro_room_3:
			Intent callIntent7 = new Intent(Intent.ACTION_CALL);
			callIntent7.setData(Uri.parse("tel:+8801777710399"));
			startActivity(callIntent7);
			break;
		case R.id.btnrab_duty_officer_3:
			Intent callIntent8 = new Intent(Intent.ACTION_CALL);
			callIntent8.setData(Uri.parse("tel:+8801777710310"));
			startActivity(callIntent8);
			break;

		case R.id.btnrab_batalian_sadar_4:
			Intent callIntent9 = new Intent(Intent.ACTION_CALL);
			callIntent9.setData(Uri.parse("tel:+8801777710444"));
			startActivity(callIntent9);
			break;
		case R.id.btnrab_contro_room_4:
			Intent callIntent10 = new Intent(Intent.ACTION_CALL);
			callIntent10.setData(Uri.parse("tel:+8801777710499"));
			startActivity(callIntent10);
			break;
		case R.id.btnrab_duty_officer_4:
			Intent callIntent11 = new Intent(Intent.ACTION_CALL);
			callIntent11.setData(Uri.parse("tel:+8801777710410"));
			startActivity(callIntent11);
			break;

		default:
			break;

		}
	}
}
