package higorhermes.tcc.projetotcc.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

import higorhermes.tcc.projetotcc.R;

public class TelaAcerto extends AppCompatActivity {
    private Toolbar myToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_acerto);
        myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        myToolbar.setTitle("Características de Qualidade");
    }
}
