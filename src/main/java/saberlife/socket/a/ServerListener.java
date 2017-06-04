package saberlife.socket.a;

import javax.swing.*;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by baiyang
 * Email: 1419408386@qq.com
 * Creation time : 2017-06-04
 * If you don't konw it,Please ask Google
 */
public class ServerListener extends Thread {

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    public void run() {
        try {
            //绑定端口
            ServerSocket serverSocket = new ServerSocket(55545,5);//端口 ，最大链接数：5
            //从连接请求队列中取出一个连接

            while (true){
                Socket socket = serverSocket.accept();
                //建立连接
                JOptionPane.showMessageDialog(null, "有客户端链接到了本机的55545端口");
                //将socket传递给新的线程
                ChatSocket cs = new ChatSocket(socket);
                cs.start();
                ChatManager.getChatManager().add(cs);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
