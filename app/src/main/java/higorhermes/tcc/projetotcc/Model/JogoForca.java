package higorhermes.tcc.projetotcc.Model;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by higor on 14/09/18.
 */

public class JogoForca extends RealmObject implements Serializable {
    @PrimaryKey
    private int id;
    private int acerto, erro;
    public JogoForca() {

    }

    public JogoForca(int id, int acerto, int erro) {
        this.id = id;
        this.acerto = acerto;
        this.erro = erro;
    }

    public JogoForca(int id) {
        this.id = id;
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
