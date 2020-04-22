package com.vidu.login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class signin extends AppCompatActivity {

    Button log_btn ;
    EditText user_txt , pass_txt;
    String pass2;
    TextView test;
    DatabaseReference reff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        user_txt = (EditText) findViewById(R.id.user_txt);
        pass_txt = (EditText) findViewById(R.id.pass_txt);
        log_btn = (Button) findViewById(R.id.log_btn);
        test = (TextView) findViewById(R.id.test);


        log_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = user_txt.getText().toString().trim();
                String pass = pass_txt.getText().toString().trim();

                 reff = FirebaseDatabase.getInstance().getReference().child("member").child(user);


                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        pass2 = dataSnapshot.child("password").getValue().toString();



                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        Toast.makeText(signin.this,"wrong username",Toast.LENGTH_SHORT);
                        user_txt.setText("");
                        pass_txt.setText("");
                    }
                });


                if(pass.equals(pass2) ||  pass==pass2)
                {
                    Toast.makeText(signin.this,"Login successful",Toast.LENGTH_SHORT);
                    Intent star = new Intent(getApplicationContext(),home.class);
                    startActivity(star);


                }
                else
                {
                    Toast.makeText(signin.this,"wrong password",Toast.LENGTH_SHORT);
                    pass_txt.setText("");
                }




            }
        });


    }
}
