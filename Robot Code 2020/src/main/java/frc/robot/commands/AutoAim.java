/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.HoodPosition;
import frc.robot.subsystems.Limelight;
import frc.robot.subsystems.TurretMovement;

public class AutoAim extends CommandBase {
  /**
   * Creates a new AutoAim.
   */
  Limelight m_limelight;
  TurretMovement m_turret;
  HoodPosition m_hood;

  double x;
  double y;
  double a;

  public AutoAim(Limelight limelight, TurretMovement turret, HoodPosition hood) {
    m_limelight = limelight;
    m_turret = turret; 
    m_hood = hood;
    addRequirements(m_limelight, m_turret, m_hood);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    x = m_limelight.xoffset();
    y = m_limelight.yoffset();
    a = m_limelight.area();

    System.out.println("X = "+x);

    m_turret.TurretSpin(-x/10);
    

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
