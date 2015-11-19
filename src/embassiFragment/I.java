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

public class I extends Fragment implements OnClickListener {

	Button btnIcelandEmbassyPhone, btnIndianEmbassyPhone,
			btnIndonessianEmbassyPhone, btnIraqEmbassyPhone,
			btnItalyEmbassyPhone;

	public I() {
		// TODO Auto-generated constructor stub
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.i, container, false);

		btnIcelandEmbassyPhone = (Button) view
				.findViewById(R.id.btnIcelandEmbassyPhone);
		btnIndianEmbassyPhone = (Button) view
				.findViewById(R.id.btnIndianEmbassyPhone);
		btnIndonessianEmbassyPhone = (Button) view
				.findViewById(R.id.btnIndonessianEmbassyPhone);
		btnIraqEmbassyPhone = (Button) view
				.findViewById(R.id.btnIraqiEmbassyPhone);
		btnItalyEmbassyPhone = (Button) view
				.findViewById(R.id.btnItalyEmbassyPhone);

		btnIcelandEmbassyPhone.setOnClickListener(this);
		btnIndianEmbassyPhone.setOnClickListener(this);
		btnIndonessianEmbassyPhone.setOnClickListener(this);
		btnIraqEmbassyPhone.setOnClickListener(this);
		btnItalyEmbassyPhone.setOnClickListener(this);

		return view;
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnIcelandEmbassyPhone:
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:88029551927"));
			startActivity(callIntent);
			break;
		case R.id.btnIndianEmbassyPhone:
			Intent callIntent1 = new Intent(Intent.ACTION_CALL);
			callIntent1.setData(Uri.parse("tel:88029889339"));
			startActivity(callIntent1);
			break;
		case R.id.btnIndonessianEmbassyPhone:
			Intent callIntent2 = new Intent(Intent.ACTION_CALL);
			callIntent2.setData(Uri.parse("tel:88029881640"));
			startActivity(callIntent2);
			break;
		case R.id.btnIraqiEmbassyPhone:
			Intent callIntent3 = new Intent(Intent.ACTION_CALL);
			callIntent3.setData(Uri.parse("tel:8802600298"));
			startActivity(callIntent3);
			break;
		case R.id.btnItalyEmbassyPhone:
			Intent callIntent4 = new Intent(Intent.ACTION_CALL);
			callIntent4.setData(Uri.parse("tel:88028822781"));
			startActivity(callIntent4);
			break;

		default:
			break;

		}
	}
}
