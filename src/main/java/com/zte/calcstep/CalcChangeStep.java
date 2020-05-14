package com.zte.calcstep;

import com.zte.rule.CharTypeRule;
import com.zte.rule.LengthRule;
import com.zte.rule.RepeatCharRule;

import java.util.ArrayList;
import java.util.List;

public class CalcChangeStep {
    public static int calc(String pwd){
        LengthRule lengthRule = new LengthRule(pwd);
        CharTypeRule charTypeRule = new CharTypeRule(pwd);
        RepeatCharRule repeatCharRule = new RepeatCharRule(pwd);
        boolean isStatisfied = lengthRule.isSatisfied() & charTypeRule.isSatisfied() & repeatCharRule.isSatisfied();
        if(isStatisfied){
            return 0;
        }
        //长度小于6时
        if(lengthRule.getInsertCharNum() > 0){
            return max(lengthRule.getInsertCharNum(),charTypeRule.getReplaceCharNum(), repeatCharRule.getReplaceCharNum());
        }else if(lengthRule.getDeleteCharNum() > 0){
            //长度大于20时
            List<Integer> repeatNums = repeatCharRule.getRepeatNums();
            int deleteNum = lengthRule.getDeleteCharNum();
            int res = 0;
            int repeatTimes = 0;
            while(deleteNum > 0) {
                List<Integer> tempRepeatNums = new ArrayList<>();
                for (Integer repeatNum : repeatNums) {
                    int curDeleteNum = res + 1;
                    if(repeatNum % 3 == res && (repeatNum - curDeleteNum) >= 2 && (deleteNum - curDeleteNum) >= 0){
                        deleteNum = deleteNum - curDeleteNum;
                        repeatNum = repeatNum - curDeleteNum;
                        tempRepeatNums.add(repeatNum);
                    }else {
                        tempRepeatNums.add(repeatNum);
                    }
                }
                if(equals(repeatNums, tempRepeatNums)){
                    repeatTimes++;
                }else {
                    repeatNums = tempRepeatNums;
                    repeatTimes = 0;
                }
                if(isNeedBreak(repeatNums) || repeatTimes >= 3){
                    break;
                }
                res = ++res%3;
            }
            repeatCharRule.setRepeatNums(repeatNums);
            return lengthRule.getDeleteCharNum() + max(charTypeRule.getReplaceCharNum(), repeatCharRule.getReplaceCharNum());

        }else{
            return max(charTypeRule.getReplaceCharNum(), repeatCharRule.getReplaceCharNum());
        }

    }

    private static int max(int... datas){
        int max = datas[0];
        for(int i = 1; i < datas.length; i++){
            if(datas[i] > max){
                max = datas[i];
            }
        }
        return max;
    }

    private static boolean isNeedBreak(List<Integer> datas){
        for(Integer data : datas){
            if(data > 2){
                return false;
            }
        }
        return true;
    }

    private static boolean equals(List<Integer> a, List<Integer> b){
        if(a.size() != b.size()){
            return false;
        }
        for(int i = 0 ; i < a.size(); i++){
            if(a.get(i) != b.get(i)){
                return false;
            }
        }
        return true;
    }
}
