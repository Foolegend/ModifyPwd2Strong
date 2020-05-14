package com.zte.rule;

import org.junit.Assert;
import org.junit.Test;

public class LengthRuleTest {
    @Test
    public void testLengthRule(){
        String ceshi = "123Aaa";
        LengthRule lengthRule = new LengthRule(ceshi);
        Assert.assertTrue(lengthRule.isSatisfied());
        Assert.assertEquals(0, lengthRule.getDeleteCharNum());
        Assert.assertEquals(0, lengthRule.getInsertCharNum());

        ceshi = "123aa";
        lengthRule = new LengthRule(ceshi);
        Assert.assertFalse(lengthRule.isSatisfied());
        Assert.assertEquals(0, lengthRule.getDeleteCharNum());
        Assert.assertEquals(1, lengthRule.getInsertCharNum());

        ceshi = "aaaaabbbbbcccccdddddeeeeeff";
        lengthRule = new LengthRule(ceshi);
        Assert.assertFalse(lengthRule.isSatisfied());
        Assert.assertEquals(7, lengthRule.getDeleteCharNum());
        Assert.assertEquals(0, lengthRule.getInsertCharNum());
    }
}
