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
  double FLmin;
  double FRmin;
  double BRmin;
  double BLmin;

  double FLmax;
  double FRmax;
  double BRmax;
  double BLmax;

  public RotateWheelCommand(RotateWheelSubsystem rotateWheel, XboxController control) {
    this.rotateWheel = rotateWheel;
    this.control = control;

    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(rotateWheel);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    FLmin = 1;
    FRmin = 1;
    BLmin = 1;
    BRmin = 1;

    FLmax = 0;
    FRmax = 0;
    BLmax = 0;
    BRmax = 0;
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (rotateWheel.getFLvalue() < FLmin) {
      FLmin = rotateWheel.getFLvalue();
      System.out.print("FL min: "); System.out.println(FLmin);
    }
    if (rotateWheel.getFRvalue() < FRmin) {
      FRmin = rotateWheel.getFRvalue();
      System.out.print("FR min: "); System.out.println(FRmin);
    }
    if (rotateWheel.getBLvalue() < BLmin) {
      BLmin = rotateWheel.getBLvalue();
      System.out.print("BL min: "); System.out.println(BLmin);
    }
    if (rotateWheel.getBRvalue() < BRmin) {
      BRmin = rotateWheel.getBRvalue();
      System.out.print("BR min: "); System.out.println(BRmin);
    }

    if (rotateWheel.getFLvalue() > FLmax) {
      FLmax = rotateWheel.getFLvalue();
      System.out.print("FL max: "); System.out.println(FLmax);
    }
    if (rotateWheel.getFRvalue() > FRmax) {
      FRmax = rotateWheel.getFRvalue();
      System.out.print("FR max: "); System.out.println(FRmax);
    }
    if (rotateWheel.getBLvalue() > BLmax) {
      BLmax = rotateWheel.getBLvalue();
      System.out.print("BL max: "); System.out.println(BLmax);
    }
    if (rotateWheel.getBRvalue() > BRmax) {
      BRmax = rotateWheel.getBRvalue();
      System.out.print("BR max: "); System.out.println(BRmax);
    }
    
    if (control.getAButton()) {
      System.out.print("FL min: "); System.out.println(FLmin);
      System.out.print("FR min: "); System.out.println(FRmin);
      System.out.print("BL min: "); System.out.println(BLmin);
      System.out.print("BR min: "); System.out.println(BRmin);

      System.out.print("FL max: "); System.out.println(FLmax);
      System.out.print("FR max: "); System.out.println(FRmax);
      System.out.print("BL max: "); System.out.println(BLmax);
      System.out.print("BR max: "); System.out.println(BRmax);
    }
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
