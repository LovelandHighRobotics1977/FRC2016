package org.usfirst.frc.team1977.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team1977.robot.Robot;
import org.usfirst.frc.team1977.robot.RobotMap;
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
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (shooter.isShooterSpinning() == true){
    		shooter.stopShooterWheel();
    	}
    	else {
    		shooter.spinUp();
    	}
    	//Inverts the state of the spinner
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
        //Ends immediately
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
