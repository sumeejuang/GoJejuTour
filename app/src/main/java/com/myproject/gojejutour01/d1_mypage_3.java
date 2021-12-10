package com.myproject.gojejutour01;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class d1_mypage_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.d1_10_mypage_3);
    }

    public void OnClickHandler(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("로그아웃").setMessage("정말 로그아웃 하시겠습니까?");

        builder.setPositiveButton("네", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int id)
            {
                Toast.makeText(getApplicationContext(), "OK Click", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("아니오", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int id)
            {
                Toast.makeText(getApplicationContext(), "Cancel Click", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog = builder.create();

        alertDialog.show();
    }

    public void clickBtn(View view) {
        Intent intent=new Intent(d1_mypage_3.this,f2_hotplace_detail_5_1.class);
        startActivity(intent);
    }

    public void clickBtn2(View view) {
        Intent intent=new Intent(d1_mypage_3.this,h1_traveltalk_7.class);
        startActivity(intent);
    }

    public void clickBtn3(View view) {
        Intent intent=new Intent(d1_mypage_3.this,d2_mypage_setting_3_1.class);
        startActivity(intent);
    }

    public void clickBtn4(View view) {
        Intent intent=new Intent(d1_mypage_3.this,b1_login_1.class);
        startActivity(intent);
    }
}
