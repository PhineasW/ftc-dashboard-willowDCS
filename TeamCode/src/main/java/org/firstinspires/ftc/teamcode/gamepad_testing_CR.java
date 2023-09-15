package org.firstinspires.ftc.teamcode;


import com.acmerobotics.dashboard.FtcDashboard;
import com.acmerobotics.dashboard.telemetry.MultipleTelemetry;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp()
public class varibleSM2 extends OpMode {
    /**
     * This is called when the driver presses INIT
     */
    @Override
    public void init() {


        int teamNumber = 16072;
        double motorSpeed = 0.5;
        boolean touchSensorPressed = true;


// this sends to the driver station
        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Motor Speed", motorSpeed);
        telemetry.addData("Touch Sensor", touchSensorPressed);


        FtcDashboard dashboard = FtcDashboard.getInstance();
        telemetry = new MultipleTelemetry(telemetry, dashboard.getTelemetry());


    }


    /**
     * This is called repeatedly while OpMode is playing
     */@Override
    public void loop() {
   package org.firstinspires.ftc.teamcode;
   import com.qualcomm.robotcore.eventloop.opmode.OpMode;
   import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
        @TeleOp()
        public class GamepadOpMode extends OpMode {
            @Override
            public void init() {




            }
            @Override
            public void loop() {
                telemetry.addData("Right Stick x", gamepad1.right_stick_x);
                telemetry.addData("Right stick y", gamepad1.right_stick_y);
                telemetry.addData("A button", gamepad1.a);
                telemetry.addData("B button", gamepad1.b);
                telemetry.addData("Left Trigger",gamepad1.left_trigger);
                telemetry.addData("Right Trigger",gamepad1.right_trigger);
                telemetry.update();

                telemetry.addData("Difference between Left y and Right y",gamepad1.left_stick_y - gamepad1.right_stick_y);
                telemetry.addData("Sum of Left and Right Trigger",gamepad1.left_trigger + gamepad1.right_trigger)
            }
        }

