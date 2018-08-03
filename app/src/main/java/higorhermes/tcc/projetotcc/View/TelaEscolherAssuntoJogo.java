package higorhermes.tcc.projetotcc.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import higorhermes.tcc.projetotcc.R;

public class TelaEscolherAssuntoJogo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_escolher_assunto_jogo);
        Button button_jogar = (Button) findViewById(R.id.button_comecar);
        button_jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaEscolherAssuntoJogo.this, TelaQuiz.class);
                startActivity(intent);
            }
        });
    }
}
