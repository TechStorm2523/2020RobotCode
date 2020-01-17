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

<<<<<<< Updated upstream
public void HoodTurnLeft(){
=======
<<<<<<< HEAD
public void LiftUp(){

  RightMotor.set(-1);
=======
public void HoodTurnLeft(){
>>>>>>> master
>>>>>>> Stashed changes

  LeftMotor.set(1);

}

<<<<<<< Updated upstream
public void HoodTurnRight(){
=======
<<<<<<< HEAD
public void LiftDown(){
>>>>>>> Stashed changes

RightMotor.set(1);

}

<<<<<<< Updated upstream
public void HoodStop(){
=======
public void LiftStop(){
=======
public void HoodTurnRight(){

RightMotor.set(1);

}

public void HoodStop(){
>>>>>>> master
>>>>>>> Stashed changes

  RightMotor.set(0);

  LeftMotor.set(0);
  
}



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
<<<<<<< Updated upstream

=======
<<<<<<< HEAD
=======

>>>>>>> master
>>>>>>> Stashed changes
