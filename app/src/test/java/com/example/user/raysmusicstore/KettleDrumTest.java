package com.example.user.raysmusicstore;

/**
 * Created by user on 09/09/2017.
 */

import static org.junit.Assert.*;
import org.junit.*;

public class KettleDrumTest {

    KettleDrum kettleDrum;

    @Before
    public void before(){
        kettleDrum = new KettleDrum( "Timpani", "Bronze", "Percussion", "Cow Hide" );
    }

    @Test
    public void testKettleDrumSkin(){
        assertEquals( "Cow Hide", kettleDrum.getSkin());
    }

    @Test
    public void testKettleDrumMakesNoise(){
        assertEquals( "BOOM BOOM BOOM", kettleDrum.play());
    }

    @Test
    public void testKettleDrumColour(){
        assertEquals( "Bronze", kettleDrum.getColour());
    }

    @Test
    public void testKettleDrumBrand(){
        assertEquals( "Timpani", kettleDrum.getBrand());
    }

    @Test
    public void testKettleDrumFamily(){
        assertEquals( "Percussion", kettleDrum.getFamily());
    }


}
