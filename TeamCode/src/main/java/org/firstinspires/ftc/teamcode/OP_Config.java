package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.internal.camera.delegating.DelegatingCaptureSequence;

public class OP_Config extends OpMode {
    public Config hr;

    @Override
    public void init() {
        hr = new Config(hardwareMap);
    }

    @Override
    public void loop() {


        //Wheels
        if(gamepad1.dpad_up)
            hr.left1.setPower(1);
        else if (gamepad1.dpad_down) { hr.left1.setPower(-1);}
        else
            hr.left1.setPower(0);

        if(gamepad1.dpad_left)
            hr.left2.setPower(1);
        else if (gamepad1.dpad_right)
            hr.left2.setPower(-1);
        else
            hr.left2.setPower(0);

        if(gamepad1.dpad_right)
            hr.right2.setPower(1);
        else if (gamepad1.dpad_right)
            hr.right2.setPower(-1);
        else
            hr.right2.setPower(0);

        if(gamepad1.dpad_down)
            hr.right1.setPower(1);
        else if (gamepad1.dpad_up) { hr.right1.setPower(-1);}
        else
            hr.right1.setPower(0);


        //Motor Speed
        if(gamepad1.y)
            hr.movement1.setPosition(1);
        else if (gamepad1.x)
            hr.movement1.setPosition(0.75);
        else if (gamepad1.a)
            hr.movement1.setPosition(0.5);
        else if (gamepad1.b)
            hr.movement1.setPosition(0.1);

        //Reverse Mode
        if(gamepad1.cross)
            hr.left1.setDirection(DcMotorSimple.Direction.REVERSE);
        else if (gamepad1.cross)
            hr.left2.setDirection(DcMotorSimple.Direction.REVERSE);
        else if (gamepad1.cross)
            hr.right1.setDirection(DcMotorSimple.Direction.REVERSE);
        else if (gamepad1.cross)
            hr.right2.setDirection(DcMotorSimple.Direction.REVERSE);
    }
    }