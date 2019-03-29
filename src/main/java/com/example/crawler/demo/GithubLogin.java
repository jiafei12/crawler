package com.example.crawler.demo;


import com.example.crawler.util.HttpUtils;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.xml.bind.Element;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liuyh
 * @description: 模拟登陆Github, 获得请求头信息
 * @date 2019/3/29 16:29
 */
public class GithubLogin {
    public static void githubLogin(String email, String password) throws Exception {

        String html = HttpUtils.doGet("https://github.com/login").getContent();
        Document doc = Jsoup.parse(html);

        // 开始构造登录的信息：账号、密码、以及三个标记信息
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();
        nvps.add(new BasicNameValuePair("login", "972659283@qq.com"));
        nvps.add(new BasicNameValuePair("password", "********"));

    }

    public static void main(String[] args) throws Exception {
        GithubLogin.githubLogin("11","22");
    }
}
