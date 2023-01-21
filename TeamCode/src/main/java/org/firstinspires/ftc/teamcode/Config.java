package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.GyroSensor;
import com.qualcomm.robotcore.hardware.Gyroscope;
import com.qualcomm.robotcore.hardware.HardwareDevice;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
import com.qualcomm.robotcore.hardware.PWMOutput;
import com.qualcomm.robotcore.hardware.PWMOutputController;
import com.qualcomm.robotcore.hardware.RobotConfigNameable;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.SwitchableLight;
import com.qualcomm.robotcore.hardware.UltrasonicSensor;
import com.qualcomm.robotcore.hardware.VoltageSensor;

import java.sql.Blob;
import java.sql.Driver;

import javax.lang.model.element.Element;

public class Config {
    //Wheels
    public DcMotor left1;
    public DcMotor right1;
    public DcMotor left2;
    public DcMotor right2;

    //Motor Speed
    public Servo movement1;
    public Servo movement2;

    //Colour Sensor(s)
    public ColorSensor color1;
    public ColorSensor color2;

    //Other
    public SwitchableLight light;
    public Appendable app;
    public Blob blob;
    public Driver drive;
    public Gyroscope gyro;
    public GyroSensor gyros;
    public HardwareDevice hd;
    public OpticalDistanceSensor ods;
    public RobotConfigNameable rcn;
    public UltrasonicSensor us;
    public VoltageSensor voltageSensor;

    public Config(HardwareMap hr){
        //Wheels
        left1=hr.get(DcMotor.class,"left1");
        right1=hr.get(DcMotor.class,"right1");
        left2=hr.get(DcMotor.class,"left2");
        right2=hr.get(DcMotor.class, "right2");


        //Wheels Config
        left1.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        right1.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        left2.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        right2.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        //Motors Speed
        movement1=hr.get(Servo.class,"movement1");
        movement2=hr.get(Servo.class,"movement2");


        //Servo Config
        movement1.setDirection(Servo.Direction.REVERSE);
        movement2.setDirection(Servo.Direction.FORWARD);
    }
}