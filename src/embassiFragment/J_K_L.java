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

public class J_K_L extends Fragment implements OnClickListener {
	Button btnJapanEmbassyPhone, btnkuwaitEmbassyPhone, btnLibyaEmbassyPhone;

	public J_K_L() {
		// TODO Auto-generated constructor stub
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.j_k_l, container, false);

		btnJapanEmbassyPhone = (Button) view
				.findViewById(R.id.btnJapanEmbassyPhone);
		btnkuwaitEmbassyPhone = (Button) view
				.findViewById(R.id.btnKuwaitEmbassyPhone);
		btnLibyaEmbassyPhone = (Button) view
				.findViewById(R.id.btnLibyanEmbassyPhone);

		btnJapanEmbassyPhone.setOnClickListener(this);
		btnkuwaitEmbassyPhone.setOnClickListener(this);
		btnLibyaEmbassyPhone.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnJapanEmbassyPhone:
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:88028810087"));
			startActivity(callIntent);
			break;
		case R.id.btnKuwaitEmbassyPhone:
			Intent callIntent1 = new Intent(Intent.ACTION_CALL);
			callIntent1.setData(Uri.parse("tel:+8802882700"));
			startActivity(callIntent1);
			break;
		case R.id.btnLibyanEmbassyPhone:
			Intent callIntent2 = new Intent(Intent.ACTION_CALL);
			callIntent2.setData(Uri.parse("tel:+88029895808"));
			startActivity(callIntent2);
			break;

		default:
			break;

		}
	}
}