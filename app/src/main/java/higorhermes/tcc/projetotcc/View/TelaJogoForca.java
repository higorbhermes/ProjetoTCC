package higorhermes.tcc.projetotcc.View;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import higorhermes.tcc.projetotcc.R;

public class TelaJogoForca extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_jogo_forca);
        Button button_revelar = (Button) findViewById(R.id.button_revelar);
        Button button_eliminar = (Button) findViewById(R.id.button_eliminar);
        Button button_dica = (Button) findViewById(R.id.button_dica);
        final Button button_pontuacao = (Button) findViewById(R.id.button_pontuacao);
        final Button button_a =  (Button) findViewById(R.id.button_a);
        final Button button_b =  (Button) findViewById(R.id.button_b);
        final Button button_c =  (Button) findViewById(R.id.button_c);
        final Button button_d =  (Button) findViewById(R.id.button_d);
        final Button button_e =  (Button) findViewById(R.id.button_e);
        final Button button_f =  (Button) findViewById(R.id.button_f);
        final Button button_g =  (Button) findViewById(R.id.button_g);
        final Button button_h =  (Button) findViewById(R.id.button_h);
        final Button button_i =  (Button) findViewById(R.id.button_i);
        final Button button_j =  (Button) findViewById(R.id.button_j);
        final Button button_k =  (Button) findViewById(R.id.button_k);
        final Button button_l =  (Button) findViewById(R.id.button_l);
        final Button button_x =  (Button) findViewById(R.id.button_x);
        final Button button_m =  (Button) findViewById(R.id.button_m);
        final Button button_n =  (Button) findViewById(R.id.button_n);
        final Button button_o =  (Button) findViewById(R.id.button_o);
        final Button button_p =  (Button) findViewById(R.id.button_p);
        final Button button_q =  (Button) findViewById(R.id.button_q);
        final Button button_r =  (Button) findViewById(R.id.button_r);
        final Button button_s =  (Button) findViewById(R.id.button_s);
        final Button button_t =  (Button) findViewById(R.id.button_t);
        final Button button_u =  (Button) findViewById(R.id.button_u);
        final Button button_v =  (Button) findViewById(R.id.button_v);
        final Button button_w =  (Button) findViewById(R.id.button_w);
        final Button button_z =  (Button) findViewById(R.id.button_z);
        final TextView letra1 = (TextView) findViewById(R.id.letra1);
        final TextView letra2 = (TextView) findViewById(R.id.letra2);
        final TextView letra3 = (TextView) findViewById(R.id.letra3);
        final TextView letra4 = (TextView) findViewById(R.id.letra4);
        final TextView letra5 = (TextView) findViewById(R.id.letra5);
        final TextView letra6 = (TextView) findViewById(R.id.letra6);
        final TextView letra7 = (TextView) findViewById(R.id.letra7);
        final TextView letra8 = (TextView) findViewById(R.id.letra8);
        final TextView letra9 = (TextView) findViewById(R.id.letra9);
        button_revelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letra3.setText("G");
            }
        });
        button_dica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg = "DICA: Essa característica é atingida quando o software protege as suas informações e dados de acordo com o nível de autorização.";
                AlertDialog.Builder dlg = new AlertDialog.Builder(TelaJogoForca.this);
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
        button_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letra6.setText("A");
                letra9.setText("A");
            }
        });
        button_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_pontuacao.setBackgroundResource(R.drawable.pontos80);
            }
        });
        button_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letra8.setText("Ç");
            }
        });
        button_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letra2.setText("E");
            }
        });
        button_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letra3.setText("G");
            }
        });
        button_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letra5.setText("R");
            }
        });
        button_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letra1.setText("S");
            }
        });
        button_u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letra4.setText("U");
            }
        });


        button_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letra7.setText("N");
            }
        });

    }
}
