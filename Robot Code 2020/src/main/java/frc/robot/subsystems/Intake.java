/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
  /**
   * Creates a new Intake.
   */
WPI_TalonSRX intakeBelt = new WPI_TalonSRX(Constants.m_intake);
   public Intake() {

  }

  public void moveIntakeBelt(){
  intakeBelt.set(.5);

  }
public void stopIntakeBelt(){
intakeBelt.set(0);

}
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
