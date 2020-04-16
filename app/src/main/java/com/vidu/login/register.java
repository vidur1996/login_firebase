package com.vidu.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class register extends AppCompatActivity {
    Button submit_btn , clear_btn , back_btn;
    TextView name_txt, user_txt, pass1_txt,pass2_txt, mail_txt ,phone_txt  ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        submit_btn = (Button) findViewById(R.id.submit_btn);
        clear_btn  = (Button) findViewById(R.id.clear_btn);
        back_btn   = (Button) findViewById(R.id.back__btn);
        name_txt   = (TextView) findViewById(R.id.name_txt);
        user_txt  = (TextView) findViewById(R.id.user_txt);
        pass1_txt = (TextView) findViewById(R.id.pass1_txt);
        pass2_txt= (TextView) findViewById(R.id.pass2_txt);
        mail_txt  = (TextView) findViewById(R.id.mail_txt);
           = (TextView) findViewById(R.id.);





    }
}
