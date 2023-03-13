package id.go.pringsewukab.kesbangpol.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import id.go.pringsewukab.kesbangpol.R;

public class InformationAppsFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_profil, container, false);
       return view;
    }


    public void onClick(View view) {
    }
}