package com.t3k.fams.broadcastexample2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class NetworkChangedReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager
                .getActiveNetworkInfo();
        if(networkInfo!=null)
        {
            Toast.makeText(context, "Connected", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(context, "Network Changed!", Toast.LENGTH_SHORT).show();
        }
    }
}
