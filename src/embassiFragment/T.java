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

public class T extends Fragment implements OnClickListener {

	Button btnTaiwaneseEmbassyPhone, btnTanzinaianEmbassyPhone,
			btnThaiEmbassyPhone, btnTurkeyEmbassyPhone;

	public T() {
		// TODO Auto-generated constructor stub
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.t, container, false);

		btnTaiwaneseEmbassyPhone = (Button) view
				.findViewById(R.id.btnTaiwanessEmbassyPhone);

		btnTanzinaianEmbassyPhone = (Button) view
				.findViewById(R.id.btnTanzanianEmbassyPhone);

		btnThaiEmbassyPhone = (Button) view
				.findViewById(R.id.btnThaiEmbassyPhone);

		btnTurkeyEmbassyPhone = (Button) view
				.findViewById(R.id.btnTurkyEmbassyPhone);

		btnTaiwaneseEmbassyPhone.setOnClickListener(this);
		btnTanzinaianEmbassyPhone.setOnClickListener(this);
		btnThaiEmbassyPhone.setOnClickListener(this);
		btnTurkeyEmbassyPhone.setOnClickListener(this);

		return view;
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnTaiwanessEmbassyPhone:
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:00288028851082"));
			startActivity(callIntent);
			break;
		case R.id.btnTanzanianEmbassyPhone:
			Intent callIntent1 = new Intent(Intent.ACTION_CALL);
			callIntent1.setData(Uri.parse("tel:+8802836203"));
			startActivity(callIntent1);
			break;
		case R.id.btnThaiEmbassyPhone:
			Intent callIntent2 = new Intent(Intent.ACTION_CALL);
			callIntent2.setData(Uri.parse("tel:+88028812795"));
			startActivity(callIntent2);
			break;
		case R.id.btnTurkyEmbassyPhone:
			Intent callIntent3 = new Intent(Intent.ACTION_CALL);
			callIntent3.setData(Uri.parse("tel:+88028822198"));
			startActivity(callIntent3);
			break;

		default:
			break;

		}
	}
}
