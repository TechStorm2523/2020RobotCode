/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.AnalogTrigger;
import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;

//TurretCommand doesn't do anything rn

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;

import frc.robot.commands.ControlDrive;
import frc.robot.commands.CommandIntake;
import frc.robot.commands.CommandLift;
import frc.robot.commands.CommandLiftDown;
import frc.robot.commands.CommandLiftUp;
import frc.robot.commands.LoaderC;
import frc.robot.commands.SpinFlyWheel;
import frc.robot.commands.TurretCommand;
//import frc.robot.commands.SpinFlyWheel;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.LauncherDontFeed;
import frc.robot.commands.LauncherFeedFeed;
import frc.robot.subsystems.DriveTrain;

import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.HoodPosition;
import frc.robot.subsystems.TurretMovement;
//import jdk.javadoc.internal.doclets.toolkit.util.DocFinder.Output;
//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;
import frc.robot.commands.TurretLeft;
import frc.robot.commands.TurretRight;
import frc.robot.commands.ColorC;
import frc.robot.commands.CommandHoodUp;
import frc.robot.commands.CommandHoodDown;
import frc.robot.subsystems.Lift;
import frc.robot.subsystems.Loader;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Launcher;
import frc.robot.subsystems.LauncherFeed;
import frc.robot.subsystems.ColorSensor;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
//#pixycam
//import frc.robot.subsystems.PixyCam;
//import frc.robot.commands.PixyCamTarget; 

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  public static XboxController xb = new XboxController(0);
  public static Joystick userStick = new Joystick(1);

// The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);

  private final DriveTrain m_driveTrain = new DriveTrain();
  private final ControlDrive m_controlDrive = new ControlDrive(m_driveTrain);

  
  private final HoodPosition m_hoodPosition = new HoodPosition();
  private final CommandHoodUp m_commandHood = new CommandHoodUp(m_hoodPosition);
  private final CommandHoodDown m_commandHoodDown = new CommandHoodDown(m_hoodPosition);

  private final TurretMovement m_turretMovement = new TurretMovement();
  //private final TurretLeft m_turretLeft = new TurretLeft(m_TurretMovement);
  //private final TurretRight m_TurretRight = new TurretRight(m_TurretMovement);
  

  private final LauncherFeed m_launcherFeed= new LauncherFeed();
  private final Intake m_intake = new Intake();

  private final Loader m_loaderSub = new Loader();

  private final Lift m_lift = new Lift();

  private final CommandIntake m_intakeFeed = new CommandIntake(m_intake);

  private final CommandLiftUp m_commandLiftUp = new CommandLiftUp(m_lift);

  private final Launcher m_launcher = new Launcher();

  private final SpinFlyWheel m_spinFlyWheel = new SpinFlyWheel(m_launcher);
 
  private final ExampleCommand m_ = new ExampleCommand(m_exampleSubsystem);

  private final ColorSensor m_colorSense = new ColorSensor();

  private final ColorC m_colorC = new ColorC(m_colorSense);

  //private final PixyCam m_pixyCam = new PixyCam();

  
/*
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }
  public String getMotorRPMs(){
    System.out.println("Starting RC.java");
    final String rpmString = m_driveTrain.motorRPMS();

    System.out.println("About to return in RC.java");
    return rpmString;
  }
  
  
  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    
    
    //final JoystickButton trigger = new JoystickButton(userStick, 1);
    
    final JoystickButton loaderButton = new JoystickButton(userStick, 2);
    final JoystickButton launcherButton = new JoystickButton(userStick, 1);
    final JoystickButton LiftUpButton = new JoystickButton(userStick, 3);
    final JoystickButton LiftDownButton = new JoystickButton(userStick, 4);
    final JoystickButton launcherFeedFeedButton = new JoystickButton(userStick, 5); 
    final JoystickButton launcherDontFeedButton = new JoystickButton(userStick, 6);
    final JoystickButton HoodTurnLeftButton = new JoystickButton(userStick, 11);
    final JoystickButton HoodTurnRightButton = new JoystickButton(userStick, 12);
    //Yo We don't have control code for the turret motor, so I made some... I will finish it later(tm)
    final JoystickButton TurretSpinCounterClockwiseButton = new JoystickButton(userStick, 9);
    final JoystickButton TurretSpinClockwiseButton = new JoystickButton(userStick, 10);
    final JoystickButton ColorSensor = new JoystickButton(userStick, 7);
    final JoystickButton PixyCamButton = new JoystickButton(userStick, 8);
    //This is supposed to be the limit switch that turns on the Loader while held.
    DigitalInput IntakeLimSwitch = new DigitalInput(0);
    DigitalInput HoodLimSwitch = new DigitalInput(2);
    //Counter motorCounter = new Counter(new DigitalInput(1));
    
    //private void DigitalInput(IntakeLimSwitch);
    //IntakeLimSwitch.get()whileHeld(new LoaderC(loader)); //Cursed AF right here
     //This stuff is dumb ignore for now.

    //#pixycam
    //final JoystickButton PixyCam = new JoystickButton(userStick, 8);
    LiftUpButton.whileHeld(new CommandLiftUp(m_lift));
    LiftDownButton.whileHeld(new CommandLiftDown(m_lift));
    
    launcherButton.whileHeld(new SpinFlyWheel(m_launcher));
    ColorSensor.whileHeld(new ColorC(m_colorSense));
    
    HoodTurnLeftButton.whileHeld(new CommandHoodDown(m_hoodPosition));
    HoodTurnRightButton.whileHeld(new CommandHoodUp(m_hoodPosition));

    //TurretSpinCounterClockwiseButton.whileHeld(new TurretLeft(m_TurretMovement));
    //TurretSpinClockwiseButton.whileHeld(new TurretRight(m_TurretMovement));

    //thumb.whileHeld(new CommandIntake(m_intake));
    
    launcherFeedFeedButton.whileHeld(new LauncherFeedFeed(m_launcherFeed));
    launcherDontFeedButton.whileHeld(new LauncherDontFeed(m_launcherFeed));

   // loaderButton.whileHeld(new LoaderC(m_loaderSub)); //Commented out because I was / am messing with the loader systems.

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
