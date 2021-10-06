package com.example.hungerhub;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class SignUpTabFragment extends Fragment {
    EditText email, mobile, pass, confirm;
    Button signUp;
    float v = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.signup_tab_fragment, container, false);


        email = root.findViewById(R.id.email);
        pass = root.findViewById(R.id.pass);
        mobile = root.findViewById(R.id.mobile);
        confirm = root.findViewById(R.id.confirm);
        signUp = root.findViewById(R.id.sign_up);

        email.setTranslationX(800);
        pass.setTranslationX(800);
        mobile.setTranslationX(800);
        confirm.setTranslationX(800);
        signUp.setTranslationX(800);

        email.setAlpha(v);
        pass.setAlpha(v);
        mobile.setAlpha(v);
        confirm.setAlpha(v);
        signUp.setAlpha(v);

        email.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        pass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        mobile.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();
        confirm.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(900).start();
        signUp.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(1100).start();

        return root;
    }

}
