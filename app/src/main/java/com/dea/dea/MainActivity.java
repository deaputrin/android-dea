package com.dea.dea;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText Etuser, EtPass;
    private Button btnLogin;

    private String username = "HiDeyyy";
    private String password = "akubaikbanget";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Etuser = findViewById(R.id.Etuser);
        EtPass = findViewById(R.id.Etpass);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Etuser.getText().toString().equalsIgnoreCase(username) && EtPass.getText().toString().equalsIgnoreCase(password)){
                    Intent login = new Intent(MainActivity.this, Dashboard.class);
                    startActivity(login);

                    Toast.makeText(MainActivity.this, "CHUAKS!!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "NT!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}