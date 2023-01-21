package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class ConfigTest extends OpMode {
        public Hardwareconfig hw;


    @Override
    public void init() { hw=new Hardwareconfig(hardwareMap); }

    @Override
    public void loop() {
        double RT=gamepad1.right_trigger;
        float LT=gamepad1.left_trigger;
        hw.rata.setPower(RT);
        hw.intake.setPower(LT);

        if(gamepad1.dpad_up)
            hw.cuvaL.setPosition(0.5);
        else if (gamepad1.dpad_down) { hw.cuvaR.setPosition(0.6);}

        if (gamepad1.dpad_left)
            hw.capper.setPosition(0.5);
        else if (gamepad1.dpad_right) { hw.capper.setPosition(0.6);}

        if (gamepad1.start)
            hw.pins.setPosition(0.5);

        if (gamepad1.x)
            hw.brat.setPosition(0.5);
        else if (gamepad1.y) {hw.crapperClaw.setPosition(0.5);}
    }
}
