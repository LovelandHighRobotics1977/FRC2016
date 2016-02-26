package org.usfirst.frc.team1977.robot.subsystems;
import org.usfirst.frc.team1977.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.Victor;
//2016
import edu.wpi.first.wpilibj.command.Subsystem;
public class Shooter extends Subsystem {
	
	public static Shooter instance;
	
	private CANTalon leftShooterWheel;
	private CANTalon rightShooterWheel;
	private Relay kickWheelShooter;
	
	private Shooter() {
		leftShooterWheel = new CANTalon(RobotMap.SHOOTER_LEFT_WHEEL_DEVICENUM);
		rightShooterWheel = new CANTalon(RobotMap.SHOOTER_RIGHT_WHEEL_DEVICENUM);
		kickWheelShooter = new Relay(RobotMap.SHOOTER_KICKWHEEL_SPIKE);
	}
	
	public void initDefaultCommand() {
		
	}
	
	public static Shooter getInstance() {
		if (instance == null) {
			instance = new Shooter();
		}
		return instance;
	}
	
	public void setShotWheel(double lPower, double rPower) {
		leftShooterWheel.set(lPower);
		rightShooterWheel.set(-rPower);
	}
	
	public void spinUp() {
		setShotWheel(1.0, 1.0);
	}
	
	public void stop() {
		setShotWheel(0, 0);
	}
	
	public void startKickWheel() {
		kickWheelShooter.set(Relay.Value.kForward);
	}
	
	public void stopKickWheel() {
		kickWheelShooter.set(Relay.Value.kOff);
	}
	
	public boolean isShooterSpinning() {
		return (Math.abs(leftShooterWheel.get()) >= 1 || Math.abs(rightShooterWheel.get()) >= 1);
	}
}
