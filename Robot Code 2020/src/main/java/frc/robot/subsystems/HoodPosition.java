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

  WPI_TalonSRX Motor = new WPI_TalonSRX(0);

  public HoodPosition() {

  }

public void Hoodposition(){

}

<<<<<<< HEAD
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
=======
public void HoodPositionUp(){
>>>>>>> Colin-2-1/16/2020

  Motor.set(1);

}

<<<<<<< HEAD
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
=======
public void HoodPositionDown(){
>>>>>>> Colin-2-1/16/2020

  Motor.set(1);
}
  public void HoodPositionStop(){

<<<<<<< HEAD
public void HoodStop(){
>>>>>>> master
>>>>>>> Stashed changes
=======
    Motor.set(0);
  
>>>>>>> Colin-2-1/16/2020


  
}



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
<<<<<<< HEAD
<<<<<<< Updated upstream

=======
<<<<<<< HEAD
=======

>>>>>>> master
>>>>>>> Stashed changes
=======
>>>>>>> Colin-2-1/16/2020
