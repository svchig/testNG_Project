package by.epam.module4.test;

import by.epam.lecture3.CustomExceptions.InvalidCandyTypeException;
import by.epam.lecture3.CustomExceptions.InvalidWeightException;
import by.epam.lecture3.task1.Candy;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Siarhei_Chyhir on 12/17/2015.
 */
public class CandyTest {
    Candy candy = new Candy("Aist", -10, "Paprika");

    @Test(expectedExceptions = InvalidWeightException.class)
    public void checkInvalidWeightException() throws InvalidWeightException {
        candy.getWeight();
    }

    @Test(expectedExceptions = InvalidCandyTypeException.class)
    public void checkInvalidCandyTypeException() throws InvalidCandyTypeException{
        candy.getType();
    }

    @Test()
    public void checkCandyType() throws InvalidCandyTypeException {
        //candy.setType("Chocolate");
        String result = candy.getType();
        String expected = "Chocolate";
        Assert.assertEquals(result, expected, "Invalid result of operation");
    }

    @Test()
    public void checkCandyName() {
        //candy.setName("Ideal");
        String result = candy.getName();
        String expected = "Ideal";
        Assert.assertEquals(result, expected, "Invalid result of operation");
    }
}
