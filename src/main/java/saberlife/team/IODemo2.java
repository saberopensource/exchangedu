package saberlife.team;

import java.io.File;

/**
 * Created by baiyang
 * Email: 1419408386@qq.com
 * Creation time : 2017/5/21
 * If you don't konw it,Please ask Google
 */
public class IODemo2 {
    public static void main(String[] args) {
        dg("d:\\");
    }
    public static void dg(String dir){
        File file = new File(dir);
        String str[] = null;
        if (file.isDirectory()){
            str = file.list();
            for (Object o : str){
                dg(dir+"\\"+o);
            }
        }else {
            System.out.println(dir);
        }
    }
}
