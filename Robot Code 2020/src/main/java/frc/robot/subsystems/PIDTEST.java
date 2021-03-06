/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDSubsystem;

public class PIDtest extends PIDSubsystem {
  /**
   * Creates a new PIDtest.
   */
  WPI_TalonFX FrontLeft = new WPI_TalonFX(0);
  public PIDtest() {
    super(
        // The PIDController used by the subsystem
        new PIDController(0, 0, 0));
  }

  @Override
  public void useOutput(double output, double setpoint) {
    // Use the output here
    FrontLeft.set(output);
  }

  @Override
  public double getMeasurement() {
    // Return the process variable measurement here
    int position = FrontLeft.getSelectedSensorPosition();
    return position;
  }
}
