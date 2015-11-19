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

public class D_E_F extends Fragment implements OnClickListener {

	Button btnDanishEmbasy, btnEgyptEmbassyPhone, btnEthiopianEmbassyPhone,
			btnFrenchEmbassyPhone;

	public D_E_F() {
		// TODO Auto-generated constructor stub
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.d_e_f, container, false);

		btnDanishEmbasy = (Button) view
				.findViewById(R.id.btnDanishEmbassyPhone);
		btnEgyptEmbassyPhone = (Button) view
				.findViewById(R.id.btnEgyptEmbassyPhone);
		btnEthiopianEmbassyPhone = (Button) view
				.findViewById(R.id.btnEthiopianEmbassyPhone);
		btnFrenchEmbassyPhone = (Button) view
				.findViewById(R.id.btnFrenchEmbassyPhone);

		btnDanishEmbasy.setOnClickListener(this);
		btnEgyptEmbassyPhone.setOnClickListener(this);
		btnEthiopianEmbassyPhone.setOnClickListener(this);
		btnFrenchEmbassyPhone.setOnClickListener(this);
		return view;
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnDanishEmbassyPhone:
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:+88028821799"));
			startActivity(callIntent);
			break;
		case R.id.btnEgyptEmbassyPhone:
			Intent callIntent1 = new Intent(Intent.ACTION_CALL);
			callIntent1.setData(Uri.parse("tel:8808822766"));
			startActivity(callIntent1);
			break;
		case R.id.btnEthiopianEmbassyPhone:
			Intent callIntent2 = new Intent(Intent.ACTION_CALL);
			callIntent2.setData(Uri.parse("tel:88029338352"));
			startActivity(callIntent2);
			break;
		case R.id.btnFrenchEmbassyPhone:
			Intent callIntent3 = new Intent(Intent.ACTION_CALL);
			callIntent3.setData(Uri.parse("tel:88028823320"));
			startActivity(callIntent3);
			break;

		default:
			break;

		}
	}
}
