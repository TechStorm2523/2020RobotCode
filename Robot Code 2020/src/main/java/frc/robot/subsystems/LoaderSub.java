/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LoaderSub extends SubsystemBase {
  /**
   * Creates a new LiftSub.
   */

  WPI_TalonSRX BeltMotor = new WPI_TalonSRX(0);

  WPI_TalonSRX WheelMotor = new WPI_TalonSRX(0);



  public LoaderSub() {

  }

public void Loadersub(){

}

public void LoaderBeltActivator(){

  BeltMotor.set(1);

}

public void LoaderBeltStop(){

BeltMotor.set(0);
}

public void WheelSpin(){

  WheelMotor.set(1);
}

public void WheelStop(){

WheelMotor.set(0);
}



public void WheelAndBeltMoterGo(){
WheelMotor.set(1);
BeltMotor.set(1);
}

public void WheelAndBeltMoterStop(){
WheelMotor.set(0);
BeltMotor.set(0);
}
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
