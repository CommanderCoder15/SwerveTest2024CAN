// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Swerve;

/** Add your docs here. */
public class SwerveMotor {
    public final double EncoderMin;
    public final double EncoderMax;
    public final double EncoderCntr;
    public final double AimDeg;
    public final double CurrentDeg;
    public final double DegDiff;
    public final boolean DegFlip;
    
    public SwerveMotor(double EncoderMinimum, double EncoderMaximum, double EncoderCenter) {
        this.EncoderMin = EncoderMinimum;
        this.EncoderMax = EncoderMaximum;
        this.EncoderCntr = EncoderCenter;
        this.AimDeg = 0;
        this.CurrentDeg = 0;
        this.DegDiff = 0;
        this.DegFlip = false;
    }
}
