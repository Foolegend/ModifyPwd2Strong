package com.zte.rule;

import org.junit.Assert;
import org.junit.Test;

public class RepeatCharRuleTest {
    @Test
    public void testRepeatRule(){
        String ceshi = "aabcc";
        RepeatCharRule repeatCharRule = new RepeatCharRule(ceshi);
        Assert.assertTrue(repeatCharRule.isSatisfied());
        Assert.assertEquals(0, repeatCharRule.getReplaceCharNum());

        ceshi = "aaaa";
        repeatCharRule = new RepeatCharRule(ceshi);
        Assert.assertFalse(repeatCharRule.isSatisfied());
        Assert.assertEquals(1, repeatCharRule.getReplaceCharNum());

        ceshi = "aaaaabbbbbcccccdddddeeeeeeff";
        repeatCharRule = new RepeatCharRule(ceshi);
        Assert.assertFalse(repeatCharRule.isSatisfied());
        Assert.assertEquals(6, repeatCharRule.getReplaceCharNum());
    }
}
