package com.myproject.gojejutour01;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class b2_register_1_1 extends AppCompatActivity {

    android.widget.Button email_login_button;
    LinearLayout signin_layout, signin_layout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b2_3_register_1_1);

        email_login_button = findViewById(R.id.email_login_button);

        signin_layout = findViewById(R.id.signin_layout);
        signin_layout2 = findViewById(R.id.signin_layout2);

        final AlertDialog.Builder alert = new AlertDialog.Builder(b2_register_1_1.this);
        alert.setMessage("회원가입 하시겠습니까?").setCancelable(false).setPositiveButton("예", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                signin_layout.setVisibility(View.GONE);
                signin_layout2.setVisibility(View.VISIBLE);
            }
        }).setNegativeButton("아니요", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "취소되었습니다", Toast.LENGTH_SHORT).show();
            }
        });

        email_login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = alert.create();
                alertDialog.show();
            }
        });

    }
}