// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Swerve;

/** Add your docs here. */
public class SwerveMotor {
	SwerveModuleInfo info;
    final double EncoderMin;
    final double EncoderMax;
    final double EncoderCntr;
    double AimDeg;
    double CurrentDeg;


    public SwerveMotor(SwerveModuleInfo info, double EncoderMinimum, double EncoderMaximum, double EncoderCenter, double x, double y) {
		this.info = info;
        this.EncoderMin = EncoderMinimum;
        this.EncoderMax = EncoderMaximum;
        this.EncoderCntr = EncoderCenter;
        this.AimDeg = 0;
        this.CurrentDeg = 0;

    }
}
