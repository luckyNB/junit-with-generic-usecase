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
        Float maxNumber = MaxNumberFinder.findingMaxNumber(10.2f, 45.3f, 8.4f);
        Assert.assertEquals(Float.valueOf(45.3f), maxNumber);
    }


    public void givenThreeString_Should_ReturnMaxAmoungThem() {
        String maxString = MaxNumberFinder.findingMaxNumber("Laxman", "Narayan", "Bhosale");
        Assert.assertEquals("Narayan", maxString);
    }

    @Test
    public void givenThreeValues_Should_ReturnMaxAmongThem() {
        String maxString = MaxNumberFinder.findingMaxGenerics("L", "Z", "M");
        Assert.assertEquals("Z", maxString);
    }

    @Test
    public void givenThreeValuesOfAnyType_Should_ReturnMax() {
        MaxNumberFinder maxNumberFinder = new MaxNumberFinder(10, 20, 30);
        Assert.assertEquals(Integer.valueOf(30), maxNumberFinder.testMaximum());
    }

    @Test
    public void givenMaxNumberAt_1stPosition_Should_Return_SameNumber() {
        Integer maxNumber=MaxNumberFinder.findingMaxNumber(50,40,30);
        Assert.assertEquals(Integer.valueOf(50),maxNumber);
    }
    @Test
    public void givenMaxNumberAt_2ndPosition_Should_Return_SameNumber() {
        Integer maxNumber=MaxNumberFinder.findingMaxNumber(40,50,30);
        Assert.assertEquals(Integer.valueOf(50),maxNumber);
    }
    @Test
    public void givenMaxNumberAt_3rdPosition_Should_Return_SameNumber() {
        Integer maxNumber=MaxNumberFinder.findingMaxNumber(40,30,50);
        Assert.assertEquals(Integer.valueOf(50),maxNumber);
    }

}
