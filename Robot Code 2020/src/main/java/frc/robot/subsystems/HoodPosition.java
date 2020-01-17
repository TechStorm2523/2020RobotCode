/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class HoodPosition extends SubsystemBase {
  /**
   * Creates a new LiftSub.
   */

  WPI_TalonSRX LeftMotor = new WPI_TalonSRX(0);
  WPI_TalonSRX RightMotor = new WPI_TalonSRX(1);

  public HoodPosition() {

  }

public void Hoodposition(){

}

public void HoodTurnLeft(){

  LeftMotor.set(1);

}

public void HoodTurnRight(){

RightMotor.set(1);

}

public void HoodStop(){

  RightMotor.set(0);

  LeftMotor.set(0);
  
}



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

