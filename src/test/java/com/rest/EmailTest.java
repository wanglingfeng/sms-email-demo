package com.rest;

/*import org.junit.Test;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.Properties;*/

/**
 * Created by Lingfeng on 2016/3/23.
 */
/*public class EmailTest {

    @Test
    public void textSend() {
        JavaMailSender sender = createSender();

        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setFrom("joseph.wang@jjcargo.com");
        mail.setTo("joseph.wlf@qq.com");
        mail.setSubject("测试Spring Mail(text)");

        String text = "你购买了什么？你猜啊！";
        mail.setText(text);
        sender.send(mail);
    }

    @Test
    public void htmlSend() {
        JavaMailSender sender = createSender();
        //建立邮件消息,发送简单邮件和html邮件的区别
        MimeMessage mailMessage = sender.createMimeMessage();
        // encoding设置为UTF-8防止乱码
        MimeMessageHelper messageHelper = new MimeMessageHelper(mailMessage, "UTF-8");

        try {
            // 设置收件人，寄件人
            messageHelper.setFrom("noreply@jjcargo.com");
            messageHelper.setTo("emma.zhu@jjcargo.com");

            messageHelper.setSubject("测试Spring Mail(html)");

            String text = "<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/></head><body>" +
                    "尊敬的客户： 您好！<br/>" +
                    "<br/>" +
                    "感谢您使用【集吉运】网上订舱服务，贵司委托出运的货物：<br/>" +
                    "订单号：JJC2016112900004<br/>" +
                    "ETD: 2016-12-07<br/>" +
                    "起运港：SHANGHAI<br/>" +
                    "目的港：DURBAN<br/>" +
                    "该订单现已发送“进仓通知“，请贵司登陆网址&nbsp;www.jjcargo.com&nbsp;完成下载，以免影响货物进仓，如有疑问请及时联系【集吉运】在线客服，或拨打400-900-7785，谢谢！<br/>" +
                    "<br/>" +
                    "感谢登陆【集吉运】，祝您工作愉快！<br/></body></html>";
            //true 表示启动HTML格式的邮件
            messageHelper.setText(text, true);

            //发送邮件
            sender.send(mailMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void htmlWithPicSend() {
        JavaMailSender sender = createSender();

        //建立邮件消息,发送简单邮件和html邮件的区别
        MimeMessage mimeMessage = sender.createMimeMessage();

        try {
            //注意这里的boolean,等于真的时候才能嵌套图片，在构建MimeMessageHelper时候，所给定的值是true表示启用multipart模式
            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "utf-8");

            // 设置收件人，寄件人
            messageHelper.setFrom("joseph.wang@jjcargo.com");
            messageHelper.setTo("joseph.wlf@qq.com");

            messageHelper.setSubject("测试Spring Mail(html with pic)");
            //true 表示启动HTML格式的邮件
            messageHelper.setText("<html><head></head><body><h1>hello!!&nbsp;it's me</h1><br/>" +
                    "<a href='http://www.baidu.com' target='_blank'>这只是一段简单的中文</a><br/>" +
                    "<img src='cid:heihei'/></body></html>", true);

            FileSystemResource img = new FileSystemResource(new File("E:\\mail_send\\QQ20150630111611.png"));
            messageHelper.addInline("heihei", img);
            sender.send(mimeMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void attachmentSend() {
        JavaMailSender sender = createSender();

        //建立邮件消息,发送简单邮件和html邮件的区别
        MimeMessage mimeMessage = sender.createMimeMessage();

        try {
            //注意这里的boolean,等于真的时候才能嵌套图片，在构建MimeMessageHelper时候，所给定的值是true表示启用multipart模式
            MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "utf-8");

            // 设置收件人，寄件人
            messageHelper.setFrom("joseph.wang@jjcargo.com");
            messageHelper.setTo("joseph.wlf@qq.com");

            messageHelper.setSubject("测试Spring Mail(html with attachment file)");
            //true 表示启动HTML格式的邮件
            messageHelper.setText("<html><head></head><body><h1>hello!!&nbsp;it's me</h1><br/>" +
                    "<a href='http://www.baidu.com' target='_blank'>这只是一段简单的中文</a><br/>" +
                    "<img src='cid:pic'/></body></html>", true);

            FileSystemResource img = new FileSystemResource(new File("E:\\mail_send\\QQ20150630111611.png"));
            messageHelper.addInline("pic", img);

            FileSystemResource attachmentFile = new FileSystemResource(new File("E:\\mail_send\\info.txt"));
            messageHelper.addAttachment("下载看看.txt", attachmentFile);

            sender.send(mimeMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    public JavaMailSender createSender() {
        JavaMailSenderImpl sender = new JavaMailSenderImpl();

        Properties javaMailProperties = new Properties();
        javaMailProperties.setProperty("mail.smtp.auth", "true");
        // 添加SSL认证
        javaMailProperties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        sender.setHost("smtp.jjcargo.com");
        sender.setPort(465);
        sender.setJavaMailProperties(javaMailProperties);
        sender.setUsername("noreply@jjcargo.com");
        sender.setPassword("Lipin2016");

        return sender;
    }
}*/
