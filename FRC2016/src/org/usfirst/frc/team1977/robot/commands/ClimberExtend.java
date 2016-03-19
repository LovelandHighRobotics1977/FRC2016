
package org.usfirst.frc.team1977.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team1977.robot.Robot;

/**
 *
 */
public class ClimberExtend extends CommandBase {

    public ClimberExtend() {
        // Use requires() here to declare subsystem dependencies
        requires(climber);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	climber.extendArms();
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
