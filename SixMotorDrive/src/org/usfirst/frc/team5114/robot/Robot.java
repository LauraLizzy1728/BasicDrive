package org.usfirst.frc.team5114.robot;

import com.ctre.CANTalon;
import com.ctre.CANTalon.TalonControlMode;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot 
{
	
	// Talons for left side 
	CANTalon frontLeftMotor = new CANTalon(1); 		
	//CANTalon middleLeftMotor = new CANTalon(5);
	CANTalon rearLeftMotor = new CANTalon(2);
	
	// Talons for right side (all even)
	CANTalon frontRightMotor = new CANTalon(3);
	//CANTalon middleRightMotor = new CANTalon(6);
	CANTalon rearRightMotor = new CANTalon(4);
	
	

	
	
	RobotDriveModified drive = new RobotDriveModified(frontLeftMotor, rearLeftMotor,
													frontRightMotor, rearRightMotor);
	
	
	
	Joystick joy = new Joystick(0);
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() 
    {

    	
    	
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() 
    {
    	double forward = joy.getRawAxis(1) * -1;		// logitech gampad left X, positive is forward
    	double turn = joy.getRawAxis(2) * -1;		//logitech gampad right X, positive means turn right
    	drive.arcadeDrive(forward, turn);
    }
}