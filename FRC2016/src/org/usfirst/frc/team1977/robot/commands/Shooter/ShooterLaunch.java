package org.usfirst.frc.team1977.robot.commands.Shooter;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team1977.robot.Robot;
import org.usfirst.frc.team1977.robot.commands.CommandBase;

/**
 *
 */
public class ShooterLaunch extends CommandBase {

    public ShooterLaunch() {
        // Use requires() here to declare subsystem dependencies
        requires(shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	shooter.startKickWheel();
    	setTimeout(1);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	shooter.stopKickWheel();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	shooter.stopKickWheel();
    }
}
