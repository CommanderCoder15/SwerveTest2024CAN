// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.Commands.RotateWheelCommand;
import frc.robot.Commands.RunWheelCommand;
import frc.robot.Subsystems.RotateWheelSubsystem;
import frc.robot.Subsystems.RunWheelSubsystem;

public class RobotContainer {

  // Subsystems here
  private final RotateWheelSubsystem rotateWheel = new RotateWheelSubsystem();
  private final RunWheelSubsystem runWheel = new RunWheelSubsystem();

  // Controller

  private final XboxController control = new XboxController(0);

  public RobotContainer() {
    // Commands here
    rotateWheel.setDefaultCommand(new RotateWheelCommand(rotateWheel, control));
    runWheel.setDefaultCommand(new RunWheelCommand(runWheel, control));

    configureBindings();
  }

  private void configureBindings() {}

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
