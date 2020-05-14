package com.zte.rule;

public class LengthRule {
    private String pwd;

    public LengthRule(String pwd){
        this.pwd = pwd;
    }

    public boolean isSatisfied(){
        return pwd.length() >=6 && pwd.length() <= 20;
    }

    public int getInsertCharNum() {
        return pwd.length() < 6 ? 6 - pwd.length() : 0;
    }

    public int getDeleteCharNum() {
        return pwd.length() > 20 ? pwd.length() - 20 : 0;
    }
}

