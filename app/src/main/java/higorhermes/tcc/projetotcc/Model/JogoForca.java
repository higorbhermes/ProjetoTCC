package higorhermes.tcc.projetotcc.Model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by higor on 14/09/18.
 */

public class JogoForca extends RealmObject {
    @PrimaryKey
    private int id, acerto, erro;
    public JogoForca() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAcerto() {
        return acerto;
    }

    public void setAcerto(int acerto) {
        this.acerto = acerto;
    }

    public int getErro() {
        return erro;
    }

    public void setErro(int erro) {
        this.erro = erro;
    }
}
