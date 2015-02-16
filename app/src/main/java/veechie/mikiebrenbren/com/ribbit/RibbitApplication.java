package veechie.mikiebrenbren.com.ribbit;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by michaelbrennan on 2/16/15.
 */
public class RibbitApplication extends Application{

    @Override
    public void onCreate(){
        // Enable Local Datastore.
        super.onCreate();
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "1d0WtednLFp3YQpwqi2bjipR3Rdv4wTLOsKbC7cq", "TMNBIAefIj7oIvo8gi8LlOO6naLrUhC2Oa3ZATFo");

    }
}
