package com.umesh.iot_led_ta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by acer on 18-06-2017.
 */

public class login extends AppCompatActivity{


    public Button but1;
    public EditText eUsername;
    public EditText ePassword;

    public void init() {
        but1 = (Button)findViewById(R.id.button);
        eUsername = (EditText)findViewById(R.id.editText);
        ePassword = (EditText)findViewById(R.id.editText2);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eUsername.getText().toString().equals("Techaakar") && ePassword.getText().toString().equals("1234")) {
                    Intent led = new Intent(login.this,ledweb.class);
                    startActivity(led);
                } else {
                    Toast.makeText(getApplicationContext(), "wrong Credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        init();
    }
}
