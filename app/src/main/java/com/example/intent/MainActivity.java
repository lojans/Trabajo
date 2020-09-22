package com.example.intent;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
 private EditText txtNombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNombre=(EditText)findViewById(R.id.txtNombre);
    }
    public void ingresar(View view){
        Intent x=new Intent(this,MainActivity2.class);
        x.putExtra("dato",txtNombre.getText().toString());
        startActivity(x);
    }
}