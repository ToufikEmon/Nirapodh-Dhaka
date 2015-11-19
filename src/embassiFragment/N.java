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

public class N extends Fragment implements OnClickListener {

	Button btnNepalEmbassyPhone, btnNetharlandsEmbassyPhone,
			btnNewZealandEmbassyPhone, btnNorwegianEmbassyPhone;

	public N() {
		// TODO Auto-generated constructor stub
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.n, container, false);

		btnNepalEmbassyPhone = (Button) view
				.findViewById(R.id.btnNepaleseEmbassyPhone);

		btnNetharlandsEmbassyPhone = (Button) view
				.findViewById(R.id.btnNetherlandsEmbassyPhone);

		btnNewZealandEmbassyPhone = (Button) view
				.findViewById(R.id.btnNewZelandEmbassyPhone);

		btnNorwegianEmbassyPhone = (Button) view
				.findViewById(R.id.btnNorweginEmbassyPhone);

		btnNepalEmbassyPhone.setOnClickListener(this);
		btnNetharlandsEmbassyPhone.setOnClickListener(this);
		btnNewZealandEmbassyPhone.setOnClickListener(this);
		btnNorwegianEmbassyPhone.setOnClickListener(this);

		return view;
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnNepaleseEmbassyPhone:
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:8802601790"));
			startActivity(callIntent);
			break;
		case R.id.btnNetherlandsEmbassyPhone:
			Intent callIntent1 = new Intent(Intent.ACTION_CALL);
			callIntent1.setData(Uri.parse("tel:+88028822715"));
			startActivity(callIntent1);
			break;
		case R.id.btnNewZelandEmbassyPhone:
			Intent callIntent2 = new Intent(Intent.ACTION_CALL);
			callIntent2.setData(Uri.parse("tel:+88028861947"));
			startActivity(callIntent2);
			break;
		case R.id.btnNorweginEmbassyPhone:
			Intent callIntent3 = new Intent(Intent.ACTION_CALL);
			callIntent3.setData(Uri.parse("tel:+88028816276"));
			startActivity(callIntent3);
			break;

		default:
			break;

		}
	}
}
