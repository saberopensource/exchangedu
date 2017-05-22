package saberlife.team;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by baiyang
 * Email: 1419408386@qq.com
 * Creation time : 2017/5/21
 * If you don't konw it,Please ask Google
 */
public class IODemo1 {
    public static void main(String[] args) {
        File file = new File("D:\\");
        if (file.isDirectory() == true){
            String str[] = file.list();
            for (int i=0;i<str.length;i++){
                System.out.println(str[i]);
            }
        }else {
            System.out.println("******");
        }
    }
    @Test
    public void IOtest1(){
        File f = new File("D:\\A.TXT");
        if (f.exists()){
            System.out.println("文件存在");
        }else{
            System.out.println("文件不存在，创建文件中ing" +
                    "请稍等");
            try {
                f.createNewFile();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
