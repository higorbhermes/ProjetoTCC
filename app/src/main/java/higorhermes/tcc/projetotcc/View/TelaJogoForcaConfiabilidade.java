package higorhermes.tcc.projetotcc.View;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import java.util.Random;
import higorhermes.tcc.projetotcc.Model.Ajustes;
import higorhermes.tcc.projetotcc.Model.JogoForca;
import higorhermes.tcc.projetotcc.R;
import io.realm.Realm;

public class TelaJogoForcaConfiabilidade extends AppCompatActivity {
    int pontos;
    int erro = 0;
    int acertos = 0;
    int numero_letras = 14;
    int eliminar_letra = 0;
    int revelar_letra = 0;
    int menu = 1;
    int filtro;
    int cont_revelar = 0;
    int partida_atual;
    int contador_partidas;
    int id;
    String letracerta1 = "C";
    String letracerta2 = "O";
    String letracerta3 = "N";
    String letracerta4 = "F";
    String letracerta5 = "I";
    String letracerta6 = "A";
    String letracerta7 = "B";
    String letracerta8 = "I";
    String letracerta9 = "L";
    String letracerta10 = "I";
    String letracerta11 = "D";
    String letracerta12 = "A";
    String letracerta13 = "D";
    String letracerta14 = "E";
    String letracerta15 = "";
    String letracerta16 = "";
    String letracerta17 = "";
    String letracerta18 = "";
    String letracerta19 = "";
    String letracerta20 = "";
    String letracerta21 = "";
    String letracerta22 = "";
    String letracerta23 = "";
    String letracerta24 = "";
    String letracerta25 = "";
    String dica = "Grau para o qual um sistema, produto ou componente executa funções especificadas sob condições especificadas por um período de tempo especificado.";
    JogoForca[] partidas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_jogo_forca_confiabilidade);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        pontos = bundle.getInt("pont");
        partida_atual = bundle.getInt("partida_atual");
        filtro = bundle.getInt("filtro");
        contador_partidas = bundle.getInt("contador_partidas");
        id = bundle.getInt("id");
        partidas = ( JogoForca[]) intent.getSerializableExtra("partidas");
        Button button_revelar = (Button) findViewById(R.id.button_revelar);
        Button button_eliminar = (Button) findViewById(R.id.button_eliminar);
        Button button_dica = (Button) findViewById(R.id.button_dica);
        final Button button_pontuacao = (Button) findViewById(R.id.button_pontuacao);
        final Button button_menu = (Button) findViewById(R.id.button_menu);
        final Button button_sentimento = (Button) findViewById(R.id.button_sentimento);
        final Button button_caderno = (Button) findViewById(R.id.button_caderno);
        final Button button_desempenho = (Button) findViewById(R.id.button_desempenho);
        final Button button_ajustes = (Button) findViewById(R.id.button_ajustes);
        final Button button_avaliacao = (Button) findViewById(R.id.button_avaliacao);
        final Button button_a = (Button) findViewById(R.id.button_a);
        final Button button_b = (Button) findViewById(R.id.button_b);
        final Button button_c = (Button) findViewById(R.id.button_c);
        final Button button_d = (Button) findViewById(R.id.button_d);
        final Button button_e = (Button) findViewById(R.id.button_e);
        final Button button_f = (Button) findViewById(R.id.button_f);
        final Button button_g = (Button) findViewById(R.id.button_g);
        final Button button_h = (Button) findViewById(R.id.button_h);
        final Button button_i = (Button) findViewById(R.id.button_i);
        final Button button_j = (Button) findViewById(R.id.button_j);
        final Button button_k = (Button) findViewById(R.id.button_k);
        final Button button_l = (Button) findViewById(R.id.button_l);
        final Button button_x = (Button) findViewById(R.id.button_x);
        final Button button_m = (Button) findViewById(R.id.button_m);
        final Button button_n = (Button) findViewById(R.id.button_n);
        final Button button_o = (Button) findViewById(R.id.button_o);
        final Button button_p = (Button) findViewById(R.id.button_p);
        final Button button_q = (Button) findViewById(R.id.button_q);
        final Button button_r = (Button) findViewById(R.id.button_r);
        final Button button_s = (Button) findViewById(R.id.button_s);
        final Button button_t = (Button) findViewById(R.id.button_t);
        final Button button_u = (Button) findViewById(R.id.button_u);
        final Button button_v = (Button) findViewById(R.id.button_v);
        final Button button_w = (Button) findViewById(R.id.button_w);
        final Button button_y = (Button) findViewById(R.id.button_y);
        final Button button_z = (Button) findViewById(R.id.button_z);
        final TextView letra1 = (TextView) findViewById(R.id.letra1);
        final TextView letra2 = (TextView) findViewById(R.id.letra2);
        final TextView letra3 = (TextView) findViewById(R.id.letra3);
        final TextView letra4 = (TextView) findViewById(R.id.letra4);
        final TextView letra5 = (TextView) findViewById(R.id.letra5);
        final TextView letra6 = (TextView) findViewById(R.id.letra6);
        final TextView letra7 = (TextView) findViewById(R.id.letra7);
        final TextView letra8 = (TextView) findViewById(R.id.letra8);
        final TextView letra9 = (TextView) findViewById(R.id.letra9);
        final TextView letra10 = (TextView) findViewById(R.id.letra10);
        final TextView letra11 = (TextView) findViewById(R.id.letra11);
        final TextView letra12 = (TextView) findViewById(R.id.letra12);
        final TextView letra13 = (TextView) findViewById(R.id.letra13);
        final TextView letra14 = (TextView) findViewById(R.id.letra14);
        final TextView letra15 = null;
        final TextView letra16 = null;
        final TextView letra17 = null;
        final TextView letra18 = null;
        final TextView letra19 = null;
        final TextView letra20 = null;
        final TextView letra21 = null;
        final TextView letra22 = null;
        final TextView letra23 = null;
        final TextView letra24 = null;
        final TextView letra25 = null;
        button_pontuacao.setBackgroundResource(R.drawable.escudo50pxbranco);
        button_menu.setBackgroundResource(R.drawable.menu40px);
        button_sentimento.setBackgroundResource(R.drawable.neutro50px);
        button_eliminar.setBackgroundResource(R.drawable.lixeira50px);
        button_dica.setBackgroundResource(R.drawable.lampada50px);
        button_revelar.setBackgroundResource(R.drawable.olho50px);
        button_caderno.setBackgroundResource(R.drawable.caderno50);
        button_desempenho.setBackgroundResource(R.drawable.desempenho40);
        button_ajustes.setBackgroundResource(R.drawable.ajustes40);
        final Button button_ver_resposta = (Button) findViewById(R.id.button_ver_resposta);
        Button button_proximo = (Button) findViewById(R.id.button_proximo);
        Button button_proximo_respostaerrada = (Button) findViewById(R.id.button_proximo_respostaerrada);
        final LinearLayout layout_0 = (LinearLayout) findViewById(R.id.layout_0);
        final LinearLayout layout_1 = (LinearLayout) findViewById(R.id.layout_1);
        final LinearLayout layout_2 = (LinearLayout) findViewById(R.id.layout_2);
        final LinearLayout layout_3 = (LinearLayout) findViewById(R.id.layout_3);
        final LinearLayout layout_menu = (LinearLayout) findViewById(R.id.layout_menu);
        final LinearLayout layout_respostacerta = (LinearLayout) findViewById(R.id.layout_respostacerta);
        final LinearLayout layout_respostaerrada = (LinearLayout) findViewById(R.id.layout_respostaerrada);
        button_sentimento.setBackgroundResource(R.drawable.neutro50px);
        layout_1.setVisibility(View.GONE);
        layout_2.setVisibility(View.GONE);
        layout_3.setVisibility(View.GONE);
        layout_menu.setVisibility(View.GONE);
        layout_respostacerta.setVisibility(View.GONE);
        layout_respostaerrada.setVisibility(View.GONE);
        calcularPontuação();
        button_revelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pontos < 60) {
                    String msg = "É necessário possuir 60 pontos para utilizar esta ajuda!";
                    AlertDialog.Builder dlg = new AlertDialog.Builder(    TelaJogoForcaConfiabilidade.this);
                    dlg.setMessage(msg);
                    dlg.setNeutralButton("OK", null);
                    dlg.show();
                } else {
                    if (revelar_letra >= 3) {
                        String msg = "Essa ajuda só pode ser utilizada três vezes em cada desafio!";
                        AlertDialog.Builder dlg = new AlertDialog.Builder(  TelaJogoForcaConfiabilidade.this);
                        dlg.setMessage(msg);
                        dlg.setNeutralButton("OK", null);
                        dlg.show();
                    } else {
                        pontos = pontos - 60;
                        calcularPontuação();
                        verSentimento(1);
                        Random gerador = new Random();
                        cont_revelar=0;
                        while (cont_revelar == 0) {
                            int num = gerador.nextInt(27);
                            if (num == 1) {
                                revelarLetra(num);
                            }
                            if (num == 2) {
                                revelarLetra(num);
                            }
                            if (num == 3) {
                                revelarLetra(num);
                            }
                            if (num == 4) {
                                revelarLetra(num);
                            }
                            if (num == 5) {
                                revelarLetra(num);
                            }
                            if (num == 6) {
                                revelarLetra(num);
                            }
                            if (num == 7) {
                                revelarLetra(num);
                            }
                            if (num == 8) {
                                revelarLetra(num);
                            }
                            if (num == 9) {
                                revelarLetra(num);
                            }
                            if (num == 10) {
                                revelarLetra(num);
                            }
                            if (num == 11) {
                                revelarLetra(num);
                            }
                            if (num == 12) {
                                revelarLetra(num);
                            }
                            if (num == 13) {
                                revelarLetra(num);
                            }
                            if (num == 14) {
                                revelarLetra(num);
                            }
                            if (num == 15) {
                                revelarLetra(num);
                            }
                            if (num == 16) {
                                revelarLetra(num);
                            }
                            if (num == 17) {
                                revelarLetra(num);
                            }
                            if (num == 18) {
                                revelarLetra(num);
                            }
                            if (num == 19) {
                                revelarLetra(num);
                            }
                            if (num == 20) {
                                revelarLetra(num);
                            }
                            if (num == 21) {
                                revelarLetra(num);
                            }
                            if (num == 22) {
                                revelarLetra(num);
                            }
                            if (num == 23) {
                                revelarLetra(num);
                            }
                            if (num == 24) {
                                revelarLetra(num);
                            }
                            if (num == 25) {
                                revelarLetra(num);
                            }
                            if (num == 26) {
                                revelarLetra(num);
                            }
                        }
                    }
                }
            }
        });

        button_dica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pontos < 20) {
                    String msg = "É necessário possuir 20 pontos para utilizar esta ajuda!";
                    AlertDialog.Builder dlg = new AlertDialog.Builder(  TelaJogoForcaConfiabilidade.this);
                    dlg.setMessage(msg);
                    dlg.setNeutralButton("OK", null);
                    dlg.show();
                } else {
                    pontos = pontos - 20;
                    calcularPontuação();
                    verSentimento(1);
                    String msg = "DICA: "+dica;
                    AlertDialog.Builder dlg = new AlertDialog.Builder(  TelaJogoForcaConfiabilidade.this);
                    dlg.setMessage(msg);
                    dlg.setNeutralButton("OK", null);
                    dlg.show();
                }
            }
        });

        button_eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pontos < 40) {
                    String msg = "É necessário possuir 40 pontos para utilizar esta ajuda!";
                    AlertDialog.Builder dlg = new AlertDialog.Builder(  TelaJogoForcaConfiabilidade.this);
                    dlg.setMessage(msg);
                    dlg.setNeutralButton("OK", null);
                    dlg.show();
                } else {
                    if (eliminar_letra >= 3) {
                        String msg = "Essa ajuda só pode ser utilizada três vezes em cada desafio!";
                        AlertDialog.Builder dlg = new AlertDialog.Builder(  TelaJogoForcaConfiabilidade.this);
                        dlg.setMessage(msg);
                        dlg.setNeutralButton("OK", null);
                        dlg.show();
                    } else {
                        verSentimento(1);
                        pontos = pontos - 40;
                        calcularPontuação();
                        if (eliminar_letra == 0) {
                            button_w.setText("");
                            button_n.setText("");
                            button_z.setText("");
                            button_w.setEnabled(false);
                            button_n.setEnabled(false);
                            button_z.setEnabled(false);
                        }
                        if (eliminar_letra == 1) {
                            button_m.setText("");
                            button_v.setText("");
                            button_j.setText("");
                            button_m.setEnabled(false);
                            button_j.setEnabled(false);
                            button_v.setEnabled(false);

                        }
                        if (eliminar_letra == 2) {
                            button_h.setText("");
                            button_k.setText("");
                            button_f.setText("");
                            button_h.setEnabled(false);
                            button_k.setEnabled(false);
                            button_f.setEnabled(false);
                        }
                        eliminar_letra = eliminar_letra + 1;
                    }
                }
            }
        });

        button_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_a.setText("");
                button_a.setEnabled(false);
                verificarLetra(1);
            }
        });

        button_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_b.setText("");
                button_b.setEnabled(false);
                verificarLetra(2);
            }
        });

        button_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_c.setText("");
                button_c.setEnabled(false);
                verificarLetra(3);
            }
        });

        button_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_d.setText("");
                button_d.setEnabled(false);
                verificarLetra(4);
            }
        });

        button_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_e.setText("");
                button_e.setEnabled(false);
                verificarLetra(5);
            }
        });

        button_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_f.setText("");
                button_f.setEnabled(false);
                verificarLetra(6);
            }
        });

        button_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_g.setText("");
                button_g.setEnabled(false);
                verificarLetra(7);
            }
        });

        button_h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_h.setText("");
                button_h.setEnabled(false);
                verificarLetra(8);
            }
        });

        button_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_i.setText("");
                button_i.setEnabled(false);
                verificarLetra(9);
            }
        });

        button_j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_j.setText("");
                button_j.setEnabled(false);
                verificarLetra(10);
            }
        });

        button_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_k.setText("");
                button_k.setEnabled(false);
                verificarLetra(11);
            }
        });

        button_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_l.setText("");
                button_l.setEnabled(false);
                verificarLetra(12);
            }
        });

        button_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_m.setText("");
                button_m.setEnabled(false);
                verificarLetra(13);
            }
        });

        button_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_n.setText("");
                button_n.setEnabled(false);
                verificarLetra(14);
            }
        });

        button_o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_o.setText("");
                button_o.setEnabled(false);
                verificarLetra(15);
            }
        });

        button_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_p.setText("");
                button_p.setEnabled(false);
                verificarLetra(16);
            }
        });

        button_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_q.setText("");
                button_q.setEnabled(false);
                verificarLetra(17);
            }
        });


        button_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_r.setText("");
                button_r.setEnabled(false);
                verificarLetra(18);
            }
        });

        button_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_s.setText("");
                button_s.setEnabled(false);
                verificarLetra(19);
            }
        });

        button_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_t.setText("");
                button_t.setEnabled(false);
                verificarLetra(20);
            }
        });

        button_u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_u.setText("");
                button_u.setEnabled(false);
                verificarLetra(21);
            }
        });

        button_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_v.setText("");
                button_v.setEnabled(false);
                verificarLetra(22);
            }
        });

        button_w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_w.setText("");
                button_w.setEnabled(false);
                verificarLetra(25);
            }
        });

        button_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_x.setText("");
                button_x.setEnabled(false);
                verificarLetra(23);
            }
        });

        button_y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_y.setText("");
                button_y.setEnabled(false);
                verificarLetra(24);
            }
        });

        button_z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_z.setText("");
                button_z.setEnabled(false);
                verificarLetra(26);
            }
        });

        button_ver_resposta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (letra1 != null){
                    letra1.setText(letracerta1);
                }
                if (letra2 != null){
                    letra2.setText(letracerta2);
                }
                if (letra3 != null){
                    letra3.setText(letracerta3);
                }
                if (letra4 != null){
                    letra4.setText(letracerta4);
                }
                if (letra5 != null){
                    letra5.setText(letracerta5);
                }
                if (letra6 != null){
                    letra6.setText(letracerta6);
                }
                if (letra7 != null){
                    letra7.setText(letracerta7);
                }
                if (letra8 != null){
                    letra8.setText(letracerta8);
                }
                if (letra9 != null){
                    letra9.setText(letracerta9);
                }
                if (letra10 != null){
                    letra10.setText(letracerta10);
                }
                if (letra11 != null){
                    letra11.setText(letracerta11);
                }
                if (letra12 != null){
                    letra12.setText(letracerta12);
                }
                if (letra13 != null){
                    letra13.setText(letracerta13);
                }
                if (letra14 != null){
                    letra14.setText(letracerta14);
                }
                if (letra15 != null){
                    letra15.setText(letracerta15);
                }
                if (letra16 != null){
                    letra16.setText(letracerta16);
                }
                if (letra17 != null){
                    letra17.setText(letracerta17);
                }
                if (letra18 != null){
                    letra18.setText(letracerta18);
                }
                if (letra19 != null){
                    letra19.setText(letracerta19);
                }
                if (letra20 != null){
                    letra20.setText(letracerta20);
                }
                if (letra21 != null){
                    letra21.setText(letracerta21);
                }
                if (letra22 != null){
                    letra22.setText(letracerta22);
                }
                if (letra23 != null){
                    letra23.setText(letracerta23);
                }
                if (letra24 != null){
                    letra24.setText(letracerta24);
                }
                if (letra25 != null){
                    letra25.setText(letracerta25);
                }

            }
        });

        button_proximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Realm realm = Realm.getDefaultInstance();
                JogoForca jForca = realm.where(JogoForca.class)
                        .equalTo("id", id).findFirst();
                realm.beginTransaction();
                jForca.setAcerto(1);
                jForca.setErro(0);
                realm.copyToRealm(jForca);
                realm.commitTransaction();
                NovaTela();
            }
        });

        button_proximo_respostaerrada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Realm realm = Realm.getDefaultInstance();
                JogoForca jForca = realm.where(JogoForca.class)
                        .equalTo("id", id).findFirst();
                realm.beginTransaction();
                jForca.setErro(1);
                jForca.setAcerto(0);
                realm.copyToRealm(jForca);
                realm.commitTransaction();
                NovaTela();
            }
        });

        button_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(  TelaJogoForcaConfiabilidade.this, button_menu);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        String s = item.getTitle().toString();
                        if (s.equals("Caderno")) {
                            Intent intent = new Intent(  TelaJogoForcaConfiabilidade.this, TelaCadernoCaracteristicasQualidade.class);
                            startActivity(intent);
                        }
                        if (s.equals("Desempenho")) {
                            Intent intent = new Intent(  TelaJogoForcaConfiabilidade.this, TelaDesempenho.class);
                            startActivity(intent);
                        }
                        if (s.equals("Ajustes")) {
                            Intent intent = new Intent(  TelaJogoForcaConfiabilidade.this, TelaAjustes.class);
                            startActivity(intent);
                        }
                        if (s.equals("Avaliar")) {
                            Intent intent = new Intent(  TelaJogoForcaConfiabilidade.this, TelaAvaliacao.class);
                            startActivity(intent);
                        }
                        return true;
                    }
                });
                popupMenu.show();
            }
        });
    }


    void mudarImagemForca(){
        final LinearLayout layout_0 = (LinearLayout) findViewById(R.id.layout_0);
        final LinearLayout layout_1 = (LinearLayout) findViewById(R.id.layout_1);
        final LinearLayout layout_2 = (LinearLayout) findViewById(R.id.layout_2);
        final LinearLayout layout_3 = (LinearLayout) findViewById(R.id.layout_3);
        final LinearLayout layout_teclado1 = (LinearLayout) findViewById(R.id.layout_teclado1);
        final LinearLayout layout_teclado2 = (LinearLayout) findViewById(R.id.layout_teclado2);
        final LinearLayout layout_teclado3 = (LinearLayout) findViewById(R.id.layout_teclado3);
        final LinearLayout layout_respostaerrada = (LinearLayout) findViewById(R.id.layout_respostaerrada);
        Button button_revelar = (Button) findViewById(R.id.button_revelar);
        Button button_eliminar = (Button) findViewById(R.id.button_eliminar);
        Button button_dica = (Button) findViewById(R.id.button_dica);
        if (erro == 1){
            layout_0.setVisibility(View.GONE);
            layout_1.setVisibility(View.VISIBLE);
            layout_2.setVisibility(View.GONE);
            layout_3.setVisibility(View.GONE);

        }
        if (erro == 2){
            layout_0.setVisibility(View.GONE);
            layout_1.setVisibility(View.GONE);
            layout_2.setVisibility(View.VISIBLE);
            layout_3.setVisibility(View.GONE);

        }
        if (erro == 3){
            layout_0.setVisibility(View.GONE);
            layout_1.setVisibility(View.GONE);
            layout_2.setVisibility(View.GONE);
            layout_3.setVisibility(View.VISIBLE);
            layout_respostaerrada.setVisibility(View.VISIBLE);
            layout_teclado1.setVisibility(View.GONE);
            layout_teclado2.setVisibility(View.GONE);
            layout_teclado3.setVisibility(View.GONE);
            button_dica.setEnabled(false);
            button_eliminar.setEnabled(false);
            button_revelar.setEnabled(false);
            verSentimento(4);
            playSound(4);
        }
    }

    void verificarAcertos(){
        final LinearLayout layout_respostacerta = (LinearLayout) findViewById(R.id.layout_respostacerta);
        final LinearLayout layout_teclado1 = (LinearLayout) findViewById(R.id.layout_teclado1);
        final LinearLayout layout_teclado2 = (LinearLayout) findViewById(R.id.layout_teclado2);
        final LinearLayout layout_teclado3 = (LinearLayout) findViewById(R.id.layout_teclado3);
        Button button_revelar = (Button) findViewById(R.id.button_revelar);
        Button button_eliminar = (Button) findViewById(R.id.button_eliminar);
        Button button_dica = (Button) findViewById(R.id.button_dica);
        if (acertos == numero_letras){
            layout_respostacerta.setVisibility(View.VISIBLE);
            layout_teclado1.setVisibility(View.GONE);
            layout_teclado2.setVisibility(View.GONE);
            layout_teclado3.setVisibility(View.GONE);
            if (erro == 0){
                pontos = pontos + 60;
            }
            if (erro == 1){
                pontos = pontos + 40;
            }
            if (erro == 2){
                pontos = pontos + 20;
            }
            calcularPontuação();
            playSound(3);
            button_dica.setEnabled(false);
            button_eliminar.setEnabled(false);
            button_revelar.setEnabled(false);
            verSentimento(5);
        }
    }

    void calcularPontuação(){
        final Button button_pontuacao = (Button) findViewById(R.id.button_pontuacao);
        if (pontos == 0){
            button_pontuacao.setBackgroundResource(R.drawable.pontos0);
        }
        if (pontos == 10){
            button_pontuacao.setBackgroundResource(R.drawable.pontos10);
        }
        if (pontos == 20){
            button_pontuacao.setBackgroundResource(R.drawable.pontos20);
        }
        if (pontos == 30){
            button_pontuacao.setBackgroundResource(R.drawable.pontos30);
        }
        if (pontos == 40){
            button_pontuacao.setBackgroundResource(R.drawable.pontos40);
        }
        if (pontos == 50){
            button_pontuacao.setBackgroundResource(R.drawable.pontos50);
        }
        if (pontos == 60){
            button_pontuacao.setBackgroundResource(R.drawable.pontos60);
        }
        if (pontos == 70){
            button_pontuacao.setBackgroundResource(R.drawable.pontos70);
        }
        if (pontos == 80){
            button_pontuacao.setBackgroundResource(R.drawable.pontos80);
        }
        if (pontos == 90){
            button_pontuacao.setBackgroundResource(R.drawable.pontos90);
        }
        if (pontos == 100){
            button_pontuacao.setBackgroundResource(R.drawable.escudo50pxbranco);
        }
        if (pontos == 110){
            button_pontuacao.setBackgroundResource(R.drawable.pontos110);
        }
        if (pontos == 120){
            button_pontuacao.setBackgroundResource(R.drawable.pontos120);
        }
        if (pontos == 130){
            button_pontuacao.setBackgroundResource(R.drawable.pontos130);
        }
        if (pontos == 140){
            button_pontuacao.setBackgroundResource(R.drawable.pontos140);
        }
        if (pontos == 150){
            button_pontuacao.setBackgroundResource(R.drawable.pontos150);
        }
        if (pontos == 160){
            button_pontuacao.setBackgroundResource(R.drawable.pontos160);
        }
        if (pontos == 170){
            button_pontuacao.setBackgroundResource(R.drawable.pontos170);
        }
        if (pontos == 180){
            button_pontuacao.setBackgroundResource(R.drawable.pontos180);
        }
        if (pontos == 190){
            button_pontuacao.setBackgroundResource(R.drawable.pontos190);
        }
        if (pontos == 200){
            button_pontuacao.setBackgroundResource(R.drawable.pontos200);
        }
        if (pontos == 210){
            button_pontuacao.setBackgroundResource(R.drawable.pontos210);
        }
        if (pontos == 220){
            button_pontuacao.setBackgroundResource(R.drawable.pontos220);
        }
        if (pontos == 230){
            button_pontuacao.setBackgroundResource(R.drawable.pontos230);
        }
        if (pontos == 240){
            button_pontuacao.setBackgroundResource(R.drawable.pontos240);
        }
        if (pontos == 250){
            button_pontuacao.setBackgroundResource(R.drawable.pontos250);
        }
        if (pontos == 260){
            button_pontuacao.setBackgroundResource(R.drawable.pontos260);
        }
        if (pontos == 270){
            button_pontuacao.setBackgroundResource(R.drawable.pontos270);
        }
        if (pontos == 280){
            button_pontuacao.setBackgroundResource(R.drawable.pontos280);
        }
        if (pontos == 290){
            button_pontuacao.setBackgroundResource(R.drawable.pontos290);
        }
        if (pontos == 300){
            button_pontuacao.setBackgroundResource(R.drawable.pontos300);
        }
        if (pontos == 310){
            button_pontuacao.setBackgroundResource(R.drawable.pontos310);
        }
        if (pontos == 320){
            button_pontuacao.setBackgroundResource(R.drawable.pontos320);
        }
        if (pontos == 330){
            button_pontuacao.setBackgroundResource(R.drawable.pontos330);
        }
        if (pontos == 340){
            button_pontuacao.setBackgroundResource(R.drawable.pontos340);
        }
        if (pontos == 350){
            button_pontuacao.setBackgroundResource(R.drawable.pontos350);
        }
        if (pontos == 360){
            button_pontuacao.setBackgroundResource(R.drawable.pontos360);
        }
        if (pontos == 370){
            button_pontuacao.setBackgroundResource(R.drawable.pontos370);
        }
        if (pontos == 380){
            button_pontuacao.setBackgroundResource(R.drawable.pontos380);
        }
        if (pontos == 390){
            button_pontuacao.setBackgroundResource(R.drawable.pontos390);
        }
        if (pontos == 400){
            button_pontuacao.setBackgroundResource(R.drawable.pontos400);
        }
        if (pontos == 410){
            button_pontuacao.setBackgroundResource(R.drawable.pontos410);
        }
        if (pontos == 420){
            button_pontuacao.setBackgroundResource(R.drawable.pontos420);
        }
        if (pontos == 430){
            button_pontuacao.setBackgroundResource(R.drawable.pontos430);
        }
        if (pontos == 440){
            button_pontuacao.setBackgroundResource(R.drawable.pontos440);
        }
        if (pontos == 450){
            button_pontuacao.setBackgroundResource(R.drawable.pontos450);
        }
        if (pontos == 460){
            button_pontuacao.setBackgroundResource(R.drawable.pontos460);
        }
        if (pontos == 470){
            button_pontuacao.setBackgroundResource(R.drawable.pontos470);
        }
        if (pontos == 480){
            button_pontuacao.setBackgroundResource(R.drawable.pontos480);
        }
        if (pontos == 490){
            button_pontuacao.setBackgroundResource(R.drawable.pontos490);
        }
        if (pontos == 500){
            button_pontuacao.setBackgroundResource(R.drawable.pontos500);
        }
        if (pontos == 510){
            button_pontuacao.setBackgroundResource(R.drawable.pontos510);
        }
        if (pontos == 520){
            button_pontuacao.setBackgroundResource(R.drawable.pontos520);
        }
        if (pontos == 530){
            button_pontuacao.setBackgroundResource(R.drawable.pontos530);
        }
        if (pontos == 540){
            button_pontuacao.setBackgroundResource(R.drawable.pontos540);
        }
        if (pontos == 550){
            button_pontuacao.setBackgroundResource(R.drawable.pontos550);
        }
        if (pontos == 560){
            button_pontuacao.setBackgroundResource(R.drawable.pontos560);
        }
        if (pontos == 570){
            button_pontuacao.setBackgroundResource(R.drawable.pontos570);
        }
        if (pontos == 580){
            button_pontuacao.setBackgroundResource(R.drawable.pontos580);
        }
        if (pontos == 590){
            button_pontuacao.setBackgroundResource(R.drawable.pontos590);
        }
        if (pontos == 600){
            button_pontuacao.setBackgroundResource(R.drawable.pontos600);
        }
        if (pontos == 610){
            button_pontuacao.setBackgroundResource(R.drawable.pontos610);
        }
        if (pontos == 620){
            button_pontuacao.setBackgroundResource(R.drawable.pontos620);
        }
        if (pontos == 630){
            button_pontuacao.setBackgroundResource(R.drawable.pontos630);
        }
        if (pontos == 640){
            button_pontuacao.setBackgroundResource(R.drawable.pontos640);
        }
        if (pontos == 650){
            button_pontuacao.setBackgroundResource(R.drawable.pontos650);
        }
        if (pontos == 660){
            button_pontuacao.setBackgroundResource(R.drawable.pontos660);
        }
        if (pontos == 670){
            button_pontuacao.setBackgroundResource(R.drawable.pontos670);
        }
        if (pontos == 680){
            button_pontuacao.setBackgroundResource(R.drawable.pontos680);
        }
        if (pontos == 690){
            button_pontuacao.setBackgroundResource(R.drawable.pontos690);
        }
        if (pontos == 700){
            button_pontuacao.setBackgroundResource(R.drawable.pontos700);
        }
        if (pontos == 710){
            button_pontuacao.setBackgroundResource(R.drawable.pontos710);
        }
        if (pontos == 720){
            button_pontuacao.setBackgroundResource(R.drawable.pontos720);
        }
        if (pontos == 730){
            button_pontuacao.setBackgroundResource(R.drawable.pontos730);
        }
        if (pontos == 740){
            button_pontuacao.setBackgroundResource(R.drawable.pontos740);
        }
        if (pontos == 750){
            button_pontuacao.setBackgroundResource(R.drawable.pontos750);
        }
        if (pontos == 760){
            button_pontuacao.setBackgroundResource(R.drawable.pontos760);
        }
        if (pontos == 770){
            button_pontuacao.setBackgroundResource(R.drawable.pontos770);
        }
        if (pontos == 780){
            button_pontuacao.setBackgroundResource(R.drawable.pontos780);
        }
        if (pontos == 790){
            button_pontuacao.setBackgroundResource(R.drawable.pontos790);
        }
        if (pontos == 800){
            button_pontuacao.setBackgroundResource(R.drawable.pontos800);
        }
        if (pontos == 810){
            button_pontuacao.setBackgroundResource(R.drawable.pontos810);
        }
        if (pontos == 820){
            button_pontuacao.setBackgroundResource(R.drawable.pontos820);
        }
        if (pontos == 830){
            button_pontuacao.setBackgroundResource(R.drawable.pontos830);
        }
        if (pontos == 840){
            button_pontuacao.setBackgroundResource(R.drawable.pontos840);
        }
        if (pontos == 850){
            button_pontuacao.setBackgroundResource(R.drawable.pontos850);
        }
        if (pontos == 860){
            button_pontuacao.setBackgroundResource(R.drawable.pontos860);
        }
        if (pontos == 870){
            button_pontuacao.setBackgroundResource(R.drawable.pontos870);
        }
        if (pontos == 880){
            button_pontuacao.setBackgroundResource(R.drawable.pontos880);
        }
        if (pontos == 890){
            button_pontuacao.setBackgroundResource(R.drawable.pontos890);
        }
        if (pontos == 900){
            button_pontuacao.setBackgroundResource(R.drawable.pontos900);
        }
        if (pontos == 910){
            button_pontuacao.setBackgroundResource(R.drawable.pontos910);
        }
        if (pontos == 920){
            button_pontuacao.setBackgroundResource(R.drawable.pontos920);
        }
        if (pontos == 930){
            button_pontuacao.setBackgroundResource(R.drawable.pontos930);
        }
        if (pontos == 940){
            button_pontuacao.setBackgroundResource(R.drawable.pontos940);
        }
        if (pontos == 950){
            button_pontuacao.setBackgroundResource(R.drawable.pontos950);
        }
        if (pontos == 960){
            button_pontuacao.setBackgroundResource(R.drawable.pontos960);
        }
        if (pontos == 970){
            button_pontuacao.setBackgroundResource(R.drawable.pontos970);
        }
        if (pontos == 980){
            button_pontuacao.setBackgroundResource(R.drawable.pontos980);
        }
        if (pontos == 990){
            button_pontuacao.setBackgroundResource(R.drawable.pontos990);
        }
        if (pontos == 1000){
            button_pontuacao.setBackgroundResource(R.drawable.pontos1000);
        }
    }

    void verSentimento(int num){
        final Button button_sentimento = (Button) findViewById(R.id.button_sentimento);
        if (num == 1){
            button_sentimento.setBackgroundResource(R.drawable.neutro50px);
        }
        if (num == 2){
            button_sentimento.setBackgroundResource(R.drawable.feliz50px);
        }
        if (num == 3){
            button_sentimento.setBackgroundResource(R.drawable.triste50px);
        }
        if (num == 4){
            button_sentimento.setBackgroundResource(R.drawable.chorando50px);
        }
        if (num == 5){
            button_sentimento.setBackgroundResource(R.drawable.apaixonado50px);
        }
    }

    public void NovaTela(){

    }

    public void playSound(int num){
        Realm realm = Realm.getDefaultInstance();
        Ajustes aj = realm.where(Ajustes.class).equalTo("id", 1).findFirst();
        if (aj.getSom() == 1){
            if (num == 1){
                MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.respostacerta);
                mediaPlayer.start();
            }
            if (num == 2){
                MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.respostacerta);
                mediaPlayer.start();
            }
            if (num == 3){
                MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.respostacerta);
                mediaPlayer.start();
            }
            if (num == 4){
                MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.respostaerrada);
                mediaPlayer.start();
            }
        }
    }

    public void verificarLetra(int num){
        int cont = 0;
        final TextView letra1 = (TextView) findViewById(R.id.letra1);
        final TextView letra2 = (TextView) findViewById(R.id.letra2);
        final TextView letra3 = (TextView) findViewById(R.id.letra3);
        final TextView letra4 = (TextView) findViewById(R.id.letra4);
        final TextView letra5 = (TextView) findViewById(R.id.letra5);
        final TextView letra6 = (TextView) findViewById(R.id.letra6);
        final TextView letra7 = (TextView) findViewById(R.id.letra7);
        final TextView letra8 = (TextView) findViewById(R.id.letra8);
        final TextView letra9 = (TextView) findViewById(R.id.letra9);
        final TextView letra10 = (TextView) findViewById(R.id.letra10);
        final TextView letra11 = (TextView) findViewById(R.id.letra11);
        final TextView letra12 = (TextView) findViewById(R.id.letra12);
        final TextView letra13 = (TextView) findViewById(R.id.letra13);
        final TextView letra14 = (TextView) findViewById(R.id.letra14);
        final TextView letra15 = null;
        final TextView letra16 = null;
        final TextView letra17 = null;
        final TextView letra18 = null;
        final TextView letra19 = null;
        final TextView letra20 = null;
        final TextView letra21 = null;
        final TextView letra22 = null;
        final TextView letra23 = null;
        final TextView letra24 = null;
        final TextView letra25 = null;
        if (num == 1){
            if (letracerta1.equals("A") || letracerta1.equals("Ã") || letracerta1.equals("Á") || letracerta1.equals("Â")){
                letra1.setText(letracerta1);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta2.equals("A") || letracerta2.equals("Ã") || letracerta2.equals("Á") || letracerta2.equals("Â")){
                letra2.setText(letracerta2);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta3.equals("A") || letracerta3.equals("Ã") || letracerta3.equals("Á") || letracerta3.equals("Â")){
                letra3.setText(letracerta3);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta4.equals("A") || letracerta4.equals("Ã") || letracerta4.equals("Á") || letracerta4.equals("Â")){
                letra4.setText(letracerta4);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta5.equals("A") || letracerta5.equals("Ã") || letracerta5.equals("Á") || letracerta5.equals("Â")){
                letra5.setText(letracerta5);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta6.equals("A") || letracerta6.equals("Ã") || letracerta6.equals("Á") || letracerta6.equals("Â")){
                letra6.setText(letracerta6);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta7.equals("A") || letracerta7.equals("Ã") || letracerta7.equals("Á") || letracerta7.equals("Â")){
                letra7.setText(letracerta7);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta8.equals("A") || letracerta8.equals("Ã") || letracerta8.equals("Á") || letracerta8.equals("Â")){
                letra8.setText(letracerta8);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta9.equals("A") || letracerta9.equals("Ã") || letracerta9.equals("Á") || letracerta9.equals("Â")){
                letra9.setText(letracerta9);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta10.equals("A") || letracerta10.equals("Ã") || letracerta10.equals("Á") || letracerta10.equals("Â")){
                letra10.setText(letracerta10);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta11.equals("A") || letracerta11.equals("Ã") || letracerta11.equals("Á") || letracerta11.equals("Â")){
                letra11.setText(letracerta11);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta12.equals("A") || letracerta12.equals("Ã") || letracerta12.equals("Á") || letracerta12.equals("Â")){
                letra12.setText(letracerta12);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta13.equals("A") || letracerta13.equals("Ã") || letracerta13.equals("Á") || letracerta13.equals("Â")){
                letra13.setText(letracerta13);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta14.equals("A") || letracerta14.equals("Ã") || letracerta14.equals("Á") || letracerta14.equals("Â")){
                letra14.setText(letracerta14);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta15.equals("A") || letracerta15.equals("Ã") || letracerta15.equals("Á") || letracerta15.equals("Â")){
                letra15.setText(letracerta15);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta16.equals("A") || letracerta16.equals("Ã") || letracerta16.equals("Á") || letracerta16.equals("Â")){
                letra16.setText(letracerta16);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta17.equals("A") || letracerta17.equals("Ã") || letracerta17.equals("Á") || letracerta17.equals("Â")){
                letra17.setText(letracerta17);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta18.equals("A") || letracerta18.equals("Ã") || letracerta18.equals("Á") || letracerta18.equals("Â")){
                letra18.setText(letracerta18);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta19.equals("A") || letracerta19.equals("Ã") || letracerta19.equals("Á") || letracerta19.equals("Â")){
                letra19.setText(letracerta19);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta20.equals("A") || letracerta20.equals("Ã") || letracerta20.equals("Á") || letracerta20.equals("Â")){
                letra20.setText(letracerta20);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta21.equals("A") || letracerta21.equals("Ã") || letracerta21.equals("Á") || letracerta21.equals("Â")){
                letra21.setText(letracerta21);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta22.equals("A") || letracerta22.equals("Ã") || letracerta22.equals("Á") || letracerta22.equals("Â")){
                letra22.setText(letracerta22);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta23.equals("A") || letracerta23.equals("Ã") || letracerta23.equals("Á") || letracerta23.equals("Â")){
                letra23.setText(letracerta23);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta24.equals("A") || letracerta24.equals("Ã") || letracerta24.equals("Á") || letracerta24.equals("Â")){
                letra24.setText(letracerta24);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta25.equals("A") || letracerta25.equals("Ã") || letracerta25.equals("Á") || letracerta25.equals("Â")){
                letra25.setText(letracerta25);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (cont>0){
                verSentimento(2);
                calcularPontuação();
                verificarAcertos();
            }
            else{
                erro = erro +1;
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        }
        if (num == 2){
            if (letracerta1.equals("B")){
                letra1.setText(letracerta1);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta2.equals("B")){
                letra2.setText(letracerta2);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta3.equals("B")){
                letra3.setText(letracerta3);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta4.equals("B")){
                letra4.setText(letracerta4);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta5.equals("B")){
                letra5.setText(letracerta5);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta6.equals("B")){
                letra6.setText(letracerta6);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta7.equals("B")){
                letra7.setText(letracerta7);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta8.equals("B")){
                letra8.setText(letracerta8);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta9.equals("B")){
                letra9.setText(letracerta9);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta10.equals("B")){
                letra10.setText(letracerta10);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta11.equals("B")){
                letra11.setText(letracerta11);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta12.equals("B")){
                letra12.setText(letracerta12);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta13.equals("B")){
                letra13.setText(letracerta13);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta14.equals("B")){
                letra14.setText(letracerta14);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta15.equals("B")){
                letra15.setText(letracerta15);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta16.equals("B")){
                letra16.setText(letracerta16);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta17.equals("B")){
                letra17.setText(letracerta17);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta18.equals("B")){
                letra18.setText(letracerta18);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta19.equals("B")){
                letra19.setText(letracerta19);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta20.equals("B")){
                letra20.setText(letracerta20);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta21.equals("B")){
                letra21.setText(letracerta21);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta22.equals("B")){
                letra22.setText(letracerta22);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta23.equals("B")){
                letra23.setText(letracerta23);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta24.equals("B")){
                letra24.setText(letracerta24);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta25.equals("B")){
                letra25.setText(letracerta25);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (cont>0){
                verSentimento(2);
                calcularPontuação();
                verificarAcertos();
            }
            else{
                erro = erro +1;
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        }

        if (num == 3){
            if (letracerta1.equals("C") || letracerta1.equals("Ç")){
                letra1.setText(letracerta1);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta2.equals("C") || letracerta2.equals("Ç")){
                letra2.setText(letracerta2);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta3.equals("C") || letracerta3.equals("Ç")){
                letra3.setText(letracerta3);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta4.equals("C") || letracerta4.equals("Ç")){
                letra4.setText(letracerta4);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta5.equals("C") || letracerta5.equals("Ç")){
                letra5.setText(letracerta5);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta6.equals("C") || letracerta6.equals("Ç")){
                letra6.setText(letracerta6);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta7.equals("C") || letracerta7.equals("Ç")){
                letra7.setText(letracerta7);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta8.equals("C") || letracerta8.equals("Ç")){
                letra8.setText(letracerta8);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta9.equals("C") || letracerta9.equals("Ç")){
                letra9.setText(letracerta9);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta10.equals("C") || letracerta10.equals("Ç")){
                letra10.setText(letracerta10);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta11.equals("C") || letracerta11.equals("Ç")){
                letra11.setText(letracerta11);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta12.equals("C") || letracerta12.equals("Ç")){
                letra12.setText(letracerta12);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta13.equals("C") || letracerta13.equals("Ç") ){
                letra13.setText(letracerta13);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta14.equals("C") || letracerta14.equals("Ç") ){
                letra14.setText(letracerta14);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta15.equals("C") || letracerta15.equals("Ç")){
                letra15.setText(letracerta15);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta16.equals("C") || letracerta16.equals("Ç") ){
                letra16.setText(letracerta16);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta17.equals("C") || letracerta17.equals("Ç") ){
                letra17.setText(letracerta17);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta18.equals("C") || letracerta18.equals("Ç") ){
                letra18.setText(letracerta18);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta19.equals("C") || letracerta19.equals("Ç") ){
                letra19.setText(letracerta19);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta20.equals("C") || letracerta20.equals("Ç") ){
                letra20.setText(letracerta20);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta21.equals("C") || letracerta21.equals("Ç") ){
                letra21.setText(letracerta21);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta22.equals("C") || letracerta22.equals("Ç") ){
                letra22.setText(letracerta22);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta23.equals("C") || letracerta23.equals("Ç")){
                letra23.setText(letracerta23);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta24.equals("C") || letracerta24.equals("Ç")){
                letra24.setText(letracerta24);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta25.equals("C") || letracerta25.equals("Ç")){
                letra25.setText(letracerta25);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (cont>0){
                verSentimento(2);
                calcularPontuação();
                verificarAcertos();
            }
            else{
                erro = erro +1;
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        }
        if (num == 4){
            if (letracerta1.equals("D")){
                letra1.setText(letracerta1);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta2.equals("D")){
                letra2.setText(letracerta2);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta3.equals("D")){
                letra3.setText(letracerta3);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta4.equals("D")){
                letra4.setText(letracerta4);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta5.equals("D")){
                letra5.setText(letracerta5);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta6.equals("D")){
                letra6.setText(letracerta6);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta7.equals("D")){
                letra7.setText(letracerta7);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta8.equals("D")){
                letra8.setText(letracerta8);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta9.equals("D")){
                letra9.setText(letracerta9);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta10.equals("D")){
                letra10.setText(letracerta10);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta11.equals("D")){
                letra11.setText(letracerta11);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta12.equals("D")){
                letra12.setText(letracerta12);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta13.equals("D")){
                letra13.setText(letracerta13);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta14.equals("D")){
                letra14.setText(letracerta14);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta15.equals("D")){
                letra15.setText(letracerta15);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta16.equals("D")){
                letra16.setText(letracerta16);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta17.equals("D")){
                letra17.setText(letracerta17);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta18.equals("D")){
                letra18.setText(letracerta18);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta19.equals("D")){
                letra19.setText(letracerta19);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta20.equals("D")){
                letra20.setText(letracerta20);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta21.equals("D")){
                letra21.setText(letracerta21);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta22.equals("D")){
                letra22.setText(letracerta22);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta23.equals("D")){
                letra23.setText(letracerta23);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta24.equals("D")){
                letra24.setText(letracerta24);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta25.equals("D")){
                letra25.setText(letracerta25);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (cont>0){
                verSentimento(2);
                calcularPontuação();
                verificarAcertos();
            }
            else{
                erro = erro +1;
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        }
        if (num == 5){
            if (letracerta1.equals("E") || letracerta1.equals("Ẽ") || letracerta1.equals("É") || letracerta1.equals("Ê")){
                letra1.setText(letracerta1);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta2.equals("E") || letracerta2.equals("Ẽ") || letracerta2.equals("É") || letracerta2.equals("Ê")){
                letra2.setText(letracerta2);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta3.equals("E") || letracerta3.equals("Ẽ") || letracerta3.equals("É") || letracerta3.equals("Ê")){
                letra3.setText(letracerta3);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta4.equals("E") || letracerta4.equals("Ẽ") || letracerta4.equals("É") || letracerta4.equals("Ê")){
                letra4.setText(letracerta4);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta5.equals("E") || letracerta5.equals("Ẽ") || letracerta5.equals("É") || letracerta5.equals("Ê")){
                letra5.setText(letracerta5);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta6.equals("E") || letracerta6.equals("Ẽ") || letracerta6.equals("É") || letracerta6.equals("Ê")){
                letra6.setText(letracerta6);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta7.equals("E") || letracerta7.equals("Ẽ") || letracerta7.equals("É") || letracerta7.equals("Ê")){
                letra7.setText(letracerta7);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta8.equals("E") || letracerta8.equals("Ẽ") || letracerta8.equals("É") || letracerta8.equals("Ê")){
                letra8.setText(letracerta8);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta9.equals("E") || letracerta9.equals("Ẽ") || letracerta9.equals("É") || letracerta9.equals("Ê")){
                letra9.setText(letracerta9);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta10.equals("E") || letracerta10.equals("Ẽ") || letracerta10.equals("É") || letracerta10.equals("Ê")){
                letra10.setText(letracerta10);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta11.equals("E") || letracerta11.equals("Ẽ") || letracerta11.equals("É") || letracerta11.equals("Ê")){
                letra11.setText(letracerta11);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta12.equals("E") || letracerta12.equals("Ẽ") || letracerta12.equals("É") || letracerta12.equals("Ê")){
                letra12.setText(letracerta12);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta13.equals("E") || letracerta13.equals("Ẽ") || letracerta13.equals("É") || letracerta13.equals("Ê")){
                letra13.setText(letracerta13);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta14.equals("E") || letracerta14.equals("Ẽ") || letracerta14.equals("É") || letracerta14.equals("Ê")){
                letra14.setText(letracerta14);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta15.equals("E") || letracerta15.equals("Ẽ") || letracerta15.equals("É") || letracerta15.equals("Ê")){
                letra15.setText(letracerta15);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta16.equals("E") || letracerta16.equals("Ẽ") || letracerta16.equals("É") || letracerta16.equals("Ê")){
                letra16.setText(letracerta16);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta17.equals("E") || letracerta17.equals("Ẽ") || letracerta17.equals("É") || letracerta17.equals("Ê")){
                letra17.setText(letracerta17);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta18.equals("E") || letracerta18.equals("Ẽ") || letracerta18.equals("É") || letracerta18.equals("Ê")){
                letra18.setText(letracerta18);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta19.equals("E") || letracerta19.equals("Ẽ") || letracerta19.equals("É") || letracerta19.equals("Ê")){
                letra19.setText(letracerta19);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta20.equals("E") || letracerta20.equals("Ẽ") || letracerta20.equals("É") || letracerta20.equals("Ê")){
                letra20.setText(letracerta20);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta21.equals("E") || letracerta21.equals("Ẽ") || letracerta21.equals("É") || letracerta21.equals("Ê")){
                letra21.setText(letracerta21);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta22.equals("E") || letracerta22.equals("Ẽ") || letracerta22.equals("É") || letracerta22.equals("Ê")){
                letra22.setText(letracerta22);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta23.equals("E") || letracerta23.equals("Ẽ") || letracerta23.equals("É") || letracerta23.equals("Ê")){
                letra23.setText(letracerta23);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta24.equals("E") || letracerta24.equals("Ẽ") || letracerta24.equals("É") || letracerta24.equals("Ê")){
                letra24.setText(letracerta24);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta25.equals("E") || letracerta25.equals("Ẽ") || letracerta25.equals("É") || letracerta25.equals("Ê")){
                letra25.setText(letracerta25);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (cont>0){
                verSentimento(2);
                calcularPontuação();
                verificarAcertos();
            }
            else{
                erro = erro +1;
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        }
        if (num == 6){
            if (letracerta1.equals("F")){
                letra1.setText(letracerta1);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta2.equals("F")){
                letra2.setText(letracerta2);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta3.equals("F")){
                letra3.setText(letracerta3);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta4.equals("F")){
                letra4.setText(letracerta4);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta5.equals("F")){
                letra5.setText(letracerta5);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta6.equals("F")){
                letra6.setText(letracerta6);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta7.equals("F")){
                letra7.setText(letracerta7);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta8.equals("F")){
                letra8.setText(letracerta8);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta9.equals("F")){
                letra9.setText(letracerta9);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta10.equals("F")){
                letra10.setText(letracerta10);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta11.equals("F")){
                letra11.setText(letracerta11);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta12.equals("F")){
                letra12.setText(letracerta12);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta13.equals("F")){
                letra13.setText(letracerta13);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta14.equals("F")){
                letra14.setText(letracerta14);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta15.equals("F")){
                letra15.setText(letracerta15);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta16.equals("F")){
                letra16.setText(letracerta16);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta17.equals("F")){
                letra17.setText(letracerta17);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta18.equals("F")){
                letra18.setText(letracerta18);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta19.equals("F")){
                letra19.setText(letracerta19);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta20.equals("F")){
                letra20.setText(letracerta20);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta21.equals("F")){
                letra21.setText(letracerta21);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta22.equals("F")){
                letra22.setText(letracerta22);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta23.equals("F")){
                letra23.setText(letracerta23);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta24.equals("F")){
                letra24.setText(letracerta24);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta25.equals("F")){
                letra25.setText(letracerta25);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (cont>0){
                verSentimento(2);
                calcularPontuação();
                verificarAcertos();
            }
            else{
                erro = erro +1;
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        }
        if (num == 7){
            if (letracerta1.equals("G")){
                letra1.setText(letracerta1);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta2.equals("G")){
                letra2.setText(letracerta2);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta3.equals("G")){
                letra3.setText(letracerta3);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta4.equals("G")){
                letra4.setText(letracerta4);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta5.equals("G")){
                letra5.setText(letracerta5);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta6.equals("G")){
                letra6.setText(letracerta6);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta7.equals("G")){
                letra7.setText(letracerta7);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta8.equals("G")){
                letra8.setText(letracerta8);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta9.equals("G")){
                letra9.setText(letracerta9);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta10.equals("G")){
                letra10.setText(letracerta10);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta11.equals("G")){
                letra11.setText(letracerta11);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta12.equals("G")){
                letra12.setText(letracerta12);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta13.equals("G")){
                letra13.setText(letracerta13);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta14.equals("G")){
                letra14.setText(letracerta14);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta15.equals("G")){
                letra15.setText(letracerta15);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta16.equals("G")){
                letra16.setText(letracerta16);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta17.equals("G")){
                letra17.setText(letracerta17);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta18.equals("G")){
                letra18.setText(letracerta18);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta19.equals("G")){
                letra19.setText(letracerta19);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta20.equals("G")){
                letra20.setText(letracerta20);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta21.equals("G")){
                letra21.setText(letracerta21);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta22.equals("G")){
                letra22.setText(letracerta22);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta23.equals("G")){
                letra23.setText(letracerta23);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta24.equals("G")){
                letra24.setText(letracerta24);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta25.equals("G")){
                letra25.setText(letracerta25);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (cont>0){
                verSentimento(2);
                calcularPontuação();
                verificarAcertos();
            }
            else{
                erro = erro +1;
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        }
        if (num == 8){
            if (letracerta1.equals("H")){
                letra1.setText(letracerta1);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta2.equals("H")){
                letra2.setText(letracerta2);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta3.equals("H")){
                letra3.setText(letracerta3);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta4.equals("H")){
                letra4.setText(letracerta4);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta5.equals("H")){
                letra5.setText(letracerta5);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta6.equals("H")){
                letra6.setText(letracerta6);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta7.equals("H")){
                letra7.setText(letracerta7);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta8.equals("H")){
                letra8.setText(letracerta8);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta9.equals("H")){
                letra9.setText(letracerta9);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta10.equals("H")){
                letra10.setText(letracerta10);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta11.equals("H")){
                letra11.setText(letracerta11);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta12.equals("H")){
                letra12.setText(letracerta12);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta13.equals("H")){
                letra13.setText(letracerta13);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta14.equals("H")){
                letra14.setText(letracerta14);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta15.equals("H")){
                letra15.setText(letracerta15);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta16.equals("H")){
                letra16.setText(letracerta16);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta17.equals("H")){
                letra17.setText(letracerta17);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta18.equals("H")){
                letra18.setText(letracerta18);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta19.equals("H")){
                letra19.setText(letracerta19);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta20.equals("H")){
                letra20.setText(letracerta20);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta21.equals("H")){
                letra21.setText(letracerta21);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta22.equals("H")){
                letra22.setText(letracerta22);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta23.equals("H")){
                letra23.setText(letracerta23);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta24.equals("H")){
                letra24.setText(letracerta24);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta25.equals("H")){
                letra25.setText(letracerta25);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (cont>0){
                verSentimento(2);
                calcularPontuação();
                verificarAcertos();
            }
            else{
                erro = erro +1;
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        }
        if (num == 9){
            if (letracerta1.equals("I") || letracerta1.equals("Ĩ") || letracerta1.equals("Í") || letracerta1.equals("Î")){
                letra1.setText(letracerta1);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta2.equals("I") || letracerta2.equals("Ĩ") || letracerta2.equals("Í") || letracerta2.equals("Î")){
                letra2.setText(letracerta2);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta3.equals("I") || letracerta3.equals("Ĩ") || letracerta3.equals("Í") || letracerta3.equals("Î")){
                letra3.setText(letracerta3);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta4.equals("I") || letracerta4.equals("Ĩ") || letracerta4.equals("Í") || letracerta4.equals("Î")){
                letra4.setText(letracerta4);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta5.equals("I") || letracerta5.equals("Ĩ") || letracerta5.equals("Í") || letracerta5.equals("Î")){
                letra5.setText(letracerta5);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta6.equals("I") || letracerta6.equals("Ĩ") || letracerta6.equals("Í") || letracerta6.equals("Î")){
                letra6.setText(letracerta6);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta7.equals("I") || letracerta7.equals("Ĩ") || letracerta7.equals("Í") || letracerta7.equals("Î")){
                letra7.setText(letracerta7);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta8.equals("I") || letracerta8.equals("Ĩ") || letracerta8.equals("Í") || letracerta8.equals("Î")){
                letra8.setText(letracerta8);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta9.equals("I") || letracerta9.equals("Ĩ") || letracerta9.equals("Í") || letracerta9.equals("Î")){
                letra9.setText(letracerta9);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta10.equals("I") || letracerta10.equals("Ĩ") || letracerta10.equals("Í") || letracerta10.equals("Î")){
                letra10.setText(letracerta10);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta11.equals("I") || letracerta11.equals("Ĩ") || letracerta11.equals("Í") || letracerta11.equals("Î")){
                letra11.setText(letracerta11);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta12.equals("I") || letracerta12.equals("Ĩ") || letracerta12.equals("Í") || letracerta12.equals("Î")){
                letra12.setText(letracerta12);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta13.equals("I") || letracerta13.equals("Ĩ") || letracerta13.equals("Í") || letracerta13.equals("Î")){
                letra13.setText(letracerta13);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta14.equals("I") || letracerta14.equals("Ĩ") || letracerta14.equals("Í") || letracerta14.equals("Î")){
                letra14.setText(letracerta14);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta15.equals("I") || letracerta15.equals("Ĩ") || letracerta15.equals("Í") || letracerta15.equals("Î")){
                letra15.setText(letracerta15);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta16.equals("I") || letracerta16.equals("Ĩ") || letracerta16.equals("Í") || letracerta16.equals("Î")){
                letra16.setText(letracerta16);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta17.equals("I") || letracerta17.equals("Ĩ") || letracerta17.equals("Í") || letracerta17.equals("Î")){
                letra17.setText(letracerta17);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta18.equals("I") || letracerta18.equals("Ĩ") || letracerta18.equals("Í") || letracerta18.equals("Î")){
                letra18.setText(letracerta18);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta19.equals("I") || letracerta19.equals("Ĩ") || letracerta19.equals("Í") || letracerta19.equals("Î")){
                letra19.setText(letracerta19);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta20.equals("I") || letracerta20.equals("Ĩ") || letracerta20.equals("Í") || letracerta20.equals("Î")){
                letra20.setText(letracerta20);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta21.equals("I") || letracerta21.equals("Ĩ") || letracerta21.equals("Í") || letracerta21.equals("Î")){
                letra21.setText(letracerta21);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta22.equals("I") || letracerta22.equals("Ĩ") || letracerta22.equals("Í") || letracerta22.equals("Î")){
                letra22.setText(letracerta22);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta23.equals("I") || letracerta23.equals("Ĩ") || letracerta23.equals("Í") || letracerta23.equals("Î")){
                letra23.setText(letracerta23);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta24.equals("I") || letracerta24.equals("Ĩ") || letracerta24.equals("Í") || letracerta24.equals("Î")){
                letra24.setText(letracerta24);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta25.equals("I") || letracerta25.equals("Ĩ") || letracerta25.equals("Í") || letracerta25.equals("Î")){
                letra25.setText(letracerta25);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (cont>0){
                verSentimento(2);
                calcularPontuação();
                verificarAcertos();
            }
            else{
                erro = erro +1;
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        }
        if (num == 10){
            if (letracerta1.equals("J")){
                letra1.setText(letracerta1);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta2.equals("J")){
                letra2.setText(letracerta2);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta3.equals("J")){
                letra3.setText(letracerta3);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta4.equals("J")){
                letra4.setText(letracerta4);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta5.equals("J")){
                letra5.setText(letracerta5);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta6.equals("J")){
                letra6.setText(letracerta6);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta7.equals("J")){
                letra7.setText(letracerta7);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta8.equals("J")){
                letra8.setText(letracerta8);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta9.equals("J")){
                letra9.setText(letracerta9);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta10.equals("J")){
                letra10.setText(letracerta10);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta11.equals("J")){
                letra11.setText(letracerta11);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta12.equals("J")){
                letra12.setText(letracerta12);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta13.equals("J")){
                letra13.setText(letracerta13);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta14.equals("J")){
                letra14.setText(letracerta14);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta15.equals("J")){
                letra15.setText(letracerta15);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta16.equals("J")){
                letra16.setText(letracerta16);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta17.equals("J")){
                letra17.setText(letracerta17);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta18.equals("J")){
                letra18.setText(letracerta18);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta19.equals("J")){
                letra19.setText(letracerta19);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta20.equals("J")){
                letra20.setText(letracerta20);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta21.equals("J")){
                letra21.setText(letracerta21);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta22.equals("J")){
                letra22.setText(letracerta22);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta23.equals("J")){
                letra23.setText(letracerta23);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta24.equals("J")){
                letra24.setText(letracerta24);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta25.equals("J")){
                letra25.setText(letracerta25);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (cont>0){
                verSentimento(2);
                calcularPontuação();
                verificarAcertos();
            }
            else{
                erro = erro +1;
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        }
        if (num == 11){
            if (letracerta1.equals("K")){
                letra1.setText(letracerta1);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta2.equals("K")){
                letra2.setText(letracerta2);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta3.equals("K")){
                letra3.setText(letracerta3);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta4.equals("K")){
                letra4.setText(letracerta4);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta5.equals("K")){
                letra5.setText(letracerta5);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta6.equals("K")){
                letra6.setText(letracerta6);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta7.equals("K")){
                letra7.setText(letracerta7);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta8.equals("K")){
                letra8.setText(letracerta8);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta9.equals("K")){
                letra9.setText(letracerta9);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta10.equals("K")){
                letra10.setText(letracerta10);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta11.equals("K")){
                letra11.setText(letracerta11);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta12.equals("K")){
                letra12.setText(letracerta12);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta13.equals("K")){
                letra13.setText(letracerta13);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta14.equals("K")){
                letra14.setText(letracerta14);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta15.equals("K")){
                letra15.setText(letracerta15);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta16.equals("K")){
                letra16.setText(letracerta16);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta17.equals("K")){
                letra17.setText(letracerta17);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta18.equals("K")){
                letra18.setText(letracerta18);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta19.equals("K")){
                letra19.setText(letracerta19);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta20.equals("K")){
                letra20.setText(letracerta20);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta21.equals("K")){
                letra21.setText(letracerta21);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta22.equals("K")){
                letra22.setText(letracerta22);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta23.equals("K")){
                letra23.setText(letracerta23);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta24.equals("K")){
                letra24.setText(letracerta24);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta25.equals("K")){
                letra25.setText(letracerta25);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (cont>0){
                verSentimento(2);
                calcularPontuação();
                verificarAcertos();
            }
            else{
                erro = erro +1;
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        }
        if (num == 12){
            if (letracerta1.equals("L")){
                letra1.setText(letracerta1);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta2.equals("L")){
                letra2.setText(letracerta2);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta3.equals("L")){
                letra3.setText(letracerta3);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta4.equals("L")){
                letra4.setText(letracerta4);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta5.equals("L")){
                letra5.setText(letracerta5);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta6.equals("L")){
                letra6.setText(letracerta6);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta7.equals("L")){
                letra7.setText(letracerta7);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta8.equals("L")){
                letra8.setText(letracerta8);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta9.equals("L")){
                letra9.setText(letracerta9);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta10.equals("L")){
                letra10.setText(letracerta10);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta11.equals("L")){
                letra11.setText(letracerta11);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta12.equals("L")){
                letra12.setText(letracerta12);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta13.equals("L")){
                letra13.setText(letracerta13);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta14.equals("L")){
                letra14.setText(letracerta14);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta15.equals("L")){
                letra15.setText(letracerta15);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta16.equals("L")){
                letra16.setText(letracerta16);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta17.equals("L")){
                letra17.setText(letracerta17);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta18.equals("L")){
                letra18.setText(letracerta18);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta19.equals("L")){
                letra19.setText(letracerta19);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta20.equals("L")){
                letra20.setText(letracerta20);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta21.equals("L")){
                letra21.setText(letracerta21);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta22.equals("L")){
                letra22.setText(letracerta22);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta23.equals("L")){
                letra23.setText(letracerta23);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta24.equals("L")){
                letra24.setText(letracerta24);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta25.equals("L")){
                letra25.setText(letracerta25);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (cont>0){
                verSentimento(2);
                calcularPontuação();
                verificarAcertos();
            }
            else{
                erro = erro +1;
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        }
        if (num == 13){
            if (letracerta1.equals("M")){
                letra1.setText(letracerta1);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta2.equals("M")){
                letra2.setText(letracerta2);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta3.equals("M")){
                letra3.setText(letracerta3);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta4.equals("M")){
                letra4.setText(letracerta4);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta5.equals("M")){
                letra5.setText(letracerta5);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta6.equals("M")){
                letra6.setText(letracerta6);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta7.equals("M")){
                letra7.setText(letracerta7);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta8.equals("M")){
                letra8.setText(letracerta8);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta9.equals("M")){
                letra9.setText(letracerta9);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta10.equals("M")){
                letra10.setText(letracerta10);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta11.equals("M")){
                letra11.setText(letracerta11);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta12.equals("M")){
                letra12.setText(letracerta12);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta13.equals("M")){
                letra13.setText(letracerta13);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta14.equals("M")){
                letra14.setText(letracerta14);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta15.equals("M")){
                letra15.setText(letracerta15);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta16.equals("M")){
                letra16.setText(letracerta16);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta17.equals("M")){
                letra17.setText(letracerta17);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta18.equals("M")){
                letra18.setText(letracerta18);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta19.equals("M")){
                letra19.setText(letracerta19);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta20.equals("M")){
                letra20.setText(letracerta20);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta21.equals("M")){
                letra21.setText(letracerta21);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta22.equals("M")){
                letra22.setText(letracerta22);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta23.equals("M")){
                letra23.setText(letracerta23);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta24.equals("M")){
                letra24.setText(letracerta24);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta25.equals("M")){
                letra25.setText(letracerta25);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (cont>0){
                verSentimento(2);
                calcularPontuação();
                verificarAcertos();
            }
            else{
                erro = erro +1;
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        }
        if (num == 14){
            if (letracerta1.equals("N")){
                letra1.setText(letracerta1);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta2.equals("N")){
                letra2.setText(letracerta2);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta3.equals("N")){
                letra3.setText(letracerta3);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta4.equals("N")){
                letra4.setText(letracerta4);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta5.equals("N")){
                letra5.setText(letracerta5);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta6.equals("N")){
                letra6.setText(letracerta6);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta7.equals("N")){
                letra7.setText(letracerta7);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta8.equals("N")){
                letra8.setText(letracerta8);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta9.equals("N")){
                letra9.setText(letracerta9);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta10.equals("N")){
                letra10.setText(letracerta10);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta11.equals("N")){
                letra11.setText(letracerta11);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta12.equals("N")){
                letra12.setText(letracerta12);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta13.equals("N")){
                letra13.setText(letracerta13);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta14.equals("N")){
                letra14.setText(letracerta14);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta15.equals("N")){
                letra15.setText(letracerta15);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta16.equals("N")){
                letra16.setText(letracerta16);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta17.equals("N")){
                letra17.setText(letracerta17);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta18.equals("N")){
                letra18.setText(letracerta18);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta19.equals("N")){
                letra19.setText(letracerta19);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta20.equals("N")){
                letra20.setText(letracerta20);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta21.equals("N")){
                letra21.setText(letracerta21);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta22.equals("N")){
                letra22.setText(letracerta22);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta23.equals("N")){
                letra23.setText(letracerta23);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta24.equals("N")){
                letra24.setText(letracerta24);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta25.equals("N")){
                letra25.setText(letracerta25);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (cont>0){
                verSentimento(2);
                calcularPontuação();
                verificarAcertos();
            }
            else{
                erro = erro +1;
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        }
        if (num == 15){
            if (letracerta1.equals("O") || letracerta1.equals("Õ") || letracerta1.equals("Ó") || letracerta1.equals("Ô")){
                letra1.setText(letracerta1);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta2.equals("O") || letracerta2.equals("Õ") || letracerta2.equals("Ó") || letracerta2.equals("Ô")){
                letra2.setText(letracerta2);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta3.equals("O") || letracerta3.equals("Õ") || letracerta3.equals("Ó") || letracerta3.equals("Ô")){
                letra3.setText(letracerta3);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta4.equals("O") || letracerta4.equals("Õ") || letracerta4.equals("Ó") || letracerta4.equals("Ô")){
                letra4.setText(letracerta4);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta5.equals("O") || letracerta5.equals("Õ") || letracerta5.equals("Ó") || letracerta5.equals("Ô")){
                letra5.setText(letracerta5);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta6.equals("O") || letracerta6.equals("Õ") || letracerta6.equals("Ó") || letracerta6.equals("Ô")){
                letra6.setText(letracerta6);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta7.equals("O") || letracerta7.equals("Õ") || letracerta7.equals("Ó") || letracerta7.equals("Ô")){
                letra7.setText(letracerta7);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta8.equals("O") || letracerta8.equals("Õ") || letracerta8.equals("Ó") || letracerta8.equals("Ô")){
                letra8.setText(letracerta8);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta9.equals("O") || letracerta9.equals("Õ") || letracerta9.equals("Ó") || letracerta9.equals("Ô")){
                letra9.setText(letracerta9);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta10.equals("O") || letracerta10.equals("Õ") || letracerta10.equals("Ó") || letracerta10.equals("Ô")){
                letra10.setText(letracerta10);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta11.equals("O") || letracerta11.equals("Õ") || letracerta11.equals("Ó") || letracerta11.equals("Ô")){
                letra11.setText(letracerta11);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta12.equals("O") || letracerta12.equals("Õ") || letracerta12.equals("Ó") || letracerta12.equals("Ô")){
                letra12.setText(letracerta12);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta13.equals("O") || letracerta13.equals("Õ") || letracerta13.equals("Ó") || letracerta13.equals("Ô")){
                letra13.setText(letracerta13);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta14.equals("O") || letracerta14.equals("Õ") || letracerta14.equals("Ó") || letracerta14.equals("Ô")){
                letra14.setText(letracerta14);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta15.equals("O") || letracerta15.equals("Õ") || letracerta15.equals("Ó") || letracerta15.equals("Ô")){
                letra15.setText(letracerta15);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta16.equals("O") || letracerta16.equals("Õ") || letracerta16.equals("Ó") || letracerta16.equals("Ô")){
                letra16.setText(letracerta16);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta17.equals("O") || letracerta17.equals("Õ") || letracerta17.equals("Ó") || letracerta17.equals("Ô")){
                letra17.setText(letracerta17);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta18.equals("O") || letracerta18.equals("Õ") || letracerta18.equals("Ó") || letracerta18.equals("Ô")){
                letra18.setText(letracerta18);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta19.equals("O") || letracerta19.equals("Õ") || letracerta19.equals("Ó") || letracerta19.equals("Ô")){
                letra19.setText(letracerta19);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta20.equals("O") || letracerta20.equals("Õ") || letracerta20.equals("Ó") || letracerta20.equals("Ô")){
                letra20.setText(letracerta20);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta21.equals("O") || letracerta21.equals("Õ") || letracerta21.equals("Ó") || letracerta21.equals("Ô")){
                letra21.setText(letracerta21);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta22.equals("O") || letracerta22.equals("Õ") || letracerta22.equals("Ó") || letracerta22.equals("Ô")){
                letra22.setText(letracerta22);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta23.equals("O") || letracerta23.equals("Õ") || letracerta23.equals("Ó") || letracerta23.equals("Ô")){
                letra23.setText(letracerta23);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta24.equals("O") || letracerta24.equals("Õ") || letracerta24.equals("Ó") || letracerta24.equals("Ô")){
                letra24.setText(letracerta24);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta25.equals("O") || letracerta25.equals("Õ") || letracerta25.equals("Ó") || letracerta25.equals("Ô")){
                letra25.setText(letracerta25);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (cont>0){
                verSentimento(2);
                calcularPontuação();
                verificarAcertos();
            }
            else{
                erro = erro +1;
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        }
        if (num == 16){
            if (letracerta1.equals("P")){
                letra1.setText(letracerta1);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta2.equals("P")){
                letra2.setText(letracerta2);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta3.equals("P")){
                letra3.setText(letracerta3);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta4.equals("P")){
                letra4.setText(letracerta4);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta5.equals("P")){
                letra5.setText(letracerta5);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta6.equals("P")){
                letra6.setText(letracerta6);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta7.equals("P")){
                letra7.setText(letracerta7);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta8.equals("P")){
                letra8.setText(letracerta8);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta9.equals("P")){
                letra9.setText(letracerta9);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta10.equals("P")){
                letra10.setText(letracerta10);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta11.equals("P")){
                letra11.setText(letracerta11);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta12.equals("P")){
                letra12.setText(letracerta12);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta13.equals("P")){
                letra13.setText(letracerta13);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta14.equals("P")){
                letra14.setText(letracerta14);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta15.equals("P")){
                letra15.setText(letracerta15);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta16.equals("P")){
                letra16.setText(letracerta16);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta17.equals("P")){
                letra17.setText(letracerta17);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta18.equals("P")){
                letra18.setText(letracerta18);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta19.equals("P")){
                letra19.setText(letracerta19);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta20.equals("P")){
                letra20.setText(letracerta20);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta21.equals("P")){
                letra21.setText(letracerta21);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta22.equals("P")){
                letra22.setText(letracerta22);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta23.equals("P")){
                letra23.setText(letracerta23);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta24.equals("P")){
                letra24.setText(letracerta24);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta25.equals("P")){
                letra25.setText(letracerta25);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (cont>0){
                verSentimento(2);
                calcularPontuação();
                verificarAcertos();
            }
            else{
                erro = erro +1;
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        }
        if (num == 17){
            if (letracerta1.equals("Q")){
                letra1.setText(letracerta1);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta2.equals("Q")){
                letra2.setText(letracerta2);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta3.equals("Q")){
                letra3.setText(letracerta3);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta4.equals("Q")){
                letra4.setText(letracerta4);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta5.equals("Q")){
                letra5.setText(letracerta5);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta6.equals("Q")){
                letra6.setText(letracerta6);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta7.equals("Q")){
                letra7.setText(letracerta7);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta8.equals("Q")){
                letra8.setText(letracerta8);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta9.equals("Q")){
                letra9.setText(letracerta9);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta10.equals("Q")){
                letra10.setText(letracerta10);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta11.equals("Q")){
                letra11.setText(letracerta11);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta12.equals("Q")){
                letra12.setText(letracerta12);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta13.equals("Q")){
                letra13.setText(letracerta13);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta14.equals("Q")){
                letra14.setText(letracerta14);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta15.equals("Q")){
                letra15.setText(letracerta15);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta16.equals("Q")){
                letra16.setText(letracerta16);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta17.equals("Q")){
                letra17.setText(letracerta17);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta18.equals("Q")){
                letra18.setText(letracerta18);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta19.equals("Q")){
                letra19.setText(letracerta19);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta20.equals("Q")){
                letra20.setText(letracerta20);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta21.equals("Q")){
                letra21.setText(letracerta21);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta22.equals("Q")){
                letra22.setText(letracerta22);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta23.equals("Q")){
                letra23.setText(letracerta23);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta24.equals("Q")){
                letra24.setText(letracerta24);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta25.equals("Q")){
                letra25.setText(letracerta25);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (cont>0){
                verSentimento(2);
                calcularPontuação();
                verificarAcertos();
            }
            else{
                erro = erro +1;
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        }
        if (num == 18){
            if (letracerta1.equals("R")){
                letra1.setText(letracerta1);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta2.equals("R")){
                letra2.setText(letracerta2);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta3.equals("R")){
                letra3.setText(letracerta3);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta4.equals("R")){
                letra4.setText(letracerta4);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta5.equals("R")){
                letra5.setText(letracerta5);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta6.equals("R")){
                letra6.setText(letracerta6);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta7.equals("R")){
                letra7.setText(letracerta7);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta8.equals("R")){
                letra8.setText(letracerta8);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta9.equals("R")){
                letra9.setText(letracerta9);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta10.equals("R")){
                letra10.setText(letracerta10);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta11.equals("R")){
                letra11.setText(letracerta11);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta12.equals("R")){
                letra12.setText(letracerta12);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta13.equals("R")){
                letra13.setText(letracerta13);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta14.equals("R")){
                letra14.setText(letracerta14);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta15.equals("R")){
                letra15.setText(letracerta15);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta16.equals("R")){
                letra16.setText(letracerta16);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta17.equals("R")){
                letra17.setText(letracerta17);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta18.equals("R")){
                letra18.setText(letracerta18);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta19.equals("R")){
                letra19.setText(letracerta19);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta20.equals("R")){
                letra20.setText(letracerta20);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta21.equals("R")){
                letra21.setText(letracerta21);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta22.equals("R")){
                letra22.setText(letracerta22);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta23.equals("R")){
                letra23.setText(letracerta23);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta24.equals("R")){
                letra24.setText(letracerta24);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta25.equals("R")){
                letra25.setText(letracerta25);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (cont>0){
                verSentimento(2);
                calcularPontuação();
                verificarAcertos();
            }
            else{
                erro = erro +1;
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        }
        if (num == 19){
            if (letracerta1.equals("S")){
                letra1.setText(letracerta1);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta2.equals("S")){
                letra2.setText(letracerta2);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta3.equals("S")){
                letra3.setText(letracerta3);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta4.equals("S")){
                letra4.setText(letracerta4);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta5.equals("S")){
                letra5.setText(letracerta5);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta6.equals("S")){
                letra6.setText(letracerta6);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta7.equals("S")){
                letra7.setText(letracerta7);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta8.equals("S")){
                letra8.setText(letracerta8);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta9.equals("S")){
                letra9.setText(letracerta9);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta10.equals("S")){
                letra10.setText(letracerta10);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta11.equals("S")){
                letra11.setText(letracerta11);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta12.equals("S")){
                letra12.setText(letracerta12);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta13.equals("S")){
                letra13.setText(letracerta13);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta14.equals("S")){
                letra14.setText(letracerta14);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta15.equals("S")){
                letra15.setText(letracerta15);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta16.equals("S")){
                letra16.setText(letracerta16);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta17.equals("S")){
                letra17.setText(letracerta17);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta18.equals("S")){
                letra18.setText(letracerta18);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta19.equals("S")){
                letra19.setText(letracerta19);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta20.equals("S")){
                letra20.setText(letracerta20);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta21.equals("S")){
                letra21.setText(letracerta21);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta22.equals("S")){
                letra22.setText(letracerta22);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta23.equals("S")){
                letra23.setText(letracerta23);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta24.equals("S")){
                letra24.setText(letracerta24);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta25.equals("S")){
                letra25.setText(letracerta25);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (cont>0){
                verSentimento(2);
                calcularPontuação();
                verificarAcertos();
            }
            else{
                erro = erro +1;
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        }
        if (num == 20){
            if (letracerta1.equals("T")){
                letra1.setText(letracerta1);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta2.equals("T")){
                letra2.setText(letracerta2);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta3.equals("T")){
                letra3.setText(letracerta3);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta4.equals("T")){
                letra4.setText(letracerta4);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta5.equals("T")){
                letra5.setText(letracerta5);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta6.equals("T")){
                letra6.setText(letracerta6);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta7.equals("T")){
                letra7.setText(letracerta7);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta8.equals("T")){
                letra8.setText(letracerta8);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta9.equals("T")){
                letra9.setText(letracerta9);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta10.equals("T")){
                letra10.setText(letracerta10);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta11.equals("T")){
                letra11.setText(letracerta11);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta12.equals("T")){
                letra12.setText(letracerta12);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta13.equals("T")){
                letra13.setText(letracerta13);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta14.equals("T")){
                letra14.setText(letracerta14);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta15.equals("T")){
                letra15.setText(letracerta15);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta16.equals("T")){
                letra16.setText(letracerta16);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta17.equals("T")){
                letra17.setText(letracerta17);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta18.equals("T")){
                letra18.setText(letracerta18);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta19.equals("T")){
                letra19.setText(letracerta19);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta20.equals("T")){
                letra20.setText(letracerta20);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta21.equals("T")){
                letra21.setText(letracerta21);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta22.equals("T")){
                letra22.setText(letracerta22);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta23.equals("T")){
                letra23.setText(letracerta23);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta24.equals("T")){
                letra24.setText(letracerta24);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta25.equals("T")){
                letra25.setText(letracerta25);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (cont>0){
                verSentimento(2);
                calcularPontuação();
                verificarAcertos();
            }
            else{
                erro = erro +1;
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        }

        if (num == 21){
            if (letracerta1.equals("U") || letracerta1.equals("Ũ") || letracerta1.equals("Ú") || letracerta1.equals("Û")){
                letra1.setText(letracerta1);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta2.equals("U") || letracerta2.equals("Ũ") || letracerta2.equals("Ú") || letracerta2.equals("Û")){
                letra2.setText(letracerta2);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta3.equals("U") || letracerta3.equals("Ũ") || letracerta3.equals("Ú") || letracerta3.equals("Û")){
                letra3.setText(letracerta3);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta4.equals("U") || letracerta4.equals("Ũ") || letracerta4.equals("Ú") || letracerta4.equals("Û")){
                letra4.setText(letracerta4);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta5.equals("U") || letracerta5.equals("Ũ") || letracerta5.equals("Ú") || letracerta5.equals("Û")){
                letra5.setText(letracerta5);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta6.equals("U") || letracerta6.equals("Ũ") || letracerta6.equals("Ú") || letracerta6.equals("Û")){
                letra6.setText(letracerta6);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta7.equals("U") || letracerta7.equals("Ũ") || letracerta7.equals("Ú") || letracerta7.equals("Û")){
                letra7.setText(letracerta7);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta8.equals("U") || letracerta8.equals("Ũ") || letracerta8.equals("Ú") || letracerta8.equals("Û")){
                letra8.setText(letracerta8);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta9.equals("U") || letracerta9.equals("Ũ") || letracerta9.equals("Ú") || letracerta9.equals("Û")){
                letra9.setText(letracerta9);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta10.equals("U") || letracerta10.equals("Ũ") || letracerta10.equals("Ú") || letracerta10.equals("Û")){
                letra10.setText(letracerta10);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta11.equals("U") || letracerta11.equals("Ũ") || letracerta11.equals("Ú") || letracerta11.equals("Û")){
                letra11.setText(letracerta11);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta12.equals("U") || letracerta12.equals("Ũ") || letracerta12.equals("Ú") || letracerta12.equals("Û")){
                letra12.setText(letracerta12);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta13.equals("U") || letracerta13.equals("Ũ") || letracerta13.equals("Ú") || letracerta13.equals("Û")){
                letra13.setText(letracerta13);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta14.equals("U") || letracerta14.equals("Ũ") || letracerta14.equals("Ú") || letracerta14.equals("Û")){
                letra14.setText(letracerta14);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta15.equals("U") || letracerta15.equals("Ũ") || letracerta15.equals("Ú") || letracerta15.equals("Û")){
                letra15.setText(letracerta15);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta16.equals("U") || letracerta16.equals("Ũ") || letracerta16.equals("Ú") || letracerta16.equals("Û")){
                letra16.setText(letracerta16);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta17.equals("U") || letracerta17.equals("Ũ") || letracerta17.equals("Ú") || letracerta17.equals("Û")){
                letra17.setText(letracerta17);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta18.equals("U") || letracerta18.equals("Ũ") || letracerta18.equals("Ú") || letracerta18.equals("Û")){
                letra18.setText(letracerta18);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta19.equals("U") || letracerta19.equals("Ũ") || letracerta19.equals("Ú") || letracerta19.equals("Û")){
                letra19.setText(letracerta19);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta20.equals("U") || letracerta20.equals("Ũ") || letracerta20.equals("Ú") || letracerta20.equals("Û")){
                letra20.setText(letracerta20);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta21.equals("U") || letracerta21.equals("Ũ") || letracerta21.equals("Ú") || letracerta21.equals("Û")){
                letra21.setText(letracerta21);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta22.equals("U") || letracerta22.equals("Ũ") || letracerta22.equals("Ú") || letracerta22.equals("Û")){
                letra22.setText(letracerta22);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta23.equals("U") || letracerta23.equals("Ũ") || letracerta23.equals("Ú") || letracerta23.equals("Û")){
                letra23.setText(letracerta23);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta24.equals("U") || letracerta24.equals("Ũ") || letracerta24.equals("Ú") || letracerta24.equals("Û")){
                letra24.setText(letracerta24);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta25.equals("U") || letracerta25.equals("Ũ") || letracerta25.equals("Ú") || letracerta25.equals("Û")){
                letra25.setText(letracerta25);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (cont>0){
                verSentimento(2);
                calcularPontuação();
                verificarAcertos();
            }
            else{
                erro = erro +1;
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        }

        if (num == 22){
            if (letracerta1.equals("V")){
                letra1.setText(letracerta1);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta2.equals("V")){
                letra2.setText(letracerta2);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta3.equals("V")){
                letra3.setText(letracerta3);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta4.equals("V")){
                letra4.setText(letracerta4);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta5.equals("V")){
                letra5.setText(letracerta5);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta6.equals("V")){
                letra6.setText(letracerta6);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta7.equals("V")){
                letra7.setText(letracerta7);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta8.equals("V")){
                letra8.setText(letracerta8);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta9.equals("V")){
                letra9.setText(letracerta9);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta10.equals("V")){
                letra10.setText(letracerta10);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta11.equals("V")){
                letra11.setText(letracerta11);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta12.equals("V")){
                letra12.setText(letracerta12);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta13.equals("V")){
                letra13.setText(letracerta13);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta14.equals("V")){
                letra14.setText(letracerta14);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta15.equals("V")){
                letra15.setText(letracerta15);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta16.equals("V")){
                letra16.setText(letracerta16);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta17.equals("V")){
                letra17.setText(letracerta17);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta18.equals("V")){
                letra18.setText(letracerta18);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta19.equals("V")){
                letra19.setText(letracerta19);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta20.equals("V")){
                letra20.setText(letracerta20);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta21.equals("V")){
                letra21.setText(letracerta21);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta22.equals("V")){
                letra22.setText(letracerta22);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta23.equals("V")){
                letra23.setText(letracerta23);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta24.equals("V")){
                letra24.setText(letracerta24);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta25.equals("V")){
                letra25.setText(letracerta25);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (cont>0){
                verSentimento(2);
                calcularPontuação();
                verificarAcertos();
            }
            else{
                erro = erro +1;
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        }
        if (num == 23){
            if (letracerta1.equals("X")){
                letra1.setText(letracerta1);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta2.equals("X")){
                letra2.setText(letracerta2);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta3.equals("X")){
                letra3.setText(letracerta3);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta4.equals("X")){
                letra4.setText(letracerta4);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta5.equals("X")){
                letra5.setText(letracerta5);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta6.equals("X")){
                letra6.setText(letracerta6);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta7.equals("X")){
                letra7.setText(letracerta7);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta8.equals("X")){
                letra8.setText(letracerta8);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta9.equals("X")){
                letra9.setText(letracerta9);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta10.equals("X")){
                letra10.setText(letracerta10);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta11.equals("X")){
                letra11.setText(letracerta11);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta12.equals("X")){
                letra12.setText(letracerta12);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta13.equals("X")){
                letra13.setText(letracerta13);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta14.equals("X")){
                letra14.setText(letracerta14);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta15.equals("X")){
                letra15.setText(letracerta15);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta16.equals("X")){
                letra16.setText(letracerta16);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta17.equals("X")){
                letra17.setText(letracerta17);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta18.equals("X")){
                letra18.setText(letracerta18);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta19.equals("X")){
                letra19.setText(letracerta19);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta20.equals("X")){
                letra20.setText(letracerta20);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta21.equals("X")){
                letra21.setText(letracerta21);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta22.equals("X")){
                letra22.setText(letracerta22);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta23.equals("X")){
                letra23.setText(letracerta23);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta24.equals("X")){
                letra24.setText(letracerta24);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta25.equals("X")){
                letra25.setText(letracerta25);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (cont>0){
                verSentimento(2);
                calcularPontuação();
                verificarAcertos();
            }
            else{
                erro = erro +1;
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        }
        if (num == 24){
            if (letracerta1.equals("Y")){
                letra1.setText(letracerta1);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta2.equals("Y")){
                letra2.setText(letracerta2);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta3.equals("Y")){
                letra3.setText(letracerta3);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta4.equals("Y")){
                letra4.setText(letracerta4);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta5.equals("Y")){
                letra5.setText(letracerta5);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta6.equals("Y")){
                letra6.setText(letracerta6);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta7.equals("Y")){
                letra7.setText(letracerta7);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta8.equals("Y")){
                letra8.setText(letracerta8);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta9.equals("Y")){
                letra9.setText(letracerta9);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta10.equals("Y")){
                letra10.setText(letracerta10);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta11.equals("Y")){
                letra11.setText(letracerta11);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta12.equals("Y")){
                letra12.setText(letracerta12);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta13.equals("Y")){
                letra13.setText(letracerta13);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta14.equals("Y")){
                letra14.setText(letracerta14);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta15.equals("Y")){
                letra15.setText(letracerta15);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta16.equals("Y")){
                letra16.setText(letracerta16);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta17.equals("Y")){
                letra17.setText(letracerta17);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta18.equals("Y")){
                letra18.setText(letracerta18);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta19.equals("Y")){
                letra19.setText(letracerta19);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta20.equals("Y")){
                letra20.setText(letracerta20);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta21.equals("Y")){
                letra21.setText(letracerta21);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta22.equals("Y")){
                letra22.setText(letracerta22);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta23.equals("Y")){
                letra23.setText(letracerta23);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta24.equals("Y")){
                letra24.setText(letracerta24);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta25.equals("Y")){
                letra25.setText(letracerta25);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (cont>0){
                verSentimento(2);
                calcularPontuação();
                verificarAcertos();
            }
            else{
                erro = erro +1;
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        }
        if (num == 25){
            if (letracerta1.equals("W")){
                letra1.setText(letracerta1);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta2.equals("W")){
                letra2.setText(letracerta2);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta3.equals("W")){
                letra3.setText(letracerta3);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta4.equals("W")){
                letra4.setText(letracerta4);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta5.equals("W")){
                letra5.setText(letracerta5);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta6.equals("W")){
                letra6.setText(letracerta6);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta7.equals("W")){
                letra7.setText(letracerta7);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta8.equals("W")){
                letra8.setText(letracerta8);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta9.equals("W")){
                letra9.setText(letracerta9);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta10.equals("W")){
                letra10.setText(letracerta10);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta11.equals("W")){
                letra11.setText(letracerta11);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta12.equals("W")){
                letra12.setText(letracerta12);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta13.equals("W")){
                letra13.setText(letracerta13);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta14.equals("W")){
                letra14.setText(letracerta14);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta15.equals("W")){
                letra15.setText(letracerta15);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta16.equals("W")){
                letra16.setText(letracerta16);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta17.equals("W")){
                letra17.setText(letracerta17);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta18.equals("W")){
                letra18.setText(letracerta18);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta19.equals("W")){
                letra19.setText(letracerta19);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta20.equals("W")){
                letra20.setText(letracerta20);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta21.equals("W")){
                letra21.setText(letracerta21);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta22.equals("W")){
                letra22.setText(letracerta22);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta23.equals("W")){
                letra23.setText(letracerta23);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta24.equals("W")){
                letra24.setText(letracerta24);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta25.equals("W")){
                letra25.setText(letracerta25);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (cont>0){
                verSentimento(2);
                calcularPontuação();
                verificarAcertos();
            }
            else{
                erro = erro +1;
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        }
        if (num == 26){
            if (letracerta1.equals("Z")){
                letra1.setText(letracerta1);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta2.equals("Z")){
                letra2.setText(letracerta2);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta3.equals("Z")){
                letra3.setText(letracerta3);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta4.equals("Z")){
                letra4.setText(letracerta4);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;
            }
            if (letracerta5.equals("Z")){
                letra5.setText(letracerta5);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta6.equals("Z")){
                letra6.setText(letracerta6);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta7.equals("Z")){
                letra7.setText(letracerta7);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta8.equals("Z")){
                letra8.setText(letracerta8);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta9.equals("Z")){
                letra9.setText(letracerta9);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta10.equals("Z")){
                letra10.setText(letracerta10);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta11.equals("Z")){
                letra11.setText(letracerta11);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta12.equals("Z")){
                letra12.setText(letracerta12);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta13.equals("Z")){
                letra13.setText(letracerta13);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta14.equals("Z")){
                letra14.setText(letracerta14);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta15.equals("Z")){
                letra15.setText(letracerta15);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta16.equals("Z")){
                letra16.setText(letracerta16);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta17.equals("Z")){
                letra17.setText(letracerta17);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta18.equals("Z")){
                letra18.setText(letracerta18);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta19.equals("Z")){
                letra19.setText(letracerta19);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta20.equals("Z")){
                letra20.setText(letracerta20);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta21.equals("Z")){
                letra21.setText(letracerta21);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta22.equals("Z")){
                letra22.setText(letracerta22);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta23.equals("Z")){
                letra23.setText(letracerta23);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta24.equals("Z")){
                letra24.setText(letracerta24);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (letracerta25.equals("Z")){
                letra25.setText(letracerta25);
                pontos = pontos + 10;
                acertos = acertos + 1;
                cont ++;

            }
            if (cont>0){
                verSentimento(2);
                calcularPontuação();
                verificarAcertos();
            }
            else{
                erro = erro +1;
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        }
    }

    public void revelarLetra(int num){
        int cont = 0;
        final TextView letra1 = (TextView) findViewById(R.id.letra1);
        final TextView letra2 = (TextView) findViewById(R.id.letra2);
        final TextView letra3 = (TextView) findViewById(R.id.letra3);
        final TextView letra4 = (TextView) findViewById(R.id.letra4);
        final TextView letra5 = (TextView) findViewById(R.id.letra5);
        final TextView letra6 = (TextView) findViewById(R.id.letra6);
        final TextView letra7 = (TextView) findViewById(R.id.letra7);
        final TextView letra8 = (TextView) findViewById(R.id.letra8);
        final TextView letra9 = (TextView) findViewById(R.id.letra9);
        final TextView letra10 = (TextView) findViewById(R.id.letra10);
        final TextView letra11 = (TextView) findViewById(R.id.letra11);
        final TextView letra12 = (TextView) findViewById(R.id.letra12);
        final TextView letra13 = (TextView) findViewById(R.id.letra13);
        final TextView letra14 = (TextView) findViewById(R.id.letra14);
        final TextView letra15 = null;
        final TextView letra16 = null;
        final TextView letra17 = null;
        final TextView letra18 = null;
        final TextView letra19 = null;
        final TextView letra20 = null;
        final TextView letra21 = null;
        final TextView letra22 = null;
        final TextView letra23 = null;
        final TextView letra24 = null;
        final TextView letra25 = null;
        final Button button_a = (Button) findViewById(R.id.button_a);
        final Button button_b = (Button) findViewById(R.id.button_b);
        final Button button_c = (Button) findViewById(R.id.button_c);
        final Button button_d = (Button) findViewById(R.id.button_d);
        final Button button_e = (Button) findViewById(R.id.button_e);
        final Button button_f = (Button) findViewById(R.id.button_f);
        final Button button_g = (Button) findViewById(R.id.button_g);
        final Button button_h = (Button) findViewById(R.id.button_h);
        final Button button_i = (Button) findViewById(R.id.button_i);
        final Button button_j = (Button) findViewById(R.id.button_j);
        final Button button_k = (Button) findViewById(R.id.button_k);
        final Button button_l = (Button) findViewById(R.id.button_l);
        final Button button_x = (Button) findViewById(R.id.button_x);
        final Button button_m = (Button) findViewById(R.id.button_m);
        final Button button_n = (Button) findViewById(R.id.button_n);
        final Button button_o = (Button) findViewById(R.id.button_o);
        final Button button_p = (Button) findViewById(R.id.button_p);
        final Button button_q = (Button) findViewById(R.id.button_q);
        final Button button_r = (Button) findViewById(R.id.button_r);
        final Button button_s = (Button) findViewById(R.id.button_s);
        final Button button_t = (Button) findViewById(R.id.button_t);
        final Button button_u = (Button) findViewById(R.id.button_u);
        final Button button_v = (Button) findViewById(R.id.button_v);
        final Button button_w = (Button) findViewById(R.id.button_w);
        final Button button_y = (Button) findViewById(R.id.button_y);
        final Button button_z = (Button) findViewById(R.id.button_z);
        if (num == 1){
            if (letracerta1.equals("A") || letracerta1.equals("Ã") || letracerta1.equals("Á") || letracerta1.equals("Â")){
                if (letra1.getText().toString().equals("__")){                    letra1.setText(letracerta1);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta2.equals("A") || letracerta2.equals("Ã") || letracerta2.equals("Á") || letracerta2.equals("Â")){
                if (letra2.getText().toString().equals("__")){                    letra2.setText(letracerta2);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta3.equals("A") || letracerta3.equals("Ã") || letracerta3.equals("Á") || letracerta3.equals("Â")){
                if (letra3.getText().toString().equals("__")){                    letra3.setText(letracerta3);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta4.equals("A") || letracerta4.equals("Ã") || letracerta4.equals("Á") || letracerta4.equals("Â")){
                if (letra4.getText().toString().equals("__")){                    letra4.setText(letracerta4);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta5.equals("A") || letracerta5.equals("Ã") || letracerta5.equals("Á") || letracerta5.equals("Â")){
                if (letra5.getText().toString().equals("__")){
                    letra5.setText(letracerta5);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta6.equals("A") || letracerta6.equals("Ã") || letracerta6.equals("Á") || letracerta6.equals("Â")){
                if (letra6.getText().toString().equals("__")){
                    letra6.setText(letracerta6);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta7.equals("A") || letracerta7.equals("Ã") || letracerta7.equals("Á") || letracerta7.equals("Â")){
                if (letra7.getText().toString().equals("__")){
                    letra7.setText(letracerta7);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta8.equals("A") || letracerta8.equals("Ã") || letracerta8.equals("Á") || letracerta8.equals("Â")){
                if (letra8.getText().toString().equals("__")){
                    letra8.setText(letracerta8);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta9.equals("A") || letracerta9.equals("Ã") || letracerta9.equals("Á") || letracerta9.equals("Â")){
                if (letra9.getText().toString().equals("__")){
                    letra9.setText(letracerta9);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta10.equals("A") || letracerta10.equals("Ã") || letracerta10.equals("Á") || letracerta10.equals("Â")){
                if (letra10.getText().toString().equals("__")){
                    letra10.setText(letracerta10);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta11.equals("A") || letracerta11.equals("Ã") || letracerta11.equals("Á") || letracerta11.equals("Â")){
                if (letra11.getText().toString().equals("__")){
                    letra11.setText(letracerta11);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta12.equals("A") || letracerta12.equals("Ã") || letracerta12.equals("Á") || letracerta12.equals("Â")){
                if (letra12.getText().toString().equals("__")){
                    letra12.setText(letracerta12);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta13.equals("A") || letracerta13.equals("Ã") || letracerta13.equals("Á") || letracerta13.equals("Â")){
                if (letra13.getText().toString().equals("__")){
                    letra13.setText(letracerta13);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta14.equals("A") || letracerta14.equals("Ã") || letracerta14.equals("Á") || letracerta14.equals("Â")){
                if (letra14.getText().toString().equals("__")){
                    letra14.setText(letracerta14);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta15.equals("A") || letracerta15.equals("Ã") || letracerta15.equals("Á") || letracerta15.equals("Â")){
                if (letra15.getText().toString().equals("__")){
                    letra15.setText(letracerta15);                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta16.equals("A") || letracerta16.equals("Ã") || letracerta16.equals("Á") || letracerta16.equals("Â")){
                if (letra16.getText().toString().equals("__")){
                    letra16.setText(letracerta16);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta17.equals("A") || letracerta17.equals("Ã") || letracerta17.equals("Á") || letracerta17.equals("Â")){
                if (letra17.getText().toString().equals("__")){
                    letra17.setText(letracerta17);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta18.equals("A") || letracerta18.equals("Ã") || letracerta18.equals("Á") || letracerta18.equals("Â")){
                if (letra18.getText().toString().equals("__")){
                    letra18.setText(letracerta18);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta19.equals("A") || letracerta19.equals("Ã") || letracerta19.equals("Á") || letracerta19.equals("Â")){
                if (letra19.getText().toString().equals("__")){
                    letra19.setText(letracerta19);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta20.equals("A") || letracerta20.equals("Ã") || letracerta20.equals("Á") || letracerta20.equals("Â")){
                if (letra20.getText().toString().equals("__")){
                    letra20.setText(letracerta20);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta21.equals("A") || letracerta21.equals("Ã") || letracerta21.equals("Á") || letracerta21.equals("Â")){
                if (letra21.getText().toString().equals("__")){
                    letra21.setText(letracerta21);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta22.equals("A") || letracerta22.equals("Ã") || letracerta22.equals("Á") || letracerta22.equals("Â")){
                if (letra22.getText().toString().equals("__")){
                    letra22.setText(letracerta22);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta23.equals("A") || letracerta23.equals("Ã") || letracerta23.equals("Á") || letracerta23.equals("Â")){
                if (letra23.getText().toString().equals("__")){
                    letra23.setText(letracerta23);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta24.equals("A") || letracerta24.equals("Ã") || letracerta24.equals("Á") || letracerta24.equals("Â")){
                if (letra24.getText().toString().equals("__")){
                    letra24.setText(letracerta24);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta25.equals("A") || letracerta25.equals("Ã") || letracerta25.equals("Á") || letracerta25.equals("Â")){
                if (letra25.getText().toString().equals("__")){
                    letra25.setText(letracerta25);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (cont>0){
                verSentimento(1);
                button_a.setText("");
                calcularPontuação();
                verificarAcertos();
            }

        }
        if (num == 2){
            if (letracerta1.equals("B")){
                if (letra1.getText().toString().equals("__")){                    letra1.setText(letracerta1);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta2.equals("B")){
                if (letra2.getText().toString().equals("__")){                    letra2.setText(letracerta2);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta3.equals("B")){
                if (letra3.getText().toString().equals("__")){                    letra3.setText(letracerta3);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta4.equals("B")){
                if (letra4.getText().toString().equals("__")){                    letra4.setText(letracerta4);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta5.equals("B")){
                if (letra5.getText().toString().equals("__")){                    letra5.setText(letracerta5);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta6.equals("B")){
                if (letra6.getText().toString().equals("__")){
                    letra6.setText(letracerta6);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta7.equals("B")){
                if (letra7.getText().toString().equals("__")){
                    letra7.setText(letracerta7);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta8.equals("B")){
                if (letra8.getText().toString().equals("__")){
                    letra8.setText(letracerta8);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta9.equals("B")){
                if (letra9.getText().toString().equals("__")){
                    letra9.setText(letracerta9);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta10.equals("B")){
                if (letra10.getText().toString().equals("__")){
                    letra10.setText(letracerta10);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta11.equals("B")){
                if (letra11.getText().toString().equals("__")){
                    letra11.setText(letracerta11);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta12.equals("B")){
                if (letra12.getText().toString().equals("__")){
                    letra12.setText(letracerta12);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta13.equals("B")){
                if (letra13.getText().toString().equals("__")){
                    letra13.setText(letracerta13);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta14.equals("B")){
                if (letra14.getText().toString().equals("__")){
                    letra14.setText(letracerta14);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta15.equals("B")){
                if (letra15.getText().toString().equals("__")){
                    letra15.setText(letracerta15);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta16.equals("B")){
                if (letra16.getText().toString().equals("__")){
                    letra16.setText(letracerta16);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta17.equals("B")){
                if (letra17.getText().toString().equals("__")){
                    letra17.setText(letracerta17);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta18.equals("B")){
                if (letra18.getText().toString().equals("__")){
                    letra18.setText(letracerta18);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta19.equals("B")){
                if (letra19.getText().toString().equals("__")){
                    letra19.setText(letracerta19);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta20.equals("B")){
                if (letra20.getText().toString().equals("__")){
                    letra20.setText(letracerta20);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta21.equals("B")){
                if (letra21.getText().toString().equals("__")){
                    letra21.setText(letracerta21);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta22.equals("B")){
                if (letra22.getText().toString().equals("__")){
                    letra22.setText(letracerta22);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta23.equals("B")){
                if (letra23.getText().toString().equals("__")){
                    letra23.setText(letracerta23);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta24.equals("B")){
                if (letra24.getText().toString().equals("__")){
                    letra24.setText(letracerta24);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta25.equals("B")){
                if (letra25.getText().toString().equals("__")){
                    letra25.setText(letracerta25);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (cont>0){
                button_b.setText("");
                verSentimento(1);
                calcularPontuação();
                verificarAcertos();
            }

        }

        if (num == 3){
            if (letracerta1.equals("C") || letracerta1.equals("Ç")){
                if (letra1.getText().toString().equals("__")){                    letra1.setText(letracerta1);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta2.equals("C") || letracerta2.equals("Ç")){
                if (letra2.getText().toString().equals("__")){                    letra2.setText(letracerta2);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta3.equals("C") || letracerta3.equals("Ç")){
                if (letra3.getText().toString().equals("__")){                    letra3.setText(letracerta3);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta4.equals("C") || letracerta4.equals("Ç")){
                if (letra4.getText().toString().equals("__")){                    letra4.setText(letracerta4);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta5.equals("C") || letracerta5.equals("Ç")){
                if (letra5.getText().toString().equals("__")){                    letra5.setText(letracerta5);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta6.equals("C") || letracerta6.equals("Ç")){
                if (letra6.getText().toString().equals("__")){
                    letra6.setText(letracerta6);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta7.equals("C") || letracerta7.equals("Ç")){
                if (letra7.getText().toString().equals("__")){
                    letra7.setText(letracerta7);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta8.equals("C") || letracerta8.equals("Ç")){
                if (letra8.getText().toString().equals("__")){
                    letra8.setText(letracerta8);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta9.equals("C") || letracerta9.equals("Ç")){
                if (letra9.getText().toString().equals("__")){
                    letra9.setText(letracerta9);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta10.equals("C") || letracerta10.equals("Ç")){
                if (letra10.getText().toString().equals("__")){
                    letra10.setText(letracerta10);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta11.equals("C") || letracerta11.equals("Ç")){
                if (letra11.getText().toString().equals("__")){
                    letra11.setText(letracerta11);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta12.equals("C") || letracerta12.equals("Ç")){
                if (letra12.getText().toString().equals("__")){
                    letra12.setText(letracerta12);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta13.equals("C") || letracerta13.equals("Ç") ){
                if (letra13.getText().toString().equals("__")){
                    letra13.setText(letracerta13);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta14.equals("C") || letracerta14.equals("Ç") ){
                if (letra14.getText().toString().equals("__")){
                    letra14.setText(letracerta14);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta15.equals("C") || letracerta15.equals("Ç")){
                if (letra15.getText().toString().equals("__")){
                    letra15.setText(letracerta15);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta16.equals("C") || letracerta16.equals("Ç") ){
                if (letra16.getText().toString().equals("__")){
                    letra16.setText(letracerta16);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta17.equals("C") || letracerta17.equals("Ç") ){
                if (letra17.getText().toString().equals("__")){
                    letra17.setText(letracerta17);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta18.equals("C") || letracerta18.equals("Ç") ){
                if (letra18.getText().toString().equals("__")){
                    letra18.setText(letracerta18);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta19.equals("C") || letracerta19.equals("Ç") ){
                if (letra19.getText().toString().equals("__")){
                    letra19.setText(letracerta19);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta20.equals("C") || letracerta20.equals("Ç") ){
                if (letra20.getText().toString().equals("__")){
                    letra20.setText(letracerta20);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta21.equals("C") || letracerta21.equals("Ç") ){
                if (letra21.getText().toString().equals("__")){
                    letra21.setText(letracerta21);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta22.equals("C") || letracerta22.equals("Ç") ){
                if (letra22.getText().toString().equals("__")){
                    letra22.setText(letracerta22);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta23.equals("C") || letracerta23.equals("Ç")){
                if (letra23.getText().toString().equals("__")){
                    letra23.setText(letracerta23);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta24.equals("C") || letracerta24.equals("Ç")){
                if (letra24.getText().toString().equals("__")){
                    letra24.setText(letracerta24);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta25.equals("C") || letracerta25.equals("Ç")){
                if (letra25.getText().toString().equals("__")){
                    letra25.setText(letracerta25);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (cont>0){
                button_c.setText("");
                verSentimento(1);
                calcularPontuação();
                verificarAcertos();
            }

        }
        if (num == 4){
            if (letracerta1.equals("D")){
                if (letra1.getText().toString().equals("__")){                    letra1.setText(letracerta1);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta2.equals("D")){
                if (letra2.getText().toString().equals("__")){                    letra2.setText(letracerta2);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta3.equals("D")){
                if (letra3.getText().toString().equals("__")){                    letra3.setText(letracerta3);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta4.equals("D")){
                if (letra4.getText().toString().equals("__")){                    letra4.setText(letracerta4);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta5.equals("D")){
                if (letra5.getText().toString().equals("__")){                    letra5.setText(letracerta5);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta6.equals("D")){
                if (letra6.getText().toString().equals("__")){
                    letra6.setText(letracerta6);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta7.equals("D")){
                if (letra7.getText().toString().equals("__")){
                    letra7.setText(letracerta7);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta8.equals("D")){
                if (letra8.getText().toString().equals("__")){
                    letra8.setText(letracerta8);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta9.equals("D")){
                if (letra9.getText().toString().equals("__")){
                    letra9.setText(letracerta9);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta10.equals("D")){
                if (letra10.getText().toString().equals("__")){
                    letra10.setText(letracerta10);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta11.equals("D")){
                if (letra11.getText().toString().equals("__")){
                    letra11.setText(letracerta11);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta12.equals("D")){
                if (letra12.getText().toString().equals("__")){
                    letra12.setText(letracerta12);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta13.equals("D")){
                if (letra13.getText().toString().equals("__")){
                    letra13.setText(letracerta13);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta14.equals("D")){
                if (letra14.getText().toString().equals("__")){
                    letra14.setText(letracerta14);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta15.equals("D")){
                if (letra15.getText().toString().equals("__")){
                    letra15.setText(letracerta15);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta16.equals("D")){
                if (letra16.getText().toString().equals("__")){
                    letra16.setText(letracerta16);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta17.equals("D")){
                if (letra17.getText().toString().equals("__")){
                    letra17.setText(letracerta17);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta18.equals("D")){
                if (letra18.getText().toString().equals("__")){
                    letra18.setText(letracerta18);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta19.equals("D")){
                if (letra19.getText().toString().equals("__")){
                    letra19.setText(letracerta19);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta20.equals("D")){
                if (letra20.getText().toString().equals("__")){
                    letra20.setText(letracerta20);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta21.equals("D")){
                if (letra21.getText().toString().equals("__")){
                    letra21.setText(letracerta21);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta22.equals("D")){
                if (letra22.getText().toString().equals("__")){
                    letra22.setText(letracerta22);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta23.equals("D")){
                if (letra23.getText().toString().equals("__")){
                    letra23.setText(letracerta23);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta24.equals("D")){
                if (letra24.getText().toString().equals("__")){
                    letra24.setText(letracerta24);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta25.equals("D")){
                if (letra25.getText().toString().equals("__")){
                    letra25.setText(letracerta25);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (cont>0){
                button_d.setText("");
                verSentimento(1);
                calcularPontuação();
                verificarAcertos();
            }

        }
        if (num == 5){
            if (letracerta1.equals("E") || letracerta1.equals("Ẽ") || letracerta1.equals("É") || letracerta1.equals("Ê")){
                if (letra1.getText().toString().equals("__")){                    letra1.setText(letracerta1);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta2.equals("E") || letracerta2.equals("Ẽ") || letracerta2.equals("É") || letracerta2.equals("Ê")){
                if (letra2.getText().toString().equals("__")){                    letra2.setText(letracerta2);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta3.equals("E") || letracerta3.equals("Ẽ") || letracerta3.equals("É") || letracerta3.equals("Ê")){
                if (letra3.getText().toString().equals("__")){                    letra3.setText(letracerta3);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta4.equals("E") || letracerta4.equals("Ẽ") || letracerta4.equals("É") || letracerta4.equals("Ê")){
                if (letra4.getText().toString().equals("__")){                    letra4.setText(letracerta4);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta5.equals("E") || letracerta5.equals("Ẽ") || letracerta5.equals("É") || letracerta5.equals("Ê")){
                if (letra5.getText().toString().equals("__")){                    letra5.setText(letracerta5);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta6.equals("E") || letracerta6.equals("Ẽ") || letracerta6.equals("É") || letracerta6.equals("Ê")){
                if (letra6.getText().toString().equals("__")){
                    letra6.setText(letracerta6);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta7.equals("E") || letracerta7.equals("Ẽ") || letracerta7.equals("É") || letracerta7.equals("Ê")){
                if (letra7.getText().toString().equals("__")){
                    letra7.setText(letracerta7);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta8.equals("E") || letracerta8.equals("Ẽ") || letracerta8.equals("É") || letracerta8.equals("Ê")){
                if (letra8.getText().toString().equals("__")){
                    letra8.setText(letracerta8);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta9.equals("E") || letracerta9.equals("Ẽ") || letracerta9.equals("É") || letracerta9.equals("Ê")){
                if (letra9.getText().toString().equals("__")){
                    letra9.setText(letracerta9);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta10.equals("E") || letracerta10.equals("Ẽ") || letracerta10.equals("É") || letracerta10.equals("Ê")){
                if (letra10.getText().toString().equals("__")){
                    letra10.setText(letracerta10);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta11.equals("E") || letracerta11.equals("Ẽ") || letracerta11.equals("É") || letracerta11.equals("Ê")){
                if (letra11.getText().toString().equals("__")){
                    letra11.setText(letracerta11);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta12.equals("E") || letracerta12.equals("Ẽ") || letracerta12.equals("É") || letracerta12.equals("Ê")){
                if (letra12.getText().toString().equals("__")){
                    letra12.setText(letracerta12);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta13.equals("E") || letracerta13.equals("Ẽ") || letracerta13.equals("É") || letracerta13.equals("Ê")){
                if (letra13.getText().toString().equals("__")){
                    letra13.setText(letracerta13);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta14.equals("E") || letracerta14.equals("Ẽ") || letracerta14.equals("É") || letracerta14.equals("Ê")){
                if (letra14.getText().toString().equals("__")){
                    letra14.setText(letracerta14);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta15.equals("E") || letracerta15.equals("Ẽ") || letracerta15.equals("É") || letracerta15.equals("Ê")){
                if (letra15.getText().toString().equals("__")){
                    letra15.setText(letracerta15);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta16.equals("E") || letracerta16.equals("Ẽ") || letracerta16.equals("É") || letracerta16.equals("Ê")){
                if (letra16.getText().toString().equals("__")){
                    letra16.setText(letracerta16);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta17.equals("E") || letracerta17.equals("Ẽ") || letracerta17.equals("É") || letracerta17.equals("Ê")){
                if (letra17.getText().toString().equals("__")){
                    letra17.setText(letracerta17);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta18.equals("E") || letracerta18.equals("Ẽ") || letracerta18.equals("É") || letracerta18.equals("Ê")){
                if (letra18.getText().toString().equals("__")){
                    letra18.setText(letracerta18);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta19.equals("E") || letracerta19.equals("Ẽ") || letracerta19.equals("É") || letracerta19.equals("Ê")){
                if (letra19.getText().toString().equals("__")){
                    letra19.setText(letracerta19);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta20.equals("E") || letracerta20.equals("Ẽ") || letracerta20.equals("É") || letracerta20.equals("Ê")){
                if (letra20.getText().toString().equals("__")){
                    letra20.setText(letracerta20);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta21.equals("E") || letracerta21.equals("Ẽ") || letracerta21.equals("É") || letracerta21.equals("Ê")){
                if (letra21.getText().toString().equals("__")){
                    letra21.setText(letracerta21);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta22.equals("E") || letracerta22.equals("Ẽ") || letracerta22.equals("É") || letracerta22.equals("Ê")){
                if (letra22.getText().toString().equals("__")){
                    letra22.setText(letracerta22);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta23.equals("E") || letracerta23.equals("Ẽ") || letracerta23.equals("É") || letracerta23.equals("Ê")){
                if (letra23.getText().toString().equals("__")){
                    letra23.setText(letracerta23);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta24.equals("E") || letracerta24.equals("Ẽ") || letracerta24.equals("É") || letracerta24.equals("Ê")){
                if (letra24.getText().toString().equals("__")){
                    letra24.setText(letracerta24);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta25.equals("E") || letracerta25.equals("Ẽ") || letracerta25.equals("É") || letracerta25.equals("Ê")){
                if (letra25.getText().toString().equals("__")){
                    letra25.setText(letracerta25);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (cont>0){
                verSentimento(1);
                button_e.setText("");
                calcularPontuação();
                verificarAcertos();
            }

        }
        if (num == 6){
            if (letracerta1.equals("F")){
                if (letra1.getText().toString().equals("__")){                    letra1.setText(letracerta1);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta2.equals("F")){
                if (letra2.getText().toString().equals("__")){                    letra2.setText(letracerta2);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta3.equals("F")){
                if (letra3.getText().toString().equals("__")){                    letra3.setText(letracerta3);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta4.equals("F")){
                if (letra4.getText().toString().equals("__")){                    letra4.setText(letracerta4);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta5.equals("F")){
                if (letra5.getText().toString().equals("__")){                    letra5.setText(letracerta5);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta6.equals("F")){
                if (letra6.getText().toString().equals("__")){
                    letra6.setText(letracerta6);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta7.equals("F")){
                if (letra7.getText().toString().equals("__")){
                    letra7.setText(letracerta7);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta8.equals("F")){
                if (letra8.getText().toString().equals("__")){
                    letra8.setText(letracerta8);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta9.equals("F")){
                if (letra9.getText().toString().equals("__")){
                    letra9.setText(letracerta9);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta10.equals("F")){
                if (letra10.getText().toString().equals("__")){
                    letra10.setText(letracerta10);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta11.equals("F")){
                if (letra11.getText().toString().equals("__")){
                    letra11.setText(letracerta11);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta12.equals("F")){
                if (letra12.getText().toString().equals("__")){
                    letra12.setText(letracerta12);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta13.equals("F")){
                if (letra13.getText().toString().equals("__")){
                    letra13.setText(letracerta13);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta14.equals("F")){
                if (letra14.getText().toString().equals("__")){
                    letra14.setText(letracerta14);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta15.equals("F")){
                if (letra15.getText().toString().equals("__")){
                    letra15.setText(letracerta15);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta16.equals("F")){
                if (letra16.getText().toString().equals("__")){
                    letra16.setText(letracerta16);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta17.equals("F")){
                if (letra17.getText().toString().equals("__")){
                    letra17.setText(letracerta17);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta18.equals("F")){
                if (letra18.getText().toString().equals("__")){
                    letra18.setText(letracerta18);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta19.equals("F")){
                if (letra19.getText().toString().equals("__")){
                    letra19.setText(letracerta19);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta20.equals("F")){
                if (letra20.getText().toString().equals("__")){
                    letra20.setText(letracerta20);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta21.equals("F")){
                if (letra21.getText().toString().equals("__")){
                    letra21.setText(letracerta21);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta22.equals("F")){
                if (letra22.getText().toString().equals("__")){
                    letra22.setText(letracerta22);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta23.equals("F")){
                if (letra23.getText().toString().equals("__")){
                    letra23.setText(letracerta23);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta24.equals("F")){
                if (letra24.getText().toString().equals("__")){
                    letra24.setText(letracerta24);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta25.equals("F")){
                if (letra25.getText().toString().equals("__")){
                    letra25.setText(letracerta25);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (cont>0){
                verSentimento(1);
                calcularPontuação();
                verificarAcertos();
                button_f.setText("");
            }

        }
        if (num == 7){
            if (letracerta1.equals("G")){
                if (letra1.getText().toString().equals("__")){                    letra1.setText(letracerta1);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta2.equals("G")){
                if (letra2.getText().toString().equals("__")){                    letra2.setText(letracerta2);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta3.equals("G")){
                if (letra3.getText().toString().equals("__")){                    letra3.setText(letracerta3);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta4.equals("G")){
                if (letra4.getText().toString().equals("__")){                    letra4.setText(letracerta4);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta5.equals("G")){
                if (letra5.getText().toString().equals("__")){                    letra5.setText(letracerta5);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta6.equals("G")){
                if (letra6.getText().toString().equals("__")){
                    letra6.setText(letracerta6);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta7.equals("G")){
                if (letra7.getText().toString().equals("__")){
                    letra7.setText(letracerta7);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta8.equals("G")){
                if (letra8.getText().toString().equals("__")){
                    letra8.setText(letracerta8);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta9.equals("G")){
                if (letra9.getText().toString().equals("__")){
                    letra9.setText(letracerta9);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta10.equals("G")){
                if (letra10.getText().toString().equals("__")){
                    letra10.setText(letracerta10);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta11.equals("G")){
                if (letra11.getText().toString().equals("__")){
                    letra11.setText(letracerta11);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta12.equals("G")){
                if (letra12.getText().toString().equals("__")){
                    letra12.setText(letracerta12);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta13.equals("G")){
                if (letra13.getText().toString().equals("__")){
                    letra13.setText(letracerta13);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta14.equals("G")){
                if (letra14.getText().toString().equals("__")){
                    letra14.setText(letracerta14);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta15.equals("G")){
                if (letra15.getText().toString().equals("__")){
                    letra15.setText(letracerta15);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta16.equals("G")){
                if (letra16.getText().toString().equals("__")){
                    letra16.setText(letracerta16);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta17.equals("G")){
                if (letra17.getText().toString().equals("__")){
                    letra17.setText(letracerta17);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta18.equals("G")){
                if (letra18.getText().toString().equals("__")){
                    letra18.setText(letracerta18);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta19.equals("G")){
                if (letra19.getText().toString().equals("__")){
                    letra19.setText(letracerta19);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta20.equals("G")){
                if (letra20.getText().toString().equals("__")){
                    letra20.setText(letracerta20);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta21.equals("G")){
                if (letra21.getText().toString().equals("__")){
                    letra21.setText(letracerta21);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta22.equals("G")){
                if (letra22.getText().toString().equals("__")){
                    letra22.setText(letracerta22);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta23.equals("G")){
                if (letra23.getText().toString().equals("__")){
                    letra23.setText(letracerta23);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta24.equals("G")){
                if (letra24.getText().toString().equals("__")){
                    letra24.setText(letracerta24);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta25.equals("G")){
                if (letra25.getText().toString().equals("__")){
                    letra25.setText(letracerta25);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (cont>0){
                verSentimento(1);
                button_g.setText("");
                calcularPontuação();
                verificarAcertos();
            }

        }
        if (num == 8){
            if (letracerta1.equals("H")){
                if (letra1.getText().toString().equals("__")){                    letra1.setText(letracerta1);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta2.equals("H")){
                if (letra2.getText().toString().equals("__")){                    letra2.setText(letracerta2);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta3.equals("H")){
                if (letra3.getText().toString().equals("__")){                    letra3.setText(letracerta3);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta4.equals("H")){
                if (letra4.getText().toString().equals("__")){                    letra4.setText(letracerta4);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta5.equals("H")){
                if (letra5.getText().toString().equals("__")){                    letra5.setText(letracerta5);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta6.equals("H")){
                if (letra6.getText().toString().equals("__")){
                    letra6.setText(letracerta6);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta7.equals("H")){
                if (letra7.getText().toString().equals("__")){
                    letra7.setText(letracerta7);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta8.equals("H")){
                if (letra8.getText().toString().equals("__")){
                    letra8.setText(letracerta8);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta9.equals("H")){
                if (letra9.getText().toString().equals("__")){
                    letra9.setText(letracerta9);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta10.equals("H")){
                if (letra10.getText().toString().equals("__")){
                    letra10.setText(letracerta10);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta11.equals("H")){
                if (letra11.getText().toString().equals("__")){
                    letra11.setText(letracerta11);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta12.equals("H")){
                if (letra12.getText().toString().equals("__")){
                    letra12.setText(letracerta12);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta13.equals("H")){
                if (letra13.getText().toString().equals("__")){
                    letra13.setText(letracerta13);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta14.equals("H")){
                if (letra14.getText().toString().equals("__")){
                    letra14.setText(letracerta14);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta15.equals("H")){
                if (letra15.getText().toString().equals("__")){
                    letra15.setText(letracerta15);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta16.equals("H")){
                if (letra16.getText().toString().equals("__")){
                    letra16.setText(letracerta16);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta17.equals("H")){
                if (letra17.getText().toString().equals("__")){
                    letra17.setText(letracerta17);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta18.equals("H")){
                if (letra18.getText().toString().equals("__")){
                    letra18.setText(letracerta18);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta19.equals("H")){
                if (letra19.getText().toString().equals("__")){
                    letra19.setText(letracerta19);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta20.equals("H")){
                if (letra20.getText().toString().equals("__")){
                    letra20.setText(letracerta20);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta21.equals("H")){
                if (letra21.getText().toString().equals("__")){
                    letra21.setText(letracerta21);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta22.equals("H")){
                if (letra22.getText().toString().equals("__")){
                    letra22.setText(letracerta22);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta23.equals("H")){
                if (letra23.getText().toString().equals("__")){
                    letra23.setText(letracerta23);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta24.equals("H")){
                if (letra24.getText().toString().equals("__")){
                    letra24.setText(letracerta24);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta25.equals("H")){
                if (letra25.getText().toString().equals("__")){
                    letra25.setText(letracerta25);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (cont>0){
                verSentimento(1);
                calcularPontuação();
                verificarAcertos();
                button_h.setText("");

            }

        }
        if (num == 9){
            if (letracerta1.equals("I") || letracerta1.equals("Ĩ") || letracerta1.equals("Í") || letracerta1.equals("Î")){
                if (letra1.getText().toString().equals("__")){                    letra1.setText(letracerta1);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta2.equals("I") || letracerta2.equals("Ĩ") || letracerta2.equals("Í") || letracerta2.equals("Î")){
                if (letra2.getText().toString().equals("__")){                    letra2.setText(letracerta2);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta3.equals("I") || letracerta3.equals("Ĩ") || letracerta3.equals("Í") || letracerta3.equals("Î")){
                if (letra3.getText().toString().equals("__")){                    letra3.setText(letracerta3);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta4.equals("I") || letracerta4.equals("Ĩ") || letracerta4.equals("Í") || letracerta4.equals("Î")){
                if (letra4.getText().toString().equals("__")){                    letra4.setText(letracerta4);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta5.equals("I") || letracerta5.equals("Ĩ") || letracerta5.equals("Í") || letracerta5.equals("Î")){
                if (letra5.getText().toString().equals("__")){                    letra5.setText(letracerta5);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta6.equals("I") || letracerta6.equals("Ĩ") || letracerta6.equals("Í") || letracerta6.equals("Î")){
                if (letra6.getText().toString().equals("__")){
                    letra6.setText(letracerta6);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta7.equals("I") || letracerta7.equals("Ĩ") || letracerta7.equals("Í") || letracerta7.equals("Î")){
                if (letra7.getText().toString().equals("__")){
                    letra7.setText(letracerta7);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta8.equals("I") || letracerta8.equals("Ĩ") || letracerta8.equals("Í") || letracerta8.equals("Î")){
                if (letra8.getText().toString().equals("__")){
                    letra8.setText(letracerta8);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta9.equals("I") || letracerta9.equals("Ĩ") || letracerta9.equals("Í") || letracerta9.equals("Î")){
                if (letra9.getText().toString().equals("__")){
                    letra9.setText(letracerta9);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta10.equals("I") || letracerta10.equals("Ĩ") || letracerta10.equals("Í") || letracerta10.equals("Î")){
                if (letra10.getText().toString().equals("__")){
                    letra10.setText(letracerta10);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta11.equals("I") || letracerta11.equals("Ĩ") || letracerta11.equals("Í") || letracerta11.equals("Î")){
                if (letra11.getText().toString().equals("__")){
                    letra11.setText(letracerta11);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta12.equals("I") || letracerta12.equals("Ĩ") || letracerta12.equals("Í") || letracerta12.equals("Î")){
                if (letra12.getText().toString().equals("__")){
                    letra12.setText(letracerta12);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta13.equals("I") || letracerta13.equals("Ĩ") || letracerta13.equals("Í") || letracerta13.equals("Î")){
                if (letra13.getText().toString().equals("__")){
                    letra13.setText(letracerta13);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta14.equals("I") || letracerta14.equals("Ĩ") || letracerta14.equals("Í") || letracerta14.equals("Î")){
                if (letra14.getText().toString().equals("__")){
                    letra14.setText(letracerta14);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta15.equals("I") || letracerta15.equals("Ĩ") || letracerta15.equals("Í") || letracerta15.equals("Î")){
                if (letra15.getText().toString().equals("__")){
                    letra15.setText(letracerta15);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta16.equals("I") || letracerta16.equals("Ĩ") || letracerta16.equals("Í") || letracerta16.equals("Î")){
                if (letra16.getText().toString().equals("__")){
                    letra16.setText(letracerta16);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta17.equals("I") || letracerta17.equals("Ĩ") || letracerta17.equals("Í") || letracerta17.equals("Î")){
                if (letra17.getText().toString().equals("__")){
                    letra17.setText(letracerta17);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta18.equals("I") || letracerta18.equals("Ĩ") || letracerta18.equals("Í") || letracerta18.equals("Î")){
                if (letra18.getText().toString().equals("__")){
                    letra18.setText(letracerta18);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta19.equals("I") || letracerta19.equals("Ĩ") || letracerta19.equals("Í") || letracerta19.equals("Î")){
                if (letra19.getText().toString().equals("__")){
                    letra19.setText(letracerta19);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta20.equals("I") || letracerta20.equals("Ĩ") || letracerta20.equals("Í") || letracerta20.equals("Î")){
                if (letra20.getText().toString().equals("__")){
                    letra20.setText(letracerta20);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta21.equals("I") || letracerta21.equals("Ĩ") || letracerta21.equals("Í") || letracerta21.equals("Î")){
                if (letra21.getText().toString().equals("__")){
                    letra21.setText(letracerta21);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta22.equals("I") || letracerta22.equals("Ĩ") || letracerta22.equals("Í") || letracerta22.equals("Î")){
                if (letra22.getText().toString().equals("__")){
                    letra22.setText(letracerta22);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta23.equals("I") || letracerta23.equals("Ĩ") || letracerta23.equals("Í") || letracerta23.equals("Î")){
                if (letra23.getText().toString().equals("__")){
                    letra23.setText(letracerta23);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta24.equals("I") || letracerta24.equals("Ĩ") || letracerta24.equals("Í") || letracerta24.equals("Î")){
                if (letra24.getText().toString().equals("__")){
                    letra24.setText(letracerta24);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta25.equals("I") || letracerta25.equals("Ĩ") || letracerta25.equals("Í") || letracerta25.equals("Î")){
                if (letra25.getText().toString().equals("__")){
                    letra25.setText(letracerta25);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (cont>0){
                verSentimento(1);
                calcularPontuação();
                verificarAcertos();
                button_i.setText("");

            }

        }
        if (num == 10){
            if (letracerta1.equals("J")){
                if (letra1.getText().toString().equals("__")){                    letra1.setText(letracerta1);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta2.equals("J")){
                if (letra2.getText().toString().equals("__")){                    letra2.setText(letracerta2);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta3.equals("J")){
                if (letra3.getText().toString().equals("__")){                    letra3.setText(letracerta3);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta4.equals("J")){
                if (letra4.getText().toString().equals("__")){                    letra4.setText(letracerta4);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta5.equals("J")){
                if (letra5.getText().toString().equals("__")){                    letra5.setText(letracerta5);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta6.equals("J")){
                if (letra6.getText().toString().equals("__")){
                    letra6.setText(letracerta6);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta7.equals("J")){
                if (letra7.getText().toString().equals("__")){
                    letra7.setText(letracerta7);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta8.equals("J")){
                if (letra8.getText().toString().equals("__")){
                    letra8.setText(letracerta8);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta9.equals("J")){
                if (letra9.getText().toString().equals("__")){
                    letra9.setText(letracerta9);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta10.equals("J")){
                if (letra10.getText().toString().equals("__")){
                    letra10.setText(letracerta10);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta11.equals("J")){
                if (letra11.getText().toString().equals("__")){
                    letra11.setText(letracerta11);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta12.equals("J")){
                if (letra12.getText().toString().equals("__")){
                    letra12.setText(letracerta12);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta13.equals("J")){
                if (letra13.getText().toString().equals("__")){
                    letra13.setText(letracerta13);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta14.equals("J")){
                if (letra14.getText().toString().equals("__")){
                    letra14.setText(letracerta14);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta15.equals("J")){
                if (letra15.getText().toString().equals("__")){
                    letra15.setText(letracerta15);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta16.equals("J")){
                if (letra16.getText().toString().equals("__")){
                    letra16.setText(letracerta16);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta17.equals("J")){
                if (letra17.getText().toString().equals("__")){
                    letra17.setText(letracerta17);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta18.equals("J")){
                if (letra18.getText().toString().equals("__")){
                    letra18.setText(letracerta18);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta19.equals("J")){
                if (letra19.getText().toString().equals("__")){
                    letra19.setText(letracerta19);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta20.equals("J")){
                if (letra20.getText().toString().equals("__")){
                    letra20.setText(letracerta20);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta21.equals("J")){
                if (letra21.getText().toString().equals("__")){
                    letra21.setText(letracerta21);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta22.equals("J")){
                if (letra22.getText().toString().equals("__")){
                    letra22.setText(letracerta22);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta23.equals("J")){
                if (letra23.getText().toString().equals("__")){
                    letra23.setText(letracerta23);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta24.equals("J")){
                if (letra24.getText().toString().equals("__")){
                    letra24.setText(letracerta24);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta25.equals("J")){
                if (letra25.getText().toString().equals("__")){
                    letra25.setText(letracerta25);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (cont>0){
                verSentimento(1);
                calcularPontuação();
                verificarAcertos();
                button_j.setText("");
            }

        }
        if (num == 11){
            if (letracerta1.equals("K")){
                if (letra1.getText().toString().equals("__")){                    letra1.setText(letracerta1);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta2.equals("K")){
                if (letra2.getText().toString().equals("__")){                    letra2.setText(letracerta2);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta3.equals("K")){
                if (letra3.getText().toString().equals("__")){                    letra3.setText(letracerta3);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta4.equals("K")){
                if (letra4.getText().toString().equals("__")){                    letra4.setText(letracerta4);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta5.equals("K")){
                if (letra5.getText().toString().equals("__")){                    letra5.setText(letracerta5);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta6.equals("K")){
                if (letra6.getText().toString().equals("__")){
                    letra6.setText(letracerta6);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta7.equals("K")){
                if (letra7.getText().toString().equals("__")){
                    letra7.setText(letracerta7);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta8.equals("K")){
                if (letra8.getText().toString().equals("__")){
                    letra8.setText(letracerta8);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta9.equals("K")){
                if (letra9.getText().toString().equals("__")){
                    letra9.setText(letracerta9);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta10.equals("K")){
                if (letra10.getText().toString().equals("__")){
                    letra10.setText(letracerta10);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta11.equals("K")){
                if (letra11.getText().toString().equals("__")){
                    letra11.setText(letracerta11);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta12.equals("K")){
                if (letra12.getText().toString().equals("__")){
                    letra12.setText(letracerta12);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta13.equals("K")){
                if (letra13.getText().toString().equals("__")){
                    letra13.setText(letracerta13);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta14.equals("K")){
                if (letra14.getText().toString().equals("__")){
                    letra14.setText(letracerta14);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta15.equals("K")){
                if (letra15.getText().toString().equals("__")){
                    letra15.setText(letracerta15);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta16.equals("K")){
                if (letra16.getText().toString().equals("__")){
                    letra16.setText(letracerta16);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta17.equals("K")){
                if (letra17.getText().toString().equals("__")){
                    letra17.setText(letracerta17);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta18.equals("K")){
                if (letra18.getText().toString().equals("__")){
                    letra18.setText(letracerta18);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta19.equals("K")){
                if (letra19.getText().toString().equals("__")){
                    letra19.setText(letracerta19);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta20.equals("K")){
                if (letra20.getText().toString().equals("__")){
                    letra20.setText(letracerta20);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta21.equals("K")){
                if (letra21.getText().toString().equals("__")){
                    letra21.setText(letracerta21);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta22.equals("K")){
                if (letra22.getText().toString().equals("__")){
                    letra22.setText(letracerta22);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta23.equals("K")){
                if (letra23.getText().toString().equals("__")){
                    letra23.setText(letracerta23);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta24.equals("K")){
                if (letra24.getText().toString().equals("__")){
                    letra24.setText(letracerta24);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta25.equals("K")){
                if (letra25.getText().toString().equals("__")){
                    letra25.setText(letracerta25);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (cont>0){
                verSentimento(1);
                calcularPontuação();
                verificarAcertos();
                button_k.setText("");
            }

        }
        if (num == 12){
            if (letracerta1.equals("L")){
                if (letra1.getText().toString().equals("__")){                    letra1.setText(letracerta1);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta2.equals("L")){
                if (letra2.getText().toString().equals("__")){                    letra2.setText(letracerta2);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta3.equals("L")){
                if (letra3.getText().toString().equals("__")){                    letra3.setText(letracerta3);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta4.equals("L")){
                if (letra4.getText().toString().equals("__")){                    letra4.setText(letracerta4);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta5.equals("L")){
                if (letra5.getText().toString().equals("__")){                    letra5.setText(letracerta5);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta6.equals("L")){
                if (letra6.getText().toString().equals("__")){
                    letra6.setText(letracerta6);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta7.equals("L")){
                if (letra7.getText().toString().equals("__")){
                    letra7.setText(letracerta7);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta8.equals("L")){
                if (letra8.getText().toString().equals("__")){
                    letra8.setText(letracerta8);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta9.equals("L")){
                if (letra9.getText().toString().equals("__")){
                    letra9.setText(letracerta9);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta10.equals("L")){
                if (letra10.getText().toString().equals("__")){
                    letra10.setText(letracerta10);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta11.equals("L")){
                if (letra11.getText().toString().equals("__")){
                    letra11.setText(letracerta11);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta12.equals("L")){
                if (letra12.getText().toString().equals("__")){
                    letra12.setText(letracerta12);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta13.equals("L")){
                if (letra13.getText().toString().equals("__")){
                    letra13.setText(letracerta13);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta14.equals("L")){
                if (letra14.getText().toString().equals("__")){
                    letra14.setText(letracerta14);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta15.equals("L")){
                if (letra15.getText().toString().equals("__")){
                    letra15.setText(letracerta15);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta16.equals("L")){
                if (letra16.getText().toString().equals("__")){
                    letra16.setText(letracerta16);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta17.equals("L")){
                if (letra17.getText().toString().equals("__")){
                    letra17.setText(letracerta17);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta18.equals("L")){
                if (letra18.getText().toString().equals("__")){
                    letra18.setText(letracerta18);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta19.equals("L")){
                if (letra19.getText().toString().equals("__")){
                    letra19.setText(letracerta19);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta20.equals("L")){
                if (letra20.getText().toString().equals("__")){
                    letra20.setText(letracerta20);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta21.equals("L")){
                if (letra21.getText().toString().equals("__")){
                    letra21.setText(letracerta21);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta22.equals("L")){
                if (letra22.getText().toString().equals("__")){
                    letra22.setText(letracerta22);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta23.equals("L")){
                if (letra23.getText().toString().equals("__")){
                    letra23.setText(letracerta23);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta24.equals("L")){
                if (letra24.getText().toString().equals("__")){
                    letra24.setText(letracerta24);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta25.equals("L")){
                if (letra25.getText().toString().equals("__")){
                    letra25.setText(letracerta25);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (cont>0){
                verSentimento(1);
                calcularPontuação();
                verificarAcertos();
                button_l.setText("");
            }

        }
        if (num == 13){
            if (letracerta1.equals("M")){
                if (letra1.getText().toString().equals("__")){                    letra1.setText(letracerta1);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta2.equals("M")){
                if (letra2.getText().toString().equals("__")){                    letra2.setText(letracerta2);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta3.equals("M")){
                if (letra3.getText().toString().equals("__")){                    letra3.setText(letracerta3);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta4.equals("M")){
                if (letra4.getText().toString().equals("__")){                    letra4.setText(letracerta4);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta5.equals("M")){
                if (letra5.getText().toString().equals("__")){                    letra5.setText(letracerta5);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta6.equals("M")){
                if (letra6.getText().toString().equals("__")){
                    letra6.setText(letracerta6);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta7.equals("M")){
                if (letra7.getText().toString().equals("__")){
                    letra7.setText(letracerta7);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta8.equals("M")){
                if (letra8.getText().toString().equals("__")){
                    letra8.setText(letracerta8);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta9.equals("M")){
                if (letra9.getText().toString().equals("__")){
                    letra9.setText(letracerta9);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta10.equals("M")){
                if (letra10.getText().toString().equals("__")){
                    letra10.setText(letracerta10);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta11.equals("M")){
                if (letra11.getText().toString().equals("__")){
                    letra11.setText(letracerta11);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta12.equals("M")){
                if (letra12.getText().toString().equals("__")){
                    letra12.setText(letracerta12);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta13.equals("M")){
                if (letra13.getText().toString().equals("__")){
                    letra13.setText(letracerta13);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta14.equals("M")){
                if (letra14.getText().toString().equals("__")){
                    letra14.setText(letracerta14);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta15.equals("M")){
                if (letra15.getText().toString().equals("__")){
                    letra15.setText(letracerta15);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta16.equals("M")){
                if (letra16.getText().toString().equals("__")){
                    letra16.setText(letracerta16);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta17.equals("M")){
                if (letra17.getText().toString().equals("__")){
                    letra17.setText(letracerta17);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta18.equals("M")){
                if (letra18.getText().toString().equals("__")){
                    letra18.setText(letracerta18);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta19.equals("M")){
                if (letra19.getText().toString().equals("__")){
                    letra19.setText(letracerta19);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta20.equals("M")){
                if (letra20.getText().toString().equals("__")){
                    letra20.setText(letracerta20);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta21.equals("M")){
                if (letra21.getText().toString().equals("__")){
                    letra21.setText(letracerta21);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta22.equals("M")){
                if (letra22.getText().toString().equals("__")){
                    letra22.setText(letracerta22);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta23.equals("M")){
                if (letra23.getText().toString().equals("__")){
                    letra23.setText(letracerta23);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta24.equals("M")){
                if (letra24.getText().toString().equals("__")){
                    letra24.setText(letracerta24);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta25.equals("M")){
                if (letra25.getText().toString().equals("__")){
                    letra25.setText(letracerta25);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (cont>0){
                verSentimento(1);
                calcularPontuação();
                verificarAcertos();
                button_m.setText("");
            }

        }
        if (num == 14){
            if (letracerta1.equals("N")){
                if (letra1.getText().toString().equals("__")){                    letra1.setText(letracerta1);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta2.equals("N")){
                if (letra2.getText().toString().equals("__")){                    letra2.setText(letracerta2);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta3.equals("N")){
                if (letra3.getText().toString().equals("__")){                    letra3.setText(letracerta3);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta4.equals("N")){
                if (letra4.getText().toString().equals("__")){                    letra4.setText(letracerta4);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta5.equals("N")){
                if (letra5.getText().toString().equals("__")){                    letra5.setText(letracerta5);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta6.equals("N")){
                if (letra6.getText().toString().equals("__")){
                    letra6.setText(letracerta6);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta7.equals("N")){
                if (letra7.getText().toString().equals("__")){
                    letra7.setText(letracerta7);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta8.equals("N")){
                if (letra8.getText().toString().equals("__")){
                    letra8.setText(letracerta8);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta9.equals("N")){
                if (letra9.getText().toString().equals("__")){
                    letra9.setText(letracerta9);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta10.equals("N")){
                if (letra10.getText().toString().equals("__")){
                    letra10.setText(letracerta10);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta11.equals("N")){
                if (letra11.getText().toString().equals("__")){
                    letra11.setText(letracerta11);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta12.equals("N")){
                if (letra12.getText().toString().equals("__")){
                    letra12.setText(letracerta12);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta13.equals("N")){
                if (letra13.getText().toString().equals("__")){
                    letra13.setText(letracerta13);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta14.equals("N")){
                if (letra14.getText().toString().equals("__")){
                    letra14.setText(letracerta14);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta15.equals("N")){
                if (letra15.getText().toString().equals("__")){
                    letra15.setText(letracerta15);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta16.equals("N")){
                if (letra16.getText().toString().equals("__")){
                    letra16.setText(letracerta16);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta17.equals("N")){
                if (letra17.getText().toString().equals("__")){
                    letra17.setText(letracerta17);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta18.equals("N")){
                if (letra18.getText().toString().equals("__")){
                    letra18.setText(letracerta18);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta19.equals("N")){
                if (letra19.getText().toString().equals("__")){
                    letra19.setText(letracerta19);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta20.equals("N")){
                if (letra20.getText().toString().equals("__")){
                    letra20.setText(letracerta20);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta21.equals("N")){
                if (letra21.getText().toString().equals("__")){
                    letra21.setText(letracerta21);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta22.equals("N")){
                if (letra22.getText().toString().equals("__")){
                    letra22.setText(letracerta22);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta23.equals("N")){
                if (letra23.getText().toString().equals("__")){
                    letra23.setText(letracerta23);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta24.equals("N")){
                if (letra24.getText().toString().equals("__")){
                    letra24.setText(letracerta24);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta25.equals("N")){
                if (letra25.getText().toString().equals("__")){
                    letra25.setText(letracerta25);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (cont>0){
                verSentimento(1);
                calcularPontuação();
                verificarAcertos();
                button_n.setText("");
            }

        }
        if (num == 15){
            if (letracerta1.equals("O") || letracerta1.equals("Õ") || letracerta1.equals("Ó") || letracerta1.equals("Ô")){
                if (letra1.getText().toString().equals("__")){                    letra1.setText(letracerta1);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta2.equals("O") || letracerta2.equals("Õ") || letracerta2.equals("Ó") || letracerta2.equals("Ô")){
                if (letra2.getText().toString().equals("__")){                    letra2.setText(letracerta2);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta3.equals("O") || letracerta3.equals("Õ") || letracerta3.equals("Ó") || letracerta3.equals("Ô")){
                if (letra3.getText().toString().equals("__")){                    letra3.setText(letracerta3);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta4.equals("O") || letracerta4.equals("Õ") || letracerta4.equals("Ó") || letracerta4.equals("Ô")){
                if (letra4.getText().toString().equals("__")){                    letra4.setText(letracerta4);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta5.equals("O") || letracerta5.equals("Õ") || letracerta5.equals("Ó") || letracerta5.equals("Ô")){
                if (letra5.getText().toString().equals("__")){                    letra5.setText(letracerta5);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta6.equals("O") || letracerta6.equals("Õ") || letracerta6.equals("Ó") || letracerta6.equals("Ô")){
                if (letra6.getText().toString().equals("__")){
                    letra6.setText(letracerta6);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta7.equals("O") || letracerta7.equals("Õ") || letracerta7.equals("Ó") || letracerta7.equals("Ô")){
                if (letra7.getText().toString().equals("__")){
                    letra7.setText(letracerta7);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta8.equals("O") || letracerta8.equals("Õ") || letracerta8.equals("Ó") || letracerta8.equals("Ô")){
                if (letra8.getText().toString().equals("__")){
                    letra8.setText(letracerta8);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta9.equals("O") || letracerta9.equals("Õ") || letracerta9.equals("Ó") || letracerta9.equals("Ô")){
                if (letra9.getText().toString().equals("__")){
                    letra9.setText(letracerta9);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta10.equals("O") || letracerta10.equals("Õ") || letracerta10.equals("Ó") || letracerta10.equals("Ô")){
                if (letra10.getText().toString().equals("__")){
                    letra10.setText(letracerta10);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta11.equals("O") || letracerta11.equals("Õ") || letracerta11.equals("Ó") || letracerta11.equals("Ô")){
                if (letra11.getText().toString().equals("__")){
                    letra11.setText(letracerta11);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta12.equals("O") || letracerta12.equals("Õ") || letracerta12.equals("Ó") || letracerta12.equals("Ô")){
                if (letra12.getText().toString().equals("__")){
                    letra12.setText(letracerta12);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta13.equals("O") || letracerta13.equals("Õ") || letracerta13.equals("Ó") || letracerta13.equals("Ô")){
                if (letra13.getText().toString().equals("__")){
                    letra13.setText(letracerta13);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta14.equals("O") || letracerta14.equals("Õ") || letracerta14.equals("Ó") || letracerta14.equals("Ô")){
                if (letra14.getText().toString().equals("__")){
                    letra14.setText(letracerta14);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta15.equals("O") || letracerta15.equals("Õ") || letracerta15.equals("Ó") || letracerta15.equals("Ô")){
                if (letra15.getText().toString().equals("__")){
                    letra15.setText(letracerta15);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta16.equals("O") || letracerta16.equals("Õ") || letracerta16.equals("Ó") || letracerta16.equals("Ô")){
                if (letra16.getText().toString().equals("__")){
                    letra16.setText(letracerta16);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta17.equals("O") || letracerta17.equals("Õ") || letracerta17.equals("Ó") || letracerta17.equals("Ô")){
                if (letra17.getText().toString().equals("__")){
                    letra17.setText(letracerta17);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta18.equals("O") || letracerta18.equals("Õ") || letracerta18.equals("Ó") || letracerta18.equals("Ô")){
                if (letra18.getText().toString().equals("__")){
                    letra18.setText(letracerta18);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta19.equals("O") || letracerta19.equals("Õ") || letracerta19.equals("Ó") || letracerta19.equals("Ô")){
                if (letra19.getText().toString().equals("__")){
                    letra19.setText(letracerta19);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta20.equals("O") || letracerta20.equals("Õ") || letracerta20.equals("Ó") || letracerta20.equals("Ô")){
                if (letra20.getText().toString().equals("__")){
                    letra20.setText(letracerta20);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta21.equals("O") || letracerta21.equals("Õ") || letracerta21.equals("Ó") || letracerta21.equals("Ô")){
                if (letra21.getText().toString().equals("__")){
                    letra21.setText(letracerta21);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta22.equals("O") || letracerta22.equals("Õ") || letracerta22.equals("Ó") || letracerta22.equals("Ô")){
                if (letra22.getText().toString().equals("__")){
                    letra22.setText(letracerta22);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta23.equals("O") || letracerta23.equals("Õ") || letracerta23.equals("Ó") || letracerta23.equals("Ô")){
                if (letra23.getText().toString().equals("__")){
                    letra23.setText(letracerta23);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta24.equals("O") || letracerta24.equals("Õ") || letracerta24.equals("Ó") || letracerta24.equals("Ô")){
                if (letra24.getText().toString().equals("__")){
                    letra24.setText(letracerta24);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta25.equals("O") || letracerta25.equals("Õ") || letracerta25.equals("Ó") || letracerta25.equals("Ô")){
                if (letra25.getText().toString().equals("__")){
                    letra25.setText(letracerta25);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (cont>0){
                verSentimento(1);
                calcularPontuação();
                verificarAcertos();
                button_o.setText("");
            }

        }
        if (num == 16){
            if (letracerta1.equals("P")){
                if (letra1.getText().toString().equals("__")){                    letra1.setText(letracerta1);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta2.equals("P")){
                if (letra2.getText().toString().equals("__")){                    letra2.setText(letracerta2);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta3.equals("P")){
                if (letra3.getText().toString().equals("__")){                    letra3.setText(letracerta3);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta4.equals("P")){
                if (letra4.getText().toString().equals("__")){                    letra4.setText(letracerta4);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta5.equals("P")){
                if (letra5.getText().toString().equals("__")){                    letra5.setText(letracerta5);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta6.equals("P")){
                if (letra6.getText().toString().equals("__")){
                    letra6.setText(letracerta6);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta7.equals("P")){
                if (letra7.getText().toString().equals("__")){
                    letra7.setText(letracerta7);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta8.equals("P")){
                if (letra8.getText().toString().equals("__")){
                    letra8.setText(letracerta8);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta9.equals("P")){
                if (letra9.getText().toString().equals("__")){
                    letra9.setText(letracerta9);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta10.equals("P")){
                if (letra10.getText().toString().equals("__")){
                    letra10.setText(letracerta10);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta11.equals("P")){
                if (letra11.getText().toString().equals("__")){
                    letra11.setText(letracerta11);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta12.equals("P")){
                if (letra12.getText().toString().equals("__")){
                    letra12.setText(letracerta12);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta13.equals("P")){
                if (letra13.getText().toString().equals("__")){
                    letra13.setText(letracerta13);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta14.equals("P")){
                if (letra14.getText().toString().equals("__")){
                    letra14.setText(letracerta14);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta15.equals("P")){
                if (letra15.getText().toString().equals("__")){
                    letra15.setText(letracerta15);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta16.equals("P")){
                if (letra16.getText().toString().equals("__")){
                    letra16.setText(letracerta16);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta17.equals("P")){
                if (letra17.getText().toString().equals("__")){
                    letra17.setText(letracerta17);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta18.equals("P")){
                if (letra18.getText().toString().equals("__")){
                    letra18.setText(letracerta18);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta19.equals("P")){
                if (letra19.getText().toString().equals("__")){
                    letra19.setText(letracerta19);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta20.equals("P")){
                if (letra20.getText().toString().equals("__")){
                    letra20.setText(letracerta20);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta21.equals("P")){
                if (letra21.getText().toString().equals("__")){
                    letra21.setText(letracerta21);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta22.equals("P")){
                if (letra22.getText().toString().equals("__")){
                    letra22.setText(letracerta22);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta23.equals("P")){
                if (letra23.getText().toString().equals("__")){
                    letra23.setText(letracerta23);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta24.equals("P")){
                if (letra24.getText().toString().equals("__")){
                    letra24.setText(letracerta24);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta25.equals("P")){
                if (letra25.getText().toString().equals("__")){
                    letra25.setText(letracerta25);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (cont>0){
                verSentimento(1);
                calcularPontuação();
                verificarAcertos();
                button_p.setText("");
            }

        }
        if (num == 17){
            if (letracerta1.equals("Q")){
                if (letra1.getText().toString().equals("__")){                    letra1.setText(letracerta1);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta2.equals("Q")){
                if (letra2.getText().toString().equals("__")){                    letra2.setText(letracerta2);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta3.equals("Q")){
                if (letra3.getText().toString().equals("__")){                    letra3.setText(letracerta3);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta4.equals("Q")){
                if (letra4.getText().toString().equals("__")){                    letra4.setText(letracerta4);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta5.equals("Q")){
                if (letra5.getText().toString().equals("__")){                    letra5.setText(letracerta5);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta6.equals("Q")){
                if (letra6.getText().toString().equals("__")){
                    letra6.setText(letracerta6);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta7.equals("Q")){
                if (letra7.getText().toString().equals("__")){
                    letra7.setText(letracerta7);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta8.equals("Q")){
                if (letra8.getText().toString().equals("__")){
                    letra8.setText(letracerta8);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta9.equals("Q")){
                if (letra9.getText().toString().equals("__")){
                    letra9.setText(letracerta9);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta10.equals("Q")){
                if (letra10.getText().toString().equals("__")){
                    letra10.setText(letracerta10);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta11.equals("Q")){
                if (letra11.getText().toString().equals("__")){
                    letra11.setText(letracerta11);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta12.equals("Q")){
                if (letra12.getText().toString().equals("__")){
                    letra12.setText(letracerta12);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta13.equals("Q")){
                if (letra13.getText().toString().equals("__")){
                    letra13.setText(letracerta13);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta14.equals("Q")){
                if (letra14.getText().toString().equals("__")){
                    letra14.setText(letracerta14);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta15.equals("Q")){
                if (letra15.getText().toString().equals("__")){
                    letra15.setText(letracerta15);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta16.equals("Q")){
                if (letra16.getText().toString().equals("__")){
                    letra16.setText(letracerta16);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta17.equals("Q")){
                if (letra17.getText().toString().equals("__")){
                    letra17.setText(letracerta17);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta18.equals("Q")){
                if (letra18.getText().toString().equals("__")){
                    letra18.setText(letracerta18);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta19.equals("Q")){
                if (letra19.getText().toString().equals("__")){
                    letra19.setText(letracerta19);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta20.equals("Q")){
                if (letra20.getText().toString().equals("__")){
                    letra20.setText(letracerta20);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta21.equals("Q")){
                if (letra21.getText().toString().equals("__")){
                    letra21.setText(letracerta21);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta22.equals("Q")){
                if (letra22.getText().toString().equals("__")){
                    letra22.setText(letracerta22);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta23.equals("Q")){
                if (letra23.getText().toString().equals("__")){
                    letra23.setText(letracerta23);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta24.equals("Q")){
                if (letra24.getText().toString().equals("__")){
                    letra24.setText(letracerta24);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta25.equals("Q")){
                if (letra25.getText().toString().equals("__")){
                    letra25.setText(letracerta25);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (cont>0){
                verSentimento(1);
                calcularPontuação();
                verificarAcertos();
                button_q.setText("");
            }

        }
        if (num == 18){
            if (letracerta1.equals("R")){
                if (letra1.getText().toString().equals("__")){                    letra1.setText(letracerta1);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta2.equals("R")){
                if (letra2.getText().toString().equals("__")){                    letra2.setText(letracerta2);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta3.equals("R")){
                if (letra3.getText().toString().equals("__")){                    letra3.setText(letracerta3);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta4.equals("R")){
                if (letra4.getText().toString().equals("__")){                    letra4.setText(letracerta4);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta5.equals("R")){
                if (letra5.getText().toString().equals("__")){                    letra5.setText(letracerta5);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta6.equals("R")){
                if (letra6.getText().toString().equals("__")){
                    letra6.setText(letracerta6);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta7.equals("R")){
                if (letra7.getText().toString().equals("__")){
                    letra7.setText(letracerta7);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta8.equals("R")){
                if (letra8.getText().toString().equals("__")){
                    letra8.setText(letracerta8);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta9.equals("R")){
                if (letra9.getText().toString().equals("__")){
                    letra9.setText(letracerta9);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta10.equals("R")){
                if (letra10.getText().toString().equals("__")){
                    letra10.setText(letracerta10);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta11.equals("R")){
                if (letra11.getText().toString().equals("__")){
                    letra11.setText(letracerta11);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta12.equals("R")){
                if (letra12.getText().toString().equals("__")){
                    letra12.setText(letracerta12);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta13.equals("R")){
                if (letra13.getText().toString().equals("__")){
                    letra13.setText(letracerta13);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta14.equals("R")){
                if (letra14.getText().toString().equals("__")){
                    letra14.setText(letracerta14);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta15.equals("R")){
                if (letra15.getText().toString().equals("__")){
                    letra15.setText(letracerta15);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta16.equals("R")){
                if (letra16.getText().toString().equals("__")){
                    letra16.setText(letracerta16);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta17.equals("R")){
                if (letra17.getText().toString().equals("__")){
                    letra17.setText(letracerta17);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta18.equals("R")){
                if (letra18.getText().toString().equals("__")){
                    letra18.setText(letracerta18);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta19.equals("R")){
                if (letra19.getText().toString().equals("__")){
                    letra19.setText(letracerta19);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta20.equals("R")){
                if (letra20.getText().toString().equals("__")){
                    letra20.setText(letracerta20);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta21.equals("R")){
                if (letra21.getText().toString().equals("__")){
                    letra21.setText(letracerta21);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta22.equals("R")){
                if (letra22.getText().toString().equals("__")){
                    letra22.setText(letracerta22);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta23.equals("R")){
                if (letra23.getText().toString().equals("__")){
                    letra23.setText(letracerta23);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta24.equals("R")){
                if (letra24.getText().toString().equals("__")){
                    letra24.setText(letracerta24);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta25.equals("R")){
                if (letra25.getText().toString().equals("__")){
                    letra25.setText(letracerta25);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (cont>0){
                verSentimento(1);
                calcularPontuação();
                verificarAcertos();
                button_r.setText("");
            }

        }
        if (num == 19){
            if (letracerta1.equals("S")){
                if (letra1.getText().toString().equals("__")){                    letra1.setText(letracerta1);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta2.equals("S")){
                if (letra2.getText().toString().equals("__")){                    letra2.setText(letracerta2);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta3.equals("S")){
                if (letra3.getText().toString().equals("__")){                    letra3.setText(letracerta3);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta4.equals("S")){
                if (letra4.getText().toString().equals("__")){                    letra4.setText(letracerta4);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta5.equals("S")){
                if (letra5.getText().toString().equals("__")){                    letra5.setText(letracerta5);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta6.equals("S")){
                if (letra6.getText().toString().equals("__")){
                    letra6.setText(letracerta6);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta7.equals("S")){
                if (letra7.getText().toString().equals("__")){
                    letra7.setText(letracerta7);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta8.equals("S")){
                if (letra8.getText().toString().equals("__")){
                    letra8.setText(letracerta8);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta9.equals("S")){
                if (letra9.getText().toString().equals("__")){
                    letra9.setText(letracerta9);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta10.equals("S")){
                if (letra10.getText().toString().equals("__")){
                    letra10.setText(letracerta10);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta11.equals("S")){
                if (letra11.getText().toString().equals("__")){
                    letra11.setText(letracerta11);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta12.equals("S")){
                if (letra12.getText().toString().equals("__")){
                    letra12.setText(letracerta12);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta13.equals("S")){
                if (letra13.getText().toString().equals("__")){
                    letra13.setText(letracerta13);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta14.equals("S")){
                if (letra14.getText().toString().equals("__")){
                    letra14.setText(letracerta14);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta15.equals("S")){
                if (letra15.getText().toString().equals("__")){
                    letra15.setText(letracerta15);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta16.equals("S")){
                if (letra16.getText().toString().equals("__")){
                    letra16.setText(letracerta16);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta17.equals("S")){
                if (letra17.getText().toString().equals("__")){
                    letra17.setText(letracerta17);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta18.equals("S")){
                if (letra18.getText().toString().equals("__")){
                    letra18.setText(letracerta18);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta19.equals("S")){
                if (letra19.getText().toString().equals("__")){
                    letra19.setText(letracerta19);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta20.equals("S")){
                if (letra20.getText().toString().equals("__")){
                    letra20.setText(letracerta20);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta21.equals("S")){
                if (letra21.getText().toString().equals("__")){
                    letra21.setText(letracerta21);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta22.equals("S")){
                if (letra22.getText().toString().equals("__")){
                    letra22.setText(letracerta22);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta23.equals("S")){
                if (letra23.getText().toString().equals("__")){
                    letra23.setText(letracerta23);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta24.equals("S")){
                if (letra24.getText().toString().equals("__")){
                    letra24.setText(letracerta24);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta25.equals("S")){
                if (letra25.getText().toString().equals("__")){
                    letra25.setText(letracerta25);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (cont>0){
                verSentimento(1);
                calcularPontuação();
                verificarAcertos();
                button_s.setText("");
            }

        }
        if (num == 20){
            if (letracerta1.equals("T")){
                if (letra1.getText().toString().equals("__")){                    letra1.setText(letracerta1);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta2.equals("T")){
                if (letra2.getText().toString().equals("__")){                    letra2.setText(letracerta2);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta3.equals("T")){
                if (letra3.getText().toString().equals("__")){                    letra3.setText(letracerta3);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta4.equals("T")){
                if (letra4.getText().toString().equals("__")){                    letra4.setText(letracerta4);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta5.equals("T")){
                if (letra5.getText().toString().equals("__")){                    letra5.setText(letracerta5);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta6.equals("T")){
                if (letra6.getText().toString().equals("__")){
                    letra6.setText(letracerta6);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta7.equals("T")){
                if (letra7.getText().toString().equals("__")){
                    letra7.setText(letracerta7);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta8.equals("T")){
                if (letra8.getText().toString().equals("__")){
                    letra8.setText(letracerta8);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta9.equals("T")){
                if (letra9.getText().toString().equals("__")){
                    letra9.setText(letracerta9);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta10.equals("T")){
                if (letra10.getText().toString().equals("__")){
                    letra10.setText(letracerta10);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta11.equals("T")){
                if (letra11.getText().toString().equals("__")){
                    letra11.setText(letracerta11);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta12.equals("T")){
                if (letra12.getText().toString().equals("__")){
                    letra12.setText(letracerta12);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta13.equals("T")){
                if (letra13.getText().toString().equals("__")){
                    letra13.setText(letracerta13);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta14.equals("T")){
                if (letra14.getText().toString().equals("__")){
                    letra14.setText(letracerta14);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta15.equals("T")){
                if (letra15.getText().toString().equals("__")){
                    letra15.setText(letracerta15);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta16.equals("T")){
                if (letra16.getText().toString().equals("__")){
                    letra16.setText(letracerta16);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta17.equals("T")){
                if (letra17.getText().toString().equals("__")){
                    letra17.setText(letracerta17);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta18.equals("T")){
                if (letra18.getText().toString().equals("__")){
                    letra18.setText(letracerta18);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta19.equals("T")){
                if (letra19.getText().toString().equals("__")){
                    letra19.setText(letracerta19);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta20.equals("T")){
                if (letra20.getText().toString().equals("__")){
                    letra20.setText(letracerta20);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta21.equals("T")){
                if (letra21.getText().toString().equals("__")){
                    letra21.setText(letracerta21);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta22.equals("T")){
                if (letra22.getText().toString().equals("__")){
                    letra22.setText(letracerta22);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta23.equals("T")){
                if (letra23.getText().toString().equals("__")){
                    letra23.setText(letracerta23);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta24.equals("T")){
                if (letra24.getText().toString().equals("__")){
                    letra24.setText(letracerta24);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta25.equals("T")){
                if (letra25.getText().toString().equals("__")){
                    letra25.setText(letracerta25);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (cont>0){
                verSentimento(1);
                calcularPontuação();
                verificarAcertos();
                button_t.setText("");
            }

        }

        if (num == 21){
            if (letracerta1.equals("U") || letracerta1.equals("Ũ") || letracerta1.equals("Ú") || letracerta1.equals("Û")){
                if (letra1.getText().toString().equals("__")){                    letra1.setText(letracerta1);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta2.equals("U") || letracerta2.equals("Ũ") || letracerta2.equals("Ú") || letracerta2.equals("Û")){
                if (letra2.getText().toString().equals("__")){                    letra2.setText(letracerta2);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta3.equals("U") || letracerta3.equals("Ũ") || letracerta3.equals("Ú") || letracerta3.equals("Û")){
                if (letra3.getText().toString().equals("__")){                    letra3.setText(letracerta3);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta4.equals("U") || letracerta4.equals("Ũ") || letracerta4.equals("Ú") || letracerta4.equals("Û")){
                if (letra4.getText().toString().equals("__")){                    letra4.setText(letracerta4);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta5.equals("U") || letracerta5.equals("Ũ") || letracerta5.equals("Ú") || letracerta5.equals("Û")){
                if (letra5.getText().toString().equals("__")){                    letra5.setText(letracerta5);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta6.equals("U") || letracerta6.equals("Ũ") || letracerta6.equals("Ú") || letracerta6.equals("Û")){
                if (letra6.getText().toString().equals("__")){
                    letra6.setText(letracerta6);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta7.equals("U") || letracerta7.equals("Ũ") || letracerta7.equals("Ú") || letracerta7.equals("Û")){
                if (letra7.getText().toString().equals("__")){
                    letra7.setText(letracerta7);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta8.equals("U") || letracerta8.equals("Ũ") || letracerta8.equals("Ú") || letracerta8.equals("Û")){
                if (letra8.getText().toString().equals("__")){
                    letra8.setText(letracerta8);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta9.equals("U") || letracerta9.equals("Ũ") || letracerta9.equals("Ú") || letracerta9.equals("Û")){
                if (letra9.getText().toString().equals("__")){
                    letra9.setText(letracerta9);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta10.equals("U") || letracerta10.equals("Ũ") || letracerta10.equals("Ú") || letracerta10.equals("Û")){
                if (letra10.getText().toString().equals("__")){
                    letra10.setText(letracerta10);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta11.equals("U") || letracerta11.equals("Ũ") || letracerta11.equals("Ú") || letracerta11.equals("Û")){
                if (letra11.getText().toString().equals("__")){
                    letra11.setText(letracerta11);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta12.equals("U") || letracerta12.equals("Ũ") || letracerta12.equals("Ú") || letracerta12.equals("Û")){
                if (letra12.getText().toString().equals("__")){
                    letra12.setText(letracerta12);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta13.equals("U") || letracerta13.equals("Ũ") || letracerta13.equals("Ú") || letracerta13.equals("Û")){
                if (letra13.getText().toString().equals("__")){
                    letra13.setText(letracerta13);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta14.equals("U") || letracerta14.equals("Ũ") || letracerta14.equals("Ú") || letracerta14.equals("Û")){
                if (letra14.getText().toString().equals("__")){
                    letra14.setText(letracerta14);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta15.equals("U") || letracerta15.equals("Ũ") || letracerta15.equals("Ú") || letracerta15.equals("Û")){
                if (letra15.getText().toString().equals("__")){
                    letra15.setText(letracerta15);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta16.equals("U") || letracerta16.equals("Ũ") || letracerta16.equals("Ú") || letracerta16.equals("Û")){
                if (letra16.getText().toString().equals("__")){
                    letra16.setText(letracerta16);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta17.equals("U") || letracerta17.equals("Ũ") || letracerta17.equals("Ú") || letracerta17.equals("Û")){
                if (letra17.getText().toString().equals("__")){
                    letra17.setText(letracerta17);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta18.equals("U") || letracerta18.equals("Ũ") || letracerta18.equals("Ú") || letracerta18.equals("Û")){
                if (letra18.getText().toString().equals("__")){
                    letra18.setText(letracerta18);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta19.equals("U") || letracerta19.equals("Ũ") || letracerta19.equals("Ú") || letracerta19.equals("Û")){
                if (letra19.getText().toString().equals("__")){
                    letra19.setText(letracerta19);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta20.equals("U") || letracerta20.equals("Ũ") || letracerta20.equals("Ú") || letracerta20.equals("Û")){
                if (letra20.getText().toString().equals("__")){
                    letra20.setText(letracerta20);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta21.equals("U") || letracerta21.equals("Ũ") || letracerta21.equals("Ú") || letracerta21.equals("Û")){
                if (letra21.getText().toString().equals("__")){
                    letra21.setText(letracerta21);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta22.equals("U") || letracerta22.equals("Ũ") || letracerta22.equals("Ú") || letracerta22.equals("Û")){
                if (letra22.getText().toString().equals("__")){
                    letra22.setText(letracerta22);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta23.equals("U") || letracerta23.equals("Ũ") || letracerta23.equals("Ú") || letracerta23.equals("Û")){
                if (letra23.getText().toString().equals("__")){
                    letra23.setText(letracerta23);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta24.equals("U") || letracerta24.equals("Ũ") || letracerta24.equals("Ú") || letracerta24.equals("Û")){
                if (letra24.getText().toString().equals("__")){
                    letra24.setText(letracerta24);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta25.equals("U") || letracerta25.equals("Ũ") || letracerta25.equals("Ú") || letracerta25.equals("Û")){
                if (letra25.getText().toString().equals("__")){
                    letra25.setText(letracerta25);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (cont>0){
                verSentimento(1);
                calcularPontuação();
                verificarAcertos();
                button_u.setText("");
            }

        }

        if (num == 22){
            if (letracerta1.equals("V")){
                if (letra1.getText().toString().equals("__")){                    letra1.setText(letracerta1);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta2.equals("V")){
                if (letra2.getText().toString().equals("__")){                    letra2.setText(letracerta2);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta3.equals("V")){
                if (letra3.getText().toString().equals("__")){                    letra3.setText(letracerta3);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta4.equals("V")){
                if (letra4.getText().toString().equals("__")){                    letra4.setText(letracerta4);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta5.equals("V")){
                if (letra5.getText().toString().equals("__")){                    letra5.setText(letracerta5);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta6.equals("V")){
                if (letra6.getText().toString().equals("__")){
                    letra6.setText(letracerta6);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta7.equals("V")){
                if (letra7.getText().toString().equals("__")){
                    letra7.setText(letracerta7);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta8.equals("V")){
                if (letra8.getText().toString().equals("__")){
                    letra8.setText(letracerta8);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta9.equals("V")){
                if (letra9.getText().toString().equals("__")){
                    letra9.setText(letracerta9);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta10.equals("V")){
                if (letra10.getText().toString().equals("__")){
                    letra10.setText(letracerta10);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta11.equals("V")){
                if (letra11.getText().toString().equals("__")){
                    letra11.setText(letracerta11);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta12.equals("V")){
                if (letra12.getText().toString().equals("__")){
                    letra12.setText(letracerta12);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta13.equals("V")){
                if (letra13.getText().toString().equals("__")){
                    letra13.setText(letracerta13);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta14.equals("V")){
                if (letra14.getText().toString().equals("__")){
                    letra14.setText(letracerta14);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta15.equals("V")){
                if (letra15.getText().toString().equals("__")){
                    letra15.setText(letracerta15);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta16.equals("V")){
                if (letra16.getText().toString().equals("__")){
                    letra16.setText(letracerta16);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta17.equals("V")){
                if (letra17.getText().toString().equals("__")){
                    letra17.setText(letracerta17);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta18.equals("V")){
                if (letra18.getText().toString().equals("__")){
                    letra18.setText(letracerta18);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta19.equals("V")){
                if (letra19.getText().toString().equals("__")){
                    letra19.setText(letracerta19);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta20.equals("V")){
                if (letra20.getText().toString().equals("__")){
                    letra20.setText(letracerta20);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta21.equals("V")){
                if (letra21.getText().toString().equals("__")){
                    letra21.setText(letracerta21);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta22.equals("V")){
                if (letra22.getText().toString().equals("__")){
                    letra22.setText(letracerta22);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta23.equals("V")){
                if (letra23.getText().toString().equals("__")){
                    letra23.setText(letracerta23);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta24.equals("V")){
                if (letra24.getText().toString().equals("__")){
                    letra24.setText(letracerta24);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta25.equals("V")){
                if (letra25.getText().toString().equals("__")){
                    letra25.setText(letracerta25);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (cont>0){
                verSentimento(1);
                calcularPontuação();
                verificarAcertos();
                button_v.setText("");
            }

        }
        if (num == 23){
            if (letracerta1.equals("X")){
                if (letra1.getText().toString().equals("__")){                    letra1.setText(letracerta1);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta2.equals("X")){
                if (letra2.getText().toString().equals("__")){                    letra2.setText(letracerta2);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta3.equals("X")){
                if (letra3.getText().toString().equals("__")){                    letra3.setText(letracerta3);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta4.equals("X")){
                if (letra4.getText().toString().equals("__")){                    letra4.setText(letracerta4);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta5.equals("X")){
                if (letra5.getText().toString().equals("__")){                    letra5.setText(letracerta5);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta6.equals("X")){
                if (letra6.getText().toString().equals("__")){
                    letra6.setText(letracerta6);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta7.equals("X")){
                if (letra7.getText().toString().equals("__")){
                    letra7.setText(letracerta7);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta8.equals("X")){
                if (letra8.getText().toString().equals("__")){
                    letra8.setText(letracerta8);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta9.equals("X")){
                if (letra9.getText().toString().equals("__")){
                    letra9.setText(letracerta9);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta10.equals("X")){
                if (letra10.getText().toString().equals("__")){
                    letra10.setText(letracerta10);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta11.equals("X")){
                if (letra11.getText().toString().equals("__")){
                    letra11.setText(letracerta11);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta12.equals("X")){
                if (letra12.getText().toString().equals("__")){
                    letra12.setText(letracerta12);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta13.equals("X")){
                if (letra13.getText().toString().equals("__")){
                    letra13.setText(letracerta13);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta14.equals("X")){
                if (letra14.getText().toString().equals("__")){
                    letra14.setText(letracerta14);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta15.equals("X")){
                if (letra15.getText().toString().equals("__")){
                    letra15.setText(letracerta15);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta16.equals("X")){
                if (letra16.getText().toString().equals("__")){
                    letra16.setText(letracerta16);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta17.equals("X")){
                if (letra17.getText().toString().equals("__")){
                    letra17.setText(letracerta17);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta18.equals("X")){
                if (letra18.getText().toString().equals("__")){
                    letra18.setText(letracerta18);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta19.equals("X")){
                if (letra19.getText().toString().equals("__")){
                    letra19.setText(letracerta19);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta20.equals("X")){
                if (letra20.getText().toString().equals("__")){
                    letra20.setText(letracerta20);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta21.equals("X")){
                if (letra21.getText().toString().equals("__")){
                    letra21.setText(letracerta21);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta22.equals("X")){
                if (letra22.getText().toString().equals("__")){
                    letra22.setText(letracerta22);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta23.equals("X")){
                if (letra23.getText().toString().equals("__")){
                    letra23.setText(letracerta23);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta24.equals("X")){
                if (letra24.getText().toString().equals("__")){
                    letra24.setText(letracerta24);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta25.equals("X")){
                if (letra25.getText().toString().equals("__")){
                    letra25.setText(letracerta25);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (cont>0){
                verSentimento(1);
                calcularPontuação();
                verificarAcertos();
                button_x.setText("");
            }

        }
        if (num == 24){
            if (letracerta1.equals("Y")){
                if (letra1.getText().toString().equals("__")){                    letra1.setText(letracerta1);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta2.equals("Y")){
                if (letra2.getText().toString().equals("__")){                    letra2.setText(letracerta2);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta3.equals("Y")){
                if (letra3.getText().toString().equals("__")){                    letra3.setText(letracerta3);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta4.equals("Y")){
                if (letra4.getText().toString().equals("__")){                    letra4.setText(letracerta4);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta5.equals("Y")){
                if (letra5.getText().toString().equals("__")){                    letra5.setText(letracerta5);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta6.equals("Y")){
                if (letra6.getText().toString().equals("__")){
                    letra6.setText(letracerta6);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta7.equals("Y")){
                if (letra7.getText().toString().equals("__")){
                    letra7.setText(letracerta7);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta8.equals("Y")){
                if (letra8.getText().toString().equals("__")){
                    letra8.setText(letracerta8);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta9.equals("Y")){
                if (letra9.getText().toString().equals("__")){
                    letra9.setText(letracerta9);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta10.equals("Y")){
                if (letra10.getText().toString().equals("__")){
                    letra10.setText(letracerta10);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta11.equals("Y")){
                if (letra11.getText().toString().equals("__")){
                    letra11.setText(letracerta11);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta12.equals("Y")){
                if (letra12.getText().toString().equals("__")){
                    letra12.setText(letracerta12);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta13.equals("Y")){
                if (letra13.getText().toString().equals("__")){
                    letra13.setText(letracerta13);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta14.equals("Y")){
                if (letra14.getText().toString().equals("__")){
                    letra14.setText(letracerta14);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta15.equals("Y")){
                if (letra15.getText().toString().equals("__")){
                    letra15.setText(letracerta15);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta16.equals("Y")){
                if (letra16.getText().toString().equals("__")){
                    letra16.setText(letracerta16);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta17.equals("Y")){
                if (letra17.getText().toString().equals("__")){
                    letra17.setText(letracerta17);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta18.equals("Y")){
                if (letra18.getText().toString().equals("__")){
                    letra18.setText(letracerta18);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta19.equals("Y")){
                if (letra19.getText().toString().equals("__")){
                    letra19.setText(letracerta19);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta20.equals("Y")){
                if (letra20.getText().toString().equals("__")){
                    letra20.setText(letracerta20);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta21.equals("Y")){
                if (letra21.getText().toString().equals("__")){
                    letra21.setText(letracerta21);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta22.equals("Y")){
                if (letra22.getText().toString().equals("__")){
                    letra22.setText(letracerta22);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta23.equals("Y")){
                if (letra23.getText().toString().equals("__")){
                    letra23.setText(letracerta23);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta24.equals("Y")){
                if (letra24.getText().toString().equals("__")){
                    letra24.setText(letracerta24);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta25.equals("Y")){
                if (letra25.getText().toString().equals("__")){
                    letra25.setText(letracerta25);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (cont>0){
                verSentimento(1);
                calcularPontuação();
                verificarAcertos();
                button_y.setText("");
            }

        }
        if (num == 25){
            if (letracerta1.equals("W")){
                if (letra1.getText().toString().equals("__")){                    letra1.setText(letracerta1);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta2.equals("W")){
                if (letra2.getText().toString().equals("__")){                    letra2.setText(letracerta2);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta3.equals("W")){
                if (letra3.getText().toString().equals("__")){                    letra3.setText(letracerta3);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta4.equals("W")){
                if (letra4.getText().toString().equals("__")){                    letra4.setText(letracerta4);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta5.equals("W")){
                if (letra5.getText().toString().equals("__")){                    letra5.setText(letracerta5);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta6.equals("W")){
                if (letra6.getText().toString().equals("__")){
                    letra6.setText(letracerta6);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta7.equals("W")){
                if (letra7.getText().toString().equals("__")){
                    letra7.setText(letracerta7);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta8.equals("W")){
                if (letra8.getText().toString().equals("__")){
                    letra8.setText(letracerta8);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta9.equals("W")){
                if (letra9.getText().toString().equals("__")){
                    letra9.setText(letracerta9);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta10.equals("W")){
                if (letra10.getText().toString().equals("__")){
                    letra10.setText(letracerta10);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta11.equals("W")){
                if (letra11.getText().toString().equals("__")){
                    letra11.setText(letracerta11);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta12.equals("W")){
                if (letra12.getText().toString().equals("__")){
                    letra12.setText(letracerta12);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta13.equals("W")){
                if (letra13.getText().toString().equals("__")){
                    letra13.setText(letracerta13);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta14.equals("W")){
                if (letra14.getText().toString().equals("__")){
                    letra14.setText(letracerta14);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta15.equals("W")){
                if (letra15.getText().toString().equals("__")){
                    letra15.setText(letracerta15);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta16.equals("W")){
                if (letra16.getText().toString().equals("__")){
                    letra16.setText(letracerta16);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta17.equals("W")){
                if (letra17.getText().toString().equals("__")){
                    letra17.setText(letracerta17);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta18.equals("W")){
                if (letra18.getText().toString().equals("__")){
                    letra18.setText(letracerta18);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta19.equals("W")){
                if (letra19.getText().toString().equals("__")){
                    letra19.setText(letracerta19);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta20.equals("W")){
                if (letra20.getText().toString().equals("__")){
                    letra20.setText(letracerta20);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta21.equals("W")){
                if (letra21.getText().toString().equals("__")){
                    letra21.setText(letracerta21);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta22.equals("W")){
                if (letra22.getText().toString().equals("__")){
                    letra22.setText(letracerta22);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta23.equals("W")){
                if (letra23.getText().toString().equals("__")){
                    letra23.setText(letracerta23);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta24.equals("W")){
                if (letra24.getText().toString().equals("__")){
                    letra24.setText(letracerta24);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta25.equals("W")){
                if (letra25.getText().toString().equals("__")){
                    letra25.setText(letracerta25);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (cont>0){
                verSentimento(1);
                calcularPontuação();
                verificarAcertos();
                button_w.setText("");
            }

        }
        if (num == 26){
            if (letracerta1.equals("Z")){
                if (letra1.getText().toString().equals("__")){                    letra1.setText(letracerta1);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta2.equals("Z")){
                if (letra2.getText().toString().equals("__")){                    letra2.setText(letracerta2);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta3.equals("Z")){
                if (letra3.getText().toString().equals("__")){                    letra3.setText(letracerta3);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta4.equals("Z")){
                if (letra4.getText().toString().equals("__")){                    letra4.setText(letracerta4);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }
            }
            if (letracerta5.equals("Z")){
                if (letra5.getText().toString().equals("__")){                    letra5.setText(letracerta5);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta6.equals("Z")){
                if (letra6.getText().toString().equals("__")){
                    letra6.setText(letracerta6);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta7.equals("Z")){
                if (letra7.getText().toString().equals("__")){
                    letra7.setText(letracerta7);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta8.equals("Z")){
                if (letra8.getText().toString().equals("__")){
                    letra8.setText(letracerta8);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta9.equals("Z")){
                if (letra9.getText().toString().equals("__")){
                    letra9.setText(letracerta9);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta10.equals("Z")){
                if (letra10.getText().toString().equals("__")){
                    letra10.setText(letracerta10);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta11.equals("Z")){
                if (letra11.getText().toString().equals("__")){
                    letra11.setText(letracerta11);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta12.equals("Z")){
                if (letra12.getText().toString().equals("__")){
                    letra12.setText(letracerta12);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta13.equals("Z")){
                if (letra13.getText().toString().equals("__")){
                    letra13.setText(letracerta13);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta14.equals("Z")){
                if (letra14.getText().toString().equals("__")){
                    letra14.setText(letracerta14);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta15.equals("Z")){
                if (letra15.getText().toString().equals("__")){
                    letra15.setText(letracerta15);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta16.equals("Z")){
                if (letra16.getText().toString().equals("__")){
                    letra16.setText(letracerta16);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta17.equals("Z")){
                if (letra17.getText().toString().equals("__")){
                    letra17.setText(letracerta17);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta18.equals("Z")){
                if (letra18.getText().toString().equals("__")){
                    letra18.setText(letracerta18);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta19.equals("Z")){
                if (letra19.getText().toString().equals("__")){
                    letra19.setText(letracerta19);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta20.equals("Z")){
                if (letra20.getText().toString().equals("__")){
                    letra20.setText(letracerta20);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta21.equals("Z")){
                if (letra21.getText().toString().equals("__")){
                    letra21.setText(letracerta21);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta22.equals("Z")){
                if (letra22.getText().toString().equals("__")){
                    letra22.setText(letracerta22);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta23.equals("Z")){
                if (letra23.getText().toString().equals("__")){
                    letra23.setText(letracerta23);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta24.equals("Z")){
                if (letra24.getText().toString().equals("__")){
                    letra24.setText(letracerta24);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (letracerta25.equals("Z")){
                if (letra25.getText().toString().equals("__")){
                    letra25.setText(letracerta25);
                    acertos = acertos + 1;
                    cont ++;
                    cont_revelar++;
                }

            }
            if (cont>0){
                verSentimento(1);
                calcularPontuação();
                verificarAcertos();
                button_z.setText("");
            }

        }
    }

    public void finish(){
        AlertDialog.Builder alerta = new AlertDialog.Builder(  TelaJogoForcaConfiabilidade.this);
        alerta.setMessage("Tem certeza que gostaria de abandonar o jogo?");
        alerta.setCancelable(false);
        alerta.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        alerta.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(  TelaJogoForcaConfiabilidade.this, TelaMenu.class);
                startActivity(intent);
            }
        });
        alerta.show();
    }
}

