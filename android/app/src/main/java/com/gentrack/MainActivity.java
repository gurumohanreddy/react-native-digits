package com.gentrack;

import android.os.Bundle;

import com.digits.sdk.android.Digits;
import com.facebook.react.ReactActivity;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterCore;

import io.fabric.sdk.android.Fabric;

public class MainActivity extends ReactActivity {

    private static final String TWITTER_KEY = "UjcKPO7Hgyl3GBcc9xIU0mQfi";
    private static final String TWITTER_SECRET = "aspZc1v1BtiV0y9IvVSB3UhMnmR1hG5GL0C4fiEAj2R9NQEugN";

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "GenTrack";
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new TwitterCore(authConfig), new Digits());

    }
}
