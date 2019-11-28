package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class JunitGenericsTestCases {

    @Test
    public void givenThreeNumber_Should_ReturnMaxAmoungThem() {
        Integer maxNumber = MaxNumberFinder.findingMaxNumber(20, 89, 45);
        Assert.assertEquals(Integer.valueOf(89), maxNumber);
    }
}
