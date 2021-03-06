/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.HoodPosition;
public class CommandHoodDown extends CommandBase {
    /**
     * Creates a new CommandHood.
     */
    HoodPosition m_hoodPosition;
    

    public CommandHoodDown(HoodPosition hoodPosition) {
    // Use addRequirements() here to declare subsystem dependencies.
    m_hoodPosition = hoodPosition;
    addRequirements(m_hoodPosition);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    if(!m_hoodPosition.HoodLimSwitch()){
      m_hoodPosition.HoodPositionDown(); 
    }
    
    boolean goingforward;
    goingforward = false;
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_hoodPosition.HoodStop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return m_hoodPosition.HoodLimSwitch();
  }
}
