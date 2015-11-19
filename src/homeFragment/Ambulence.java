package homeFragment;

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

public class Ambulence extends Fragment implements OnClickListener {

	Button btnApolloHospital, btnAdDinHospital, btnAnjumanEMofidulIslam,
			btnPGHospital, btnBirdemHospital, btnCMH, btnEyeHospital, btnDMC,
			btnHolyFamily, btnICDDRB, btnIslamiaEyeHospital, btnLabAid,
			btnMedinova, btnNationalHeartFoundation, btnRedCrescent,
			btnSishuHospital, btnSohrawardyHosital, btnSquareHospital,
			btnUnitedHospital, btnOrthPedicHospital;

	public Ambulence() {
		// TODO Auto-generated constructor stub
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.ambulence, container, false);

		btnApolloHospital = (Button) view.findViewById(R.id.btnApolloHospital);
		btnAdDinHospital = (Button) view.findViewById(R.id.btnAdDinHospital);
		btnAnjumanEMofidulIslam = (Button) view
				.findViewById(R.id.btnAnjumanEMufidulislam);
		btnPGHospital = (Button) view.findViewById(R.id.btnPGHospital);
		btnBirdemHospital = (Button) view.findViewById(R.id.btnBirdemHospital);
		btnCMH = (Button) view.findViewById(R.id.btnCMHHospital);
		btnEyeHospital = (Button) view.findViewById(R.id.btnEyeHospital);
		btnDMC = (Button) view.findViewById(R.id.btnDMCHospital);
		btnHolyFamily = (Button) view.findViewById(R.id.btnHolyFamilyHospital);
		btnICDDRB = (Button) view.findViewById(R.id.btnICDDRBHospital);
		btnIslamiaEyeHospital = (Button) view
				.findViewById(R.id.btnIslamiaOpticalHospital);
		btnLabAid = (Button) view.findViewById(R.id.btnLabAidHospital);
		btnMedinova = (Button) view.findViewById(R.id.btnMedinovaHospital);
		btnNationalHeartFoundation = (Button) view
				.findViewById(R.id.btnNationalHeartFoundationHospital);
		btnRedCrescent = (Button) view
				.findViewById(R.id.btnRedCrescentHospital);
		btnSishuHospital = (Button) view.findViewById(R.id.btnSishuHospital);
		btnSohrawardyHosital = (Button) view
				.findViewById(R.id.btnShaheedSuhrawardyHospital);
		btnSquareHospital = (Button) view.findViewById(R.id.btnSquareHospital);
		btnUnitedHospital = (Button) view.findViewById(R.id.btnUnitedHospital);
		btnOrthPedicHospital = (Button) view
				.findViewById(R.id.btnOrthopedicHospital);

		btnApolloHospital.setOnClickListener(this);
		btnAdDinHospital.setOnClickListener(this);
		btnAnjumanEMofidulIslam.setOnClickListener(this);
		btnPGHospital.setOnClickListener(this);
		btnBirdemHospital.setOnClickListener(this);
		btnCMH.setOnClickListener(this);
		btnEyeHospital.setOnClickListener(this);
		btnDMC.setOnClickListener(this);
		btnHolyFamily.setOnClickListener(this);
		btnICDDRB.setOnClickListener(this);
		btnIslamiaEyeHospital.setOnClickListener(this);
		btnLabAid.setOnClickListener(this);
		btnMedinova.setOnClickListener(this);
		btnNationalHeartFoundation.setOnClickListener(this);
		btnRedCrescent.setOnClickListener(this);
		btnSishuHospital.setOnClickListener(this);
		btnSohrawardyHosital.setOnClickListener(this);
		btnSquareHospital.setOnClickListener(this);
		btnUnitedHospital.setOnClickListener(this);
		btnOrthPedicHospital.setOnClickListener(this);

