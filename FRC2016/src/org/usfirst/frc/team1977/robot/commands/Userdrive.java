package org.usfirst.frc.team1977.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
//2016
/**
 *
 * @author Loveland High Robotics 1977
 */
public class Userdrive extends CommandBase {

    public Userdrive() {
        requires(drive);
    	// Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }
    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double lPower = oi.getDriveJoystick().getLeftY();
    	double rPower = oi.getDriveJoystick().getRightY();
    	if (Math.abs(lPower) < 0.2) {
    		lPower = 0;
    	}
    	if (Math.abs(rPower) < 0.2) {
    		rPower = 0;
    	}
    	drive.drive(lPower, rPower);
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
