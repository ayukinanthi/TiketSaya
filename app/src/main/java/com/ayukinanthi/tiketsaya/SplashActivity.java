package com.ayukinanthi.tiketsaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
//import android.view.Window;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //cara menghubungkan activity satu ke yg lain
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //mengubah activity ke activity laen
                Intent gogetstarted = new Intent(SplashActivity.this, GetStartedActivity.class);
                //untuk mulai
                startActivity(gogetstarted);
                //selesai
                finish();
            }
            //setting timer 1 detik
        }, 1500); //1000 ms = 1 detik
    }
}