/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arun Reddy
 */
public class AreaCalculator {
    public static double area (double radius)
    {
        if(radius<0)
        {
            return -1;
        }
        else
        {
           return Math.PI*radius*radius; 
        }
    }
    public static double area(double x, double y)
    {
        if(x<0||y<0)
        {
            return -1;
        }
        else
        {
            return x*y;
        }
    }
    
}
