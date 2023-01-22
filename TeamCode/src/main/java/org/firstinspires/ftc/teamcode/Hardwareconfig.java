package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Hardwareconfig {

  public DcMotor ducks;
  public DcMotor intake;
  public Servo servoIntake;
  public Servo servoA;
  public Servo servoB;
  public Servo clawAB;
  public Servo capperClaw;
  public Servo capperBrat;


  public Hardwareconfig(HardwareMap hw) {
      ducks = hw.get(DcMotor.class, "rate");
      intake = hw.get(DcMotor.class, "intake");
      servoIntake = hw.get(Servo.class, "servoIntake");
      servoA = hw.get(Servo.class, "cuvaL");
      servoB = hw.get(Servo.class, "cuvaR");
      clawAB = hw.get(Servo.class, "impins");
      capperClaw = hw.get(Servo.class, "capperClaw");
      capperBrat = hw.get(Servo.class, "capperBrat");

      servoA.setDirection(Servo.Direction.REVERSE);
  }
}
