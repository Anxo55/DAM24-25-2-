package com.example.a005numerosprimos;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        textView = findViewById(R.id.textView2);
        editText = findViewById(R.id.cajaIntroducir);
        button = findViewById(R.id.calcula);

        button.setOnClickListener(v -> {
        String input = editText.getText().toString();
            if (!input.isEmpty()) {
                int numero = Integer.parseInt(input);
                if (esPrimo(numero)) {
                    textView.setText(numero + " es un número primo.");
                } else {
                    textView.setText(numero + " no es un número primo.");
                }
            } else {
                Toast.makeText(MainActivity.this, "Introduce un número", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private boolean esPrimo(int numero) {
        if(numero <= 1) return false;
        for(int i = 2; i <=Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}