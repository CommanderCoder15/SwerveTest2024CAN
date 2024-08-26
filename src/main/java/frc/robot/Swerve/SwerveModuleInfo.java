// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Swerve;

/** Add your docs here. */
public class SwerveModuleInfo {
    final int rotationMotorID;
    final int movementMotorID;
    
    public SwerveModuleInfo(int rotationMotorID, int movementMotorID) {
        this.rotationMotorID = rotationMotorID;
        this.movementMotorID = movementMotorID;
    }
}
