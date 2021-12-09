package com.myproject.gojejutour01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class b1_login_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b1_2_login_1);
    }
    public void clickBtn(View view) {
        Intent intent=new Intent(b1_login_1.this,MainActivity.class);
        startActivity(intent);
    }

    public void clickBtn2(View view) {
        Intent intent=new Intent(b1_login_1.this,b2_register_1_1.class);
        startActivity(intent);
    }


}