package scijoker.nptracker.app;

import android.app.Application;

import ablack13.npsdk.NovaPoshtaSDK;
import scijoker.nptracker.net.ApiConstants;


/**
 * Created by scijoker on 15.10.16.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        NovaPoshtaSDK.setup(ApiConstants.API_KEY, true);
    }
}
