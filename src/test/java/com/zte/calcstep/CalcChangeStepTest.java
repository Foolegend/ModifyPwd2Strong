package com.zte.calcstep;

import org.junit.Assert;
import org.junit.Test;

public class CalcChangeStepTest {
    @Test
    public void testChangeStepWhenLess6(){
        String pwd = "";
        Assert.assertEquals(6, CalcChangeStep.calc(pwd));

        pwd = "a";
        Assert.assertEquals(5, CalcChangeStep.calc(pwd));

        pwd = "aa";
        Assert.assertEquals(4, CalcChangeStep.calc(pwd));

        pwd = "aaaaa";
        Assert.assertEquals(2, CalcChangeStep.calc(pwd));

        pwd = "aA123";
        Assert.assertEquals(1, CalcChangeStep.calc(pwd));

        pwd = "*****";
        Assert.assertEquals(3, CalcChangeStep.calc(pwd));
    }

    @Test
    public void testChangeStepWhenGreater6(){
        String pwd = "kkkkkkkkkakkkkkkkkakkkkkkkkakkkkkkk";
        Assert.assertEquals(18, CalcChangeStep.calc(pwd));

        pwd = "×××××××××？××××××××（××××××××）××××））（";
        Assert.assertEquals(18, CalcChangeStep.calc(pwd));

        pwd = "aab*Cd1";
        Assert.assertEquals(0, CalcChangeStep.calc(pwd));

        pwd = "aaaaab";
        Assert.assertEquals(2, CalcChangeStep.calc(pwd));

        pwd = "aA123";
        Assert.assertEquals(1, CalcChangeStep.calc(pwd));

        pwd = "aA123aA123aA123aA123aA123";
        Assert.assertEquals(5, CalcChangeStep.calc(pwd));
    }

}
