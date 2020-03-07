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
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Loader extends SubsystemBase {
  /**
   * Creates a new LiftSub.
   */
  DigitalInput IntakeLimSwitch = new DigitalInput(0);
  WPI_TalonSRX beltMotor = new WPI_TalonSRX(Constants.m_loader);

  public Loader() {
    //setDefaultCommand(new LoaderC());

  }
  



public void LoaderBeltActivator(){

  beltMotor.set(1);

}

public void LoaderBeltStop(){

beltMotor.set(0);
}
public boolean IntakeLimSwitch(){
  return IntakeLimSwitch.get();
}



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
