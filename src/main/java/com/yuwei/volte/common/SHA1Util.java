package com.yuwei.volte.common;

import com.alibaba.fastjson.JSON;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;

/**
 * sha1加密
 * @author weisk
 * @date 2017年11月23日 下午3:09:57
 */
public class SHA1Util {

    /**
     * sha1加密方式
     * @param list 参数值集合
     * @return
     * @throws Exception
     * @author weisk
     * @date 2017年11月23日 下午3:10:09
     */
    public static String getSha1Sign(List<String> list) throws Exception {
        Collections.sort(list);//排序
        StringBuffer strbf = new StringBuffer();
        for (String string : list) {
            strbf.append(string);//拼接字符串
        }
        //加密
        MessageDigest crypt = MessageDigest.getInstance("SHA-1");
        crypt.reset();
        crypt.update(strbf.toString().getBytes("UTF-8"));
        String signature = byteToHex(crypt.digest());
        return signature;
    }

    private static String byteToHex(final byte[] hash) {
        Formatter formatter = new Formatter();
        for (byte b : hash) {
            formatter.format("%02x", b);
        }
        String result = formatter.toString();
        formatter.close();
        return result;
    }

    public static void main(String[] args) {
        try {
            String timestamp = Long.toString(System.currentTimeMillis() / 1000);
            System.err.println(timestamp);
            List<String> list = new ArrayList<String>();
            list.add("xx1WYbIgwDh7uJyjN");
            list.add(timestamp);
            System.err.println(getSha1Sign(list));

            HxrdReqData hxrdReqData = new HxrdReqData();
            hxrdReqData.setQrcode("11111111111");
            hxrdReqData.setOpenid("22222222222");
            System.out.println(JSON.toJSONString(hxrdReqData));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
