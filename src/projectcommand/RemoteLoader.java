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
public class RemoteLoader {
    
    public static void main(String[] args)
    {
       /*
        RemoteControl remoteControl=new RemoteControl();
         Light livingRoomLight=new Light("Living Room");
        Light kitchenLight=new Light("Kitchen");
        CeilingFan ceilingFan=new CeilingFan("Living Room");
        GarageDoor garageDoor =new GarageDoor("");
        Stereo stereo=new Stereo("Living room");
        
        LightOnCommand livingRoomLightOn=new LightOnCommand(livingRoomLight);
         LightOffCommand livingRoomLightOff=new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenRoomLightOn=new LightOnCommand(kitchenLight);
         LightOffCommand kitchenRoomLightOff=new LightOffCommand(kitchenLight);
         
         CeilingFanOnCommand ceilingFanOn=new CeilingFanOnCommand(ceilingFan);
         CeilingFanOffCommand ceilingFanOff=new CeilingFanOffCommand(ceilingFan);
         
         GarageOpenCommand garageDoorOpen=new GarageOpenCommand(garageDoor);
         GarageCloseCommand garageDoorClose=new GarageCloseCommand(garageDoor);
         
         StereoOnWithCommand stereoOnWith =new StereoOnWithCommand(stereo);
         StereoOffCommand stereoOff=new StereoOffCommand(stereo);
         
         remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
         remoteControl.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
         remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
         remoteControl.setCommand(3, stereoOnWith, stereoOff);
         
         System.out.println(remoteControl);
         
         remoteControl.onButtonWasPushed(0);
         remoteControl.offButtonWasPushed(0);
         remoteControl.onButtonWasPushed(1);
         remoteControl.offButtonWasPushed(1);
         remoteControl.onButtonWasPushed(2);
         remoteControl.offButtonWasPushed(2);
         remoteControl.onButtonWasPushed(3);
         remoteControl.offButtonWasPushed(3);*/
        RemoteControlWithUndo remoteControl=new RemoteControlWithUndo();
        
        Light livingRoomLight=new Light("Living Room");
        
        LightOnCommand livingRoomLightOn=new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff=new LightOffCommand(livingRoomLight);
        
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
         
    }
    
}
