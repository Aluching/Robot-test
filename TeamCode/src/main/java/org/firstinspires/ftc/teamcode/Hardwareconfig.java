package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcontroller.external.samples.SampleRevBlinkinLedDriver;

import java.sql.SQLRecoverableException;

public class Hardwareconfig {

  public DcMotor rata;
  public DcMotor intake;
  public Servo servoIntake;
  public Servo brat;
  public Servo cuvaL;
  public Servo cuvaR;
  public Servo pins;
  public Servo crapperClaw;
  public Servo capper;


  public Hardwareconfig(HardwareMap hw){
      rata=hw.get(DcMotor.class,"rata");
      intake=hw.get(DcMotor.class,"Intake");
      servoIntake=hw.get(Servo.class,"servoIntake");
      brat=hw.get(Servo.class, "brat");
      cuvaL=hw.get(Servo.class, "cuvaL");
      cuvaR=hw.get(Servo.class, "cuvaR");
      pins=hw.get(Servo.class, "pins");
      crapperClaw=hw.get(Servo.class, "crapperClaw");
      capper=hw.get(Servo.class, "capper");
      C:\Users\George\Documents\GitHub\Robot-test\TeamCode\src\main\java\org\firstinspires\ftc\teamcode\Hardwareconfig.java
  }
}
