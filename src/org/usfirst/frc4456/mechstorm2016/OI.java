// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4456.mechstorm2016;

import org.usfirst.frc4456.mechstorm2016.Robot;
import org.usfirst.frc4456.mechstorm2016.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc4456.mechstorm2016.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton leftBumper;
    public JoystickButton leftTrigger;
    public JoystickButton rightBumper;
    public JoystickButton rightTrigger;
    public JoystickButton yButton;
    public JoystickButton bButton;
    public JoystickButton xButton;
    public JoystickButton aButton;
    public JoystickButton startButton;
    public JoystickButton leftStick;
    public JoystickButton rightStick;
    public Joystick joystick;
    public Joystick rightAxis;
    private final CANTalon singleArm = RobotMap.armsingleArm;
    
    private Robot robot;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public OI(Robot robot) {
    
    	System.out.println("UI Initializing...");
        this.robot = robot;
    	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

    	joystick = new Joystick(1);                                                    
        
        startButton = new JoystickButton(joystick, 8);
        startButton.toggleWhenActive(new startIntake());
        bButton = new JoystickButton(joystick, 2);
        bButton.whileHeld(new primaryBack());
        yButton = new JoystickButton(joystick, 4);
        yButton.whileHeld(new primaryForward());
        rightBumper = new JoystickButton(joystick, 6);
        rightBumper.toggleWhenPressed(new startShooter());
        leftBumper = new JoystickButton(joystick, 5);
        leftBumper.whileHeld(new shoot());
        /*rightStick = new JoystickButton(joystick, 10);
        rightStick.whileHeld(new liftShooter());
        leftStick = new JoystickButton(joystick, 9);
        leftStick.whileHeld(new dropShooter());*/
        xButton = new JoystickButton(joystick, 3);
        xButton.whileHeld(new liftShooter());
        aButton = new JoystickButton(joystick, 1);
        aButton.whileHeld(new dropShooter());
        
        
        /*double rightStickvalue = 0;
        rightStickvalue = joystick.getRawAxis(5);
        System.out.println(rightStickvalue);
        if (rightStickvalue > 0)
        	new liftShooter();
        else if (rightStickvalue < 0)
        	new dropShooter();
        else
        */
        
        // test comment


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("teleopDrive", new teleopDrive());
        SmartDashboard.putData("startIntake", new startIntake());
        SmartDashboard.putData("primaryForward", new primaryForward());
        SmartDashboard.putData("primaryBack", new primaryBack());
        SmartDashboard.putData("shoot", new shoot());
        SmartDashboard.putData("startShooter", new startShooter());
        SmartDashboard.putData("liftShooter", new liftShooter());
        SmartDashboard.putData("dropShooter", new dropShooter());
       // SmartDashboard.putNumber("Position", singleArm.getPosition());
		//SmartDashboard.putNumber("Current", singleArm.getOutputCurrent());
		//SmartDashboard.putNumber("Speed", singleArm.getSpeed());

    		
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
 
    public void update()
	{	
    	//Robot Enabled
    	SmartDashboard.putBoolean("Enabled", robot.isEnabled());
    	
    	//robot.pidController = (PIDController) SmartDashboard.getData("talonPID");    	
    	CANTalon singlArm = this.robot.arm.getSingleArm();
       	//singleArm.changeControlMode(CANTalon.TalonControlMode.Position);
		//System.out.println("stopArm.singleArm.getPosition():" + singleArm.getPosition());
		//System.out.println("OI.singleArm.getDeviceId():" + singleArm.getDeviceID());
		//System.out.println("stopArm.singleArm.getSpeed():" + singleArm.getSpeed());

    }
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS

}

