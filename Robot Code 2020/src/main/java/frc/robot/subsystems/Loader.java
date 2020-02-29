/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import frc.robot.Constants;
import frc.robot.commands.LoaderC;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Loader extends SubsystemBase {
  /**
   * Creates a new LiftSub.
   */

  WPI_TalonSRX BeltMotor = new WPI_TalonSRX(Constants.m_loader);

  public Loader() {

  }
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new LoaderC());
}



public void LoaderBeltActivator(){

  BeltMotor.set(1);

}

public void LoaderBeltStop(){

BeltMotor.set(0);
}


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
