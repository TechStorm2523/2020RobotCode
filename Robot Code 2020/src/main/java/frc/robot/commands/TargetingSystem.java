/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
/*
package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.HoodPosition;
import frc.robot.subsystems.TurretMovement;
import frc.robot.subsystems.PixyCam;
import frc.robot.subsystems.SonicSensor;
import java.lang.Math;


public class TargetingSystem extends CommandBase {
  /**
   * Creates a new CommandLift.
   */

/*
this command uses all the possible systems that relate to shooting
sonic sensor is for distance

use arctan to determine the angle of elevation  x = arctan(height of target/distance)
convert angle to some kind of PID motor spin to get an exact angle in hood
this is separate from the img proc because the sonic sensor provides distance, and nothing else is needed

the amount the turret needs to turn is relative to the distance and coordinate points
some sort of pixel-to-foot consant is needed relative to distance
this finds the feet left/right of exact target there is
distance finds distance
this creates a right triangle, unless the robot is dead center
the angle is determined using arctan (sidelengthoff/distance)
based on fractions of degrees relative to the whole circle of rotation, the motors will spin 
to the right angle
(some sort of left-right distinguishing algorithm should also be in place)

once both the angle of elevation and x-y angle are locked on, the dashboard will alert and
the user will fire

Needed info

peripheral range
how many times the motor spins relative to the entire turret




*/

/*
HoodPosition hood;
TurretMovement turret;
PixyCam img;
SonicSensor distanceSensor;
int tolerance = 1; //in pixels - how much error is allowed before shooting
double distanceOff; // some sort of pixel-to-actual algorithm given distance and perhiphrial range
boolean isLeft; // is it left of target
double height; //relative to shooting point of robot


  public TargetingSystem(HoodPosition m_hood, TurretMovement m_turret, PixyCam m_img, SonicSensor m_sonic) {
m_hood = hood;
m_turret = turret;
m_img = img;
m_sonic = distanceSensor;

    addRequirements(hood, turret, img, distanceSensor);
    // Use addRequirements() here to declare subsystem dependencies.
  }
  public double getAngleXY(){
      isLeft = img.isLeft();
      if (isLeft == true){
        return 360 - Math.atan(distanceOff/(distanceSensor.GetDistance()));
      } else if (isLeft == false){
        return Math.atan(distanceOff/(distanceSensor.GetDistance()));
      }
      return 0.0;
  }
  public double getAngleElev(){
      return Math.atan(height/(distanceSensor.GetDistance()));
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    //activate turret PID from given angle
    //activate hood PID

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    //goes to the bottom - like a reset(?)
    // above depends on how many are fired at once 
  }
  

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
*/