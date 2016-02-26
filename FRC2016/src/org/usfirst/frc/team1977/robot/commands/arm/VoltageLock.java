package org.usfirst.frc.team1977.robot.commands.arm;

import org.usfirst.frc.team1977.robot.commands.CommandBase;

/**
 *
 */
public class VoltageLock extends CommandBase {

    public VoltageLock() {
        //Does not require arm; this command should be able to run in parallel to UserArm.
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("Toggling arm voltage lock...");
    	arm.setVoltageLocked(!arm.isVoltageLocked());
    	System.out.println("Arm voltage lock is now " + (arm.isVoltageLocked()? "enabled." : "disabled."));   	
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
