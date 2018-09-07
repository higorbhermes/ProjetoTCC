package higorhermes.tcc.projetotcc.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import higorhermes.tcc.projetotcc.R;

public class TelaQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_quiz);
        Button button_responder = (Button) findViewById(R.id.button_responder);
        Button button_ajuda = (Button) findViewById(R.id.button_ajuda);
        button_responder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaQuiz.this, TelaAcerto.class);
                startActivity(intent);
            }
        });
        button_ajuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaQuiz.this, TelaAjuda.class);
                startActivity(intent);
            }
        });
    }
}
