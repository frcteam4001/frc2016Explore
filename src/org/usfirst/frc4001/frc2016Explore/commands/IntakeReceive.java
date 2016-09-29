// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4001.frc2016Explore.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc4001.frc2016Explore.Robot;

/**
 *
 */
public class IntakeReceive extends Command {

  
    public IntakeReceive() {
        requires(Robot.intake);
    }
    
    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.print("Intake Receive");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//System.out.print("IntakeReceive.execute()");
    	Robot.intake.receive();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	//return false;
    	return Robot.intake.ballset();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.intake.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
