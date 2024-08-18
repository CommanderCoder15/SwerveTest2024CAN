// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.RotateWheelSubsystem;
import frc.robot.utils.MathR;

public class RotateWheelCommand extends Command {
  /** Creates a new RotateWheelCommand. */
  RotateWheelSubsystem rotateWheel;
  XboxController control;
  MathR math;
  
  final double FLmin = 0.2039;
  final double FRmin = 0.0150;
  final double BRmin = 0.0864;
  final double BLmin = 0.0267;

  final double FLmax = 3.3267;
  final double FRmax = 3.247;
  final double BRmax = 2.96;
  final double BLmax = 3.229;

  final double FLcntr = 1.6;
  final double FRcntr = 1.7;
  final double BRcntr = 0.091;
  final double BLcntr = 3.01;

  double FLaimDeg;

  double FLcurrentDeg;

  double FLDegDiff;

  boolean FLFlip;

  public RotateWheelCommand(RotateWheelSubsystem rotateWheel, XboxController control) {
    this.rotateWheel = rotateWheel;
    this.control = control;

    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(rotateWheel);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    /* Code to detect encoder values (initialization)
    FLmin = 1;
    FRmin = 1;
    BLmin = 1;
    BRmin = 1;

    FLmax = 0;
    FRmax = 0;
    BLmax = 0;
    BRmax = 0;
    */
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    FLcurrentDeg = MathR.lerp(0, 360, FLmin, FLmax, rotateWheel.getFLvalue()) * -1 + 360;
    FLDegDiff = FLaimDeg - FLcurrentDeg;
    if(FLDegDiff >= 180){ // detects whether the aiming passes through 
      FLaimDeg -= 180;
      FLcurrentDeg -= 180;
      FLFlip = true;
      FLDegDiff = FLaimDeg - FLcurrentDeg;
    }



    if(FLFlip){
      FLaimDeg += 180;
      FLcurrentDeg += 180;
      FLFlip = false;
    }

    /* Code to find encoder values (execution)
    if(control.getRightBumper()) {
      rotateWheel.rotateFLWheel(0.05);
      rotateWheel.rotateFRWheel(0.05);
      rotateWheel.rotateBLWheel(0.05);
      rotateWheel.rotateBRWheel(0.05);
    } else {
      rotateWheel.rotateFLWheel(0);
      rotateWheel.rotateFRWheel(0);
      rotateWheel.rotateBLWheel(0);
      rotateWheel.rotateBRWheel(0);
    }
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
    */
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
