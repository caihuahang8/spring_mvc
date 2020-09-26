package cn.zwq.ssm.io;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.aliyun.oss.model.PutObjectRequest;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.UUID;

public class AliYunUpload {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "D:\\1234\\download.jpg";
        File file = new File(path);
        FileInputStream inputStream = new FileInputStream(file);
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "http://oss-cn-hangzhou.aliyuncs.com";
// 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
        String accessKeyId = "LTAI4Fiifg9bPh71dPKaE1iv";
        String accessKeySecret = "HbcHiYHTHStucPY9JqqHGMieQ1ISsW";

// 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

// 创建PutObjectRequest对象。
        String content = "Hello OSS";
        String bucketName = "caihuahang";
// <yourObjectName>表示上传文件到OSS时需要指定包含文件后缀在内的完整路径，例如abc/efg/123.jpg。
        //PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, "123.txt", inputStream);
        //上传文件流
        ossClient.putObject(bucketName, getRandomName()+".jpg", inputStream);

// 上传字符串。

// 关闭OSSClient。
        ossClient.shutdown();
    }

    public static  String getRandomName(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
