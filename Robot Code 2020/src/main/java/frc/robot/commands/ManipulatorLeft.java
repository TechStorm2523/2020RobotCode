/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Manipulator;
import frc.robot.subsystems.ColorSensor;

public class ManipulatorLeft extends CommandBase {
  /**
   * Creates a new ManipulatorLeft.
   */
  Manipulator m_manipulator;
  ColorSensor m_color;
  public ManipulatorLeft(Manipulator manipulator, ColorSensor colorSensor) {
    m_manipulator = manipulator;
    m_color = colorSensor;
    addRequirements(m_manipulator, m_color);

    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (m_color.colorRotations >= 3.0 || m_color.colorRotations <= 5.0){
      m_manipulator.SpinCounterClockwise();
    }
  }
  

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_manipulator.Spin(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

