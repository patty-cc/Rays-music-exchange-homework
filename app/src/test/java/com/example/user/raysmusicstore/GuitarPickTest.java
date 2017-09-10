package com.example.user.raysmusicstore;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by user on 10/09/2017.
 */

public class GuitarPickTest {

    GuitarPick guitarPick;

    @Before
    public void before() {
        guitarPick = new GuitarPick("Guitar Pick", 2.00, 5.00);
    }

    @Test
    public void getType(){
        assertEquals( "Guitar Pick", guitarPick.getItemType());
    }

    @Test
    public void testBuyPrice(){
        assertEquals( 2.00, guitarPick.getBuyPrice(), 0.01);
    }

    @Test
    public void testSellPrice(){
        assertEquals( 5.00, guitarPick.getSellPrice(), 0.01);
    }

}
