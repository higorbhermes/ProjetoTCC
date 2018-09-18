package higorhermes.tcc.projetotcc.Model;

import java.io.Serializable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by higor on 17/09/18.
 */

public class Ajustes extends RealmObject implements Serializable {
    @PrimaryKey

    int id;
    int som, num_desafios;
    public Ajustes(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSom() {
        return som;
    }

    public void setSom(int som) {
        this.som = som;
    }

    public int getNum_desafios() {
        return num_desafios;
    }

    public void setNum_desafios(int num_desafios) {
        this.num_desafios = num_desafios;
    }
}

