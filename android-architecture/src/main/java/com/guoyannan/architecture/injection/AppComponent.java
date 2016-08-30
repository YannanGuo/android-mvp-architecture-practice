package com.guoyannan.architecture.injection;

import android.content.Context;

import com.guoyannan.architecture.App;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    Context getAppContext();

    App getApp();
}