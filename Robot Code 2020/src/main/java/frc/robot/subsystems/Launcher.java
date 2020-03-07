/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.commands.SpinFlyWheel;
//import edu.wpi.first.wpilibj2.Encoder;

public class Launcher extends SubsystemBase {
  /*
   * Creates a new Launcher.
   */
 // Encoder encoder = new Encoder(0,1);
  WPI_TalonSRX LauncherWheel = new WPI_TalonSRX(Constants.m_launcher);

  public Launcher() {
    setDefaultCommand(new SpinFlyWheel(this));
  }

  public void SpinLauncherWheel(){

  }

  public void spinLauncherWheel(double speed){
    LauncherWheel.set(speed);

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
  

