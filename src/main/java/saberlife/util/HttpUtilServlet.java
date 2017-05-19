package saberlife.util;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by baiyang
 * Email: 1419408386@qq.com
 * Creation time : 2017/5/19
 * If you don't konw it,Please ask Google
 */
public class HttpUtilServlet {
    public String HttpUtilServletDoGET(String url) throws Exception{
        URL obj = new URL(url);
        HttpURLConnection connection = (HttpURLConnection)obj.openConnection();
        connection.setRequestMethod("GET");
        int responseCode = connection.getResponseCode();
        System.out.println("请求地址是："+url);
        System.out.println("请求结果是: "+responseCode);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        return response.toString();
    }
    public void HttpUtilServletDoPost(){

    }
}
