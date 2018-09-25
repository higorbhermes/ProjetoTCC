package higorhermes.tcc.projetotcc.View;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import java.io.Serializable;
import java.util.Random;

import higorhermes.tcc.projetotcc.Model.JogoForca;
import higorhermes.tcc.projetotcc.R;
import io.realm.Realm;

public class TelaFiltro extends AppCompatActivity implements Serializable {
    final int tipo_jogo = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_filtro);
        adicionarForca();
        Button button_play = (Button) findViewById(R.id.button_play);
        button_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JogoForca jForca;
                final RadioButton rb_semFiltro = (RadioButton) findViewById(R.id.rb_semFiltro);
                final RadioButton rb_nãoRespondidas = (RadioButton) findViewById(R.id.rb_nãoRespondidas);
                final RadioButton rb_Respondidas = (RadioButton) findViewById(R.id.rb_Respondidas);
                final RadioButton rb_Erradas = (RadioButton) findViewById(R.id.rb_Erradas);
                final RadioButton rb_Certas = (RadioButton) findViewById(R.id.rb_Certas);
                if((rb_semFiltro.isChecked()==false)&&(rb_nãoRespondidas.isChecked()==false)&&(rb_Respondidas.isChecked()==false)&&(rb_Erradas.isChecked()==false)&&(rb_Certas.isChecked()==false)){
                    String msg = "Selecione um filtro";
                    AlertDialog.Builder dlg = new AlertDialog.Builder(TelaFiltro.this);
                    dlg.setMessage(msg);
                    dlg.setNeutralButton("OK", null);
                    dlg.show();
                }
                else{
                    if (tipo_jogo == 1){
                            int[] partidas = new int[35];
                            JogoForca[] partidasComId = new JogoForca[35];
                            if (rb_semFiltro.isChecked()==true){
                                int i = 1;
                                while(i<35){
                                    Random gerador = new Random();
                                    int num = gerador.nextInt(35);
                                    int j = 1;
                                    int k = 0;
                                    while (j<35){
                                       if (partidas[j] == num){
                                           k = 1;
                                       }
                                       j++;
                                    }
                                    if (k == 0){
                                        partidas[i] = num;
                                        i++;
                                    }
                                }
                                i = 0;
                                while(i<35){
                                    if (partidas[i] == 1){
                                        partidasComId[i] = new JogoForca(201);
                                    }
                                    if (partidas[i] == 2){
                                        partidasComId[i] = new JogoForca(202);
                                    }
                                    if (partidas[i] == 3){
                                        partidasComId[i] = new JogoForca(203);
                                    }
                                    if (partidas[i] == 4){
                                        partidasComId[i] = new JogoForca(204);
                                    }
                                    if (partidas[i] == 5){
                                        partidasComId[i] = new JogoForca(205);
                                    }
                                    if (partidas[i] == 6){
                                        partidasComId[i] = new JogoForca(206);
                                    }
                                    if (partidas[i] == 7){
                                        partidasComId[i] = new JogoForca(207);
                                    }
                                    if (partidas[i] == 8){
                                        partidasComId[i] = new JogoForca(208);
                                    }
                                    if (partidas[i] == 9){
                                        partidasComId[i] = new JogoForca(209);
                                    }
                                    if (partidas[i] == 10){
                                        partidasComId[i] = new JogoForca(210);
                                    }
                                    if (partidas[i] == 11){
                                        partidasComId[i] = new JogoForca(211);
                                    }
                                    if (partidas[i] == 12){
                                        partidasComId[i] = new JogoForca(212);
                                    }
                                    if (partidas[i] == 13){
                                        partidasComId[i] = new JogoForca(213);
                                    }
                                    if (partidas[i] == 14){
                                        partidasComId[i] = new JogoForca(214);
                                    }
                                    if (partidas[i] == 15){
                                        partidasComId[i] = new JogoForca(215);
                                    }
                                    if (partidas[i] == 16){
                                        partidasComId[i] = new JogoForca(216);
                                    }
                                    if (partidas[i] == 17){
                                        partidasComId[i] = new JogoForca(217);
                                    }
                                    if (partidas[i] == 18){
                                        partidasComId[i] = new JogoForca(218);
                                    }
                                    if (partidas[i] == 19){
                                        partidasComId[i] = new JogoForca(219);
                                    }
                                    if (partidas[i] == 20){
                                        partidasComId[i] = new JogoForca(220);
                                    }
                                    if (partidas[i] == 21){
                                        partidasComId[i] = new JogoForca(221);
                                    }
                                    if (partidas[i] == 22){
                                        partidasComId[i] = new JogoForca(222);
                                    }
                                    if (partidas[i] == 23){
                                        partidasComId[i] = new JogoForca(223);
                                    }
                                    if (partidas[i] == 24){
                                        partidasComId[i] = new JogoForca(224);
                                    }
                                    if (partidas[i] == 25){
                                        partidasComId[i] = new JogoForca(225);
                                    }
                                    if (partidas[i] == 26){
                                        partidasComId[i] = new JogoForca(226);
                                    }
                                    if (partidas[i] == 27){
                                        partidasComId[i] = new JogoForca(227);
                                    }
                                    if (partidas[i] == 28){
                                        partidasComId[i] = new JogoForca(228);
                                    }
                                    if (partidas[i] == 29){
                                        partidasComId[i] = new JogoForca(229);
                                    }
                                    if (partidas[i] == 30){
                                        partidasComId[i] = new JogoForca(230);
                                    }
                                    if (partidas[i] == 31){
                                        partidasComId[i] = new JogoForca(231);
                                    }
                                    if (partidas[i] == 32){
                                        partidasComId[i] = new JogoForca(232);
                                    }
                                    if (partidas[i] == 33){
                                        partidasComId[i] = new JogoForca(233);
                                    }
                                    if (partidas[i] == 34){
                                        partidasComId[i] = new JogoForca(234);
                                    }
                                    i++;
                                }
                                if (partidas[1] == 1){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 201);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForca.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 2){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 202);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAcessibilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 3){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 203);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAdaptabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 4){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 204);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAdequabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 5){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 205);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAdequacaoFuncional.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 6){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 206);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAnalisabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 7){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 207);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAprendizagem.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 8){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 208);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAutenticidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 9){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 209);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaCapacidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 10){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 210);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaCoexistencia.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 11){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 211);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaCompatibilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 12){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 212);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaCompletudeFuncional.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 13){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 213);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaComportamentoNoTempo.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 14){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 214);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaConfiabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 15){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 215);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaCorrecaoFuncional.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 16){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 216);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaDisponibilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 17){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 217);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaEficienciaDeDesempenho.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 18){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 218);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaEsteticaDaInterface.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 19){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 219);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaInstalabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 20){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 220);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaIntegridade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 21){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 221);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaManutencao.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 22){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 222);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaMaturidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 23){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 223);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaModificabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 24){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 224);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaModularidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 25){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 225);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaNaoRepudio.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 26){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 226);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaOperabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 27){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 227);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaPortabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 28){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 228);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaPrestacaoDeContas.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 29){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 229);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaProtecaoContraErros.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 30){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 230);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaReplacibilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 31){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 231);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaReutilizacao.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 32){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 232);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaTestabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 33){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 233);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaUsabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidas[1] == 34){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 234);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaUtilizacaoDeRecursos.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                            }
                            if (rb_nãoRespondidas.isChecked()==true){
                                int cont = 1;
                                Realm realm = Realm.getDefaultInstance();
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 201).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(201);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 202).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(202);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 203).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(203);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 204).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(204);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 205).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(205);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 206).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(206);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 207).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(207);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 208).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(208);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 209).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(209);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 210).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(210);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 211).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(211);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 212).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(212);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 213).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(213);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 214).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(214);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 215).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(215);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 216).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(216);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 217).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(217);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 218).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(218);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 219).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(219);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 220).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(220);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 221).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(221);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 222).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(222);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 223).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(223);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 224).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(224);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 225).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(225);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 226).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(226);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 227).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(227);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 228).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(228);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 229).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(229);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 230).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(230);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 231).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(231);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 232).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(232);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 233).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(233);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 234).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidasComId[cont] = new JogoForca(234);
                                    cont++;
                                }
                                if (cont == 1){
                                    String msg = "Você já respondeu todos os desafios!";
                                    AlertDialog.Builder dlg = new AlertDialog.Builder(TelaFiltro.this);
                                    dlg.setMessage(msg);
                                    dlg.setNeutralButton("OK", null);
                                    dlg.show();
                                }
                                else{
                                if (partidasComId[1].getId() == 201){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 201);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForca.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 202){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 202);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAcessibilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 203){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 203);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAdaptabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 204){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 204);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAdequabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 205){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 205);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAdequacaoFuncional.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 206){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 206);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAnalisabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 207){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 207);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAprendizagem.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 208){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 208);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAutenticidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 209){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 209);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaCapacidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 210){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 210);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaCoexistencia.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 211){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 211);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaCompatibilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 212){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 212);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaCompletudeFuncional.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 213){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 213);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaComportamentoNoTempo.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 214){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 214);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaConfiabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 215){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 215);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaCorrecaoFuncional.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 216){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 216);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaDisponibilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 217){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 217);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaEficienciaDeDesempenho.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 218){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 218);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaEsteticaDaInterface.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 219){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 219);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaInstalabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 220){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 220);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaIntegridade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 221){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 221);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaManutencao.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 222){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 222);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaMaturidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 223){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 223);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaModificabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 224){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 224);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaModularidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 225){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 225);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaNaoRepudio.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 226){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 226);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaOperabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 227){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 227);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaPortabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 228){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 228);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaPrestacaoDeContas.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 229){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 229);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaProtecaoContraErros.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 230){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 230);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaReplacibilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 231){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 231);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaReutilizacao.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 232){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 232);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaTestabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 233){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 233);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaUsabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 234){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 234);
                                    bundle.putInt("filtro", 1);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaUtilizacaoDeRecursos.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                            }

                            }
                            if (rb_Respondidas.isChecked()==true) {
                                int cont = 1;
                                Realm realm = Realm.getDefaultInstance();
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 201).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(201);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 202).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(202);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 203).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(203);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 204).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(204);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 205).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(205);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 206).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(206);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 207).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(207);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 208).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(208);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 209).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(209);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 210).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(210);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 211).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(211);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 212).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(212);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 213).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(213);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 214).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(214);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 215).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(215);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 216).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(216);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 217).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(217);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 218).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(218);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 219).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(219);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 220).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(220);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 221).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(221);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 222).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(222);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 223).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(223);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 224).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(224);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 225).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(225);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 226).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(226);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 227).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(227);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 228).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(228);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 229).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(229);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 230).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(230);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 231).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(231);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 232).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(232);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 233).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(233);
                                    cont++;
                                }
                                jForca = null;
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 234).findFirst();
                                if ((jForca.getAcerto() == 1) || (jForca.getErro() == 1)) {
                                    partidasComId[cont] = new JogoForca(234);
                                    cont++;
                                }
                                if (cont == 1) {
                                    String msg = "Você ainda não respondeu nenhum desafios!";
                                    AlertDialog.Builder dlg = new AlertDialog.Builder(TelaFiltro.this);
                                    dlg.setMessage(msg);
                                    dlg.setNeutralButton("OK", null);
                                    dlg.show();
                                }
                                else{
                                    if (partidasComId[1].getId() == 201) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 201);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForca.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 202) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 202);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAcessibilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 203) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 203);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAdaptabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 204) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 204);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAdequabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 205) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 205);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAdequacaoFuncional.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 206) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 206);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAnalisabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 207) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 207);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAprendizagem.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 208) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 208);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAutenticidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 209) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 209);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaCapacidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 210) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 210);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaCoexistencia.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 211) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 211);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaCompatibilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 212) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 212);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaCompletudeFuncional.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 213) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 213);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaComportamentoNoTempo.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 214) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 214);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaConfiabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 215) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 215);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaCorrecaoFuncional.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 216) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 216);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaDisponibilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 217) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 217);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaEficienciaDeDesempenho.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 218) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 218);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaEsteticaDaInterface.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 219) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 219);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaInstalabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 220) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 220);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaIntegridade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 221) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 221);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaManutencao.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 222) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 222);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaMaturidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 223) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 223);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaModificabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 224) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 224);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaModularidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 225) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 225);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaNaoRepudio.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 226) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 226);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaOperabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 227) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 227);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaPortabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 228) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 228);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaPrestacaoDeContas.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 229) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 229);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaProtecaoContraErros.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 230) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 230);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaReplacibilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 231) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 231);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaReutilizacao.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 232) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 232);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaTestabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 233) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 233);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaUsabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 234) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 234);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaUtilizacaoDeRecursos.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                            }

                            }
                            if (rb_Certas.isChecked()==true){
                                int cont = 1;
                                Realm realm = Realm.getDefaultInstance();
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 201).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(201);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 202).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(202);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 203).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(203);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 204).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(204);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 205).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(205);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 206).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(206);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 207).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(207);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 208).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(208);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 209).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(209);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 210).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(210);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 211).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(211);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 212).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(212);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 213).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(213);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 214).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(214);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 215).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(215);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 216).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(216);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 217).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(217);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 218).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(218);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 219).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(219);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 220).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(220);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 221).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(221);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 222).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(222);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 223).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(223);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 224).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(224);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 225).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(225);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 226).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(226);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 227).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(227);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 228).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(228);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 229).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(229);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 230).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(230);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 231).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(231);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 232).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(232);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 233).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(233);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 234).findFirst();
                                if ((jForca.getAcerto() == 1)){
                                    partidasComId[cont] = new JogoForca(234);
                                    cont++;
                                }
                                if (cont == 1){
                                    String msg = "Você ainda não acertou nenhum desafio!";
                                    AlertDialog.Builder dlg = new AlertDialog.Builder(TelaFiltro.this);
                                    dlg.setMessage(msg);
                                    dlg.setNeutralButton("OK", null);
                                    dlg.show();
                                }
                                else {
                                    if (partidasComId[1].getId() == 201) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 201);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForca.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 202) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 202);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAcessibilidade.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 203) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 203);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAdaptabilidade.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 204) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 204);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAdequabilidade.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 205) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 205);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAdequacaoFuncional.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 206) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 206);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAnalisabilidade.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 207) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 207);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAprendizagem.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 208) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 208);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAutenticidade.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 209) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 209);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaCapacidade.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 210) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 210);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaCoexistencia.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 211) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 211);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaCompatibilidade.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 212) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 212);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaCompletudeFuncional.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 213) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 213);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaComportamentoNoTempo.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 214) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 214);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaConfiabilidade.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 215) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 215);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaCorrecaoFuncional.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 216) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 216);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaDisponibilidade.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 217) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 217);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaEficienciaDeDesempenho.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 218) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 218);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaEsteticaDaInterface.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 219) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 219);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaInstalabilidade.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 220) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 220);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaIntegridade.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 221) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 221);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaManutencao.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 222) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 222);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaMaturidade.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 223) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 223);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaModificabilidade.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 224) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 224);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaModularidade.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 225) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 225);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaNaoRepudio.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 226) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 226);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaOperabilidade.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 227) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 227);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaPortabilidade.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 228) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 228);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaPrestacaoDeContas.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 229) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 229);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaProtecaoContraErros.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 230) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 230);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaReplacibilidade.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 231) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 231);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaReutilizacao.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 232) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 232);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaTestabilidade.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 233) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 233);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaUsabilidade.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                    if (partidasComId[1].getId() == 234) {
                                        Bundle bundle = new Bundle();
                                        bundle.putInt("pont", 100);
                                        bundle.putInt("id", 234);
                                        bundle.putInt("filtro", 2);
                                        bundle.putInt("partidas_atuais", 1);
                                        bundle.putInt("contador_partidas", 1);
                                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaUtilizacaoDeRecursos.class);
                                        intent.putExtra("partidas", partidasComId);
                                        intent.putExtras(bundle);
                                        startActivity(intent);
                                    }
                                }
                            }
                            if (rb_Erradas.isChecked()==true){
                                int cont = 1;
                                Realm realm = Realm.getDefaultInstance();
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 201).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(201);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 202).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(202);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 203).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(203);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 204).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(204);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 205).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(205);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 206).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(206);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 207).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(207);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 208).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(208);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 209).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(209);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 210).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(210);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 211).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(211);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 212).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(212);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 213).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(213);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 214).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(214);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 215).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(215);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 216).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(216);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 217).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(217);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 218).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(218);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 219).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(219);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 220).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(220);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 221).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(221);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 222).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(222);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 223).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(223);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 224).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(224);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 225).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(225);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 226).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(226);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 227).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(227);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 228).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(228);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 229).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(229);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 230).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(230);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 231).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(231);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 232).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(232);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 233).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(233);
                                    cont++;
                                }
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 234).findFirst();
                                if ((jForca.getErro() == 1)){
                                    partidasComId[cont] = new JogoForca(234);
                                    cont++;
                                }
                                if (cont == 1){
                                    String msg = "Parabéns!!! Você ainda não errou nenhum desafio.";
                                    AlertDialog.Builder dlg = new AlertDialog.Builder(TelaFiltro.this);
                                    dlg.setMessage(msg);
                                    dlg.setNeutralButton("OK", null);
                                    dlg.show();
                                }
                                if (partidasComId[1].getId() == 201){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 201);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForca.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 202){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 202);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAcessibilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 203){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 203);
                                    bundle.putInt("filtro", 2);                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAdaptabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 204){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 204);
                                    bundle.putInt("filtro", 2);                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAdequabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 205){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 205);
                                    bundle.putInt("filtro", 2);                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAdequacaoFuncional.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 206){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 206);
                                    bundle.putInt("filtro", 2);                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAnalisabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 207){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 207);
                                    bundle.putInt("filtro", 2);                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAprendizagem.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 208){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 208);
                                    bundle.putInt("filtro", 2);                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAutenticidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 209){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 209);
                                    bundle.putInt("filtro", 2);                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaCapacidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 210){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 210);
                                    bundle.putInt("filtro", 2);                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaCoexistencia.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 211){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 211);
                                    bundle.putInt("filtro", 2);                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaCompatibilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 212){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 212);
                                    bundle.putInt("filtro", 2);                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaCompletudeFuncional.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 213){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 213);
                                    bundle.putInt("filtro", 2);                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaComportamentoNoTempo.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 214){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 214);
                                    bundle.putInt("filtro", 2);                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaConfiabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 215){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 215);
                                    bundle.putInt("filtro", 2);                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaCorrecaoFuncional.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 216){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 216);
                                    bundle.putInt("filtro", 2);                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaDisponibilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 217){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 217);
                                    bundle.putInt("filtro", 2);                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaEficienciaDeDesempenho.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 218){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 218);
                                    bundle.putInt("filtro", 2);                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaEsteticaDaInterface.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 219){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 219);
                                    bundle.putInt("filtro", 2);                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaInstalabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 220){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 220);
                                    bundle.putInt("filtro", 2);                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaIntegridade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 221){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 221);
                                    bundle.putInt("filtro", 2);                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaManutencao.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 222){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 222);
                                    bundle.putInt("filtro", 2);                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaMaturidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 223){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 223);
                                    bundle.putInt("filtro", 2);                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaModificabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 224){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 224);
                                    bundle.putInt("filtro", 2);                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaModularidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 225){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 225);
                                    bundle.putInt("filtro", 2);                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaNaoRepudio.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 226){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 226);
                                    bundle.putInt("filtro", 2);                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaOperabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 227){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 227);
                                    bundle.putInt("filtro", 2);                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaPortabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 228){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 228);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaPrestacaoDeContas.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 229){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 229);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaProtecaoContraErros.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 230){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 230);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaReplacibilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 231){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 231);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaReutilizacao.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 232){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 232);
                                    bundle.putInt("filtro", 2);                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaTestabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 233){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 233);
                                    bundle.putInt("filtro", 2);                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaUsabilidade.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                                if (partidasComId[1].getId() == 234){
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 234);
                                    bundle.putInt("filtro", 2);                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaUtilizacaoDeRecursos.class);
                                    intent.putExtra("partidas", partidasComId);
                                    intent.putExtras(bundle);
                                    startActivity(intent);
                                }
                            }

                    }
                }
            }
        });
    }

    public void adicionarForca(){
        JogoForca[] jogoForca = new JogoForca[50];
        jogoForca[0] = new JogoForca(201, 0, 0);
        jogoForca[1] = new JogoForca(202, 0, 0);
        jogoForca[2] = new JogoForca(203, 0, 0);
        jogoForca[3] = new JogoForca(204, 0, 0);
        jogoForca[4] = new JogoForca(205, 0, 0);
        jogoForca[5] = new JogoForca(206, 0, 0);
        jogoForca[6] = new JogoForca(207, 0, 0);
        jogoForca[7] = new JogoForca(208, 0, 0);
        jogoForca[8] = new JogoForca(209, 0, 0);
        jogoForca[9] = new JogoForca(210, 0, 0);
        jogoForca[10] = new JogoForca(211, 0, 0);
        jogoForca[11] = new JogoForca(212, 0, 0);
        jogoForca[12] = new JogoForca(213, 0, 0);
        jogoForca[13] = new JogoForca(214, 0, 0);
        jogoForca[14] = new JogoForca(215, 0, 0);
        jogoForca[15] = new JogoForca(216, 0, 0);
        jogoForca[16] = new JogoForca(217, 0, 0);
        jogoForca[17] = new JogoForca(218, 0, 0);
        jogoForca[18] = new JogoForca(219, 0, 0);
        jogoForca[19] = new JogoForca(220, 0, 0);
        jogoForca[20] = new JogoForca(221, 0, 0);
        jogoForca[21] = new JogoForca(222, 0, 0);
        jogoForca[22] = new JogoForca(223, 0, 0);
        jogoForca[23] = new JogoForca(224, 0, 0);
        jogoForca[24] = new JogoForca(225, 0, 0);
        jogoForca[25] = new JogoForca(226, 0, 0);
        jogoForca[26] = new JogoForca(227, 0, 0);
        jogoForca[27] = new JogoForca(228, 0, 0);
        jogoForca[28] = new JogoForca(229, 0, 0);
        jogoForca[29] = new JogoForca(230, 0, 0);
        jogoForca[30] = new JogoForca(231, 0, 0);
        jogoForca[31] = new JogoForca(232, 0, 0);
        jogoForca[32] = new JogoForca(233, 0, 0);
        jogoForca[33] = new JogoForca(234, 0, 0);
        jogoForca[34] = new JogoForca(235, 0, 0);
        jogoForca[35] = new JogoForca(236, 0, 0);
        jogoForca[36] = new JogoForca(237, 0, 0);
        jogoForca[37] = new JogoForca(238, 0, 0);
        jogoForca[38] = new JogoForca(239, 0, 0);
        jogoForca[39] = new JogoForca(240, 0, 0);
        jogoForca[40] = new JogoForca(241, 0, 0);
        jogoForca[41] = new JogoForca(242, 0, 0);
        jogoForca[42] = new JogoForca(243, 0, 0);
        jogoForca[43] = new JogoForca(244, 0, 0);
        jogoForca[44] = new JogoForca(245, 0, 0);
        jogoForca[45] = new JogoForca(246, 0, 0);
        jogoForca[46] = new JogoForca(247, 0, 0);
        jogoForca[47] = new JogoForca(248, 0, 0);
        jogoForca[48] = new JogoForca(249, 0, 0);
        jogoForca[49] = new JogoForca(250, 0, 0);
        int cont = 0, i=0;
        Realm realm = Realm.getDefaultInstance();
        while(i<50){
            JogoForca jForca = realm.where(JogoForca.class)
                    .equalTo("id",jogoForca[i].getId()).findFirst();
            if(jForca == null){
                   realm.beginTransaction();
                   realm.copyToRealm(jogoForca[i]);
                   realm.commitTransaction();
                   cont ++;
            }
            i++;
        }
    }

    public void ComeçarJogo(){
        JogoForca jForca;
        final RadioButton rb_semFiltro = (RadioButton) findViewById(R.id.rb_semFiltro);
        final RadioButton rb_nãoRespondidas = (RadioButton) findViewById(R.id.rb_nãoRespondidas);
        final RadioButton rb_Respondidas = (RadioButton) findViewById(R.id.rb_semFiltro);
        final RadioButton rb_Erradas = (RadioButton) findViewById(R.id.rb_Erradas);
        final RadioButton rb_Certas = (RadioButton) findViewById(R.id.rb_Certas);
        if((rb_semFiltro.isChecked()==false)&&(rb_nãoRespondidas.isChecked()==false)&&(rb_Respondidas.isChecked()==false)&&(rb_Erradas.isChecked()==false)&&(rb_Certas.isChecked()==false)){
            String msg = "Selecione um filtro";
            AlertDialog.Builder dlg = new AlertDialog.Builder(TelaFiltro.this);
            dlg.setMessage(msg);
            dlg.setNeutralButton("OK", null);
            dlg.show();
        }
        else{
            if (tipo_jogo == 1){
                if (rb_semFiltro.isChecked()==true){
                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForca.class);
                    startActivity(intent);
                }
                if (rb_nãoRespondidas.isChecked()==true){
                    Realm realm = Realm.getDefaultInstance();
                    jForca = realm.where(JogoForca.class)
                            .equalTo("id", 1).findFirst();
                    realm.close();
                    if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForca.class);
                        startActivity(intent);
                    }
                    else{
                        String msg = "Você já respondeu todos os desafios!";
                        AlertDialog.Builder dlg = new AlertDialog.Builder(TelaFiltro.this);
                        dlg.setMessage(msg);
                        dlg.setNeutralButton("OK", null);
                        dlg.show();
                    }
                }
                if (rb_Respondidas.isChecked()==true){
                    Realm realm = Realm.getDefaultInstance();
                    jForca = realm.where(JogoForca.class)
                            .equalTo("id", 1).findFirst();
                    realm.close();
                    if ((jForca.getAcerto() == 1)||(jForca.getErro() == 1)){
                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForca.class);
                        startActivity(intent);
                    }
                    else{
                        String msg = "Você ainda não respondeu nenhum desafio!";
                        AlertDialog.Builder dlg = new AlertDialog.Builder(TelaFiltro.this);
                        dlg.setMessage(msg);
                        dlg.setNeutralButton("OK", null);
                        dlg.show();
                    }
                }
                if (rb_Certas.isChecked()==true){
                    Realm realm = Realm.getDefaultInstance();
                    jForca = realm.where(JogoForca.class)
                            .equalTo("id", 1).findFirst();
                    realm.close();
                    if (jForca.getAcerto() == 1){
                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForca.class);
                        startActivity(intent);
                    }
                    else{
                        String msg = "Você ainda não respondeu ou não acertou nenhum desafio!";
                        AlertDialog.Builder dlg = new AlertDialog.Builder(TelaFiltro.this);
                        dlg.setMessage(msg);
                        dlg.setNeutralButton("OK", null);
                        dlg.show();
                    }
                }
                if (rb_Erradas.isChecked()==true){
                    Realm realm = Realm.getDefaultInstance();
                    jForca = realm.where(JogoForca.class)
                            .equalTo("id", 1).findFirst();
                    realm.close();
                    if (jForca.getErro() == 1){
                        Intent intent = new Intent(TelaFiltro.this, TelaJogoForca.class);
                        startActivity(intent);
                    }
                    else{
                        String msg = "Você não errou nenhum desafio!";
                        AlertDialog.Builder dlg = new AlertDialog.Builder(TelaFiltro.this);
                        dlg.setMessage(msg);
                        dlg.setNeutralButton("OK", null);
                        dlg.show();
                    }
                }
            }
        }
    }
}
