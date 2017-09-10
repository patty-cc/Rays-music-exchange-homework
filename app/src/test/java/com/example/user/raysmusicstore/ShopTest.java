package com.example.user.raysmusicstore;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;

/**
 * Created by user on 10/09/2017.
 */

public class ShopTest {

    Shop shop;
    ArrayList<Sellable> stock;

    @Before
    public void before(){
        stock = new ArrayList<>();
        stock.add( new Amplifier( "Amplifier", 20.00, 40.00 ));
    }


    @Test
    public void testShopStockArray(){
       assertEquals( "Amplifier" , stock.getStock());
    }
}
