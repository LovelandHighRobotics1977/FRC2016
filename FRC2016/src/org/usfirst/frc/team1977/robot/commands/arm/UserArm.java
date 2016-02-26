package org.usfirst.frc.team1977.robot.commands.arm;

import org.usfirst.frc.team1977.robot.RobotMap;
import org.usfirst.frc.team1977.robot.commands.CommandBase;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 * @author Loveland High Robotics 1977
 */
public class UserArm extends CommandBase {

	private double axisSum = 0.0;
	private double voltageCoeff = 0.25;
	private boolean triggerLastState = false;
	
    public UserArm() {
        requires(arm);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	axisSum = oi.getDriveJoystick().getRightTriggerAxis() - 
    			oi.getDriveJoystick().getLeftTriggerAxis();
    	if (oi.getDriveJoystick().getLeftShoulderValue() && !arm.isVoltageLocked()) {
    		voltageCoeff *= 2;
    	}
    	if (oi.getDriveJoystick().getRightShoulderValue() && !arm.isVoltageLocked()) {
    		voltageCoeff *= 2;
    	}
    	System.out.println("ASUM " + axisSum + ", COEFF " + voltageCoeff + ", RES ");
    	arm.setArm(axisSum * voltageCoeff);
    	boolean triggerCurrentState = oi.getDriveJoystick().
    			getXButtonValue();
    	if (triggerCurrentState) {
    		if (!triggerLastState) {
    			arm.toggleRoller();
    		}
    	}
    	triggerLastState = triggerCurrentState;
    	voltageCoeff = 0.25;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
