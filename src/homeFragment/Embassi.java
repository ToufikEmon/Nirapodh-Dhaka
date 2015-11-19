package homeFragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.emon.nirapodthdhaka.R;

import embassiFragment.A;
import embassiFragment.B;
import embassiFragment.C;
import embassiFragment.D_E_F;
import embassiFragment.G;
import embassiFragment.I;
import embassiFragment.J_K_L;
import embassiFragment.M;
import embassiFragment.N;
import embassiFragment.P;
import embassiFragment.Q_R;
import embassiFragment.S;
import embassiFragment.T;
import embassiFragment.U_V;

public class Embassi extends Fragment implements OnClickListener {

	Button btnA, btnB, btnC, btnDEF, btnG, btnI, btnJKL, btnM, btnN, btnP,
			btnQR, btnS, btnT, btnUV;

	public Embassi() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.embassi, container, false);

		btnA = (Button) view.findViewById(R.id.btnA);
		btnB = (Button) view.findViewById(R.id.btnB);
		btnC = (Button) view.findViewById(R.id.btnC);
		btnDEF = (Button) view.findViewById(R.id.btnDEF);
		btnG = (Button) view.findViewById(R.id.btnG);
		btnI = (Button) view.findViewById(R.id.btnI);
		btnJKL = (Button) view.findViewById(R.id.btnJKL);
		btnM = (Button) view.findViewById(R.id.btnM);
		btnN = (Button) view.findViewById(R.id.btnN);
		btnP = (Button) view.findViewById(R.id.btnP);
		btnQR = (Button) view.findViewById(R.id.btnQR);
		btnS = (Button) view.findViewById(R.id.btnS);
		btnT = (Button) view.findViewById(R.id.btnT);
		btnUV = (Button) view.findViewById(R.id.btnUV);

		btnA.setOnClickListener(this);
		btnB.setOnClickListener(this);
		btnC.setOnClickListener(this);
		btnDEF.setOnClickListener(this);
		btnG.setOnClickListener(this);
		btnI.setOnClickListener(this);
		btnJKL.setOnClickListener(this);
		btnM.setOnClickListener(this);
		btnN.setOnClickListener(this);
		btnP.setOnClickListener(this);
		btnQR.setOnClickListener(this);
		btnS.setOnClickListener(this);
		btnT.setOnClickListener(this);
		btnUV.setOnClickListener(this);

		return view;
	}

	@Override
	public void onClick(View v) {

		FragmentManager fm = getFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();

		switch (v.getId()) {
		case R.id.btnA:
			A a = new A();
			ft.replace(R.id.frame_container, a);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnB:
			B b = new B();
			ft.replace(R.id.frame_container, b);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnC:
			C c = new C();
			ft.replace(R.id.frame_container, c);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnDEF:
			D_E_F f = new D_E_F();
			ft.replace(R.id.frame_container, f);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnG:
			G g = new G();
			ft.replace(R.id.frame_container, g);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnI:
			I i = new I();
			ft.replace(R.id.frame_container, i);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnJKL:
			J_K_L jkl = new J_K_L();
			ft.replace(R.id.frame_container, jkl);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnM:
			M m = new M();
			ft.replace(R.id.frame_container, m);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnN:
			N n = new N();
			ft.replace(R.id.frame_container, n);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnP:
			P p = new P();
			ft.replace(R.id.frame_container, p);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnQR:
			Q_R qr = new Q_R();
			ft.replace(R.id.frame_container, qr);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnS:
			S s = new S();
			ft.replace(R.id.frame_container, s);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnT:
			T t = new T();
			ft.replace(R.id.frame_container, t);
			ft.addToBackStack(null);
			ft.commit();

			break;
		case R.id.btnUV:
			U_V uv = new U_V();
			ft.replace(R.id.frame_container, uv);
			ft.addToBackStack(null);
			ft.commit();

			break;

		default:
			break;
		}

	}

}
