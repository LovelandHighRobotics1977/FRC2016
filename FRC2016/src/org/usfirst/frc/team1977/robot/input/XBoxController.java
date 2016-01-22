package org.usfirst.frc.team1977.robot.input;

import java.util.Vector;

import org.usfirst.frc.team1977.robot.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;

/**
 * A wrapper class and further abstraction layer for Joystick that returns
 * specified input from an XBox 360 controller. Contains method to check input
 * from the a, b, x, and y buttons; the left and right bumpers; and the axes for
 * the left and right joysticks and triggers. The input channels for each of
 * these controls are specified in an interior class of the RobotMap. Now
 * updated in order to take full advantage of the further button inputs
 * available on the 2015 driver station.
 * 
 * @author Loveland High Robotics 1977
 * @author Gavin Stewart
 * @author Ali Persings
 * @author Evan Stewart
 */
public class XBoxController extends Joystick {

	// Instance values
	private int port;
	// Button inputs
	private JoystickButton a;
	private JoystickButton b;
	private JoystickButton x;
	private JoystickButton y;
	private JoystickButton shoulderLeft;
	private JoystickButton shoulderRight;
	private JoystickButton back;
	private JoystickButton start;
	private JoystickButton thumbLeft;
	private JoystickButton thumbRight;
	// Listeners
	private Vector axisListeners;

	/**
	 * Creates a new XBox 360 controller instance at the specified port
	 * 
	 * @param port
	 *            The input port this controller occupies on the Driver Station
	 *            (1 <= x <= 4)
	 */
	public XBoxController(int port) {
		super(port);
		this.port = port;
		initInputSources();
		axisListeners = new Vector();
	}

	/**
	 * Creates a new Joystick button object with this controller as its parent
	 * 
	 * @param number
	 *            The input number on the controller to which this button is to
	 *            be mapped
	 * @return The created JoystickButton mapped to the specified input on this
	 *         controller
	 */
	private JoystickButton addButton(int number) {
		return new JoystickButton(this, number);
	}

	/**
	 * Adds to this controller all of the possible buttons from which input is
	 * taken. Input mappings are pulled from the RobotMap.
	 */
	private void initInputSources() {
		a = addButton(RobotMap.XBoxMappings.BUTTON_A);
		b = addButton(RobotMap.XBoxMappings.BUTTON_B);
		x = addButton(RobotMap.XBoxMappings.BUTTON_X);
		y = addButton(RobotMap.XBoxMappings.BUTTON_Y);
		shoulderLeft = addButton(RobotMap.XBoxMappings.BUTTON_SHOULDER_LEFT);
		shoulderRight = addButton(RobotMap.XBoxMappings.BUTTON_SHOULDER_RIGHT);
		back = addButton(RobotMap.XBoxMappings.BUTTON_BACK);
		start = addButton(RobotMap.XBoxMappings.BUTTON_START);
		thumbLeft = addButton(RobotMap.XBoxMappings.BUTTON_THUMB_LEFT);
		thumbRight = addButton(RobotMap.XBoxMappings.BUTTON_THUMB_RIGHT);
	}

	// AButton Methods

	/**
	 * Get the JoystickButton corresponding to the A button
	 * 
	 * @return The JoystickButton corresponding to the A button.
	 */
	public JoystickButton getAButton() {
		return a;
	}

	/**
	 * Returns whether or not the A button is pressed
	 * 
	 * @return A boolean corresponding to whether or not A is pressed
	 */
	public boolean getAButtonValue() {
		return a.get();
	}

	/**
	 * Sets the command to be run while the A button is held (a.get() is true)
	 * 
	 * @param command
	 *            The command to be executed while A is held
	 */
	public void aWhileHeld(Command command) {
		a.whileHeld(command);
	}

	/**
	 * Sets the command to be run when the A button is released (a.get() becomes
	 * false)
	 * 
	 * @param command
	 *            The command to be executed when A is released
	 */
	public void aWhenReleased(Command command) {
		a.whenReleased(command);
	}

	/**
	 * Sets the command to be run when the A button is pressed (a.get() becomes
	 * true)
	 * 
	 * @param command
	 *            The command to be executed when A is pressed
	 */
	public void aWhenPressed(Command command) {
		a.whenPressed(command);
	}

	// B Button Methods

	/**
	 * Get the JoystickButton corresponding to the B button
	 * 
	 * @return The JoystickButton corresponding to the B button.
	 */
	public JoystickButton getBButton() {
		return b;
	}

	/**
	 * Returns whether or not the B button is pressed
	 * 
	 * @return A boolean corresponding to whether or not B is pressed
	 */
	public boolean getBButtonValue() {
		return b.get();
	}

