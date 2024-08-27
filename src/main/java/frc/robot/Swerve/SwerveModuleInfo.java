// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Swerve;

/** Add your docs here. */
public class SwerveModuleInfo {
    final int rotationMotorID;
    final int movementMotorID;
    final double x;
    final double y;
    
    public SwerveModuleInfo(int rotationMotorID, int movementMotorID, double x, double y) {
        this.rotationMotorID = rotationMotorID;
        this.movementMotorID = movementMotorID;
		this.x = x;
		this.y = y;
    }
}
