package org.usfirst.frc.team1977.robot.subsystems;
import org.usfirst.frc.team1977.robot.RobotMap;

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
	
	private UserDrive userDrive;
	
	private boolean speedToggle = false;
	private double voltageCoefficient = 1;
	private double turnPowerCoefficient = 1;
	
	public Drive() {
		frontLeft = new Talon(RobotMap.DRIVE_FRONT_LEFT_TALON);
		frontRight = new Talon (RobotMap.DRIVE_FRONT_RIGHT_TALON);
		backLeft = new Talon(RobotMap.DRIVE_LEFT_TALON);
		backRight = new Talon(RobotMap.DRIVE_BACK_RIGHT_TALON);
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

