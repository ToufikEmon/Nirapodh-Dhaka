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

public class M extends Fragment implements OnClickListener {

	Button btnMalaysiaEmbassyPhone, btnMaltaEmbassyPhonel,
			btnMoroccoEmbassyPhone, btnMyanmarEmbassyPhone;

	public M() {
		// TODO Auto-generated constructor stub
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.m, container, false);

		btnMalaysiaEmbassyPhone = (Button) view
				.findViewById(R.id.btnMalaysianEmbassyPhone);
		btnMaltaEmbassyPhonel = (Button) view
				.findViewById(R.id.btnMaltaEmbassyPhone);
		btnMoroccoEmbassyPhone = (Button) view
				.findViewById(R.id.btnMoroccoEmbassyPhone);
		btnMyanmarEmbassyPhone = (Button) view
				.findViewById(R.id.btnMyanmarEmbassyPhone);

		btnMalaysiaEmbassyPhone.setOnClickListener(this);
		btnMaltaEmbassyPhonel.setOnClickListener(this);
		btnMoroccoEmbassyPhone.setOnClickListener(this);
		btnMyanmarEmbassyPhone.setOnClickListener(this);

		return view;
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnMalaysianEmbassyPhone:
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:88028827759"));
			startActivity(callIntent);
			break;
		case R.id.btnMaltaEmbassyPhone:
			Intent callIntent1 = new Intent(Intent.ACTION_CALL);
			callIntent1.setData(Uri.parse("tel:88031721882"));
			startActivity(callIntent1);
			break;
		case R.id.btnMoroccoEmbassyPhone:
			Intent callIntent2 = new Intent(Intent.ACTION_CALL);
			callIntent2.setData(Uri.parse("tel:+8802883176"));
			startActivity(callIntent2);
			break;
		case R.id.btnMyanmarEmbassyPhone:
			Intent callIntent3 = new Intent(Intent.ACTION_CALL);
			callIntent3.setData(Uri.parse("tel:88029888903"));
			startActivity(callIntent3);
			break;

		default:
			break;

		}
	}
}