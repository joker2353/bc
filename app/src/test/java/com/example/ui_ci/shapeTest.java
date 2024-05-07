package com.example.ui_ci;





import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;

import org.junit.Test;

public class shapeTest extends TestCase {
    @Test
    public void testCircle() {
        Circle c = new Circle(5);
        double expectedArea = 78.5;
        double expectedPerimeter = 31.4;

        assertEquals(expectedArea, c.area(), 0.01);
        assertEquals(expectedPerimeter, c.perimeter(), 0.01);
    }


    @Test
    public void testSquare(){
        Square s = new Square(5);
        float s1=s.area();
        assertEquals(25.0, s1,0.01);
        assertEquals(20, s.perimeter(),0.01);
    }

    @Test
    public void testTriangle(){
        Triangle t = new Triangle(3, 4, 5);
        float s3=t.area();
        assertEquals(6.0, s3,0.01);
    }
}
