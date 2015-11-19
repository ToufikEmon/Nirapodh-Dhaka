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

public class Q_R extends Fragment implements OnClickListener {

	Button btnQatarEmbassyPhone, btnRussiaEmbassyPhone;

	public Q_R() {
		// TODO Auto-generated constructor stub
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.q_r, container, false);

		btnQatarEmbassyPhone = (Button) view
				.findViewById(R.id.btnQatarEmbassyPhone);
		btnRussiaEmbassyPhone = (Button) view
				.findViewById(R.id.btnRussianEmbassyPhone);

		btnQatarEmbassyPhone.setOnClickListener(this);
		btnRussiaEmbassyPhone.setOnClickListener(this);
		return view;
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnQatarEmbassyPhone:
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:+8802604477"));
			startActivity(callIntent);
			break;
		case R.id.btnRussianEmbassyPhone:
			Intent callIntent1 = new Intent(Intent.ACTION_CALL);
			callIntent1.setData(Uri.parse("tel:88031654154"));
			startActivity(callIntent1);
			break;

		default:
			break;

		}
	}
}
