package jiun.com.panda.http;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2017/9/13.
 */

public class HttpUtils {
    private static HttpUtils utils;
        private OkHttpClient client;
        private HttpUtils(){
            client = new OkHttpClient();
        }
        public static synchronized HttpUtils getInstace(){
            if (utils == null){
                utils = new HttpUtils();
            }
            return utils;
        }
        public void get(String url, Callback callback){
            Request request = new Request.Builder().url(url).build();
            client.newCall(request).enqueue(callback);
        }
}
