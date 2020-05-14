package com.zte.rule;

import org.junit.Assert;
import org.junit.Test;

public class CharTypeRuleTest {
    @Test
    public void testCharType(){
        String ceshi = "123Aab";
        CharTypeRule charTypeRule = new CharTypeRule(ceshi);
        Assert.assertTrue(charTypeRule.isSatisfied());
        Assert.assertEquals(0, charTypeRule.getReplaceCharNum());

        ceshi = "123aab";
        charTypeRule = new CharTypeRule(ceshi);
        Assert.assertFalse(charTypeRule.isSatisfied());
        Assert.assertEquals(1, charTypeRule.getReplaceCharNum());

        ceshi = "****aa";
        charTypeRule = new CharTypeRule(ceshi);
        Assert.assertFalse(charTypeRule.isSatisfied());
        Assert.assertEquals(2, charTypeRule.getReplaceCharNum());

        ceshi = "*******";
        charTypeRule = new CharTypeRule(ceshi);
        Assert.assertFalse(charTypeRule.isSatisfied());
        Assert.assertEquals(3, charTypeRule.getReplaceCharNum());
    }
}