	/**
	 * Sets the command to be run when the B button is released (b.get() becomes
	 * false)
	 * 
	 * @param command
	 *            The command to be executed when B is released
	 */
	public void bWhenReleased(Command command) {
		b.whenReleased(command);
	}

	/**
	 * Sets the command to be run when the B button is pressed (b.get() becomes
	 * true)
	 * 
	 * @param command
	 *            The command to be executed when B is pressed
	 */
	public void bWhenPressed(Command command) {
		b.whenPressed(command);
	}

	/**
	 * Sets the command to be run while the B button is held (b.get() is true)
	 * 
	 * @param command
	 *            The command to be executed while B is held
	 */
	public void bWhileHeld(Command command) {
		b.whileHeld(command);
	}

	// X Button methods

	/**
	 * Get the JoystickButton corresponding to the X button
	 * 
	 * @return The JoystickButton corresponding to the X button.
	 */
	public JoystickButton getXButton() {
		return x;
	}

	/**
	 * Returns whether or not the X button is pressed
	 * 
	 * @return A boolean corresponding to whether or not X is pressed
	 */
	public boolean getXButtonValue() {
		return x.get();
	}

	/**
	 * Sets the command to be run when the X button is pressed (x.get() becomes
	 * true)
	 * 
	 * @param command
	 *            The command to be executed when X is pressed
	 */
	public void xWhenPressed(Command command) {
		x.whenPressed(command);
	}

	/**
	 * Sets the command to be run while the X button is held (x.get() is true)
	 * 
	 * @param command
	 *            The command to be executed while X is held
	 */
	public void xWhileHeld(Command command) {
		x.whileHeld(command);
	}

	/**
	 * Sets the command to be run when the X button is released (x.get() becomes
	 * false)
	 * 
	 * @param command
	 *            The command to be executed when X is released
	 */
	public void xWhenReleased(Command command) {
		x.whenReleased(command);
	}

	// Y Button methods

	/**
	 * Get the JoystickButton corresponding to the Y button
	 * 
	 * @return The JoystickButton corresponding to the Y button.
	 */
	public JoystickButton getYButton() {
		return y;
	}

	/**
	 * Returns whether or not the Y button is pressed
	 * 
	 * @return A boolean corresponding to whether or not Y is pressed
	 */
	public boolean getYButtonValue() {
		return y.get();
	}

	/**
	 * Sets the command to be run when the Y button is released (y.get() becomes
	 * false)
	 * 
	 * @param command
	 *            The command to be executed when Y is released
	 */
	public void yWhenReleased(Command command) {
		y.whenReleased(command);
	}

	/**
	 * Sets the command to be run when the Y button is pressed (y.get() becomes
	 * true)
	 * 
	 * @param command
	 *            The command to be executed when Y is pressed
	 */
	public void yWhenPressed(Command command) {
		y.whenPressed(command);
	}

	/**
	 * Sets the command to be run while the Y button is held (y.get() is true)
	 * 
	 * @param command
	 *            The command to be executed while Y is held
	 */
	public void yWhileHeld(Command command) {
		y.whileHeld(command);
	}

	// Left shoulder Methods

	/**
	 * Get the JoystickButton corresponding to the left bumper
	 * 
	 * @return The JoystickButton corresponding to the left bumper.
	 */
	public JoystickButton getLeftShoulder() {
		return shoulderLeft;
	}

	/**
	 * Returns whether or not the left bumper is pressed
	 * 
	 * @return A boolean corresponding to whether or not the left bumper is
	 *         pressed
	 */
	public boolean getLeftShoulderValue() {
		return shoulderLeft.get();
	}

	/**
	 * Sets the command to be run when the left bumper button is pressed
	 * (shoulderLeft.get() becomes true)
	 * 
	 * @param command
	 *            The command to be executed when the left bumper is pressed
	 */
	public void leftWhenPressed(Command command) {
		shoulderLeft.whenPressed(command);
	}

	/**
	 * Sets the command to be run while the left bumper is held
	 * (shoulderLeft.get() is true)
	 * 
	 * @param command
	 *            The command to be executed while the left bumper is held
	 */
	public void leftWhileHeld(Command command) {
		shoulderLeft.whileHeld(command);
	}

	/**
	 * Sets the command to be run when the left bumper is released
	 * (shoulderLeft.get() becomes false)
	 * 
	 * @param command
	 *            The command to be executed when the left bumper is released
	 */
	public void leftWhenReleased(Command command) {
		shoulderLeft.whenReleased(command);
	}

	// Right Shoulder methods

	/**
	 * Get the JoystickButton corresponding to the right bumper
	 * 
	 * @return The JoystickButton corresponding to the right bumper.
	 */
	public JoystickButton getRightShoulder() {
		return shoulderRight;
	}

