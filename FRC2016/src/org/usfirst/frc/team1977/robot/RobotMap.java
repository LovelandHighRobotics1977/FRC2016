package org.usfirst.frc.team1977.robot;
//2016
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	// PWMOut
	// -Talon
	public static final int DRIVE_FRONT_LEFT_TALON = 0;
	public static final int DRIVE_FRONT_RIGHT_TALON = 1;
	public static final int DRIVE_BACK_LEFT_TALON = 2;
	public static final int DRIVE_BACK_RIGHT_TALON = 3;
	// RelayOut
	// -Spike
	public static final int ARM_ROLLER_SPIKE = 0;
	public static final int SHOOTER_KICKWHEEL_SPIKE = 1;
	// DigitalIO
	// -Limit
	public static final int ARM_BOTTOM_LIMIT = 0;
	public static final int ARM_TOP_LIMIT = 1;
	// AnalogIn
	// CANTrain
	// -TalonSRX
	public static final int SHOOTER_LEFT_WHEEL_DEVICENUM = 1;
	public static final int SHOOTER_RIGHT_WHEEL_DEVICENUM = 2;
	public static final int ARM_LEFT_TALONSRX_DEVICENUM = 3;
	public static final int ARM_RIGHT_TALONSRX_DEVICENUM = 4;
	// PCM
	// -Solenoid
	public static final int LEFT_CLIMBER_PISTON_FOREWARD = 0;
	public static final int LEFT_CLIMBER_PISTON_REVERSE = 1;
	public static final int RIGHT_CLIMBER_PISTON_FOREWARD = 2;
	public static final int RIGHT_CLIMBER_PISTON_REVERSE = 3;

	public class XBoxMappings {

		/**
		 * The axis number for the left horizontal axis of the XBox 360.
		 */
		public static final int XBOX_LEFT_X = 0;
		/**
		 * The axis number for the left vertical axis of the XBox 360.
		 */
		public static final int XBOX_LEFT_Y = 1;
		/**
		 * The axis number for the trigger buttons of the XBox 360.
		 */
		public static final int XBOX_LEFT_TRIGGER = 2;
		/**
		 * The axis number for the trigger buttons of the XBox 360.
		 */
		public static final int XBOX_RIGHT_TRIGGER = 3;
		/**
		 * The axis number for the right horizontal axis of the XBox 360.
		 */
		public static final int XBOX_RIGHT_X = 4;
		/**
		 * The axis number for the right vertical axis of the XBox 360.
		 */
		public static final int XBOX_RIGHT_Y = 5;
		/**
		 * The channel of the A button.
		 */
		public static final int BUTTON_A = 1;
		/**
		 * The channel of the B button.
		 */
		public static final int BUTTON_B = 2;
		/**
		 * The channel of the X button.
		 */
		public static final int BUTTON_X = 3;
		/**
		 * The channel of the Y button.
		 */
		public static final int BUTTON_Y = 4;
		/**
		 * The channel of the left shoulder button.
		 */
		public static final int BUTTON_SHOULDER_LEFT = 5;
		/**
		 * The channel of the right shoulder button.
		 */
		public static final int BUTTON_SHOULDER_RIGHT = 6;
		/**
		 * The channel of the back button.
		 */
		public static final int BUTTON_BACK = 7;
		/**
		 * The channel of the start button.
		 */
		public static final int BUTTON_START = 8;
		/**
		 * The channel of the left thumb button.
		 */
		public static final int BUTTON_THUMB_LEFT = 9;
		/**
		 * The channel of the right thumb button.
		 */
		public static final int BUTTON_THUMB_RIGHT = 10;
	};
}
