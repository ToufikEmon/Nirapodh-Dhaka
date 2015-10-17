package drawerlayoutView;

import android.app.Fragment;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.nirapodthakun.R;
import com.example.round_image.RoundImage;

public class AboutMe extends Fragment {

	Button btnPhone;

	ImageView imgEmon;
	RoundImage roundImage1, roundImage2, roundImage3;

	public AboutMe() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.about_me, container, false);

		imgEmon = (ImageView) view.findViewById(R.id.imgEmon);

		Bitmap bm2 = BitmapFactory.decodeResource(getResources(),
				R.drawable.emon);

		roundImage2 = new RoundImage(bm2);

		imgEmon.setImageDrawable(roundImage2);

		return view;
	}

}
