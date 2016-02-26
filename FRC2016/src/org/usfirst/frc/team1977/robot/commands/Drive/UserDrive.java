package org.usfirst.frc.team1977.robot.commands.Drive;

import org.usfirst.frc.team1977.robot.commands.CommandBase;
import org.usfirst.frc.team1977.robot.subsystems.Drive;

import edu.wpi.first.wpilibj.command.Command;
//2016
/**
 *
 * @author Loveland High Robotics 1977
 */
public class UserDrive extends CommandBase {

    public UserDrive() {
        requires(drive);
    	// Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }
    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double theta = oi.getDriveJoystick().getPOV(0);
    	double lPower = oi.getDriveJoystick().getLeftY();
    	double rPower = oi.getDriveJoystick().getRightY();
    	if (drive.isFinesseMode()) {
    		lPower /= 2;
    		rPower /= 2;
    	}
    	if (Math.abs(lPower) < 0.2) {
    		lPower = 0;
    	}
    	if (Math.abs(rPower) < 0.2) {
    		rPower = 0;
    	}
    	drive.drive(lPower, rPower, Drive.Side.fromPOV(theta));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	drive.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	drive.stop();
    }
}
