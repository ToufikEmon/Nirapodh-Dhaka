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

public class B extends Fragment implements OnClickListener {

	Button btnBritishEmbassyPhone, btnBelgiumEmbassyPhone,
			btnBhutanEmbassyPhone, btnBrazilEmbassyPhone,
			btnBruneiEmbassyPhone;

	public B() {
		// TODO Auto-generated constructor stub
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.b, container, false);

		btnBritishEmbassyPhone = (Button) view
				.findViewById(R.id.btnBritainEmbassyPhone);
		btnBelgiumEmbassyPhone = (Button) view
				.findViewById(R.id.btnBelgiumEmbassyPhone);
		btnBhutanEmbassyPhone = (Button) view
				.findViewById(R.id.btnBHUTANEmbassyPhone);
		btnBrazilEmbassyPhone = (Button) view
				.findViewById(R.id.btnBRAambassyPhone);
		btnBruneiEmbassyPhone = (Button) view
				.findViewById(R.id.btnBRUNEIEmbassyPhone);

		btnBritishEmbassyPhone.setOnClickListener(this);
		btnBelgiumEmbassyPhone.setOnClickListener(this);
		btnBhutanEmbassyPhone.setOnClickListener(this);
		btnBrazilEmbassyPhone.setOnClickListener(this);
		btnBruneiEmbassyPhone.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.btnBritainEmbassyPhone:
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:+88028822705"));
			startActivity(callIntent);

			break;
		case R.id.btnBelgiumEmbassyPhone:
			Intent callIntent4 = new Intent(Intent.ACTION_CALL);
			callIntent4.setData(Uri.parse("tel:+88028878603"));
			startActivity(callIntent4);

			break;
		case R.id.btnBHUTANEmbassyPhone:
			Intent callIntent1 = new Intent(Intent.ACTION_CALL);
			callIntent1.setData(Uri.parse("tel:88028826863"));
			startActivity(callIntent1);

			break;
		case R.id.btnBRAambassyPhone:
			Intent callIntent2 = new Intent(Intent.ACTION_CALL);
			callIntent2.setData(Uri.parse("tel:88029887667"));
			startActivity(callIntent2);

			break;
		case R.id.btnBRUNEIEmbassyPhone:
			Intent callIntent3 = new Intent(Intent.ACTION_CALL);
			callIntent3.setData(Uri.parse("tel:88029861837"));
			startActivity(callIntent3);

			break;

		default:
			break;
		}

	}

}
