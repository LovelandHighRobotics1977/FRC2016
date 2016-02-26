package org.usfirst.frc.team1977.robot.commands.Drive;

import org.usfirst.frc.team1977.robot.commands.CommandBase;

/**
 *
 */
public class ToggleFinesse extends CommandBase {

    public ToggleFinesse() {
    	//Does not require drive; this command should be able to run in parallel to UserDrive.
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("Toggling drive voltage...");
    	drive.setFinesseMode(!drive.isFinesseMode());
    	System.out.println("Finesse driving mode is now " + (drive.isFinesseMode()? "enabled." : "disabled."));
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
