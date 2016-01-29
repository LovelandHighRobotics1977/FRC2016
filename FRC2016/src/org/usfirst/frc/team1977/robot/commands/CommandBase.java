package org.usfirst.frc.team1977.robot.commands;

import org.usfirst.frc.team1977.robot.input.OI;

import edu.wpi.first.wpilibj.command.Command;

/**
 * A shell parent class extending Command in order to provide a few extra,
 * general purpose characteristics to each of the commands used on the robot. In
 * particular, inherited access to all subsystems and other important robot
 * elements, such as the OI.
 *
 * @author Loveland High Robotics 1977
 * @author Evan Stewart
 */
public abstract class CommandBase extends Command {
	/**
	 * Inherited static access to the OI.
	 */
	protected static OI oi;
	

	/**
	 * Initialize the CommandBase, in doing so accessing and initializing every
	 * primary subsystem on the robot. Use this during robot initialization to
	 * prevent unnecessary redundancy.
	 */
	public static void init() {
		oi = OI.getInstance();
	}
}