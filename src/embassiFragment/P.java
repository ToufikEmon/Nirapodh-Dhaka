package embassiFragment;

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

public class P extends Fragment implements OnClickListener {

	Button btnPakistanEmbassyPhone, btnPalestineEmbassyPhone,
			btnPhilippinesEmbassyPhone, btnPolandEmbassyPhone;

	public P() {
		// TODO Auto-generated constructor stub
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.p, container, false);

		btnPakistanEmbassyPhone = (Button) view
				.findViewById(R.id.btnPakiataniEmbassyPhone);

		btnPalestineEmbassyPhone = (Button) view
				.findViewById(R.id.btnPalestineEmbassyPhone);

		btnPhilippinesEmbassyPhone = (Button) view
				.findViewById(R.id.btnPhilippinesEmbassyPhone);

		btnPolandEmbassyPhone = (Button) view
				.findViewById(R.id.btnPolandEmbassyPhone);

		btnPakistanEmbassyPhone.setOnClickListener(this);
		btnPalestineEmbassyPhone.setOnClickListener(this);
		btnPhilippinesEmbassyPhone.setOnClickListener(this);
		btnPolandEmbassyPhone.setOnClickListener(this);

		return view;
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnPakiataniEmbassyPhone:
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:+88028825388"));
			startActivity(callIntent);
			break;
		case R.id.btnPalestineEmbassyPhone:
			Intent callIntent1 = new Intent(Intent.ACTION_CALL);
			callIntent1.setData(Uri.parse("tel:88029893895"));
			startActivity(callIntent1);
			break;
		case R.id.btnPhilippinesEmbassyPhone:
			Intent callIntent2 = new Intent(Intent.ACTION_CALL);
			callIntent2.setData(Uri.parse("tel:+88029881590"));
			startActivity(callIntent2);
			break;
		case R.id.btnPolandEmbassyPhone:
			Intent callIntent3 = new Intent(Intent.ACTION_CALL);
			callIntent3.setData(Uri.parse("tel:88029893528"));
			startActivity(callIntent3);
			break;

		default:
			break;

		}
	}
}