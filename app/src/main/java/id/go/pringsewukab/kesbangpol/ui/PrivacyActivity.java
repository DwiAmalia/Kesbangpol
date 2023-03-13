package id.go.pringsewukab.kesbangpol.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import id.go.pringsewukab.kesbangpol.R;
import id.go.pringsewukab.kesbangpol.databinding.ActivityPrivacyBinding;

public class PrivacyActivity extends AppCompatActivity {
    private ActivityPrivacyBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy);
        getSupportActionBar().hide();

        binding = ActivityPrivacyBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

    }
}