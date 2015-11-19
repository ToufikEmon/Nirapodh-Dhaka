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

public class C extends Fragment implements OnClickListener {

	Button btnCanadaEmbassyPhone, btnChinaEmbassyPhone, btnCubaEmbassyPhone,
			btnCyprusEmbassyPhone, btnCzechEmbassyPhone;

	public C() {
		// TODO Auto-generated constructor stub
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.c, container, false);

		btnCanadaEmbassyPhone = (Button) view
				.findViewById(R.id.btnCanadianEmbassyPhone);
		btnChinaEmbassyPhone = (Button) view
				.findViewById(R.id.btnChinessEmbassyPhone);

		btnCubaEmbassyPhone = (Button) view
				.findViewById(R.id.btnCubianEmbassyPhone);

		btnCyprusEmbassyPhone = (Button) view
				.findViewById(R.id.btnCyprusEmbassyPhone);

		btnCzechEmbassyPhone = (Button) view
				.findViewById(R.id.btnCzechRepublicPhone);

		btnCanadaEmbassyPhone.setOnClickListener(this);
		btnChinaEmbassyPhone.setOnClickListener(this);
		btnCubaEmbassyPhone.setOnClickListener(this);
		btnCyprusEmbassyPhone.setOnClickListener(this);
		btnCzechEmbassyPhone.setOnClickListener(this);

		return view;
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnCanadianEmbassyPhone:
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:+880255668444"));
			startActivity(callIntent);
			break;
		case R.id.btnChinessEmbassyPhone:
			Intent callIntent1 = new Intent(Intent.ACTION_CALL);
			callIntent1.setData(Uri.parse("tel:88028824862"));
			startActivity(callIntent1);
			break;
		case R.id.btnCubianEmbassyPhone:
			Intent callIntent2 = new Intent(Intent.ACTION_CALL);
			callIntent2.setData(Uri.parse("tel:8802603130"));
			startActivity(callIntent2);
			break;
		case R.id.btnCyprusEmbassyPhone:
			Intent callIntent3 = new Intent(Intent.ACTION_CALL);
			callIntent3.setData(Uri.parse("tel:88028825845"));
			startActivity(callIntent3);
			break;
		case R.id.btnCzechRepublicPhone:
			Intent callIntent4 = new Intent(Intent.ACTION_CALL);
			callIntent4.setData(Uri.parse("tel:88028821942"));
			startActivity(callIntent4);
			break;
		default:
			break;

		}
	}
}
