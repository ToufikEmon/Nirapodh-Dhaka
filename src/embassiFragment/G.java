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

public class G extends Fragment implements OnClickListener {

	Button btnGermanyEmbassyPhone, btnGreceEmbassyPhone;

	public G() {
		// TODO Auto-generated constructor stub
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.g, container, false);

		btnGermanyEmbassyPhone = (Button) view
				.findViewById(R.id.btnGermanEmbassyPhone);
		btnGreceEmbassyPhone = (Button) view
				.findViewById(R.id.btnGreekEmbassyPhone);

		btnGermanyEmbassyPhone.setOnClickListener(this);
		btnGreceEmbassyPhone.setOnClickListener(this);

		return view;
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnGermanEmbassyPhone:
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:88028853521"));
			startActivity(callIntent);
			break;
		case R.id.btnGreekEmbassyPhone:
			Intent callIntent1 = new Intent(Intent.ACTION_CALL);
			callIntent1.setData(Uri.parse("tel:+88031500943"));
			startActivity(callIntent1);
			break;

		default:
			break;

		}
	}
}
