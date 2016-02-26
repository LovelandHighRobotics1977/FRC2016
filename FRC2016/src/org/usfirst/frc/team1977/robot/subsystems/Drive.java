package org.usfirst.frc.team1977.robot.subsystems;
import org.usfirst.frc.team1977.robot.RobotMap;
import org.usfirst.frc.team1977.robot.commands.Drive.UserDrive;

import edu.wpi.first.wpilibj.Talon;
//2016
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Loveland High Robotics 1977
 */
public class Drive extends Subsystem {
	
	//Singleton instances
	private static Drive instance;
	
	//Actuators
	private Talon frontLeft;
	private Talon frontRight;
	private Talon backLeft;
	private Talon backRight;
	
	//Commands
	private UserDrive userDrive;
	
	//Runtime variables
	private boolean finesseMode;
	
	public enum Side {
		HOLISTIC, FRONT, BACK;
		
		public static Side fromPOV(double pov) {
			if (pov < 0.0) {
				return Side.HOLISTIC;
			} else if (pov < 90.0 || pov > 270.0) {
				return Side.FRONT;
			} else if (pov > 90.0 && pov < 270.0) {
				return Side.BACK;
			}
			return null;
		}
	}
	
	private Drive() {
		frontLeft = new Talon(RobotMap.DRIVE_FRONT_LEFT_TALON);
		frontRight = new Talon (RobotMap.DRIVE_FRONT_RIGHT_TALON);
		backLeft = new Talon(RobotMap.DRIVE_BACK_LEFT_TALON);
		backRight = new Talon(RobotMap.DRIVE_BACK_RIGHT_TALON);
		finesseMode = true;
	}
	
    public void initDefaultCommand() {
        userDrive = new UserDrive();
        setDefaultCommand(userDrive);
    }
    
    public static Drive getInstance() {
    	if (instance == null) {
    		instance = new Drive();
    	}
    	return instance;
    }
    
    public void drive(double lPower, double rPower) {
    	drive(lPower, rPower, Side.HOLISTIC);
    }
    
    public void drive(double lPower, double rPower, Side side) {
    	if (side != Side.BACK) {
    		frontLeft.set(-lPower);
    		frontRight.set(rPower);
    	} else {
    		frontLeft.set(0);
    		frontRight.set(0);
    	}
    	if (side != Side.FRONT) {
    		backLeft.set(-lPower);
        	backRight.set(rPower);
    	} else {
    		backLeft.set(0);
        	backRight.set(0);
    	}
    }
    
    public void stop() {
    	drive(0, 0);
    }
    
    public boolean isFinesseMode() {
    	return finesseMode;
    }
    
    public void setFinesseMode(boolean mode) {
    	finesseMode = mode;
    }
}

