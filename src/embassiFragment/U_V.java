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

public class U_V extends Fragment implements OnClickListener {

	Button btnUAEEMbassyPhone, btnUSEmbassyPhone, btnUzbekistanEmbassyPhone,
			btnVietNameEmbassyPhone;

	public U_V() {
		// TODO Auto-generated constructor stub
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.u_v, container, false);

		btnUAEEMbassyPhone = (Button) view
				.findViewById(R.id.btnEmiratesEmbassyPhone);
		btnUSEmbassyPhone = (Button) view.findViewById(R.id.btnUSEmbassyPhone);
		btnUzbekistanEmbassyPhone = (Button) view
				.findViewById(R.id.btnUzbekistanEmbassyPhone);
		btnVietNameEmbassyPhone = (Button) view
				.findViewById(R.id.btnVietnamEmbassyPhone);

		btnUAEEMbassyPhone.setOnClickListener(this);
		btnUSEmbassyPhone.setOnClickListener(this);
		btnUzbekistanEmbassyPhone.setOnClickListener(this);
		btnVietNameEmbassyPhone.setOnClickListener(this);

		return view;
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnEmiratesEmbassyPhone:
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:+88029882244"));
			startActivity(callIntent);
			break;
		case R.id.btnUSEmbassyPhone:
			Intent callIntent1 = new Intent(Intent.ACTION_CALL);
			callIntent1.setData(Uri.parse("tel:88028855500"));
			startActivity(callIntent1);
			break;
		case R.id.btnUzbekistanEmbassyPhone:
			Intent callIntent2 = new Intent(Intent.ACTION_CALL);
			callIntent2.setData(Uri.parse("tel:88028813453"));
			startActivity(callIntent2);
			break;
		case R.id.btnVietnamEmbassyPhone:
			Intent callIntent3 = new Intent(Intent.ACTION_CALL);
			callIntent3.setData(Uri.parse("tel:+88029854052"));
			startActivity(callIntent3);
			break;

		default:
			break;

		}
	}
}