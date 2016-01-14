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
    Candy candy;

    @Test(expectedExceptions = InvalidWeightException.class)
    public void checkInvalidWeightException() throws InvalidWeightException {
        candy = new Candy("Aist", -10, "Paprika");
        candy.getWeight();
    }

    @Test(expectedExceptions = InvalidCandyTypeException.class)
    public void checkInvalidCandyTypeException() throws InvalidCandyTypeException{
        candy = new Candy("Aist", -10, "Paprika");
        candy.getType();
    }

    @Test(priority = 0)
    public void checkCandyType() throws InvalidCandyTypeException {
        candy = new Candy("Candy1", 10, "Chocolate");
        String result = candy.getType();
        String expected = "Chocolate";
        Assert.assertEquals(result, expected, "Invalid result of operation");
    }

    @Test(priority = 1)
    public void checkCandyName() {
        candy = new Candy("Ideal", -10, "Paprika");
        String result = candy.getName();
        String expected = "Ideal";
        Assert.assertEquals(result, expected, "Invalid result of operation");
    }
}
