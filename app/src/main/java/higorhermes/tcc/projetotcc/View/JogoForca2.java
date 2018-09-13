package higorhermes.tcc.projetotcc.View;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import higorhermes.tcc.projetotcc.R;

public class JogoForca2 extends AppCompatActivity {
    private Toolbar myToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo_forca2);
        myToolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(myToolbar);
        Button button_dica = (Button) findViewById(R.id.button_dica);
        Button button_revelar = (Button) findViewById(R.id.button_revelar);
        Button button_eliminar = (Button) findViewById(R.id.button_eliminar);
        final Button button_d =  (Button) findViewById(R.id.button_d);
        final Button button_x =  (Button) findViewById(R.id.button_x);
        final Button button_m  =  (Button) findViewById(R.id.button_m);
        final TextView tv_letra3 = (TextView) findViewById(R.id.letra3);
        button_revelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_letra3.setText("G");
            }
        });
        button_dica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "DICA: Essa característica é atingida quando o software protege as suas informações e dados de acordo com o nível de autorização.";
                AlertDialog.Builder dlg = new AlertDialog.Builder(JogoForca2.this);
                dlg.setMessage(msg);
                dlg.setNeutralButton("OK", null);
                dlg.show();
            }
        });
        button_eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_d.setText("");
                button_x.setText("");
                button_m.setText("");
            }
        });
    }
}
