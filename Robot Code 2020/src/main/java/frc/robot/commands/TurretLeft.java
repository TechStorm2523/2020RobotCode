/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.TurretMovement;

public class TurretLeft extends CommandBase {
  /**
   * Creates a new TurretLeft.
   */
  TurretMovement m_turretMovement;
  public TurretLeft(TurretMovement turretMovement) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_turretMovement = turretMovement;
    addRequirements(m_turretMovement);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_turretMovement.TurretSpinCounterClockwise();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  m_turretMovement.TurretSpin(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
