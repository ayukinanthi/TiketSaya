package com.ayukinanthi.tiketsaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity {

    TextView btn_new_acc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        btn_new_acc = findViewById(R.id.btn_new_acc);
        //setOnClickListener memberikan fungsi pada tiap btn_new_acc
        btn_new_acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoregisterone = new Intent(SignInActivity.this, RegisterOneActivity.class);
                startActivity(gotoregisterone);

            }
        });
    }
}