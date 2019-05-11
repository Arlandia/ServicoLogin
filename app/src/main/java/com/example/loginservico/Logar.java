package com.example.loginservico;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class Logar extends Service {
    private final IBinder mBinder = new MyBinder();


    public class MyBinder extends Binder {
        Logar getService(){
            return Logar.this;

        }
    }

    @Override
    public IBinder onBind(Intent intent) {
       return mBinder;
    }
    public boolean validar (String login, String senha){
        if (login.equals("Arlandia")&& senha.equals("123456"))
            return true;
        return false;
    }
}
