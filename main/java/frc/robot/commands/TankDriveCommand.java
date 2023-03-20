package frc.robot.commands;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.States;


public class TankDriveCommand extends CommandBase {

  DriveSubsystem DriveTrainSubsystem;
  Joystick logitechController;

  public TankDriveCommand(Joystick logitechController, DriveSubsystem DriveSubs) {
    addRequirements(DriveSubs);  
    
    DriveTrainSubsystem = DriveSubs;

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}
  
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  DriveTrainSubsystem.tankDrive((States.isReversed ? -1 : 1) * logitechController.getRawAxis(5), (States.isReversed ? -1 : 1) * logitechController.getRawAxis(1));
  
}
  
  // Called once the command ends or is interrupted.
  @Override
  public void end (boolean interrupted) {
    DriveTrainSubsystem.tankDrive(0,0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}