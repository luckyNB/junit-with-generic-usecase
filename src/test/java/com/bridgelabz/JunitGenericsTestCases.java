package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class JunitGenericsTestCases {

    @Test
    public void givenThreeNumber_AsInteger_Should_ReturnMaxAmoungThem() {
        Integer maxNumber = MaxNumberFinder.findingMaxNumber(20, 89, 45);
        Assert.assertEquals(Integer.valueOf(89), maxNumber);
    }

    @Test
    public void givenThreeNumber_AsFloat_Should_ReturnMaxAmoungThem() {
        Float maxNumber=MaxNumberFinder.findingMaxNumber(10.2f,45.3f,8.4f);
        Assert.assertEquals(Float.valueOf(45.3f),maxNumber);
    }

    @Test
    public void givenMaxNumberat_1stPosition_Should_ReturntheSameNumber() {
        Integer  maxNumber=MaxNumberFinder.findingMaxNumber(30,20,10);
        Assert.assertEquals(Integer.valueOf(30),maxNumber);
    }
}
