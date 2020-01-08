/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
  /**
   * Creates a new Intake.
   */
WPI_TalonSRX feederWheel = new WPI_TalonSRX(0) ;
WPI_TalonSRX intakeBelt = new WPI_TalonSRX(0) ;
   public Intake() {

  }
  //taco
  


  public void spinFeederWheel() {
  feederWheel.set(1);
  }



  public void moveIntakeBelt() {
  intakeBelt.set(1);
}
public void moveIntakeAndFeeder() {
  feederWheel.set(1);
  intakeBelt.set(1);
}
public void stopIntakeAndFeeder() {
  feederWheel.set(0);
  intakeBelt.set(0);
}
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
