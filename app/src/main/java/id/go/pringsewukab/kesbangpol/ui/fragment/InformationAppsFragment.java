package id.go.pringsewukab.kesbangpol.ui.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import id.go.pringsewukab.kesbangpol.R;
import id.go.pringsewukab.kesbangpol.ui.PrivacyActivity;

public class InformationAppsFragment extends Fragment {
    ImageButton btnUbahPassword;


    @SuppressLint("MissingInflatedId")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_profil, container, false);

       //Button or pop up
       btnUbahPassword = view.findViewById(R.id.buttonUbahPassword);
       btnUbahPassword.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(getContext(), PrivacyActivity.class);
               startActivity(intent);
           }
       });


       return view;
    }
}