package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.SwingArm;

public class Arm extends Subsystem{
    private static VictorSP armMasterVictor;
    private static Arm instance;

    private Arm() {
        armMasterVictor = new VictorSP(3);
    }

    public static Arm getInstance(){
        if(instance == null){
          instance = new Arm();
        }
        return instance;
    }

    public void setSpeed(double speed) {
        armMasterVictor.setSpeed(speed);
    }

    @Override
    protected void initDefaultCommand(){
        setDefaultCommand(new SwingArm());
    }
}