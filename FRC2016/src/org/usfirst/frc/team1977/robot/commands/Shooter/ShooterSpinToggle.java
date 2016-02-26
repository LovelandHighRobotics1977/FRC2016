package org.usfirst.frc.team1977.robot.commands.Shooter;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team1977.robot.Robot;
import org.usfirst.frc.team1977.robot.RobotMap;
import org.usfirst.frc.team1977.robot.commands.CommandBase;
import org.usfirst.frc.team1977.robot.subsystems.Shooter;

/**
 *
 */
public class ShooterSpinToggle extends CommandBase {

    public ShooterSpinToggle() {
        // Use requires() here to declare subsystem dependencies
        requires(shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("Toggling shooter spin...");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (shooter.isShooterSpinning()) {
    		shooter.stop();
    	}
    	else {
    		shooter.spinUp();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	System.out.println("Shooter is now " + (shooter.isShooterSpinning()? "live." : "resting."));
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
