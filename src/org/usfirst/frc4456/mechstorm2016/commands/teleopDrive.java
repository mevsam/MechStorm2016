// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4456.mechstorm2016.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.CANTalon.TalonControlMode;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc4456.mechstorm2016.Robot;
import org.usfirst.frc4456.mechstorm2016.RobotMap;

/**
 *
 */
public class teleopDrive extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public teleopDrive() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    	requires(Robot.drive);
    	
    	//RobotMap.armsingleArm.changeControlMode(TalonControlMode.Position);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
		
    	Robot.drive.driver(Robot.oi.joystick);
    	
    	//RobotMap.armsingleArm.changeControlMode(TalonControlMode.Position);
        	
       	/*System.out.println("telopDrive.getOutputCurrent(): " + RobotMap.armsingleArm.getOutputCurrent());
    	System.out.println("telopDrive.getPosition(): " + RobotMap.armsingleArm.getPosition());
    	System.out.println("telopDrive.getSpeed(): " + RobotMap.armsingleArm.getSpeed());
      	System.out.println("telopDrive.get(): " + RobotMap.armsingleArm.get());
      	System.out.println("telopDrive.Enc(): " + RobotMap.armsingleArm.getEncPosition());
      	System.out.println("telopDrive.Analog(): " + RobotMap.armsingleArm.getAnalogInPosition());
      	
      
      	
        SmartDashboard.putNumber("Position", RobotMap.armsingleArm.getPosition());
		SmartDashboard.putNumber("Current", RobotMap.armsingleArm.getOutputCurrent());
		SmartDashboard.putNumber("Speed", RobotMap.armsingleArm.getSpeed());
		*/

    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
