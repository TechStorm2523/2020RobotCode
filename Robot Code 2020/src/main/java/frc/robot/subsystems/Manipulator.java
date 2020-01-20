/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Manipulator extends SubsystemBase {
  /**
   * Creates a new Manipulator.
   */
  WPI_TalonSRX Manipulator = new WPI_TalonSRX(Constants.m_manipulator);
   public Manipulator() {

  }
  //Constructor boi
  public void SpinClockwise(){
    Manipulator.set(1);
    

  }
  public void SpinCounterClockwise(){
    Manipulator.set(-1);
    

  }
  public void Spin(final double  Speed){
    Manipulator.set(Speed);
    

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
