/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

public class Turret extends SubsystemBase {
  /**
   * Creates a new TurretMovement.
   */
<<<<<<< HEAD
  WPI_TalonSRX TurretMovement = new WPI_TalonSRX(69);
  public Turret() {
=======
  WPI_TalonFX TurretMovement = new WPI_TalonFX(0);
 
  public TurretMovement() {
>>>>>>> Colin-2-1/11/2020

  }
  public void TurretSpinClockwise(){
    TurretMovement.set(1);
    
  }
  public void TurretSpinCounterClockwise(){
    TurretMovement.set(-1);
    
  }
  /*
  public void TurretSpin(double Speed){
    TurretMovement.set(Speed);

  }
*/
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
