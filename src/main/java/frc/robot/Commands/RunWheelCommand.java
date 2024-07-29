// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.RunWheelSubsystem;

public class RunWheelCommand extends Command {
  /** Creates a new RunWheelCommand. */
  RunWheelSubsystem runWheel;
  XboxController control;

  public RunWheelCommand(RunWheelSubsystem runWheel, XboxController control) {
    this.runWheel = runWheel;
    this.control = control;
  
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(runWheel);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    runWheel.runFRmotor(control.getRightTriggerAxis()*0.1);
    runWheel.runFLmotor(control.getRightTriggerAxis()*0.1);
    runWheel.runBRmotor(control.getRightTriggerAxis()*0.1);
    runWheel.runBLmotor(control.getRightTriggerAxis()*0.1);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
