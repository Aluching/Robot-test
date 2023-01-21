package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Hardwareconfig {

    public DcMotor stanga;
    public DcMotor dreapta;
    public Servo servo_std;

    public Hardwareconfig(HardwareMap hw) {
        stanga=hw.get(DcMotor.class,"stanga");
        dreapta=hw.get(DcMotor.class,"dreapta");
        servo_std=hw.get(Servo.class,"servo_std");

        stanga.setDirection(DcMotorSimple.Direction.REVERSE);
        stanga.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
}
