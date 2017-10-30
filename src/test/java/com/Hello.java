package com;

import com.skill.Chainshape;
import com.skill.Uselombok;
import org.junit.Test;

public class Hello {
    @Test
    public void say(){
        Uselombok chainshape = Uselombok.builder().sex("男").build();
        System.out.println(chainshape.toString());

        Chainshape sq = new Chainshape.Set().sex("女").build();
        System.out.println(sq.toString());
    }
}
