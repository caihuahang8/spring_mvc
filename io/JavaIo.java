package cn.zwq.ssm.io;

import com.sun.mail.iap.Response;
import org.apache.http.HttpResponse;

import java.io.*;

public class JavaIo {
    private final static int  KB=1024;
    public static void main(String[] args) throws IOException {
        String path1 = "D:\\1234\\1111.txt";
        String path2 = "E:\\1234.txt";
        File srcfile  = new File(path1);
        File tofile = new File(path2);
        int len = 0;
        FileInputStream inputStream = new FileInputStream(srcfile);
        FileOutputStream outputStream = new FileOutputStream(tofile);
        byte[] bytes = new byte[5*KB];
        while ((len = (inputStream.read(bytes)))>-1){
            outputStream.write(bytes,0,len);
        }
    }




}
