/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendarclicker;
import java.util.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Clovvach
 */
public class Month {
    private int numDays;
    private String monthName;
    private Day dayArr[];
    public Month(int n, String m){
        numDays = n;
        monthName = m;
        dayArr = new Day[numDays];
        for(int j = 0; j < dayArr.length; j ++){
            dayArr[j] = new Day(j+1,Color.BLACK);
        }
    }
    public String getName(){
        return monthName;
    }
    public int getNumDays(){
        return numDays;
    }
}
