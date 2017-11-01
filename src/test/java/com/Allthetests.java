package com;

import com.proxy.Cglb;
import com.proxy.Dynamic;
import com.proxy.Hello;
import com.proxy.Helloword;

import com.proxy.dome.Intercep;
import com.skill.Chainshape;
import com.skill.Uselombok;
import org.junit.Test;

public class Allthetests {
    @Test
    public void say(){
        Uselombok chainshape = Uselombok.builder().sex("男").build();
        System.out.println(chainshape.toString());

        Chainshape sq = new Chainshape.Set().sex("女").build();
        System.out.println(sq.toString());
    }


    @Test
    public void testProxy(){
        Dynamic jdk = new Dynamic();
        Helloword helloword = (Helloword) jdk.bind(new Hello());
        helloword.sayHello();
    }

    @Test
    public void textCglb(){
        Cglb cglb = new Cglb();
        Hello helloword = (Hello) cglb.getProxy(Hello.class);
        helloword.sayHello();
    }

    @Test
    public void textintercep(){
        Helloword helloword = (Helloword) Intercep.bind(new Hello(),
                "com.proxy.dome.My");
        helloword.sayHello();
    }


    @Test
    public void textNo(){
        Helloword helloword = (Helloword) Intercep.bind(new Hello(),
                "com.proxy.dome.My");
        Helloword no1 = (Helloword) Intercep.bind(helloword,
                "com.proxy.dome.No1");
        Helloword no2 = (Helloword) Intercep.bind(no1,
                "com.proxy.dome.No2");
        Helloword no3 = (Helloword) Intercep.bind(no2,
                "com.proxy.dome.No3");
        no3.sayHello();
    }
}
