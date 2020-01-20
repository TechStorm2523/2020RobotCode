/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LauncherFeed extends SubsystemBase {
  /**
   * Creates a new LiftSub.
   */

  WPI_TalonFX LiftMotor = new WPI_TalonFX(0);

  

public void LoadUp(){

  LiftMotor.set(1);

}

public void LoadDown(){

LiftMotor.set(-1);

}

public void LoadStop(){

  LiftMotor.set(0);
  
}



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}