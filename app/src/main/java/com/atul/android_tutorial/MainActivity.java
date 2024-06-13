package com.atul.android_tutorial;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
showToast();
    }
    public void showToast()
    {
        LinearLayout linearLayout = findViewById(R.id.customToast);
        LayoutInflater layoutInflater = getLayoutInflater();
        View customToastVie= layoutInflater.inflate(R.layout.custom_toast , linearLayout);
        btn = findViewById(R.id.btnToast);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0,0);
                toast.setView(customToastVie);
                toast.show();
            }
        });
    }
}