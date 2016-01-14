package by.epam.module4.test;

import by.epam.lecture3.CustomExceptions.InvalidWeightException;
import by.epam.lecture3.task1.Candy;
import by.epam.lecture3.task1.NYGift;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Siarhei_Chyhir on 12/18/2015.
 */
public class NYGiftTest {

    NYGift gift = new NYGift();

    List<Candy> candies = new ArrayList<Candy>();

    public List<Candy> preconditions(){

        candies.add(new Candy("Aist1", 10, "Paprika"));
        candies.add(new Candy("Aist1", 10, "Paprika"));
        candies.add(new Candy("Aist2", 112, "Paprika"));
        candies.add(new Candy("Aist3", 113, "Paprika"));
        candies.add(new Candy("Aist4", 111, "Paprika"));
        candies.add(new Candy("Aist5", 114, "Paprika"));

        return candies;
    }

    @Test()
    public void checkGetPackWeight() throws InvalidWeightException{
        int expected = 460;
        int result = gift.getPackWeight();
        Assert.assertEquals(result, expected, "Invalid result of operation");

    }

}
