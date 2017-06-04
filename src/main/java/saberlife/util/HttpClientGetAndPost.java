package saberlife.util;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by baiyang
 * Email: 1419408386@qq.com
 * Creation time : 2017-06-03
 * If you don't konw it,Please ask Google
 */
public class HttpClientGetAndPost {
    public String httpClientGet(String url){
        String message = null;
        HttpClient client = HttpClients.createDefault();
        HttpGet get = new HttpGet(url);
        try {
            HttpResponse response = client.execute(get);
            System.out.println(response.toString());
            HttpEntity entity = response.getEntity();
            message = EntityUtils.toString(entity,"UTF-8");

        } catch (IOException e) {
            e.printStackTrace();
        }
        return message;
    }
    public String httpClientPost(String url,Map<String,String> map){
        String message = null;
        HttpClient client = HttpClients.createDefault();
        HttpPost post = new HttpPost(url);
        try {
            List<BasicNameValuePair> list = new ArrayList<BasicNameValuePair>();
            map = new HashMap<String, String>();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                list.add(new BasicNameValuePair(entry.getKey(),entry.getValue()));
            }
            post.setEntity(new UrlEncodedFormEntity(list,"UTF-8"));
            HttpResponse response = client.execute(post);
            System.out.println(response.toString());
            HttpEntity entity = response.getEntity();
            message = EntityUtils.toString(entity,"UTF-8");

        } catch (IOException e) {
            e.printStackTrace();
        }
        return message;
    }
}
