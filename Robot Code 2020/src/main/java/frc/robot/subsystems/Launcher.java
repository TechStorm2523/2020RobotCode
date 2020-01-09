/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Launcher extends SubsystemBase {
  /**
   * Creates a new Launcher.
   */

  WPI_TalonSRX flywheel = new WPI_TalonSRX(0);


  public Launcher() {

  }

  public void methodName(){




  }

  public void spinFlyWheel(int rpm){
    flywheel.set(1);



  }

  public void stopFlyWheel(int rpm){
   flywheel.set(0);

}


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
