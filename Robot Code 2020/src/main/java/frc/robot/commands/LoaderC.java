/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.LauncherFeed;
import frc.robot.subsystems.Loader;
import frc.robot.subsystems.Pneumatics;



public class LoaderC extends CommandBase {
  /**
   * Creates a new intakeFeed.
   */
  Loader m_loader;
  LauncherFeed m_launcherfeed;
  Pneumatics m_pneumatics;
  Intake m_intake;
  public LoaderC(Loader loader, LauncherFeed launcherfeed, Pneumatics pneumatics, Intake intake){

    m_intake = intake;
    m_loader = loader;
    m_launcherfeed = launcherfeed;
    m_pneumatics = pneumatics;
    
        addRequirements(m_loader, m_launcherfeed, m_pneumatics);
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
    if(m_loader.IntakeLimSwitch() == true){
      m_loader.LoaderBeltActivator();
      m_launcherfeed.LoadDown();
    } else {
      m_loader.LoaderBeltStop();
      m_launcherfeed.LoadStop();
    }
    //System.out.println(m_loader.IntakeLimSwitch());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_loader.LoaderBeltStop();
    m_intake.stopIntakeBelt();
    m_pneumatics.frontIn();
  }
  

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
