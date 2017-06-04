package saberlife.test;

import org.junit.Test;
import saberlife.util.HttpClientGetAndPost;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by baiyang
 * Email: 1419408386@qq.com
 * Creation time : 2017-06-04
 * If you don't konw it,Please ask Google
 */
public class HttpCGAPTest {
    //此处必须实例化 否则运行会报空指针异常  java.lang.NullPointerException
    private HttpClientGetAndPost httpClientGetAndPost = new HttpClientGetAndPost();
    @Test
    public void TestGet(){
        String mess = httpClientGetAndPost.httpClientGet("http://www.baidu.com");
        System.out.println(mess);
    }
    @Test
    public void TestPost(){
        Map<String,String> map = new HashMap<String, String>();
        map.put("url","http://www.baidu.com");
        map.put("name","ahahah");
        System.out.println(map.toString());
        String mess = httpClientGetAndPost.httpClientPost("http://www.baidu.com",map);
        System.out.println(mess);
    }
}
