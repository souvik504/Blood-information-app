package com.example.lenovo.activityswitch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button switching_btn;
    EditText et_1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_1=findViewById(R.id.enter_phonenumber);


        switching_btn=findViewById(R.id.switching_btn);
        switching_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phonenumber=et_1.getText().toString();
                if(phonenumber.equals("01762226459")) {
                    Intent switchingIntent = new Intent(MainActivity.this, AnotherActivity.class);

                    startActivity(switchingIntent);
                }
                if(phonenumber.equals("01782614627")) {
                    Intent switchingIntent = new Intent(MainActivity.this, Another2.class);

                    startActivity(switchingIntent);
                }
                if(phonenumber.equals("01797338420")) {
                    Intent switchingIntent = new Intent(MainActivity.this, Another3.class);

                    startActivity(switchingIntent);
                }
                if(phonenumber.equals("01797338460")) {
                    Intent switchingIntent = new Intent(MainActivity.this, Another4.class);

                    startActivity(switchingIntent);
                }
                if(phonenumber.equals("01762226439")) {
                    Intent switchingIntent = new Intent(MainActivity.this, Another5.class);

                    startActivity(switchingIntent);
                }
                if(phonenumber.equals("01797338830")) {
                    Intent switchingIntent = new Intent(MainActivity.this, Another6.class);

                    startActivity(switchingIntent);
                }
                if(phonenumber.equals("01762226490")) {
                    Intent switchingIntent = new Intent(MainActivity.this, Another7.class);

                    startActivity(switchingIntent);
                }
                if(phonenumber.equals("01791519862")) {
                    Intent switchingIntent = new Intent(MainActivity.this, Another8.class);

                    startActivity(switchingIntent);
                }
                if(phonenumber.equals("01797338429")) {
                    Intent switchingIntent = new Intent(MainActivity.this, Another9.class);

                    startActivity(switchingIntent);
                }
                if(phonenumber.equals("01797338430")) {
                    Intent switchingIntent = new Intent(MainActivity.this, Another10.class);

                    startActivity(switchingIntent);
                }

            }
        });
    }
}
