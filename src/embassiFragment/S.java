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

public class S extends Fragment implements OnClickListener {

	Button btnSaudiArabiaEmbassyPhone, btnSingaporeEmbassyPhone,
			btnSpainEmbassyPhone, btnSriLankaEmbassyPhone,
			btnSwedenEmbassyPhone, btnSwitzerlanEmbassyPhone;

	public S() {
		// TODO Auto-generated constructor stub
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.s, container, false);

		btnSaudiArabiaEmbassyPhone = (Button) view
				.findViewById(R.id.btnSaudiEmbassyPhone);

		btnSingaporeEmbassyPhone = (Button) view
				.findViewById(R.id.btnSingaporeEmbassyPhone);

		btnSpainEmbassyPhone = (Button) view
				.findViewById(R.id.btnSpainEmbassyPhone);

		btnSriLankaEmbassyPhone = (Button) view
				.findViewById(R.id.btnSriLankaEmbassyPhone);

		btnSwedenEmbassyPhone = (Button) view
				.findViewById(R.id.btnSwedenEmbassyPhone);

		btnSwitzerlanEmbassyPhone = (Button) view
				.findViewById(R.id.btnSwitzerlandEmbassyPhone);

		btnSaudiArabiaEmbassyPhone.setOnClickListener(this);
		btnSingaporeEmbassyPhone.setOnClickListener(this);
		btnSpainEmbassyPhone.setOnClickListener(this);
		btnSriLankaEmbassyPhone.setOnClickListener(this);
		btnSwedenEmbassyPhone.setOnClickListener(this);
		btnSwitzerlanEmbassyPhone.setOnClickListener(this);

		return view;
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnSaudiEmbassyPhone:
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:88028829333"));
			startActivity(callIntent);
			break;
		case R.id.btnSingaporeEmbassyPhone:
			Intent callIntent1 = new Intent(Intent.ACTION_CALL);
			callIntent1.setData(Uri.parse("tel:88029880404"));
			startActivity(callIntent1);
			break;
		case R.id.btnSpainEmbassyPhone:
			Intent callIntent2 = new Intent(Intent.ACTION_CALL);
			callIntent2.setData(Uri.parse("tel:+88028833288"));
			startActivity(callIntent2);
			break;
		case R.id.btnSriLankaEmbassyPhone:
			Intent callIntent3 = new Intent(Intent.ACTION_CALL);
			callIntent3.setData(Uri.parse("tel:+88029896353"));
			startActivity(callIntent3);
			break;
		case R.id.btnSwedenEmbassyPhone:
			Intent callIntent4 = new Intent(Intent.ACTION_CALL);
			callIntent4.setData(Uri.parse("tel:+880255668500"));
			startActivity(callIntent4);
			break;
		case R.id.btnSwitzerlandEmbassyPhone:
			Intent callIntent5 = new Intent(Intent.ACTION_CALL);
			callIntent5.setData(Uri.parse("tel:+88028812874"));
			startActivity(callIntent5);
			break;

		default:
			break;

		}
	}
}
