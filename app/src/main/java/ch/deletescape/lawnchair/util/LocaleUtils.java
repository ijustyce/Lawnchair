package ch.deletescape.lawnchair.util;

import android.content.Context;
import android.content.res.Configuration;

import java.util.Locale;

public class LocaleUtils {

    public static void updateConfig(Context mContext, String sLocale) {
        Locale locale = new Locale(sLocale);
        Locale.setDefault(locale);
        Configuration config = mContext.getResources().getConfiguration();
        config.locale = locale;
        mContext.getResources().updateConfiguration(config,
                mContext.getResources().getDisplayMetrics());
    }
}
