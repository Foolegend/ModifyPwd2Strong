package com.zte;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zte.json.ParsePwdJson;
import com.zte.json.PwdEntity;

public class DealMain {

    public static void main(String[] args){
        String ceshi = "{\"P\":[\"123\",\"abc\"],\"C\":[3,2], \"N\":2, \"MS\":1}";
        PwdEntity pwdEntity = new ParsePwdJson().parsePwd(ceshi);
        System.out.println(pwdEntity.getP());
        System.out.println(pwdEntity.getC());
        System.out.println(pwdEntity.getN());
        System.out.println(pwdEntity.getMS());
    }
}
