/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Loader;

public class LoaderC extends CommandBase {
  /**
   * Creates a new intakeFeed.
   */
  Loader m_loader;
<<<<<<< HEAD:Robot Code 2020/src/main/java/frc/robot/commands/LoaderC.java
  public LoaderC (Loader loader) {

=======
  public Loader(Loader loader) {
>>>>>>> 86508624fd7829abc69ac8ecaf13319a56bb8b0e:Robot Code 2020/src/main/java/frc/robot/commands/Loader.java
    m_loader = loader;
    
        addRequirements(m_loader);
        // Use addRequirements() here to declare subsystem dependencies.
      }


  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_loader.LoaderBeltActivator();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_loader.LoaderBeltStop();
  }
  

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}