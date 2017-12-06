package com.example.kanayabuno.chromecast;

import android.content.Context;

import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.OptionsProvider;
import com.google.android.gms.cast.framework.SessionProvider;

import java.util.List;

/**
 * Created by kanayabuno on 11/13/17.
 */

class CastOptionsProvider implements OptionsProvider {

    public static final String CUSTOM_NAMESPACE = "urn:x-cast:custom_namespace";

    @Override
    public CastOptions getCastOptions(Context appContext) {

        return new CastOptions.Builder()
                .setReceiverApplicationId(appContext.getString(R.string.app_id))
                .build();
    }
    @Override
    public List<SessionProvider> getAdditionalSessionProviders(Context context) {
        return null;
    }
}