	/**
	 * Returns whether or not the right bumper is pressed
	 * 
	 * @return A boolean corresponding to whether or not the right bumper is
	 *         pressed
	 */
	public boolean getRightShoulderValue() {
		return shoulderRight.get();
	}

	/**
	 * Sets the command to be run when the right bumper button is pressed
	 * (shoulderRight.get() becomes true)
	 * 
	 * @param command
	 *            The command to be executed when the right bumper is pressed
	 */
	public void rightWhenPressed(Command command) {
		shoulderRight.whenPressed(command);
	}

	/**
	 * Sets the command to be run while the right bumper is held
	 * (shoulderRight.get() is true)
	 * 
	 * @param command
	 *            The command to be executed while right bumper is held
	 */
	public void rightWhileHeld(Command command) {
		shoulderRight.whileHeld(command);
	}

	/**
	 * Sets the command to be run when the right bumper button is released
	 * (shoulderRight.get() becomes false)
	 * 
	 * @param command
	 *            The command to be executed when the right bumper is released
	 */
	public void rightWhenReleased(Command command) {
		shoulderRight.whenReleased(command);
	}

	// Back methods

	public JoystickButton getBackButton() {
		return back;
	}

	public boolean getBackButtonValue() {
		return back.get();
	}

	public void backWhenPressed(Command command) {
		back.whenPressed(command);
	}

	public void backWhileHeld(Command command) {
		back.whileHeld(command);
	}

	public void backWhenReleased(Command command) {
		back.whenReleased(command);
	}

	// Start methods

	public JoystickButton getStartButton() {
		return start;
	}

	public boolean getStartButtonValue() {
		return start.get();
	}

	public void startWhenPressed(Command command) {
		start.whenPressed(command);
	}

	public void startWhileHeld(Command command) {
		start.whileHeld(command);
	}

	public void startWhenReleased(Command command) {
		start.whenReleased(command);
	}

	// Left thumb methods

	public JoystickButton getLeftThumbButton() {
		return thumbLeft;
	}

	public boolean getLeftThumbButtonValue() {
		return thumbLeft.get();
	}

	public void leftThumbWhenPressed(Command command) {
		thumbLeft.whenPressed(command);
	}

	public void leftThumbWhileHeld(Command command) {
		thumbLeft.whileHeld(command);
	}

	public void leftThumbWhenReleased(Command command) {
		thumbLeft.whenReleased(command);
	}

	// Right thumb methods

	public JoystickButton getRightThumbButton() {
		return thumbRight;
	}

	public boolean getRightThumbButtonValue() {
		return thumbRight.get();
	}

	public void rightThumbWhenPressed(Command command) {
		thumbRight.whenPressed(command);
	}

	public void rightThumbWhileHeld(Command command) {
		thumbRight.whileHeld(command);
	}

	public void rightThumbWhenReleased(Command command) {
		thumbRight.whenReleased(command);
	}

	// Axis methods

	/**
	 * Returns the value of the x axis of the left joystick.
	 * 
	 * @return The value of the x axis of the left joystick.
	 */
	public double getLeftX() {
		return getRawAxis(RobotMap.XBoxMappings.XBOX_LEFT_X);
	}

	/**
	 * Returns the value of the y axis of the left joystick.
	 * 
	 * @return The value of the y axis of the left joystick.
	 */
	public double getLeftY() {
		return getRawAxis(RobotMap.XBoxMappings.XBOX_LEFT_Y);
	}

	/**
	 * Returns the value of the x axis of the right joystick.
	 * 
	 * @return The value of the x axis of the right joystick.
	 */
	public double getRightX() {
		return getRawAxis(RobotMap.XBoxMappings.XBOX_RIGHT_X);
	}

	/**
	 * Returns the value of the y axis of the right joystick
	 * 
	 * @return The value of the y axis of the right joystick
	 */
	public double getRightY() {
		return getRawAxis(RobotMap.XBoxMappings.XBOX_RIGHT_Y);
	}

	/**
	 * Returns the value of the left joystick trigger.
	 * 
	 * @return The value of the left joystick trigger.
	 */
	public double getLeftTriggerAxis() {
		return getRawAxis(RobotMap.XBoxMappings.XBOX_LEFT_TRIGGER);
	}

	/**
	 * Returns the value of the right joystick trigger.
	 * 
	 * @return The value of the right joystick trigger.
	 */
	public double getRightTriggerAxis() {
		return getRawAxis(RobotMap.XBoxMappings.XBOX_RIGHT_TRIGGER);
	}

	/**
	 * Get the port this controller occupies on the Driver Station
	 * 
	 * @return This controller's driver station port (1 <= x <= 4)
	 */
	public int getPort() {
		return port;
	}
}