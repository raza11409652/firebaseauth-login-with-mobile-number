/*
 * hackdroidbykhan 24th feb 2019
 * */

package com.cadproject.hackdroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Mobile extends AppCompatActivity {
Button login ;
TextView mobilenumber  ;
String mobileStr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);
        login= (Button)findViewById(R.id.loginUserBtn);
        //Textview
        mobilenumber = (TextView)findViewById(R.id.phoneText);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mobileStr= mobilenumber.getText().toString().trim();
                if (TextUtils.isEmpty(mobileStr)){
                    Toast.makeText(getApplicationContext() , "Please Enter Mobile number" , Toast.LENGTH_SHORT).show();
                }else{
                    String phonenumber = "+91" + mobileStr;
                    Intent intent = new Intent(getApplicationContext(), Login.class);
                    intent.putExtra("phonenumber", phonenumber);
                    startActivity(intent);
                }
            }
        });
    }
}