		return view;
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnApolloHospital:
			Intent callIntent = new Intent(Intent.ACTION_CALL);
			callIntent.setData(Uri.parse("tel:+8801714090000"));
			startActivity(callIntent);
			break;
		case R.id.btnAdDinHospital:
			Intent callIntent1 = new Intent(Intent.ACTION_CALL);
			callIntent1.setData(Uri.parse("tel:88029362929"));
			startActivity(callIntent1);
			break;
		case R.id.btnAnjumanEMufidulislam:
			Intent callIntent2 = new Intent(Intent.ACTION_CALL);
			callIntent2.setData(Uri.parse("tel:88029336611"));
			startActivity(callIntent2);
			break;
		case R.id.btnPGHospital:
			Intent callIntent3 = new Intent(Intent.ACTION_CALL);
			callIntent3.setData(Uri.parse("tel:88028614001"));
			startActivity(callIntent3);
			break;
		case R.id.btnBirdemHospital:
			Intent callIntent4 = new Intent(Intent.ACTION_CALL);
			callIntent4.setData(Uri.parse("tel:88029661551"));
			startActivity(callIntent4);
			break;
		case R.id.btnCMHHospital:
			Intent callIntent5 = new Intent(Intent.ACTION_CALL);
			callIntent5.setData(Uri.parse("tel:88029871469"));
			startActivity(callIntent5);
			break;

		case R.id.btnEyeHospital:
			Intent callIntent6 = new Intent(Intent.ACTION_CALL);
			callIntent6.setData(Uri.parse("tel:88028014476"));
			startActivity(callIntent6);
			break;
		case R.id.btnDMCHospital:
			Intent callIntent7 = new Intent(Intent.ACTION_CALL);
			callIntent7.setData(Uri.parse("tel:88028626812"));
			startActivity(callIntent7);
			break;
		case R.id.btnHolyFamilyHospital:
			Intent callIntent8 = new Intent(Intent.ACTION_CALL);
			callIntent8.setData(Uri.parse("tel:88028311721"));
			startActivity(callIntent8);
			break;
		case R.id.btnICDDRBHospital:
			Intent callIntent9 = new Intent(Intent.ACTION_CALL);
			callIntent9.setData(Uri.parse("tel:88028811751"));
			startActivity(callIntent9);
			break;
		case R.id.btnIslamiaOpticalHospital:
			Intent callIntent10 = new Intent(Intent.ACTION_CALL);
			callIntent10.setData(Uri.parse("tel:88029119315"));
			startActivity(callIntent10);
			break;
		case R.id.btnLabAidHospital:
			Intent callIntent11 = new Intent(Intent.ACTION_CALL);
			callIntent11.setData(Uri.parse("tel:+8801713333337"));
			startActivity(callIntent11);
			break;
		case R.id.btnMedinovaHospital:
			Intent callIntent12 = new Intent(Intent.ACTION_CALL);
			callIntent12.setData(Uri.parse("tel:88029120288"));
			startActivity(callIntent12);
			break;
		case R.id.btnNationalHeartFoundationHospital:
			Intent callIntent13 = new Intent(Intent.ACTION_CALL);
			callIntent13.setData(Uri.parse("tel:88028114089"));
			startActivity(callIntent13);
			break;
		case R.id.btnRedCrescentHospital:
			Intent callIntent14 = new Intent(Intent.ACTION_CALL);
			callIntent14.setData(Uri.parse("tel:88029330188"));
			startActivity(callIntent14);
			break;
		case R.id.btnSishuHospital:
			Intent callIntent15 = new Intent(Intent.ACTION_CALL);
			callIntent15.setData(Uri.parse("tel:88028116061"));
			startActivity(callIntent15);
			break;
		case R.id.btnShaheedSuhrawardyHospital:
			Intent callIntent16 = new Intent(Intent.ACTION_CALL);
			callIntent16.setData(Uri.parse("tel:88028114856"));
			startActivity(callIntent16);
			break;
		case R.id.btnSquareHospital:
			Intent callIntent17 = new Intent(Intent.ACTION_CALL);
			callIntent17.setData(Uri.parse("tel:88028144466"));
			startActivity(callIntent17);
			break;
		case R.id.btnUnitedHospital:
			Intent callIntent18 = new Intent(Intent.ACTION_CALL);
			callIntent18.setData(Uri.parse("tel:88028836000"));
			startActivity(callIntent18);
			break;
		case R.id.btnOrthopedicHospital:
			Intent callIntent19 = new Intent(Intent.ACTION_CALL);
			callIntent19.setData(Uri.parse("tel:88029112150"));
			startActivity(callIntent19);
			break;

		default:
			break;

		}
	}
}
