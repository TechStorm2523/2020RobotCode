/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;
import edu.wpi.first.wpilibj.Counter;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.HoodPosition;
public class CommandHoodUp extends CommandBase {
  /**
   * Creates a new CommandHood.
   */

  /*Counter myCounter = new Counter(1);
  double distance = myCounter.getDistance(); */
 



  HoodPosition m_hoodPosition;
  public CommandHoodUp(HoodPosition hoodPosition) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_hoodPosition = hoodPosition;
    addRequirements(m_hoodPosition);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_hoodPosition.HoodPositionUp();
    boolean goingforward;
    goingforward = true;
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  /*@Override
  public void execute() {
  SmartDashboard.putNumber("Counter", myCounter.get());
  System.out.println(myCounter.get());
  }*/

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_hoodPosition.HoodStop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
