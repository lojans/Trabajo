package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast.makeText(getApplicationContext(),"entraste crack sigue asi",Toast.LENGTH_LONG).show();
        tv=(TextView)findViewById(R.id.tv2);
        String nombre=getIntent().getStringExtra("dato");
        tv.setText("Buenos dias señor(a) "+nombre);
    }

    public void devolver(View view){
        Intent actividad2=new Intent(this,MainActivity.class);
        startActivity(actividad2);
    }
}
