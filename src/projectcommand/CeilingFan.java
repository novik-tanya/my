/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectcommand;

/**
 *
 * @author Пользователь
 */
public class CeilingFan 
{
    public static final int HIGH=3;
    public static final int MEDIUM=2;
    public static final int LOW=1;
    public static final int OFF=0;
    String location;
    int speed;

    public CeilingFan(String i) 
    {
        this.location=i;
        speed=OFF;
        System.out.println(i);
    }
    
    public void high()
    {
        speed=HIGH;
        System.out.println("CeilingFan is high!");
    }
    public void medium()
    {
        speed=MEDIUM;
        System.out.println("CeilingFan is medium!");
    }
    public void low()
    {
        speed=LOW;
        System.out.println("CeilingFan is low!");
    }
    public void off()
    {
        speed=OFF;
        System.out.println("CeilingFan is off!");
    }
     public int getSpeed()
    {
        System.out.println("CeilingFan is setSpeed!");
          return speed;
    }
    
}
