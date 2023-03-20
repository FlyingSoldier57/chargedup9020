// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ElevatorConstants;

public class ElevatorSubsytem extends SubsystemBase {
  /** Creates a new ElevatorSubsytem. */
  public ElevatorSubsytem() {
 
    //VictorSPX elevator_motor_down_ID_5 = new VictorSPX(ElevatorConstants.Elevator_motor_down_ID_5);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public static void setLeftMotors(double speed)  {
  //  elevator_motor_down_ID_5.set(ControlMode.PercentOutput, -speed);
  }
  
  public void setRightMotors(double speed) {
    //  elevator_motor_up_ID_5.set(ControlMode.PercentOutput, speed);
  }
}