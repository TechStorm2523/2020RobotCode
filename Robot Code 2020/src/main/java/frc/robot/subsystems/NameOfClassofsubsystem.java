/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDSubsystem;



public class NameOfClassofsubsystem extends PIDSubsystem {
  /**
   * Creates a new NameOfClassofsubsystem.
   */
  
  WPI_TalonSRX feederWheel = new WPI_TalonSRX(0) ;

  public NameOfClassofsubsystem() {
    super(
        // The PIDController used by the subsystem
        new PIDController(0, 0, 0));
  }

  @Override
  public void useOutput(double output, double setpoint) {
    // Use the output here
    feederWheel.set(output);
  }

  @Override
  public double getMeasurement() {
    // Return the process variable measurement here
    int position = feederWheel.getSelectedSensorPosition();
    return 0;
  }
}
