package br.ulbra.comprasapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    CheckBox Arroz, Leite, Carne, Feijao;
    Button btntotal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Arroz = (CheckBox) findViewById(R.id.Arroz);
        Leite = (CheckBox) findViewById(R.id.Leite);
        Carne = (CheckBox) findViewById(R.id.Carne);
        Feijao = (CheckBox) findViewById(R.id.Feijao);
        Button btntotal = (Button) findViewById(R.id.btntotal);

        btntotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double total = 0;
                if (Arroz.isChecked()) {
                    total += 2.69;
                } else if (Leite.isChecked()) {
                    total += 5.00;
                } else if (Carne.isChecked()) {
                    total += 9.7;
                } else if (Feijao.isChecked()) {
                    total += 2.30;
                }

                AlertDialog.Builder dialago = new AlertDialog.Builder(MainActivity.this);
                dialago.setTitle("Aviso");
                dialago.setMessage("Valor total de compra:" + String.valueOf(total));
                dialago.setNeutralButton("OK", null);
                dialago.show();
            }
        });


    }
}