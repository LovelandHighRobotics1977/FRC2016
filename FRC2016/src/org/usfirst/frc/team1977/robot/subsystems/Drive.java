package org.usfirst.frc.team1977.robot.subsystems;
import org.usfirst.frc.team1977.robot.RobotMap;
import org.usfirst.frc.team1977.robot.commands.Userdrive;

import edu.wpi.first.wpilibj.Talon;
//2016
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Loveland High Robotics 1977
 */
public class Drive extends Subsystem {
	
	private static Drive instance;
	
	private Talon frontLeft;
	private Talon frontRight;
	private Talon backLeft;	
	private Talon backRight;
	
	private Userdrive Userdrive;
	
	private boolean speedToggle = false;
	private double voltageCoefficient = 1;
	
	public Drive() {
		frontLeft = new Talon(RobotMap.DRIVE_FRONT_LEFT_TALON);
		frontRight = new Talon (RobotMap.DRIVE_FRONT_RIGHT_TALON);
		backLeft = new Talon(RobotMap.DRIVE_LEFT_TALON);
		backRight = new Talon(RobotMap.DRIVE_BACK_RIGHT_TALON);
	}
    public void initDefaultCommand() {
        userDrive = new userDrive();
        setDefaultCommand(userDrive);
        
    }
    public static Drive getInstance() {
    	if (instance == null) {
    		instance = new Drive();
    	}
    	return instance;
    }
    
    public void drive(double lPower, double rPower) {
    	
    }
}

