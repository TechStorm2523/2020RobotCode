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
import frc.robot.commands.CommandIntake;
import frc.robot.commands.CommandLift;
import frc.robot.commands.CommandLiftDown;
import frc.robot.commands.CommandLiftUp;
import frc.robot.commands.LoaderC;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.DriveTrain;

import frc.robot.subsystems.ExampleSubsystem;

import frc.robot.subsystems.Lift;
import frc.robot.subsystems.Loader;
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

private final Loader m_loaderSub = new Loader();

private final Lift m_lift = new Lift();


  private final CommandIntake m_intakeFeed = new CommandIntake(m_intake);


private final CommandLiftUp m_commandLiftUp = new CommandLiftUp(m_lift);

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
    final Joystick userStick = new Joystick(1);
    final JoystickButton trigger = new JoystickButton(userStick, 1);
    
    //final JoystickButton thumb = new JoystickButton(userStick, 2);
    //thumb.whileHeld(new intakeFeed(m_intake));

    final JoystickButton LiftUpButton = new JoystickButton(userStick, 3);

    final JoystickButton LiftDownButton = new JoystickButton(userStick, 4);
    

    LiftUpButton.whileHeld(new CommandLiftUp(m_lift));
    LiftDownButton.whileHeld(new CommandLiftDown(m_lift));

    final JoystickButton thumb = new JoystickButton(userStick, 2);

    
    thumb.whileHeld(new LoaderC(m_loaderSub, m_loaderSub));

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
