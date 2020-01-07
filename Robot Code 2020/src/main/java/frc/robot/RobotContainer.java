/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

import frc.robot.commands.ControlDrive;

import frc.robot.commands.CommandLift;
import frc.robot.commands.CommandLiftDown;
import frc.robot.commands.CommandLiftUp;
import frc.robot.commands.ExampleCommand;

import frc.robot.subsystems.DriveTrain;

import frc.robot.commands.intakeFeed;

import frc.robot.subsystems.ExampleSubsystem;

import frc.robot.subsystems.LiftSub;

import frc.robot.subsystems.Intake;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);

  private final DriveTrain m_driveTrain = new DriveTrain();
  private final ControlDrive m_controlDrive = new ControlDrive(m_driveTrain);

  
  private final Intake m_intake = new Intake();



private final LiftSub m_liftSub = new LiftSub();


  private final intakeFeed m_intakeFeed = new intakeFeed(m_intake);


private final CommandLiftUp m_commandLiftUp = new CommandLiftUp(m_liftSub);

  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }
  
  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    Joystick userStick = new Joystick(1);
    
    JoystickButton ANGRIERBUTTON = new JoystickButton(userStick, 3);

    JoystickButton ANGERYBUTTON = new JoystickButton(userStick, 4);
    
    ANGRIERBUTTON.whileHeld(new CommandLiftDown(m_liftSub));
    ANGERYBUTTON.whileHeld(new CommandLiftUp(m_liftSub));
    
  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
