package drawerlayoutView;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.emon.nirapodthdhaka.R;

public class HistoryOfDhaka extends Fragment {
	public HistoryOfDhaka() {

	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View view = inflater.inflate(R.layout.history_of_dhaka, container,
				false);

		return view;
	}

}
