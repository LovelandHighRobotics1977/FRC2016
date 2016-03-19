package org.usfirst.frc.team1977.robot.commands.Auto;

import org.usfirst.frc.team1977.robot.commands.CommandBase;
import org.usfirst.frc.team1977.robot.commands.Drive.DriveTime;

import edu.wpi.first.wpilibj.command.CommandGroup;
/**
 *
 */
public class LowBar extends CommandBase {

    public LowBar() {
        // Use requires() here to declare subsystem dependencies
        requires(drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(15);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	 addSequential( new DriveTime() );
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {

    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {

    }
}
