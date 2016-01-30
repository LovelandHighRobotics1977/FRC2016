package org.usfirst.frc.team1977.robot.subsystems;
import org.usfirst.frc.team1977.robot.RobotMap;
import edu.wpi.first.wpilibj.Victor;
//2016
import edu.wpi.first.wpilibj.command.Subsystem;
public class Shooter extends Subsystem {
	
	public static Shooter instance;
	
	private Victor leftShooterWheel;
	private Victor rightShooterWheel;
	private Victor flywheelShooter;
	
	public Shooter() {
		leftShooterWheel = new Victor(RobotMap.LEFT_SHOOTER_WHEEL_VICTOR);
		rightShooterWheel = new Victor(RobotMap.RIGHT_SHOOTER_WHEEL_VICTOR);
		flywheelShooter = new Victor(RobotMap.FLYWHEEL_SHOOTER_VICTOR);
	}
	public void initDefaultCommand() {
		
	}
	public static Shooter getInstance() {
		if (instance == null) {
			instance = new Shooter();
		}
		return instance;
	}
}
