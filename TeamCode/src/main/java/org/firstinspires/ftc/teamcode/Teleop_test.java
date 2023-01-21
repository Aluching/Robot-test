package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp

public class Teleop_test extends OpMode {
    public Hardwareconfig hw;
    @Override
    public void init() { hw=new Hardwareconfig(hardwareMap); }

    @Override
    public void loop() {
        if(gamepad1.dpad_up)
            hw.stanga.setPower(1);
        else if (gamepad1.dpad_down) {
            hw.stanga.setPower(-1);

        }
        else
            hw.stanga.setPower(0);

        if(gamepad1.dpad_left)
            hw.dreapta.setPower(1);
        else if (gamepad1.dpad_right) {
            hw.dreapta.setPower(-1);

        }
        else
            hw.dreapta.setPower(0);

        if(gamepad1.b)
            hw.servo_std.setPosition(0.25);
        else if (gamepad1.y)
            hw.servo_std.setPosition(0.5);
        else if (gamepad1.x)
            hw.servo_std.setPosition(0.75);
        else if (gamepad1.a)
            hw.servo_std.setPosition(1);
    }

}
