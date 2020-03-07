/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

//import frc.robot.commands.frontOut;

/**
 * Add your docs here.
 */
public class Pneumatics extends SubsystemBase {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  
  DoubleSolenoid front = new DoubleSolenoid(0,1);
  DoubleSolenoid lock = new DoubleSolenoid(2,3);

  boolean frontIsOut = false;
  boolean lockIsOut = false;


  public void frontOut(){
    front.set(Value.kOff);
    front.set(Value.kReverse);
    frontIsOut = true;
    
  }
  public void frontIn(){
    front.set(Value.kOff);
    front.set(Value.kForward);
    frontIsOut = false;
  }
  public void lockOut(){
    lock.set(Value.kForward);
    lockIsOut = true;
  }
  public void lockIn(){
    lock.set(Value.kReverse);
    lockIsOut = false;
  }

  public void toggleFront(){
    if(frontIsOut){
      frontIn();
    } else {
      frontOut();
    }

  }

  public void toggleLock(){
    if(lockIsOut){
      lockIn();
    } else {
      lockOut();
    }

  }

}
