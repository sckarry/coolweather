package com.example.sc.coolweather.util;

import android.app.DownloadManager;

/**
 * Created by sc on 2017/12/4.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        okHttpClient client=new OkHttpClient();
        DownloadManager.Request request =new DownloadManager.Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

    }
}
