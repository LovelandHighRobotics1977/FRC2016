package org.usfirst.frc.team1977.robot.subsystems;
import org.usfirst.frc.team1977.robot.RobotMap;
import org.usfirst.frc.team1977.robot.commands.arm.UserArm;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * @author Loveland High Robotics 1977
 * @author 57
 */
public class Arm extends Subsystem {
    
	//Runtime Constants
	private static final int ARM_RAMP_RATE = 1; // volts/second
	private static final boolean ARM_BRAKE = true;
	
	//Singleton Instances
	public static Arm instance;
    
	//Actuators
    private CANTalon armLeft;
    private CANTalon armRight;
    private Relay armRoller;
    
    //Digital
    private DigitalInput bottomLimit;
    private DigitalInput topLimit;
    
    //Commands
    private UserArm userArm;
    
    //Runtime variables
    private boolean voltageLock;
	
    private Arm() {
    	//Initialize actuators
    	armLeft = new CANTalon(RobotMap.ARM_LEFT_TALONSRX_DEVICENUM);
    	armRight = new CANTalon(RobotMap.ARM_RIGHT_TALONSRX_DEVICENUM);
    	armRoller = new Relay(RobotMap.ARM_ROLLER_SPIKE);
    	//Configure CAN actuators
    	armLeft.enableBrakeMode(ARM_BRAKE);
    	armLeft.setVoltageRampRate(ARM_RAMP_RATE);
    	armRight.enableBrakeMode(ARM_BRAKE);
    	armRight.setVoltageRampRate(ARM_RAMP_RATE);
    	//Initialize digital sensors
    	bottomLimit = new DigitalInput(RobotMap.ARM_BOTTOM_LIMIT);
    	topLimit = new DigitalInput(RobotMap.ARM_TOP_LIMIT);
    	//Initialize runtime variables
    	voltageLock = true;
    }
    
    public static Arm getInstance(){
    	if (instance == null){
    		instance = new Arm();
    	}
    	return instance;
    }
    
    public void setArm(double power){
    	armLeft.set(-power);
    	armRight.set(power);
    }
    
    public void initDefaultCommand() {
    	userArm = new UserArm();
        setDefaultCommand(userArm);    
    }
    
    public void stop() {
    	setArm(0);
    }
    
    public void toggleRoller() {
    	if (armRoller.get() == Relay.Value.kOff) {
    		armRoller.set(Relay.Value.kForward);
    	} else if (armRoller.get() == Relay.Value.kForward) {
    		armRoller.set(Relay.Value.kOff);
    	}
    }
    
    public boolean isVoltageLocked() {
    	return voltageLock;
    }
    
    public void setVoltageLocked(boolean locked) {
    	voltageLock = locked;
    }
}

