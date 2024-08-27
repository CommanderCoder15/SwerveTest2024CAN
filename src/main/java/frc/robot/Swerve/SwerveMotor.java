// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Swerve;

import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkAnalogSensor;
import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.SparkAnalogSensor.Mode;

/** Add your docs here. */
public class SwerveMotor {
	SwerveModuleInfo info;
	private CANSparkMax lateral;
    private SparkAnalogSensor absLateralEncoder;
	private CANSparkMax rotation;
    private SparkAnalogSensor absRotationEncoder;
    final double EncoderMin;
    final double EncoderMax;
    final double EncoderCntr;
    double AimDeg;
    double CurrentDeg;

    public SwerveMotor(SwerveModuleInfo info, double EncoderMinimum, double EncoderMaximum, double EncoderCenter) {
		this.info = info;
		this.lateral = new CANSparkMax(info.movementMotorID, MotorType.kBrushless);
        this.absLateralEncoder = this.lateral.getAnalog(Mode.kAbsolute);
		this.rotation = new CANSparkMax(info.movementMotorID, MotorType.kBrushless);
        this.absRotationEncoder = this.rotation.getAnalog(Mode.kAbsolute);

        this.EncoderMin = EncoderMinimum;
        this.EncoderMax = EncoderMaximum;
        this.EncoderCntr = EncoderCenter;
        this.AimDeg = 0;
        this.CurrentDeg = 0;
    }

    /* COMMANDS (for reference)
     * set() on a motor sets the speed
     * getPosition() returns the absolute encoder's position
     * 
     * 
     * 
     * 
     * 
     */
}
