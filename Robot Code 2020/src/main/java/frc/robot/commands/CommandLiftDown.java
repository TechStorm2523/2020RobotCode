/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Lift;
import frc.robot.subsystems.Pneumatics;

public class CommandLiftDown extends CommandBase {
  /**
   * Creates a new CommandLift.
   */
  Lift m_lift;
  Pneumatics m_pneumatics;

 public CommandLiftDown(Lift lift, Pneumatics pneumatics) {
m_pneumatics = pneumatics;
m_lift = lift;

   addRequirements(m_lift, m_pneumatics);
   // Use addRequirements() here to declare subsystem dependencies.
 }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_pneumatics.lockOut();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_lift.LiftDown();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
 
    m_lift.LiftStop();
 
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
