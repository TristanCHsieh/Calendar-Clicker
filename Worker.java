/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendarclicker;

/**
 *
 * @author Clovvach
 */
public class Worker {
    private String workerName;
    private float salary;
    private float utility;
    public Worker(String w, float s, float u){
        workerName = w;
        salary = s;
        utility = u;
    }
    public String getName(){
        return workerName;
    }  
    public float getSalary(){
        return salary;
    }    
    public float getUtility(){
        return utility;
    }
    public float getProfit(){
        return utility-salary;
    }
}
