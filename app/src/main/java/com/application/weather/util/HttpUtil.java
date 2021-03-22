package com.application.weather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @author wangrui
 * @date 2021/3/22 15:42
 *
 * 从服务器端获取省市县的数据
 * 发起一个Http请求只需要调用sendOkHttpRequest()方法，传入请求地址，
 * 并注册一个回调来处理服务器响应
 */
public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

}
