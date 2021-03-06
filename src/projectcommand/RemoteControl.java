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
public class RemoteControl {
    CommandInt[] onCommands;
    CommandInt[] offCommands;
    
    public RemoteControl()
    {
        onCommands=new CommandInt[7];
        offCommands=new CommandInt[7];
        
        CommandInt noCommand=new NoCommand();
        for (int i=0;i<7;i++)
        {
            onCommands[i]=noCommand;
            offCommands[i]=noCommand;
        }
    }
    
    public void setCommand(int slot, CommandInt onCommand, CommandInt offCommand)
    {
        onCommands[slot]=onCommand;
        offCommands[slot]=offCommand;
    }
    public void onButtonWasPushed(int slot)
    {
        if(onCommands[slot]!=null)
        {
        onCommands[slot].execute();
        }
    }
     public void offButtonWasPushed(int slot)
    {
        offCommands[slot].execute();
    }
    
     public String toString()
     {
         StringBuffer stringBuff=new StringBuffer();
         stringBuff.append("\n-----Remote Controle-----\n");
         for(int i=0;i<onCommands.length ; i++)
         {
             stringBuff.append("[slot " + i +"]" + onCommands[i].getClass().getName()
                            +"   "+ offCommands[i].getClass().getName()+"\n");
         }
         return stringBuff.toString();
     }
    
    
}
