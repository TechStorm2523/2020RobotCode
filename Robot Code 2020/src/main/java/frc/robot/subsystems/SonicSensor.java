// /*----------------------------------------------------------------------------*/
// /* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
// /* Open Source Software - may be modified and shared by FRC teams. The code   */
// /* must be accompanied by the FIRST BSD license file in the root directory of */
// /* the project.                                                               */
// /*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

//import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

// /**
//  * An example subsystem.  You can replace me with your own Subsystem.
//  */
public class SonicSensor extends SubsystemBase {
//   // Put methods for controlling this subsystem
//   // here. Call these from Commands.
  DigitalInput piNG = new DigitalInput(1);
  DigitalInput d2 = new DigitalInput(2);
  Ultrasonic sonic = new Ultrasonic(1, 2);


  //http://first.wpi.edu/FRC/roborio/beta/docs/java/edu/wpi/first/wpilibj/Ultrasonic.html
 //most likely - make three methods, one to turn it on/off, one to make it keep pinging its surroundings, have a method in inch
 //how do I actually make this visualized?

public void sonicinit() //turns the sensor and the automated scanning on. 
{
 sonic.setEnabled(true); //this line might be unescessary
 sonic.setAutomaticMode(true);
}

public void SensorOff() //turns the sensor off
{
sonic.setEnabled(false);
}

public double GetDistance() //returns distance in inches
{
return sonic.getRangeInches();
}


  
}
