package com.myproject.gojejutour01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class b2_register_1_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b2_3_register_1_1);
    }

    public void clickBtn(View view) {
        Intent intent=new Intent(b2_register_1_1.this,b1_login_1.class);
        startActivity(intent);
    }
}