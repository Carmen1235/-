package com.wqy.util;

import com.alibaba.fastjson.JSONObject;
import com.sun.xml.internal.rngom.util.Uri;
import com.wqy.dao.mapper.WxtemplateMapper;
import com.wqy.entity.Wxtemplate;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: 王秋叶
 * @author: WangQiuYe
 * @Date: 2018/8/31 14:34
 * @Description: 微信发送消息工具类
 */
public class WeiXinUtil {




    private String appid;
    private String secret;

    private static final String URL = "api.weixin.qq.com/cgi-bin/token";

    public WeiXinUtil(String appid, String secret) {
        this.appid = appid;
        this.secret = secret;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public static String getURL() {
        return URL;
    }

    /**
     * 获取
     * @param tt
     * @return
     */
    public String getAccessToken(WeiXinUtil tt) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //设置请求地址
        URIBuilder uriBuilder = new URIBuilder();
        uriBuilder.setScheme("https");
        uriBuilder.setHost(WeiXinUtil.URL);
        uriBuilder.setParameter("grant_type", "client_credential");
        uriBuilder.setParameter("appid", tt.getAppid());
        uriBuilder.setParameter("secret", tt.getSecret());
        HttpGet httpGet = new HttpGet(String.valueOf(uriBuilder));
        System.out.println("请求地址：:" + httpGet.getURI());
        //获取响应结果
        CloseableHttpResponse response = httpClient.execute(httpGet);
        String result = EntityUtils.toString(response.getEntity());
        System.out.println("请求结果:" + result);
        String substring = result.substring(result.indexOf(":") + 2, result.indexOf(",") - 1);
        return substring;
    }

    /**
     * 发送消息
     * @param accessToken 动态令牌
     * @param touser 发送的用户   例如：o8mYN1NQssHCUyzihP_Mk2FjK0FE
     * @param content 发送个用户的内容
     */
    public static void sendMessagae(String accessToken, String touser,String content) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //设置请求地址
        URIBuilder uriBuilder = new URIBuilder();
        uriBuilder.setScheme("https");
        uriBuilder.setHost("api.weixin.qq.com/cgi-bin/message/custom/send");
        uriBuilder.setParameter("access_token", accessToken);
        HttpPost httpPost = new HttpPost(String.valueOf(uriBuilder));

        System.out.println("sendMessage的请求地址：" + httpPost.getURI());

        //设置请求参数
        JSONObject jsonParam = new JSONObject();
        jsonParam.put("touser", touser);
        jsonParam.put("msgtype", "text");
        Map map1 = new HashMap();
        map1.put("content", content);
        jsonParam.put("text", map1);
        //解决中文乱码问题
        StringEntity entity = new StringEntity(jsonParam.toString(), "utf-8");
        entity.setContentEncoding("UTF-8");
        entity.setContentType("application/json");
        httpPost.setEntity(entity);
        CloseableHttpResponse response = httpClient.execute(httpPost);
            System.out.println(EntityUtils.toString(response.getEntity()));


    }

    /**
     * 发送模板消息
     * @param access_token 动态口令
     * @param touser 发送对象
     * @param template_id 模板id
     * @param map 模板data
     * @throws IOException
     */
    public  static void sendTemplateMessage(String access_token,String touser,String template_id,Map map) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        URIBuilder uriBuilder = new URIBuilder();
        uriBuilder.setScheme("https");
        uriBuilder.setHost("api.weixin.qq.com/cgi-bin/message/template/send");
        uriBuilder.setParameter("access_token",access_token);
        HttpPost httpPost = new HttpPost(String.valueOf(uriBuilder));

        JSONObject jsonParam = new JSONObject();
        jsonParam.put("touser", touser);
        jsonParam.put("template_id", template_id);



        jsonParam.put("data",map);


        //解决中文乱码问题
        StringEntity entity = new StringEntity(jsonParam.toString(), "utf-8");
        entity.setContentEncoding("UTF-8");
        entity.setContentType("application/json");
        httpPost.setEntity(entity);

        CloseableHttpResponse response = httpClient.execute(httpPost);
        System.out.println(EntityUtils.toString(response.getEntity()));



    }

    public static void main(String[] args) throws IOException {

        /**
         * 测试发送客服消息
         */
//        WeiXinUtil t1   = new WeiXinUtil("wx6926050855924f92","0c13d683a45ddd9888e662b2f4dc8050");
//        String accessToken1 = t1.getAccessToken(t1);
//        System.out.println(accessToken1);
//        WeiXinUtil.sendMessagae("13_Bv2kq5WjXjBYAyREqigvtJEmbIJysf7Z-PnMt1K0yjOENuWPDlwnxvR8gtdpaIulcKUr0HYwPUsJh3van5BjT5WudSvhw7Q65t5OJyiLKN61kbXaoYJQyxEwvhIpxnMY2x4dDAe9eKOKLC8-WJDgAIAREY",
//                "oKbXs0X_EmecYHbiqHelsJ21M4ZY","测试内容");




        /**
         * 测试发送模板消息
         */
//        WeiXinUtil t   = new WeiXinUtil("wxfcb8fb7d8ace1576","eaeeac4a4d2668a298b28bb64ffabcd5");
                WeiXinUtil t   = new WeiXinUtil("wx6926050855924f92","0c13d683a45ddd9888e662b2f4dc8050");
        String accessToken = t.getAccessToken(t);
        System.out.println(accessToken);

        Map map = new HashMap();
        //头
        Map first = new HashMap();
        first.put("value","反馈部门："+"部门");
        first.put("color","#FF1010");
        map.put("first",first);
        //分类 反馈类型
        Map sort = new HashMap();
        sort.put("value","类型");
        sort.put("color","#0000FF");
        map.put("keyword1",sort);
        //姓名 反馈名称
        Map username = new HashMap();
        username.put("value","意见反馈");
        username.put("color","#0000FF");
        map.put("keyword2",username);
        //部门 反馈人姓名
        Map department = new HashMap();
        department.put("value","姓名");
        department.put("color","#0000FF");
        map.put("keyword3",department);
        //联系方式 反馈人手机号
        Map telPhone = new HashMap();
        telPhone.put("value","12121");
        telPhone.put("color","#0000FF");
        map.put("keyword4",telPhone);
        //反馈意见/建议

        //尾

        Map remark = new HashMap();
        remark.put("value","反馈意见："+"卡拉杀害库萨克老大和看来是电话ask好的卡萨丁");
        remark.put("color","#FF1010");
        map.put("remark",remark);

        WeiXinUtil.sendTemplateMessage(accessToken,"oKbXs0X_EmecYHbiqHelsJ21M4ZY","1-2Qd7Ik0mC9NtvtX5z5HwBGgHH4R5RaRULtT4gDkmQ",map);





    }
}
