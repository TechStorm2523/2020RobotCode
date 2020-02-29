/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class HoodPosition extends SubsystemBase {
  /**
   * Creates a new LiftSub.
   */
  DigitalInput HoodLimSwitch = new DigitalInput(6);
  Counter motorCounter = new Counter();
  public HoodPosition(){

  }

  WPI_TalonSRX Motor = new WPI_TalonSRX(Constants.m_hood);

public void HoodPositionUp(){

  Motor.set(1);

}

public void HoodPositionDown(){
  Motor.set(-1);
}

public void HoodStop(){

  Motor.set(0);
}
boolean goingforward;
private int position = 0;
  @Override
  public void periodic() {
    if (goingforward) {
       position += motorCounter.get();
    } else {
       position -= motorCounter.get();
    }
    motorCounter.reset();
 }
 public boolean HoodLimSwitch(){
   return HoodLimSwitch.get();
 }
}

