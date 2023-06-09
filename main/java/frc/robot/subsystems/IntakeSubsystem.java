// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IntakeConstants;

public class IntakeSubsystem extends SubsystemBase {
  private static TalonSRX intakeMotor = new TalonSRX(IntakeConstants.INTAKE_MOTOR_ID);
  
  public void DriveTrain() {}

  @Override
  public void periodic() {
    
  }

public static void penceyikapat (double speed)  {
    intakeMotor.set(ControlMode.PercentOutput, -speed);

}

public void penceyiac (double speed) {
    intakeMotor.set(ControlMode.PercentOutput, speed);
}

public void fullStop() {
  
}


}