package saberlife.socket.a;

import java.util.Vector;

/**
 * Created by baiyang
 * Email: 1419408386@qq.com
 * Creation time : 2017-06-04
 * If you don't konw it,Please ask Google
 */
public class ChatManager {
    /**
     * 单例模式  构造方法 public变成private
     * 创建类对象 和类方法 并返回类对象
     *
     */
    private ChatManager() {
    }
    private static final ChatManager CHAT_MANAGER = new ChatManager();

    public static ChatManager getChatManager() {
        return CHAT_MANAGER;
    }
    Vector<ChatSocket> vector = new Vector<ChatSocket>();

    protected void add(ChatSocket chatSocket){
        vector.add(chatSocket);
    }
    protected void remove(ChatSocket chatSocket){
        vector.remove(chatSocket);
    }
    public void publish(ChatSocket cs,String out) {
        for (int i = 0; i < vector.size(); i++) {
            ChatSocket csChatSocket = vector.get(i);
            if (!cs.equals(csChatSocket)) {
                csChatSocket.out(out);
            }
        }
    }
}
