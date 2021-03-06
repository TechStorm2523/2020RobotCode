/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.commands.TurretCommand;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

public class TurretMovement extends SubsystemBase {
  /**
   * Creates a new TurretMovement.
   */
  WPI_TalonFX TurretMovement = new WPI_TalonFX(Constants.m_turret);
 
  public TurretMovement() {
    setDefaultCommand(new TurretCommand(this));

  }
  /*
  public void TurretSpinClockwise(){
    TurretMovement.set(1);
    

  }
  public void TurretSpinCounterClockwise(){
    TurretMovement.set(-1);
    //taco's man..  
    // MMM
*/
  
  public void TurretSpin(double speed){
    TurretMovement.set(speed/2);
  }
  public void TurretStop(){
    TurretMovement.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
