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
        shop = new Shop( "The Music Emporium");
        stock = new ArrayList<>();
    }

    @Test
    public void testShopName(){
        assertEquals( "The Music Emporium", shop.getShopName());
    }

    @Test
    public void testShopStockArray(){
        shop = new Shop( "The Music Emproium", stock );
    }
}
