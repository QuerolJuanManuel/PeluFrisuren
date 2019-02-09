package frisuren.pelufrisuren;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registrarse(View view){
        Intent i=new Intent(this, registro.class);
        startActivity(i);
    }

    public void ofertas(View view){
        Intent i=new Intent(this, ofertas.class);
        startActivity(i);
    }

    public void PedirCita(View view){
        Intent i=new Intent(this, calendario.class);
        startActivity(i);
    }
}
