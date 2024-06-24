// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class RunWheelSubsystem extends SubsystemBase {
  /** Creates a new MoveMotorSubsystem. */
  private CANSparkMax moveFL = new CANSparkMax(7, MotorType.kBrushless);
  private CANSparkMax moveFR = new CANSparkMax(5, MotorType.kBrushless);
  private CANSparkMax moveBL = new CANSparkMax(3, MotorType.kBrushless);
  private CANSparkMax moveBR = new CANSparkMax(1, MotorType.kBrushless);

  public void runFLmotor(double speed) {moveFL.set(speed);}
  public void runFRmotor(double speed) {moveFR.set(speed);}
  public void runBLmotor(double speed) {moveBL.set(speed);}
  public void runBRmotor(double speed) {moveBR.set(speed);}

  public RunWheelSubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
