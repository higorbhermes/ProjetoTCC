package higorhermes.tcc.projetotcc.View;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import higorhermes.tcc.projetotcc.Model.Ajustes;
import higorhermes.tcc.projetotcc.Model.JogoForca;
import higorhermes.tcc.projetotcc.R;
import io.realm.Realm;

public class TelaAjustes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_ajustes);
        Button button_som = (Button) findViewById(R.id.button_som);
        button_som.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Realm realm = Realm.getDefaultInstance();
                Ajustes aj = realm.where(Ajustes.class).equalTo("id", 1).findFirst();
                if (aj.getSom() == 1){
                    String msg = "Som Desativado";
                    AlertDialog.Builder dlg = new AlertDialog.Builder(TelaAjustes.this);
                    dlg.setMessage(msg);
                    dlg.setNeutralButton("OK", null);
                    dlg.show();
                    realm.beginTransaction();
                    aj.setSom(0);
                    realm.copyToRealm(aj);
                    realm.commitTransaction();
                }
                else{
                    String msg = "Som Ativado";
                    AlertDialog.Builder dlg = new AlertDialog.Builder(TelaAjustes.this);
                    dlg.setMessage(msg);
                    dlg.setNeutralButton("OK", null);
                    dlg.show();
                    realm.beginTransaction();
                    aj.setSom(1);
                    realm.copyToRealm(aj);
                    realm.commitTransaction();
                }
            }
        });
    }
}
