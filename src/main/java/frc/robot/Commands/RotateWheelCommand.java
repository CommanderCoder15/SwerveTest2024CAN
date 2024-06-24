// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.RotateWheelSubsystem;

public class RotateWheelCommand extends Command {
  /** Creates a new RotateWheelCommand. */
  RotateWheelSubsystem rotateWheel;
  XboxController control;

  public RotateWheelCommand(RotateWheelSubsystem rotateWheel, XboxController control) {
    this.rotateWheel = rotateWheel;
    this.control = control;

    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(rotateWheel);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    System.out.print("FL: "); System.out.print(rotateWheel.getFLvalue());
    System.out.print("FR: "); System.out.print(rotateWheel.getFRvalue());
    System.out.print("BL: "); System.out.print(rotateWheel.getBLvalue());
    System.out.print("BR: "); System.out.print(rotateWheel.getBRvalue());
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
