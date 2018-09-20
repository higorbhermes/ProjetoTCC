package higorhermes.tcc.projetotcc.View;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import java.io.Serializable;

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
                            JogoForca[] partidas = new JogoForca[50];
                            if (rb_semFiltro.isChecked()==true){
                                partidas[0] = new JogoForca(201);
                                Bundle bundle = new Bundle();
                                bundle.putInt("pont", 100);
                                bundle.putInt("id", 205);
                                bundle.putInt("filtro", 1);
                                bundle.putInt("partidas_atuais", 1);
                                bundle.putInt("contador_partidas", 1);
                                Intent intent = new Intent(TelaFiltro.this, TelaJogoForcaAcessibilidade.class);
                                intent.putExtra("partidas", partidas);
                                intent.putExtras(bundle);
                                startActivity(intent);
                            }
                            if (rb_nãoRespondidas.isChecked()==true){
                                Realm realm = Realm.getDefaultInstance();
                                jForca = realm.where(JogoForca.class)
                                        .equalTo("id", 201).findFirst();
                                if ((jForca.getAcerto() == 0)&&(jForca.getErro() == 0)){
                                    partidas[0] = new JogoForca(201);
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 201);
                                    bundle.putInt("filtro", 2);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForca.class);
                                    intent.putExtra("partidas", partidas);
                                    intent.putExtras(bundle);
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
                                        .equalTo("id", 201).findFirst();
                                if ((jForca.getAcerto() == 1)||(jForca.getErro() == 1)){
                                    partidas[0] = new JogoForca(201);
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 201);
                                    bundle.putInt("filtro", 3);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForca.class);
                                    intent.putExtra("partidas", partidas);
                                    intent.putExtras(bundle);
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
                                        .equalTo("id", 201).findFirst();
                                realm.close();
                                if (jForca.getAcerto() == 1){
                                    partidas[0] = new JogoForca(201);
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 201);
                                    bundle.putInt("filtro", 4);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForca.class);
                                    intent.putExtra("partidas", partidas);
                                    intent.putExtras(bundle);
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
                                        .equalTo("id", 201).findFirst();
                                realm.close();
                                if (jForca.getErro() == 1){
                                    partidas[0] = new JogoForca(201);
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("pont", 100);
                                    bundle.putInt("id", 201);
                                    bundle.putInt("filtro", 5);
                                    bundle.putInt("partidas_atuais", 1);
                                    bundle.putInt("contador_partidas", 1);
                                    Intent intent = new Intent(TelaFiltro.this, TelaJogoForca.class);
                                    intent.putExtra("partidas", partidas);
                                    intent.putExtras(bundle);
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
