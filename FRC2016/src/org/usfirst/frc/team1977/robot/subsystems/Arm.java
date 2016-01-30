package org.usfirst.frc.team1977.robot.subsystems;
import org.usfirst.frc.team1977.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.Relay;

/**
 * @author Loveland High Robotics 1977
 * @author 57
 */
public class Arm extends Subsystem {
    public static Arm instance;
    private Victor ArmA;
    private Victor ArmB;
    private Relay ArmRoller;
	
    public Arm() {
    	ArmA = new Victor(RobotMap.ARM_A_MOTOR_CONTROLLER);
    	ArmB = new Victor(RobotMap.ARM_B_MOTOR_CONTROLLER);
    	ArmRoller = new Relay(RobotMap.ARM_ROLLER_SPIKE);
    }
    
    public static Arm getInstance(){
    	if (instance == null){
    		instance = new Arm();
    	}
    	return instance;
    }

    public void initDefaultCommand() {
        
    }
}

