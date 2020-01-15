/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDSubsystem;
import frc.robot.commands.ControlDrive;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.XboxController;

public class DriveTrain extends PIDSubsystem {
  /**
   * Creates a new DriveTrain.
   */
//Motor Declarations Go Here 
WPI_TalonFX FrontLeft = new WPI_TalonFX(0);
WPI_TalonFX FrontRight = new WPI_TalonFX(1);
WPI_TalonFX BackLeft = new WPI_TalonFX(2);
WPI_TalonFX BackRight = new WPI_TalonFX(3);
SpeedControllerGroup LeftSide = new SpeedControllerGroup(FrontLeft, BackLeft);
SpeedControllerGroup RightSide = new SpeedControllerGroup(FrontRight, BackRight);


  public DriveTrain() {
    super(
        // The PIDController used by the subsystem
        new PIDController(0, 0, 0));
  }
  public void methodname(){

  }
  public void Drive(double Left, double Right){
    LeftSide.set(Left);
    RightSide.set(Right); 
    

  }



  @Override
  public void useOutput(double output, double setpoint) {
    // Use the output here
  }

  @Override
  public double getMeasurement() {
    // Return the process variable measurement here
    return 0;
  }
}
