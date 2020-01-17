/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
  /*
   * Creates a new Launcher.
   */
  WPI_TalonSRX LauncherWheel = new WPI_TalonSRX(0);

  public Shooter() {

  }

  public void SpinLauncherWheel(){

  }

  public void spinLauncherWheel(){
    LauncherWheel.set(1);

  }
  public void dontspinLauncherWheel(){
    LauncherWheel.set(0);
    }
  public void antispinLauncherWheel(){
    LauncherWheel.set(-1);
      }

  @Override
  public void periodic(){
    // This method will be called once per scheduler run
  }
}
  

