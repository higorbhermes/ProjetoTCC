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

public class TelaJogoForcaCorrecaoFuncional extends AppCompatActivity {
    int pontos;
    int erro = 0;
    int acertos = 0;
    int numero_letras = 17;
    int eliminar_letra = 0;
    int revelar_letra = 0;
    int menu = 1;
    int filtro;
    int partida_atual;
    int contador_partidas;
    int id;
    JogoForca[] partidas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_jogo_forca_correcao_funcional);
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
        button_pontuacao.setBackgroundResource(R.drawable.escudo50pxbranco);
        button_menu.setBackgroundResource(R.drawable.menu40px);
        button_sentimento.setBackgroundResource(R.drawable.neutro50px);
        button_eliminar.setBackgroundResource(R.drawable.lixeira50px);
        button_dica.setBackgroundResource(R.drawable.lampada50px);
        button_revelar.setBackgroundResource(R.drawable.olho50px);
        button_caderno.setBackgroundResource(R.drawable.caderno50);
        button_desempenho.setBackgroundResource(R.drawable.desempenho40);
        button_ajustes.setBackgroundResource(R.drawable.ajustes40);
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
        final Button button_ver_resposta = (Button) findViewById(R.id.button_ver_resposta);
        Button button_proximo = (Button) findViewById(R.id.button_proximo);
        Button button_proximo_respostaerrada = (Button) findViewById(R.id.button_proximo_respostaerrada);
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
        final TextView letra15 = (TextView) findViewById(R.id.letra15);
        final TextView letra16 = (TextView) findViewById(R.id.letra16);
        final TextView letra17 = (TextView) findViewById(R.id.letra17);
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
                    AlertDialog.Builder dlg = new AlertDialog.Builder(  TelaJogoForcaCorrecaoFuncional.this);
                    dlg.setMessage(msg);
                    dlg.setNeutralButton("OK", null);
                    dlg.show();
                } else {
                    if (revelar_letra >= 3) {
                        String msg = "Essa ajuda só pode ser utilizada três vezes em cada desafio!";
                        AlertDialog.Builder dlg = new AlertDialog.Builder(TelaJogoForcaCorrecaoFuncional.this);
                        dlg.setMessage(msg);
                        dlg.setNeutralButton("OK", null);
                        dlg.show();
                    } else {
                       pontos = pontos - 60;
                        calcularPontuação();
                        verSentimento(1);
                        int i = 0;
                        Random gerador = new Random();
                        while (i == 0) {
                            int num = gerador.nextInt(19);
                            if (num == 1) {
                                if ((letra1.getText().toString()).equals("___")) {
                                    letra1.setText("C");
                                    letra6.setText("Ç");
                                    letra12.setText("C");
                                    i = 1;
                                    revelar_letra = revelar_letra + 1;
                                    button_c.setEnabled(false);
                                    button_c.setText("");
                                    acertos = acertos + 3;
                                    verificarAcertos();
                                }
                            }
                            if (num == 2) {
                                if ((letra2.getText().toString()).equals("___")) {
                                    letra2.setText("O");
                                    letra8.setText("O");
                                    letra14.setText("O");
                                    i = 1;
                                    revelar_letra = revelar_letra + 1;
                                    button_o.setEnabled(false);
                                    button_o.setText("");
                                    acertos = acertos + 3;
                                    verificarAcertos();
                                }
                            }
                            if (num == 3) {
                                if ((letra3.getText().toString()).equals("___")) {
                                    letra3.setText("R");
                                    letra4.setText("R");
                                    i = 1;
                                    revelar_letra = revelar_letra + 1;
                                    button_r.setEnabled(false);
                                    button_r.setText("");
                                    acertos = acertos + 2;
                                    verificarAcertos();
                                }
                            }
                            if (num == 5) {
                                if ((letra5.getText().toString()).equals("___")) {
                                    letra5.setText("E");
                                    i = 1;
                                    revelar_letra = revelar_letra + 1;
                                    button_e.setEnabled(false);
                                    button_e.setText("");
                                    acertos = acertos + 1;
                                    verificarAcertos();
                                }
                            }

                            if (num == 7) {
                                if ((letra7.getText().toString()).equals("___")) {
                                    letra7.setText("Ã");
                                    letra16.setText("A");
                                    i = 1;
                                    revelar_letra = revelar_letra + 1;
                                    button_a.setEnabled(false);
                                    button_a.setText("");
                                    acertos = acertos + 2;
                                    verificarAcertos();
                                }
                            }

                            if (num == 9) {
                                if ((letra9.getText().toString()).equals("___")) {
                                    letra9.setText("F");
                                    i = 1;
                                    revelar_letra = revelar_letra + 1;
                                    button_f.setEnabled(false);
                                    button_f.setText("");
                                    acertos = acertos + 1;
                                    verificarAcertos();
                                }
                            }

                            if (num == 10) {
                                if ((letra10.getText().toString()).equals("___")) {
                                    letra10.setText("U");
                                    i = 1;
                                    revelar_letra = revelar_letra + 1;
                                    button_u.setEnabled(false);
                                    button_u.setText("");
                                    acertos = acertos + 1;
                                    verificarAcertos();
                                }
                            }

                            if (num == 11) {
                                if ((letra11.getText().toString()).equals("___")) {
                                    letra11.setText("N");
                                    letra15.setText("N");
                                    i = 1;
                                    revelar_letra = revelar_letra + 1;
                                    button_n.setEnabled(false);
                                    button_n.setText("");
                                    acertos = acertos + 2;
                                    verificarAcertos();
                                }
                            }

                            if (num == 13) {
                                if ((letra13.getText().toString()).equals("___")) {
                                    letra13.setText("I");
                                    i = 1;
                                    revelar_letra = revelar_letra + 1;
                                    button_i.setEnabled(false);
                                    button_i.setText("");
                                    acertos = acertos + 1;
                                    verificarAcertos();
                                }
                            }

                            if (num == 17) {
                                if ((letra17.getText().toString()).equals("___")) {
                                    letra17.setText("L");
                                    i = 1;
                                    revelar_letra = revelar_letra + 1;
                                    button_l.setEnabled(false);
                                    button_l.setText("");
                                    acertos = acertos + 1;
                                    verificarAcertos();
                                }
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
                    AlertDialog.Builder dlg = new AlertDialog.Builder(TelaJogoForcaCorrecaoFuncional.this);
                    dlg.setMessage(msg);
                    dlg.setNeutralButton("OK", null);
                    dlg.show();
                } else {
                    pontos = pontos - 20;
                    calcularPontuação();
                    verSentimento(1);
                    String msg = "DICA:  Grau para o qual um produto ou sistema fornece os resultados corretos com o grau de precisão necessário.";
                    AlertDialog.Builder dlg = new AlertDialog.Builder(TelaJogoForcaCorrecaoFuncional.this);
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
                    AlertDialog.Builder dlg = new AlertDialog.Builder(TelaJogoForcaCorrecaoFuncional.this);
                    dlg.setMessage(msg);
                    dlg.setNeutralButton("OK", null);
                    dlg.show();
                } else {
                    if (eliminar_letra >= 3) {
                        String msg = "Essa ajuda só pode ser utilizada três vezes em cada desafio!";
                        AlertDialog.Builder dlg = new AlertDialog.Builder(TelaJogoForcaCorrecaoFuncional.this);
                        dlg.setMessage(msg);
                        dlg.setNeutralButton("OK", null);
                        dlg.show();
                    } else {
                        verSentimento(1);
                        pontos = pontos - 40;
                        calcularPontuação();
                        if (eliminar_letra == 0) {
                            button_w.setText("");
                            button_b.setText("");
                            button_z.setText("");
                            button_w.setEnabled(false);
                            button_b.setEnabled(false);
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
                            button_s.setText("");
                            button_h.setEnabled(false);
                            button_k.setEnabled(false);
                            button_s.setEnabled(false);
                        }
                        eliminar_letra = eliminar_letra + 1;
                    }
                }
            }
        });

        button_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letra7.setText("A");
                letra16.setText("A");
                button_a.setText("");
                button_a.setEnabled(false);
                acertos = acertos + 2;
                pontos = pontos + 20;
                calcularPontuação();
                verSentimento(2);
                verificarAcertos();
            }
        });

        button_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_b.setText("");
                erro = erro + 1;
                button_b.setEnabled(false);
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        });

        button_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letra1.setText("C");
                letra6.setText("Ç");
                letra12.setText("C");
                button_c.setText("");
                button_c.setEnabled(false);
                acertos = acertos + 3;
                pontos = pontos + 30;
                calcularPontuação();
                verSentimento(2);
                verificarAcertos();
            }
        });

        button_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_d.setText("");
                erro = erro + 1;
                button_d.setEnabled(false);
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        });

        button_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letra5.setText("E");
                button_e.setText("");
                acertos = acertos + 1;
                pontos = pontos + 10;
                calcularPontuação();
                button_e.setEnabled(false);
                verSentimento(2);
                verificarAcertos();
            }
        });

        button_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letra9.setText("F");
                button_f.setText("");
                button_f.setEnabled(false);
                acertos = acertos + 1;
                pontos = pontos + 10;
                calcularPontuação();
                verSentimento(2);
                verificarAcertos();
            }
        });

        button_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_g.setText("");
                erro = erro + 1;
                button_g.setEnabled(false);
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        });

        button_h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_h.setText("");
                button_h.setEnabled(false);
                erro = erro + 1;
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        });

        button_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letra13.setText("I");
                button_i.setText("");
                button_i.setEnabled(false);
                acertos = acertos + 1;
                pontos = pontos + 10;
                calcularPontuação();
                verSentimento(2);
                verificarAcertos();
            }
        });

        button_j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_j.setText("");
                button_j.setEnabled(false);
                erro = erro + 1;
                pontos = pontos - 10;
                mudarImagemForca();
                verSentimento(3);
                calcularPontuação();
            }
        });

        button_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_k.setText("");
                button_k.setEnabled(false);
                erro = erro + 1;
                pontos = pontos - 10;
                mudarImagemForca();
                verSentimento(3);
                calcularPontuação();
            }
        });

        button_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letra17.setText("L");
                button_l.setText("");
                button_l.setEnabled(false);
                acertos = acertos + 1;
                pontos = pontos + 20;
                calcularPontuação();
                verSentimento(2);
                verificarAcertos();
            }
        });

        button_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_m.setText("");
                button_m.setEnabled(false);
                erro = erro + 1;
                pontos = pontos - 10;
                mudarImagemForca();
                verSentimento(3);
                calcularPontuação();
            }
        });

        button_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letra11.setText("N");
                letra15.setText("N");
                button_n.setText("");
                button_n.setEnabled(false);
                acertos = acertos + 2;
                pontos = pontos + 20;
                calcularPontuação();
                verSentimento(2);
                verificarAcertos();
            }
        });

        button_o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letra2.setText("O");
                letra8.setText("O");
                letra14.setText("O");
                button_o.setText("");
                button_o.setEnabled(false);
                acertos = acertos + 3;
                pontos = pontos + 30;
                calcularPontuação();
                verSentimento(2);
                verificarAcertos();
            }
        });

        button_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_r.setText("");
                erro = erro + 1;
                pontos = pontos - 10;
                mudarImagemForca();
                button_r.setEnabled(false);
                verSentimento(3);
                calcularPontuação();
            }
        });

        button_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_q.setText("");
                erro = erro + 1;
                pontos = pontos - 10;
                mudarImagemForca();
                button_q.setEnabled(false);
                verSentimento(3);
                calcularPontuação();
            }
        });


        button_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letra3.setText("R");
                letra4.setText("R");
                button_r.setText("");
                button_r.setEnabled(false);
                acertos = acertos + 2;
                pontos = pontos + 20;
                calcularPontuação();
                verSentimento(2);
                verificarAcertos();
            }
        });

        button_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_s.setText("");
                erro = erro + 1;
                pontos = pontos - 10;
                mudarImagemForca();
                button_s.setEnabled(false);
                verSentimento(3);
                calcularPontuação();
            }
        });

        button_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_t.setText("");
                erro = erro + 1;
                pontos = pontos - 10;
                mudarImagemForca();
                button_t.setEnabled(false);
                verSentimento(3);
                calcularPontuação();
            }
        });

        button_u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letra10.setText("U");
                button_u.setText("");
                button_u.setEnabled(false);
                acertos = acertos + 1;
                pontos = pontos + 10;
                calcularPontuação();
                verSentimento(2);
                verificarAcertos();
            }
        });

        button_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_v.setText("");
                erro = erro + 1;
                pontos = pontos - 10;
                button_v.setEnabled(false);
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        });

        button_w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_w.setText("");
                erro = erro + 1;
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                button_w.setEnabled(false);
                mudarImagemForca();
            }
        });

        button_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_x.setText("");
                button_x.setEnabled(false);
                erro = erro + 1;
                pontos = pontos - 10;
                verSentimento(3);
                calcularPontuação();
                mudarImagemForca();
            }
        });

        button_y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_y.setText("");
                button_y.setEnabled(false);
                erro = erro + 1;
                pontos = pontos - 10;
                calcularPontuação();
                verSentimento(3);
                mudarImagemForca();
            }
        });

        button_z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button_z.setText("");
                button_z.setEnabled(false);
                erro = erro + 1;
                verSentimento(3);
                pontos = pontos - 10;
                calcularPontuação();
                mudarImagemForca();
            }
        });

        button_ver_resposta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letra1.setText("C");
                letra2.setText("O");
                letra3.setText("R");
                letra4.setText("R");
                letra5.setText("E");
                letra6.setText("Ç");
                letra7.setText("Ã");
                letra8.setText("O");
                letra9.setText("F");
                letra10.setText("U");
                letra11.setText("N");
                letra12.setText("C");
                letra13.setText("I");
                letra14.setText("O");
                letra15.setText("N");
                letra16.setText("A");
                letra17.setText("L");
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
                PopupMenu popupMenu = new PopupMenu(TelaJogoForcaCorrecaoFuncional.this, button_menu);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        String s = item.getTitle().toString();
                        if (s.equals("Caderno")) {
                            Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaCadernoCaracteristicasQualidade.class);
                            startActivity(intent);
                        }
                        if (s.equals("Desempenho")) {
                            Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaDesempenho.class);
                            startActivity(intent);
                        }
                        if (s.equals("Ajustes")) {
                            Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaAjustes.class);
                            startActivity(intent);
                        }
                        if (s.equals("Avaliar")) {
                            Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaAvaliacao.class);
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
        if (partidas[contador_partidas+1] == null){
            Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaFimDeJogo.class);
            startActivity(intent);
        }
        else{
            if (filtro == 1 ||  filtro == 2){
                if (partidas[contador_partidas+1].getId() == 201){
                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 201);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForca.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 202){
                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 202);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaAcessibilidade.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 203){
                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 203);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaAdaptabilidade.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 204){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 204);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaAdequabilidade.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 205){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 205);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaAdequacaoFuncional.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 206){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 206);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaAnalisabilidade.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 207){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 207);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaAprendizagem.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 208){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 208);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaAutenticidade.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 209){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 209);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaCapacidade.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 210){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 210);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaCoexistencia.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 211){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 211);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaCompatibilidade.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 212){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 212);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaCompletudeFuncional.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 213){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 213);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaComportamentoNoTempo.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 214){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 214);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaConfiabilidade.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 215){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 215);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaCorrecaoFuncional.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 216){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 216);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaDisponibilidade.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 217){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 217);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaEficienciaDeDesempenho.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 218){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 218);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaEsteticaDaInterface.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 219){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 219);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaInstalabilidade.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 220){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 220);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaIntegridade.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 221){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 221);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaManutencao.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 222){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 222);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaMaturidade.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 223){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 223);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaModificabilidade.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 224){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 224);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaModularidade.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 225){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 225);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaNaoRepudio.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 226){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 226);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaOperabilidade.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 227){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 227);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaPortabilidade.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 228){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 228);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaPrestacaoDeContas.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 229){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 229);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaProtecaoContraErros.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 30){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 230);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaReplacibilidade.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 31){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 231);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaReutilizacao.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 32){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 232);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaTestabilidade.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 33){

                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 233);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaUsabilidade.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                if (partidas[contador_partidas+1].getId() == 34){
                    Bundle bundle = new Bundle();
                    bundle.putInt("pont", pontos);
                    bundle.putInt("id", 234);
                    bundle.putInt("filtro", 1);
                    bundle.putInt("partidas_atuais", 1);
                    bundle.putInt("contador_partidas", contador_partidas+1);
                    Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaJogoForcaUtilizacaoDeRecursos.class);
                    intent.putExtra("partidas", partidas);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            }
        }
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


    public void finish(){
        AlertDialog.Builder alerta = new AlertDialog.Builder(TelaJogoForcaCorrecaoFuncional.this);
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
                Intent intent = new Intent(TelaJogoForcaCorrecaoFuncional.this, TelaMenu.class);
                startActivity(intent);
            }
        });
        alerta.show();
    }
}
