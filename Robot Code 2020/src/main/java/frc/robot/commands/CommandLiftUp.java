/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Lift;

public class CommandLiftUp extends CommandBase {
  /**
   * Creates a new CommandLift.
   */

<<<<<<< HEAD
   Lift m_liftSub;

  public CommandLiftUp(Lift liftSub) {
=======
   Lift m_lift;

  public CommandLiftUp(Lift lift) {
>>>>>>> 86508624fd7829abc69ac8ecaf13319a56bb8b0e

m_lift = lift;

    addRequirements(m_lift);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_lift.LiftUp();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
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
