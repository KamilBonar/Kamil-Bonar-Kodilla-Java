package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {
    @Nested
    @DisplayName("The Tests")
    class Tests {
        @Test
        public void testAddFigure() {

            //Given
            ShapeCollector shapeCollectors = new ShapeCollector();
            Shape shape = new Square(3);
            //When
            shapeCollectors.addFigure(shape);
            //Then
            Assertions.assertEquals(1, shapeCollectors.shapeCollection().size());
        }

        @Test
        public void testRemoveFigure() {

            //Given
            ShapeCollector shapeCollectors = new ShapeCollector();
            Shape shape = new Square(4);
            shapeCollectors.addFigure(shape);
            //When
            boolean result = shapeCollectors.removeFigure(shape);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollectors.shapeCollection().size());
        }

        @Test
        public void testGetFigureNumber() {

            //Given
            ShapeCollector shapeCollectors = new ShapeCollector();
            Shape shape = new Square(4);
            shapeCollectors.addFigure(shape);
            //When
            Shape shapeResult = shapeCollectors.getFigure(0);
            //Then
            Assertions.assertEquals(shape, shapeResult);
        }

        @Test
        public void testFigures() {

            //Given
            ShapeCollector shapeCollectors = new ShapeCollector();
            Shape shape = new Square(4);
            shapeCollectors.addFigure(shape);
            ArrayList<Shape> shapeList = new ArrayList<>();
            shapeList.add(shape);
            //When
            List<Shape> shapeResultList = shapeCollectors.shapeCollection();
            //Then
            Assertions.assertEquals(shapeList.toString(), shapeResultList.toString());
        }
        @Test
        public void testGetFigureHeigher(){

            //Given
            ShapeCollector shapeCollectors = new ShapeCollector();
            //When
            Shape shapeResult = shapeCollectors.getFigure(2);
            //Then
            Assertions.assertNull(shapeResult);
        }
        @Test
        public void testGetFigureMinus(){

            //Given
            ShapeCollector shapeCollectors = new ShapeCollector();
            //When
            Shape shapeResult = shapeCollectors.getFigure(-2);
            //Then
            Assertions.assertNull(shapeResult);
        }
    }
}