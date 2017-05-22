package saberlife.team;

import org.junit.Test;

import java.io.*;

/**
 * Created by baiyang
 * Email: 1419408386@qq.com
 * Creation time : 2017/5/21
 * If you don't konw it,Please ask Google
 */
public class IODemo3 {
    public static void main(String[] args) {
        OutputStream outputStream = null;
        File file = new File("d:\\writer.txt");
        try {
            outputStream = new FileOutputStream(file);
            String str = "hahahaha ";
            byte by[] = str.getBytes();
            outputStream.write(by);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    @Test
    public void test(){
        System.getProperties().list(System.out);
    }
}
