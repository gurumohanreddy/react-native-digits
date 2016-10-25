package com.gentrack;

import android.app.Application;
import android.os.Bundle;
import android.util.Log;

import com.digits.sdk.android.Digits;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;

import java.util.Arrays;
import java.util.List;

import com.proxima.RCTDigits.DigitsPackage;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterCore;

import io.fabric.sdk.android.Fabric;

public class MainApplication extends Application implements ReactApplication {
  // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
  private static final String TWITTER_KEY = "UjcKPO7Hgyl3GBcc9xIU0mQfi";
  private static final String TWITTER_SECRET = "aspZc1v1BtiV0y9IvVSB3UhMnmR1hG5GL0C4fiEAj2R9NQEugN";

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    protected boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
          new DigitsPackage()   
      );
    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//      super.onCreate(savedInstanceState);
//      TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
//      Fabric.with(getApplicationContext(), new TwitterCore(authConfig), new Digits.Builder().build());
//
//    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
      return mReactNativeHost;
  }
}
