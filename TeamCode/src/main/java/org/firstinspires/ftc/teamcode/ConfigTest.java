package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class ConfigTest extends OpMode {
        public Hardwareconfig hw;


    @Override
    public void init() { hw=new Hardwareconfig(hardwareMap); }

    @Override
    public void loop() {
        double RT=gamepad1.right_trigger;
        float LT=gamepad1.left_trigger;
        hw.ducks.setPower(RT);
        hw.intake.setPower(LT);

        if(gamepad1.dpad_up)
            hw.servoA.setPosition(0.5);
        else if (gamepad1.dpad_down) { hw.servoB.setPosition(0.5);}

        if (gamepad1.dpad_left)
            hw.capperBrat.setPosition(0.6);
        else if (gamepad1.dpad_right) { hw.capperBrat.setPosition(0.6);}

        if (gamepad1.start)
            hw.clawAB.setPosition(0.35);

        if (gamepad1.x)
            hw.capperClaw.setPosition(0.5);
        else if (gamepad1.y) {
            hw.capperClaw.setPosition(0.6);
        }
    }
}
