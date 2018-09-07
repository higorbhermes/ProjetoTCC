package higorhermes.tcc.projetotcc.View;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import higorhermes.tcc.projetotcc.MainActivity;
import higorhermes.tcc.projetotcc.R;

/**
 * Created by higor on 29/07/18.
 */

public class TelaMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_menu);
        Button button_jogar = (Button) findViewById(R.id.button_jogar);
        Button button_caderno = (Button) findViewById(R.id.button_caderno);
        Button button_dados = (Button) findViewById(R.id.button_dados);
        Button button_desempenho = (Button) findViewById(R.id.button_desempenho);
        Button button_sobre = (Button) findViewById(R.id.button_sobre);
        Button button_sair = (Button) findViewById(R.id.button_sair);

        button_jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaMenu.this, TelaEscolherAssuntoJogo.class);
                startActivity(intent);
            }
        });
        button_caderno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaMenu.this, TelaEscolherAssuntoCaderno.class);
                startActivity(intent);
            }
        });
        button_dados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaMenu.this, TelaJogoForca.class);
                startActivity(intent);
            }
        });
        button_desempenho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaMenu.this, TelaDesempenho.class);
                startActivity(intent);
            }
        });
        button_sobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaMenu.this, TelaSobre.class);
                startActivity(intent);
            }
        });

        button_sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaMenu.this, TelaPrincipal.class);
                startActivity(intent);
            }
        });
    }
}