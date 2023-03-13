package id.go.pringsewukab.kesbangpol;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class login extends AppCompatActivity {
    TextView tvForgetPass;
    TextInputEditText inputUsername, inputPassword;
    Button btnLogin;
    String username, password;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tvForgetPass = findViewById(R.id.tvForgetPassword);
        tvForgetPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDiaglog = new AlertDialog.Builder(login.this);
                alertDiaglog.setMessage("Lupa Password Harap Menghubungi Kontak Developer");
                alertDiaglog.setPositiveButton("Oke", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                alertDiaglog.show();
            }
        });

        btnLogin = findViewById(R.id.login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(inputUsername.getText().toString())||
                TextUtils.isEmpty(inputPassword.getText().toString())){
                    AlertDialog.Builder alertDiaglog = new AlertDialog.Builder(login.this);
                    alertDiaglog.setMessage("Harap Masukkan Username dan Password");
                    alertDiaglog.setPositiveButton("Oke", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
                    alertDiaglog.show();
                }
                else {
                    //create method login
                    loginUser(username, password);
                }
            }
        });

    }

    //api login
    private void loginUser(String username, String password) {
    }
}