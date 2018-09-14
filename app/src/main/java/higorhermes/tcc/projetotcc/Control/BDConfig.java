package higorhermes.tcc.projetotcc.Control;
import android.app.Application;
import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by higor on 14/09/18.
 */

public class BDConfig extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(getApplicationContext());
        RealmConfiguration.Builder builder = new RealmConfiguration.Builder();
        builder.name("qualif.realm");
        builder.schemaVersion(0);
        builder.deleteRealmIfMigrationNeeded();
        RealmConfiguration realmConfiguration = builder.build();
        Realm.setDefaultConfiguration(realmConfiguration);
    }
}


