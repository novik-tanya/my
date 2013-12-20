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
public class MacroCommand implements CommandInt
{
    CommandInt[] commands;

    public MacroCommand(CommandInt[] commands)
    {
        this.commands=commands;
    }
    

    public void execute() {
        for(int i=0; i<commands.length; i++)
        {
            commands[i].execute();
        }
    }

    public void undo() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (int i=0; i<commands.length; i++)
        {
            commands[i].undo();
        }
    }
    
}
