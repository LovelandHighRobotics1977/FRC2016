package org.usfirst.frc.team1977.robot.input;

import org.usfirst.frc.team1977.robot.commands.Drive.ToggleFinesse;
import org.usfirst.frc.team1977.robot.commands.Shooter.ShooterSpinToggle;
import org.usfirst.frc.team1977.robot.commands.arm.VoltageLock;
//2016

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	private static OI instance;
	private XBoxController driveJoystick;
	private XBoxController shooterJoystick;
	private OI() {
		driveJoystick = new XBoxController(0);
		shooterJoystick = new XBoxController(1);
	}
	
	public void init() {
		driveJoystick.aWhenPressed(new ShooterSpinToggle());
		driveJoystick.backWhenPressed(new VoltageLock());
		driveJoystick.rightThumbWhenPressed(new ToggleFinesse());
	}
	/**
	 * Access the singleton instance of OI, constructing it if necessary.
	 * 
	 * @return The singleton instance of OI.
	 */
	public static OI getInstance() {
		if (instance == null) {
			instance = new OI();
		}
		return instance;
	}
	public XBoxController getDriveJoystick() {
		return driveJoystick;
	}
	public XBoxController getShooterJoystick() {
		return shooterJoystick;
	}
}
