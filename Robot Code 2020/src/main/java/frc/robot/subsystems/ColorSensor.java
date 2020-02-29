/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.util.Color;

import com.revrobotics.ColorSensorV3;
import com.revrobotics.ColorMatchResult;
import com.revrobotics.ColorMatch;


public class ColorSensor extends SubsystemBase {
  /**
   * Creates a new Intake.
   */
  private static final I2C.Port i2cPort = I2C.Port.kOnboard;
  public ColorMatch m_colorMatcher = new ColorMatch();
  public static ColorSensorV3 m_colorSensor = new ColorSensorV3(i2cPort);

  public Color kBlueTarget = ColorMatch.makeColor(0.143, 0.427, 0.429);
  public Color kGreenTarget = ColorMatch.makeColor(0.197, 0.561, 0.240);
  public Color kRedTarget = ColorMatch.makeColor(0.561, 0.232, 0.114);
  public Color kYellowTarget = ColorMatch.makeColor(0.361, 0.524, 0.113);


  /*public String red = "edu.wpi.first.wpilibj.util.ColorShim@ba85d85f";
  public String blue = "edu.wpi.first.wpilibj.util.ColorShim@5d7cd05f";
  public String green = "edu.wpi.first.wpilibj.util.ColorShim@645cf45f";
  public String yellow = "edu.wpi.first.wpilibj.util.ColorShim@97d1da5f";
*/
  public Color detectedColor = m_colorSensor.getColor();

   public ColorSensor() {
  }

  public boolean isBlue(){
    if (detectedColor.blue > .35 && detectedColor.green > .3 && detectedColor.red <.35){
      return true;
    }
    return false;
  }

  public boolean isGreen(){
    if (detectedColor.green > .4 && detectedColor.blue < .3 && detectedColor.red < .3){
      return true;
    }
    return false;
  }

  public boolean isRed(){
    if (detectedColor.red > .3 && detectedColor.green < .4 && detectedColor.blue <.4){
      return true;
    }
    return false;
  }

  public boolean isYellow(){
    if (detectedColor.red > .3 && detectedColor.green > .3 && detectedColor.blue <.35 && detectedColor.red < .35){
      return true;
    }
    return false;
  }


/*
  public boolean isBlue() {
    detectedColor = m_colorSensor.getColor();
    ColorMatchResult match = m_colorMatcher.matchClosestColor(detectedColor);
    return (match.color==kBlueTarget);
    
  }


  public boolean isGreen() {
    detectedColor = m_colorSensor.getColor();
    ColorMatchResult match = m_colorMatcher.matchClosestColor(detectedColor);
    return (match.color==kGreenTarget);
  }

  public boolean isRed(){
    detectedColor = m_colorSensor.getColor();
    ColorMatchResult match = m_colorMatcher.matchClosestColor(detectedColor);
    return (match.color==kRedTarget);
  }
  public boolean isYellow(){
    detectedColor = m_colorSensor.getColor();
    ColorMatchResult match = m_colorMatcher.matchClosestColor(detectedColor);
    return (match.color==kYellowTarget);
  }*/
public Color getSensedColor(){
    return detectedColor;


}
public ColorMatchResult isColorMatch(Color color){
  return m_colorMatcher.matchColor(kRedTarget);
  //return kBlueTarget == detectedColor();

}
public Color getColor1(){
  return m_colorSensor.getColor();
}
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

