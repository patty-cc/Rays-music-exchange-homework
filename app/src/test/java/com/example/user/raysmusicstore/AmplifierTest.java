package com.example.user.raysmusicstore;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by user on 10/09/2017.
 */

public class AmplifierTest {

    Amplifier amplifier;

    @Before
    public void before(){
        amplifier = new Amplifier( "Amplifier", 20.00, 40.00);
    }

    @Test
    public void testAmplifierType(){
        assertEquals( "Amplifier", amplifier.getItemType());
    }

    @Test
    public void testAmplifierBuyPrice(){
        assertEquals( 20.00, amplifier.getItemBuyPrice(), 0.01);
    }

    @Test
    public void testAmplifierSellPrice(){
        assertEquals( 40.00, amplifier.getItemSellPrice(), 0.01);
    }


    @Test
    public void testAmplifierMarkUp(){
        assertEquals( 20.00, amplifier.calculateMarkup(), 0.01);
    }
}
