/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendar.clicker;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author kiera
 */
public class Shop extends JFrame implements ActionListener
{
    private JPanel main, buttonPanel;
    private HashMap<String, Item> itemMap;
    private ArrayList<JButton> buttonList;
    public Shop(Item[] itemList)
    {
        super("Shop");
        main = new JPanel();
        buttonPanel = new JPanel();
        buttonList = new ArrayList<JButton>();
        itemMap = new HashMap<String, Item>();
        setSize(500, 800);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2-getSize().width/2, dim.height/2-getSize().height/2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        buttonPanel.setLayout(new GridLayout(itemList.length, 1));
        
        for(int i = 0; i < itemList.length; i ++)
        {
            JButton tempButton = new JButton(itemList[i].getName());
            buttonPanel.add(tempButton);
            buttonList.add(tempButton);
            itemMap.put(itemList[i].getName(), itemList[i]);
            tempButton.addActionListener(this);
        }
        
        
        
        add(main, BorderLayout.EAST);
        add(buttonPanel, BorderLayout.WEST);
        setVisible(true);
    }
    public void addItem(Item x)
    {
        itemMap.put(x.getName(), x); //Note: don't have 2 items with same name.
        for(String p: itemMap.keySet())
        {
            if(itemMap.get(p).equals("tristan is a shithead"))
                System.out.println("I agree");
        }
    }
    public void actionPerformed(ActionEvent e)
    {
        
    }
}
