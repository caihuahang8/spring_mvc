package cn.zwq.ssm.jms;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class sendMail {
    public static void main(String[] args) {
        try {
            sendMail();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
    public static void sendMail() throws MessagingException {
        // 创建Properties 类用于记录邮箱的一些属性
        final Properties props = new Properties();
        // 表示SMTP发送邮件，必须进行身份验证
        props.put("mail.smtp.auth", "true");
        //此处填写SMTP服务器
        props.put("mail.smtp.host", "smtp.qq.com");
        //端口号，QQ邮箱端口587
        props.put("mail.smtp.port", "587");
        // 此处填写，写信人的账号
        props.put("mail.user", "506606613@qq.com");
        // 此处填写16位STMP口令
        props.put("mail.password", "saempdwnebkzbhdc");
        String context = "<img src=\"https://caihuahang.oss-cn-hangzhou.aliyuncs.com/af194c36a5ba467593edf99602a48fb1.jpg?Expires=1601107823&OSSAccessKeyId=TMP.3KjdhMqdiv4AbvvWXX8YwmrWgy5xXjpMg5RBYYgasxbp7og2YknwRV8LEpQaRA5hP3WJLadrX8AwsSyiwWdvApbfaYyU3w&Signature=O%2BTw1PB38MZGpOUUMRiF6wXtBC4%3D\"/>";
        // 构建授权信息，用于进行SMTP进行身份验证
        Authenticator authenticator = new Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {
                // 用户名、密码
                String userName = props.getProperty("mail.user");
                String password = props.getProperty("mail.password");
                return new PasswordAuthentication(userName, password);
            }
        };
        // 使用环境属性和授权信息，创建邮件会话
        Session mailSession = Session.getInstance(props, authenticator);
        // 创建邮件消息
        MimeMessage message = new MimeMessage(mailSession);
        // 设置发件人
        InternetAddress form = new InternetAddress(props.getProperty("mail.user"));
        message.setFrom(form);

        // 设置收件人的邮箱
        InternetAddress to = new InternetAddress("506606613@qq.com");
        message.setRecipient(Message.RecipientType.TO, to);

        // 设置邮件标题
        message.setSubject("标题");

        // 设置邮件的内容体
        message.setContent(context, "text/html;charset=UTF-8");
        // 最后当然就是发送邮件啦
        Transport.send(message);
    }
}
