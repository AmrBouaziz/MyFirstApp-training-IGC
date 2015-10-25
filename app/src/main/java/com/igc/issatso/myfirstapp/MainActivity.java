package com.igc.issatso.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txt_login= (EditText) findViewById(R.id.txt_username);
        final EditText txt_password= (EditText) findViewById(R.id.txt_password);
        Button btn_login= (Button) findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user,password;
                user=txt_login.getText().toString();
                password=txt_password.getText().toString();

                if(user.equals("user")&& password.equals("1234"))
                {
                    Toast.makeText(MainActivity.this,"Login Approved",Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                    // intent.putExtra
                    startActivity(intent);

                }
                else
                {
                    Toast.makeText(MainActivity.this,"Login refused",Toast.LENGTH_SHORT).show();
                    txt_login.setText("");
                    txt_password.setText("");
                }
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
