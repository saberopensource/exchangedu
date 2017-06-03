package saberlife.util;


import org.junit.Test;

import java.io.*;
import java.net.*;

/**
 * Created by baiyang
 * Email: 1419408386@qq.com
 * Creation time : 2017/5/19
 * If you don't konw it,Please ask Google
 */
public class HttpUtilServlet {
    /**
     * GET 发起get请求
     * @param url
     * @return
     */
    public String HttpUtilServletDoGET(String url){
        URL obj = null;
        StringBuffer response = null;
        try {
            obj = new URL(url);
            URLConnection connection = obj.openConnection();
            connection.addRequestProperty("encoding","UTF-8");
            connection.setDoInput(true);
            connection.setDoOutput(true);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));
            String inputLine;
            response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
       return response.toString()+"调用Get请求";
    }

    /**
     * POST 发起请求post
     * @param url
     * @param param
     * @return
     */
    public String HttpUtilServletDoPost(String url,String param){

        URL obj = null;

        HttpURLConnection httpURLConnection = null;

        StringBuilder sb = null;
        try {
            obj = new URL(url);
            httpURLConnection = (HttpURLConnection) obj.openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);        // 设置该连接是可以输出的
            httpURLConnection.setRequestMethod("POST"); // 设置请求方式
            httpURLConnection.setRequestProperty("charset", "utf-8");
            PrintWriter pw = new PrintWriter(new BufferedOutputStream(httpURLConnection.getOutputStream()));
            pw.write(param);                   // 向连接中输出数据（相当于发送数据给服务器）
            pw.flush();
            pw.close();

            BufferedReader br = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(),"utf-8"));
            String line = null;
            sb = new StringBuilder();
            while ((line = br.readLine()) != null) {    // 读取数据
                sb.append(line + "\n");
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString()+"发起Post请求";
    }
}
