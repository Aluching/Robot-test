package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class Configuration extends OpMode {
    public Hardwareconfig hw;


    @Override
    public void init() { hw=new Hardwareconfig(hardwareMap); }

    @Override
    public void loop() {
        double RT=gamepad1.right_trigger;
        double LT=gamepad1.left_trigger;
        double JRY=gamepad1.right_stick_y;
        double JLY=gamepad1.left_stick_y;
        boolean A=gamepad1.a;
        boolean X= gamepad1.x;
        boolean Y= gamepad1.y;
        boolean B= gamepad1.b;

        hw.capperBrat.setPosition(RT);
        hw.capperClaw.setPosition(LT);

        if(JRY>0) hw.servoR.setPosition(JRY);
        else if (JRY<=0) {hw.servoR.setPosition(-JRY);}

        if (JLY>0) hw.servoL.setPosition(JLY);
        else if (JLY<=0) {hw.servoL.setPosition(-JLY);}

        if (A) hw.clawAB.setPosition(0.35);
        else if (X) {hw.clawAB.setPosition(0.1);}

        if (Y) hw.servoIntake.setPosition(0.5);
        else if (B) {hw.intake.setPower(0.6);}
    }
}
