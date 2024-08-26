// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Swerve;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

/** Add your docs here. */
public class SwerveMotor {
	SwerveModuleInfo info;
	private CANSparkMax lateral;
	private CANSparkMax rotation;
    final double EncoderMin;
    final double EncoderMax;
    final double EncoderCntr;
    double AimDeg;
    double CurrentDeg;

    public SwerveMotor(SwerveModuleInfo info, double EncoderMinimum, double EncoderMaximum, double EncoderCenter) {
		this.info = info;
		this.lateral = new CANSparkMax(info.movementMotorID, MotorType.kBrushless);
		this.rotation = new CANSparkMax(info.movementMotorID, MotorType.kBrushless);

        this.EncoderMin = EncoderMinimum;
        this.EncoderMax = EncoderMaximum;
        this.EncoderCntr = EncoderCenter;
        this.AimDeg = 0;
        this.CurrentDeg = 0;
    }
}
