package org.oop;

public class DistanceAndDirectionCalculator {
    public static double xDifference;
    public static double yDifference;

    public static  void setCoordinatesDifference(Point start, Point end) {
        xDifference = end.getXdifference (start);
        yDifference = end.getYdifference (start);
    }

    public static double distance(Point start, Point end) {
        setCoordinatesDifference (start, end);
        return Math.sqrt (square (xDifference) + square (yDifference));
    }

    public static double direction(Point start, Point end) {
        setCoordinatesDifference (start, end);
        return Math.atan2 (yDifference, xDifference);
    }

    private static double square(double difference) {
        return Math.pow (difference, 2);
    }


}
