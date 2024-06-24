// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkAnalogSensor;
import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.SparkAnalogSensor.Mode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class RotateWheelSubsystem extends SubsystemBase {
  /** Creates a new RotateWheelSubsystem. */
  // CALLS THE MOTORS

  private CANSparkMax spinFL = new CANSparkMax(4, MotorType.kBrushless);
  private CANSparkMax spinFR = new CANSparkMax(6, MotorType.kBrushless);
  private CANSparkMax spinBL = new CANSparkMax(8, MotorType.kBrushless);
  private CANSparkMax spinBR = new CANSparkMax(2, MotorType.kBrushless);

  private SparkAnalogSensor absFLencoder = spinFL.getAnalog(Mode.kAbsolute);
  private SparkAnalogSensor absFRencoder = spinFR.getAnalog(Mode.kAbsolute);
  private SparkAnalogSensor absBLencoder = spinBL.getAnalog(Mode.kAbsolute);
  private SparkAnalogSensor absBRencoder = spinBR.getAnalog(Mode.kAbsolute);

  // ALLOWS THE WHEEL TO ROTATE (HOPEFULLY)
  
  public void rotateFLWheel(double wheelSpinSpeed) {spinFL.set(wheelSpinSpeed);}
  public void rotateFRWheel(double wheelSpinSpeed) {spinFR.set(wheelSpinSpeed);}
  public void rotateBLWheel(double wheelSpinSpeed) {spinBL.set(wheelSpinSpeed);}
  public void rotateBRWheel(double wheelSpinSpeed) {spinBR.set(wheelSpinSpeed);}

  public double getFLvalue() {return absFLencoder.getPosition();}
  public double getFRvalue() {return absFRencoder.getPosition();}
  public double getBLvalue() {return absBLencoder.getPosition();}
  public double getBRvalue() {return absBRencoder.getPosition();}

  public RotateWheelSubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
