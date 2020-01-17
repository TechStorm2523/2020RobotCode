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
  public HoodPosition(){

  }

  WPI_TalonSRX Motor = new WPI_TalonSRX(0);

public void HoodPositionUp(){

  Motor.set(1);

}

public void HoodPositionDown(){
  Motor.set(-1);
}

public void HoodStop(){

  Motor.set(0);
}


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

