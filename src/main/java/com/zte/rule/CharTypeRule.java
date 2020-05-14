 package com.zte.rule;

public class CharTypeRule {
    private String pwd;
    private int type;

    public CharTypeRule(String pwd){
        this.pwd = pwd;
        this.type = 0;
    }

    public boolean isSatisfied(){
        for(int i = 0; i < pwd.length(); i++){
            if(pwd.charAt(i) >= '0' && pwd.charAt(i) <= '9'){
                type = type | 1;
            }
            if(pwd.charAt(i) >= 'A' && pwd.charAt(i) <= 'Z'){
                type = type | 2;
            }
            if(pwd.charAt(i) >= 'a' && pwd.charAt(i) <= 'z'){
                type = type | 4;
            }
            if(type == 7){
                return true;
            }
        }
        return false;
    }

    public int getReplaceCharNum() {
        return 3 - Integer.bitCount(type);
    }

}
