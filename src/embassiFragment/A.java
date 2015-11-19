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

public class A extends Fragment implements OnClickListener {

	Button btnAfganisthan, btnAustralia, btnAustria;

	public A() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.a, container, false);

		btnAfganisthan = (Button) view.findViewById(R.id.btnAfganEmbassyPhone);
		btnAustralia = (Button) view
				.findViewById(R.id.btnAustralianEmbassyPhone);

		btnAustria = (Button) view.findViewById(R.id.btnAustrianEmbassyPhone);

		btnAfganisthan.setOnClickListener(this);
		btnAustralia.setOnClickListener(this);
		btnAustria.setOnClickListener(this);
		return view;
	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.btnAfganEmbassyPhone:
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:88029895994"));
			startActivity(callIntent);

			break;
		case R.id.btnAustralianEmbassyPhone:
			Intent callIntent1 = new Intent(Intent.ACTION_CALL);
			callIntent1.setData(Uri.parse("tel:88028813105"));
			startActivity(callIntent1);

			break;
		case R.id.btnAustrianEmbassyPhone:
			Intent callIntent2 = new Intent(Intent.ACTION_CALL);
			callIntent2.setData(Uri.parse("tel:8802982064951"));
			startActivity(callIntent2);

			break;

		default:
			break;
		}

	}

}
