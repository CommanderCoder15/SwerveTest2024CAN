// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Swerve;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SwerveSubsystem extends SubsystemBase {
  /** Creates a new SwerveSubsystem. */
  public SwerveModuleInfo FLmotorInfo = new SwerveModuleInfo(4, 7, -1, 1);
  public SwerveMotor FLmotor = new SwerveMotor(FLmotorInfo, 0.2039, 3.3267, 1.6);

  public SwerveModuleInfo FRmotorInfo = new SwerveModuleInfo(6, 5, 1, 1);
  public SwerveMotor FRmotor = new SwerveMotor(FRmotorInfo, 0.0150, 3.247, 1.7);

  public SwerveModuleInfo BLmotorInfo = new SwerveModuleInfo(8, 3, -1, -1);
  public SwerveMotor BLmotor = new SwerveMotor(BLmotorInfo, 0.0267, 2.96, 0.091);

  public SwerveModuleInfo BRmotorInfo = new SwerveModuleInfo(2, 1, 1, -1);
  public SwerveMotor BRmotor = new SwerveMotor(BRmotorInfo, 0.0864, 3.229, 3.01);

  public SwerveSubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
