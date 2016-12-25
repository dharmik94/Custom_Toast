package com.toast.customtoast;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnalerttoast,btnsuccesstoast,btncustomtoast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnalerttoast = (Button) findViewById(R.id.btn_alert);
        btnalerttoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertToast toast = new AlertToast(getApplicationContext());
                toast.alerttoast("Custom Toast...!");
                toast.setLongDuration();
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM,0,90);
                toast.setcustomfont("fonts/Sansation-Regular.ttf");
                toast.show();
            }
        });

        btnsuccesstoast = (Button) findViewById(R.id.btn_success);
        btnsuccesstoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SuccessToast toast = new SuccessToast(getApplicationContext());
                toast.successtoast("Custom Toast...!");
                toast.setLongDuration();
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM,0,90);
                toast.setcustomfont("fonts/Sansation-Regular.ttf");
                toast.show();
            }
        });

        btncustomtoast = (Button) findViewById(R.id.btn_customtoast);
        btncustomtoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomToast toast = new CustomToast(getApplicationContext());
                toast.customtoast("Custom Toast...!",Color.BLACK,R.drawable.ic_account_circle);
                toast.setLongDuration();
                toast.setBorder(4,Color.BLACK,10,Color.WHITE);
                toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM,0,90);
                toast.setcustomfont("fonts/Sansation-Regular.ttf");
                toast.show();
            }
        });
    }
}
