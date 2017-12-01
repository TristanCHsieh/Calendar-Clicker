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
public class Day extends JPanel{
    private JLabel dayLab,nameLab;
    private int dayNum;
    private Color borderColor;
    private String holidayName;
    public Day(){
        super();
        dayNum = 1;
        dayLab = new JLabel();
        nameLab = new JLabel();
        borderColor = Color.BLACK;
        holidayName = "";
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLineBorder(borderColor));
        dayLab.setText(dayNum + "");
        nameLab.setText(holidayName);
        add(dayLab,BorderLayout.NORTH);
        add(nameLab,BorderLayout.CENTER);
    }
    public Day(int n, Color c){
        super();
        dayNum = n;
        dayLab = new JLabel();
        nameLab = new JLabel();
        borderColor = c;
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLineBorder(borderColor));
        dayLab.setText(dayNum + "");
        add(dayLab,BorderLayout.NORTH);
        add(nameLab,BorderLayout.CENTER);
    }
    public Day(int n, Color c, String h){
        super();
        dayNum = n;
        dayLab = new JLabel();
        borderColor = c;
        holidayName = h;
        nameLab = new JLabel(holidayName, JLabel.CENTER);
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLineBorder(borderColor));
        dayLab.setText(dayNum + "");
        add(dayLab,BorderLayout.NORTH);
        add(nameLab,BorderLayout.CENTER);
    }
    public void select(){
        borderColor = Color.RED;
        setBorder(BorderFactory.createLineBorder(borderColor));
    }
    public String getName(){
        return holidayName;
    }
    public void setName(String n){
        holidayName = n;
        nameLab.setText(holidayName);
    }
}
