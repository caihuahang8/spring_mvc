package cn.zwq.ssm.sqlite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipOutputStream;

public class Cut1M {
    private final static int M=1024*1024;

    public static void main(String[] args) throws IOException {
        // 读取文件流
        String path = "D:\\PCQQ2020.exe";
        String path2 = "D:\\";
        File file = new File(path);
        byte[] bytes = new byte[M];
        //定义输入流读取文件中的数据

        FileInputStream fis = new FileInputStream(file);

        //定义变量充当碎片文件的名称

        int count = 1;

        //定义数组，固定数组的大小为100kb

        byte[] buf = new byte[M];

        int len = 0;

        while( ( len = fis.read(buf) ) ==M ){

            //定义输出流，将读取到的100kb数据写到文件中
            FileOutputStream zos = new FileOutputStream(path2+count+".tar");

            //写数据

            zos.write(buf,0,M);


            //充当碎片文件的名称变量变化

            count++;

        }

        //关闭输入流
        fis.close();
    }
}
