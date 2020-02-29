/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import com.revrobotics.ColorSensorV3;
import com.revrobotics.ColorMatchResult;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.ColorSensor;
public class ColorC extends CommandBase {
  /**
   * Creates a new CommandHood.
   */

  ColorSensor m_color;
  public ColorC(ColorSensor color) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_color = color;
    addRequirements(m_color);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
   
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_color.detectedColor = m_color.getColor1();
    //System.out.println(m_color.isColorMatch(ColorSensor.m_colorSensor.getColor()));
    /*
    SmartDashboard.putString("Color", String.valueOf(m_color.getSensedColor()));
    SmartDashboard.putNumber("Red Detected", m_color.detectedColor.red);
    SmartDashboard.putNumber("Blue Detected", m_color.detectedColor.blue);
    SmartDashboard.putNumber("Green Detected", m_color.detectedColor.green);
    */
    SmartDashboard.putString("Red Detected", String.valueOf(m_color.isRed()));
    SmartDashboard.putString("Blue Detected", String.valueOf(m_color.isBlue()));
    SmartDashboard.putString("Green Detected", String.valueOf(m_color.isGreen()));
    SmartDashboard.putString("Yellow Detected", String.valueOf(m_color.isYellow()));

  }
  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
