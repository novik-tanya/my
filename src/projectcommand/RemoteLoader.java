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
        
        /*Light livingRoomLight=new Light("Living Room");
        
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
        remoteControl.undoButtonWasPushed();*/
        
     /*   CeilingFan ceilingFan=new CeilingFan("Living Room");
        
        CeilingFanMediumCommand ceilingFanMedium=new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHightCommand ceilingFanHight=new CeilingFanHightCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff=new CeilingFanOffCommand(ceilingFan);
        
        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
         remoteControl.setCommand(1, ceilingFanHight, ceilingFanOff);
         
         remoteControl.onButtonWasPushed(0);
         remoteControl.offButtonWasPushed(0);
         System.out.println(remoteControl);
         remoteControl.undoButtonWasPushed();
         
         remoteControl.onButtonWasPushed(1);
         System.out.println(remoteControl);
         remoteControl.undoButtonWasPushed();*/
        Light light=new Light("Living Room");
        TV tv=new TV("Living Room");
        Stereo stereo=new Stereo("Living Room");
        Hottub hottub=new Hottub();
        
        LightOnCommand lightOn=new LightOnCommand(light);
        StereoOnCommand stereoOn=new StereoOnCommand(stereo);
        TVOnCommand tvOn=new TVOnCommand(tv);
        HottubOnCommand hottubOn=new HottubOnCommand(hottub);
        
        LightOffCommand lightOff=new LightOffCommand(light);
        StereoOffCommand stereoOff=new StereoOffCommand(stereo);
        TVOffCommand tvOff=new TVOffCommand(tv);
        HottubOffCommand hottubOff=new HottubOffCommand(hottub);
        
        CommandInt[] partyOn={lightOn, stereoOn, tvOn, hottubOn    };
        CommandInt[] partyOff={lightOff, stereoOff, tvOff, hottubOff    };
        
        MacroCommand partyOnMacro=new MacroCommand(partyOn);
        MacroCommand partyOffMacro=new MacroCommand(partyOff);
        
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
        
        System.out.println(remoteControl);
        System.out.println("---Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("---Pushing Macro Off---");
        remoteControl.offButtonWasPushed(0);
        
        
                
    }
    
}
