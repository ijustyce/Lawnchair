package ch.deletescape.lawnchair;

import android.app.Application;
import android.content.Context;

import ch.deletescape.lawnchair.preferences.PreferenceImpl;
import ch.deletescape.lawnchair.preferences.PreferenceProvider;
import ch.deletescape.lawnchair.util.LocaleUtils;

public class App extends Application {

     @Override
    public void onCreate() {
        super.onCreate();

        PreferenceProvider.INSTANCE.init(new PreferenceImpl(this));
    }
}
