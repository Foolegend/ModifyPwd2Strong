package com.zte.json;

import org.junit.Test;

public class ParsePwdJsonTest {


    @Test
    public void testParsePwd(){
        String ceshi = "{\"P\":[\"123\",\"abc\"],\"C\":[3,2], \"N\":2, \"MS\":1}";
        PwdEntity pwdEntity = new ParsePwdJson().parsePwd(ceshi);
        System.out.println(pwdEntity.getP());
        System.out.println(pwdEntity.getC());
        System.out.println(pwdEntity.getN());
        System.out.println(pwdEntity.getMS());
    }
}
