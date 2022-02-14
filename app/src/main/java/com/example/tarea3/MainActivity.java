package com.example.tarea3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtnombre, txtape, txtedad, txtcorreo, txtdireccion;
    Button btninsertar, btneditar, btneliminar, btnmostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnombre=(EditText) findViewById(R.id.txtnombre);
        txtape=(EditText) findViewById(R.id.txtape);
        txtedad=(EditText) findViewById(R.id.txtedad);
        txtcorreo=(EditText) findViewById(R.id.txtcorreo);
        txtdireccion=(EditText) findViewById(R.id.txtdireccion);
        btninsertar=(Button) findViewById(R.id.btninsertar);

        final personas personas = new personas(getApplicationContext());

        btninsertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                personas.agregarpersona(txtnombre.getText().toString(),txtape.getText().toString(),txtedad.getText().toString(),txtcorreo.getText().toString(),txtdireccion.getText().toString());
                Toast.makeText(getApplicationContext(), "Se agrego correctamente", Toast.LENGTH_SHORT).show();
            }
        });

    }
}