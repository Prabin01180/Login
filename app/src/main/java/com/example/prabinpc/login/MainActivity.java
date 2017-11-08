package com.example.prabinpc.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button login;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText)findViewById(R.id.username);
        login=(Button)findViewById(R.id.button);

    }
    private void validate(String UserName, String Password)
    {
        if((UserName == "admin")&&(Password == "1234"))
        {
            System.out.println("You are login");
        }else{
            System.out.println("Invalid Username and Password");
        }
    }
}
