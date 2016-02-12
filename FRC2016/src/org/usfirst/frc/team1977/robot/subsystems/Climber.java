
package org.usfirst.frc.team1977.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climber extends Subsystem {
    
	public static Climber instance;
	
	private DoubleSolenoid leftPneumaticPiston;
	private DoubleSolenoid rightPneumaticPiston;
	
	public Climber() {
		leftPneumaticPiston = new DoubleSolenoid(1, 2);
		rightPneumaticPiston = new DoubleSolenoid(1, 2);

	}
    public void initDefaultCommand() {

    }
    
    public static Climber getInstance() {
		if (instance == null) {
			instance = new Climber();
		}
		return instance;
	}
    
    public void extendArms{
    	leftPneumaticPiston.set(DoubleSolenoid.Value.kForward);
    	rightPneumaticPiston.set(DoubleSolenoid.Value.kForward);
    }
    
    public void retractArms{
    	rightPneumaticPiston.set(DoubleSolenoid.Value.kReverse);
    	leftPneumaticPiston.set(DoubleSolenoid.Value.kReverse);
    }
    
    public void stopArm{
    	rightPneumaticPiston.set(DoubleSolenoid.Value.kOff);
    	rightPneumaticPiston.set(DoubleSolenoid.Value.kOff);
}

