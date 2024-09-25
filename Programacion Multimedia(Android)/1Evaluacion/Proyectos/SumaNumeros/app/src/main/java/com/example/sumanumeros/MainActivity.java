package com.example.sumanumeros;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Referencias de los componentes del xml.
        EditText primerNumero = findViewById(R.id.PrimerNumero);
        EditText segundoNumero = findViewById(R.id.SegundoNumero);
        Button boton = findViewById(R.id.boton);
        TextView resultadoOperacion = findViewById(R.id.resultadoOperacion);

        //Configuramos el boton con un onclick
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String numero1Text = primerNumero.getText().toString();
                String numero2Text = segundoNumero.getText().toString();

                if (!numero1Text.isEmpty() && !numero2Text.isEmpty()) {
                    int numero1 = Integer.parseInt(numero1Text);
                    int numero2 = Integer.parseInt(numero2Text);

                    int resultado = sumar(numero1, numero2);

                    resultadoOperacion.setText("El resultado de la suma es: "+resultado);
                }else{
                    resultadoOperacion.setText("Por favor ingresa ambos valores: ");
                }

            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }
}