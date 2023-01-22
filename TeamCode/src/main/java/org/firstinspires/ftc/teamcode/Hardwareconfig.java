package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Hardwareconfig {

  public DcMotor rate;
  public DcMotor intake;
  public Servo servoIntake;
  public Servo cuvaL;
  public Servo cuvaR;
  public Servo impins;
  public Servo capperClaw;
  public Servo capperBrat;


  public Hardwareconfig(HardwareMap hw) {
      rate = hw.get(DcMotor.class, "rate");
      intake = hw.get(DcMotor.class, "intake");
      servoIntake = hw.get(Servo.class, "servoIntake");
      cuvaL = hw.get(Servo.class, "cuvaL");
      cuvaR = hw.get(Servo.class, "cuvaR");
      impins = hw.get(Servo.class, "impins");
      capperClaw = hw.get(Servo.class, "capperClaw");
      capperBrat = hw.get(Servo.class, "capperBrat");

      cuvaL.setDirection(Servo.Direction.REVERSE);
  }
}
