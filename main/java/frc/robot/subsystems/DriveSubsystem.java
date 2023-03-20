

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants.DriveConstants;

public class DriveSubsystem extends SubsystemBase {
  
  private static PWMTalonSRX motorLeft1 = new PWMTalonSRX(DriveConstants.LEFT_MOTOR_1_ID);
  private static PWMVictorSPX motorLeft2 = new PWMVictorSPX(DriveConstants.LEFT_MOTOR_2_ID);
  MotorControllerGroup MOTORS_LEFT = new MotorControllerGroup(motorLeft1, motorLeft2);

  private static PWMVictorSPX motorRight2 = new PWMVictorSPX(DriveConstants.RIGHT_MOTOR_2_ID);
  private static PWMTalonSRX motorRight1 = new PWMTalonSRX(DriveConstants.RIGHT_MOTOR_1_ID);
  MotorControllerGroup MOTORS_RIGHT = new MotorControllerGroup(motorRight1, motorRight2);

  DifferentialDrive tankDrive = new DifferentialDrive(MOTORS_LEFT, MOTORS_RIGHT);


  public DriveSubsystem() {

    MOTORS_LEFT.setInverted(true);
    MOTORS_RIGHT.setInverted(false);
  
    leftEncoder.setDistancePerPulse(DriveConstants.EncoderDistancePerPulse); //Encoderların bir tikteki aldığı mesafe
    rightEncoder.setDistancePerPulse(DriveConstants.EncoderDistancePerPulse);
    resetEncoders();
    }
  
  
    //resets the encoders to read a position of 0
    private void resetEncoders() {
      leftEncoder.reset();
      rightEncoder.reset();
   }
    // The left-side drive encoder
    private final Encoder leftEncoder =
    new Encoder(
        DriveConstants.LeftEncoderPorts[0],
        DriveConstants.LeftEncoderPorts[1]);
  // The right-side drive encoder
   private final Encoder rightEncoder =
     new Encoder(
        DriveConstants.RightEncoderPorts[0],
        DriveConstants.RightEncoderPorts[1]);
   public Encoder getRightEncoder() {
     return rightEncoder;
     }
   public Encoder getLeftEncoder() {
     return leftEncoder;
   }
     
     
  
   //Encoder'ın ilerlediği metre sayısı
     public double getEncoderMeters() {
       return (leftEncoder.get() + -rightEncoder.get()) / 2 * DriveConstants.EncoderDistancePerPulse;
  }
  
  
    @Override
    public void periodic() {
      // This method will be called once per scheduler run
      
    }
    
    public void tankDrive(double leftSpeed, double rightSpeed)
    {
      tankDrive.tankDrive(rightSpeed, leftSpeed);
    }
    
  
    public void speed(double rawAxis, double rawAxis2) {
      
    }
  
  }