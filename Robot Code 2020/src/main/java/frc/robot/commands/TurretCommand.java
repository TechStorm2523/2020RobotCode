/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.TurretMovement;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.RobotContainer;

public class TurretCommand extends CommandBase {
  /**
   * Creates a new TurretLeft.
   */

  TurretMovement m_turretMovement;
  public TurretCommand(TurretMovement turretMovement) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_turretMovement = turretMovement;
    addRequirements(m_turretMovement);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
     double output = RobotContainer.userStick.getTwist();
     output = -output * Math.abs(output);
    
      m_turretMovement.TurretSpin(output);
      

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_turretMovement.TurretStop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
