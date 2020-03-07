/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.LauncherFeed;
import frc.robot.subsystems.Pneumatics;

public class CommandIntake extends CommandBase {
  /**
   * Creates a new CommandLift.
   */

   Intake m_intake;
   LauncherFeed m_launcherFeed;
   Pneumatics m_pneumatics;

  public CommandIntake(Intake Intake, LauncherFeed LauncherFeed, Pneumatics Pneumatics) {

m_intake = Intake;
m_launcherFeed = LauncherFeed;
m_pneumatics = Pneumatics;

    addRequirements(m_intake, m_launcherFeed, m_pneumatics);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_pneumatics.frontOut();
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_intake.moveIntakeBelt();
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_intake.stopIntakeBelt();
    m_pneumatics.frontIn();
    
 
  }
  

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
