package saberlife.socket.a;

import java.io.*;
import java.net.Socket;
import java.nio.charset.Charset;

/**
 * Created by baiyang
 * Email: 1419408386@qq.com
 * Creation time : 2017-06-04
 * If you don't konw it,Please ask Google
 */
public class ChatSocket extends Thread {

    Socket socket;
    BufferedWriter bw;
    public ChatSocket(Socket socket) {
        this.socket = socket;
    }
    protected void out(String str){
        try {
            bw = new BufferedWriter(
                    new OutputStreamWriter(
                            socket.getOutputStream(), "UTF-8"));
//            System.out.println("当前JVM的默认字符集：" + Charset.defaultCharset());
            bw.write(str + "\n");
            bw.flush();
        }catch (UnsupportedEncodingException e){
            System.out.println("这是什么鬼");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("断开了一个客户端链接");
            try {
                bw.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            ChatManager.getChatManager().remove(this);
            e.printStackTrace();
        }
    }
    public void run() {
        out("你已经连接到本服务器了");
        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            socket.getInputStream(),"UTF-8"));
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                ChatManager.getChatManager().publish(this, line);
            }
            br.close();
            System.out.println("断开了一个客户端链接");
            ChatManager.getChatManager().remove(this);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("断开了一个客户端链接");
            ChatManager.getChatManager().remove(this);
            e.printStackTrace();
        }

    }
}
