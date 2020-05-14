package com.zte.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zte.Utils;

public class ParsePwdJson {
   private Gson gson = new GsonBuilder().setPrettyPrinting().create();

   public PwdEntity parsePwd(String pwd){
       PwdEntity pwdEntity;
       try {
           pwdEntity = gson.fromJson(pwd, PwdEntity.class);
       }catch(Exception ex){
           System.out.println("Format Error.");
           return  null;
       }

       if(Utils.isEmpty(pwdEntity.getP()) || Utils.isEmpty(pwdEntity.getC()) || pwdEntity.getN() < 0 || pwdEntity.getMS() < 0){
           System.out.println("Data Error.");
           return null;
       }

       return pwdEntity;

   }

}
