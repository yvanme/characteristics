package com.loong.base64;

import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Test {
    @Test
    public void testBase64(){
        String text = "这是一个测试文本1";

        String encodeText = Base64.getEncoder().encodeToString(text
                .getBytes(StandardCharsets.UTF_8));

        System.out.println("加密后的字符串为："+encodeText);

        String decodeText = new String(Base64.getDecoder().decode(encodeText
                .getBytes(StandardCharsets.UTF_8)));

        System.out.println("解密后的字符串为："+decodeText);
    }
}
