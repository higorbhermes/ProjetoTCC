package higorhermes.tcc.projetotcc.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import higorhermes.tcc.projetotcc.R;

public class TelaFiltro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_filtro);
        Button button_play = (Button) findViewById(R.id.button_play);
        button_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaFiltro.this, TelaJogoForca.class);
                startActivity(intent);
            }
        });
    }
}
