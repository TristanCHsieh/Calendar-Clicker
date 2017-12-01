/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendar.clicker;

/**
 *
 * @author kiera
 */
public class Item 
{
    private double cost;
    private String name;
    private int bonus;
    public Item()
    {
        cost = 0;
        name = "Fix Me";
        bonus = 2;
    }
    public Item(double c, String n, int b)
    {
        cost = c;
        name = n;
        bonus = b;
    }
    public double getCost()
    {
        return cost;
    }
    public String getName()
    {
        return name;
    }
    public int getBonus()
    {
        return bonus;
    }
}
