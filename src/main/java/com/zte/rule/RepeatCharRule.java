package com.zte.rule;

import java.util.ArrayList;
import java.util.List;

public class RepeatCharRule {
    List<Integer> repeatNums = new ArrayList<>();
    private String pwd;

    public RepeatCharRule(String pwd){
        this.pwd = pwd;
    }

    public boolean isSatisfied(){
        for(int i = 0; i < pwd.length(); i++){
            int repeat = 1;
            while(i + 1 < pwd.length() && pwd.charAt(i) == pwd.charAt(i+1)){
                repeat++;
                i++;
            }
            if( repeat >= 3){
                repeatNums.add(repeat);
            }
        }
        return repeatNums.size() == 0;
    }

    public int getReplaceCharNum() {
        int sum = 0;
        for(Integer repeatNum : repeatNums){
            sum += repeatNum/3;
        }
        return sum;
    }

    public List<Integer> getRepeatNums() {
        return repeatNums;
    }

    public void setRepeatNums(List<Integer> repeatNums) {
        this.repeatNums = repeatNums;
    }
}
