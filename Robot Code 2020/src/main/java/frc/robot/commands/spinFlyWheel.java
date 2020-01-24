/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

// THIS IS FOR THE LAUNCHER FLYWHEEL

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Launcher;

public class SpinFlyWheel extends CommandBase {
  /**
   * Creates a new spinFlyWheel.
   */
<<<<<<< HEAD

  Launcher m_Launcher;

=======
  
  Launcher m_Launcher;
>>>>>>> 15ce39114a9f15d832c6c515e9ba8654eeddb57b
  public SpinFlyWheel(Launcher launcher) {
    m_Launcher = launcher;
    addRequirements(m_Launcher);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_Launcher.spinLauncherWheel();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_Launcher.dontspinLauncherWheel();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
