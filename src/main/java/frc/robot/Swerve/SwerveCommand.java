// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Swerve;

import java.util.Vector;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.utils.VectorR;

public class SwerveCommand extends Command {
  /** Creates a new SwerveCommand. */

  XboxController control;
  SwerveSubsystem swerve = new SwerveSubsystem();
  VectorR vector = new VectorR();

  public SwerveCommand(SwerveSubsystem swerveIN, XboxController controlIN) {
    this.swerve = swerveIN;
    this.control = controlIN;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(swerveIN);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
