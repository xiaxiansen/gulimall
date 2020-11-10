package com.atguigu.gulimall.member;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.Md5Crypt;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class GulimallMemberApplicationTests {
    
    @Test
    void contextLoads() {
        String s = DigestUtils.md5Hex("123456".getBytes());
        //盐值加密，随机值 加盐
        //$1$41QRqm9o$c04vsHCXdVJVSQsgJciLS/ $1$ALiYHuPL$hCORrOMuRVwctAKQ5GGsu0
//        String s1 = Md5Crypt.md5Crypt("123456".getBytes(),"$1$xiaxiansen");
//        System.out.println(s1);
//        System.out.println(s);
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        //$2a$10$Gf8phyDY8G6i6o/HOGpTbeHpAXjOd1y62fj44zMDxid6aWjLehh9.
        //$2a$10$fzoZRzzu6h9uALv3nudWBexcdHd1RMEMcfHW2J2Bv6C3sHZCCMgty
        String encode = passwordEncoder.encode("123456");
        boolean matches = passwordEncoder.matches("123456", "$2a$10$Gf8phyDY8G6i6o/HOGpTbeHpAXjOd1y62fj44zMDxid6aWjLehh9.");
        System.out.println(encode+"=>"+matches);
    }
    
}
