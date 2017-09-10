package com.example.user.raysmusicstore;

/**
 * Created by user on 09/09/2017.
 */

import static org.junit.Assert.*;
import org.junit.*;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar( "Fender", "Red", "Percussion",  6 );
    }

    @Test
    public void numberOfStings(){
        assertEquals( 6, guitar.getStrings());
    }

    @Test
    public void testGuitarMakesSound(){
        assertEquals( "Strum Strum Strum", guitar.play());
    }

    @Test
    public void testGuitarColour(){
        assertEquals( "Red", guitar.getColour());
    }

    @Test
    public void testGuitarBrand(){
        assertEquals( "Fender", guitar.getBrand());
    }

    @Test
    public void testGuitarFamily(){
        assertEquals( "Percussion", guitar.getFamily());
    }


}
