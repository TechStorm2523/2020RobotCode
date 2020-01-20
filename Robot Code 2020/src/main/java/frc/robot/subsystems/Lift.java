/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Lift extends SubsystemBase {
  /**
   * Creates a new LiftSub.
   */

  WPI_TalonFX LiftMotor = new WPI_TalonFX(Constants.m_lift);

  

public void LiftUp(){

  LiftMotor.set(1);

}

public void LiftDown(){

LiftMotor.set(-1);

}

public void LiftStop(){

  LiftMotor.set(0);
  
}



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
