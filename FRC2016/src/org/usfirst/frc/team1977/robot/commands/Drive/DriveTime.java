package org.usfirst.frc.team1977.robot.commands.Drive;

import org.usfirst.frc.team1977.robot.commands.CommandBase;
import org.usfirst.frc.team1977.robot.subsystems.Drive;
import edu.wpi.first.wpilibj.command.Command;
/**
 *
 */
public class DriveTime extends CommandBase {
    
    private final String commandName = "Drive Forward";
    private final String subsytemName = "Drive";

    private final double vPowerMin, vPowerMax, RAMP_RATE = 0.25, rampInterval;
    private final long startTime, halfTime, endTime;
    private long lastRamp;
    private double driveSpeed;

    public DriveTime(double minSpeedVolts, double maxSpeedVolts, int timeMillis) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        requires(drive);
        
        vPowerMin = minSpeedVolts;
        vPowerMax = maxSpeedVolts;
        startTime = System.currentTimeMillis();
        halfTime = startTime + (timeMillis / 2);
        endTime = startTime + timeMillis;
        rampInterval = timeMillis / ((vPowerMax - vPowerMin) / RAMP_RATE);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        driveSpeed = vPowerMin;
        lastRamp = System.currentTimeMillis();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        drive.drive((driveSpeed / 12), (driveSpeed / 12), Drive.Side.HOLISTIC);
        if (System.currentTimeMillis() <= halfTime) {
            if (System.currentTimeMillis() - lastRamp >= rampInterval) {
                driveSpeed += (RAMP_RATE);
                lastRamp = System.currentTimeMillis();
            }
        } else {
            if (System.currentTimeMillis() - lastRamp >= rampInterval) {
                driveSpeed -= (RAMP_RATE);
                lastRamp = System.currentTimeMillis();
            }
        }
        if (driveSpeed > vPowerMax) {
            driveSpeed = vPowerMax;
        } else if (driveSpeed < vPowerMin) {
            driveSpeed = vPowerMin;
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (System.currentTimeMillis() >= endTime);
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
