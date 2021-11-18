package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.subsystems.Arm;

public class SwingArm extends Command {

    private OI oi;
    private Arm arm;

    private double direction; // 0 is neutral, -1 is down, 1 is up

    public SwingArm() {
        oi = OI.getInstance();
        arm = Arm.getInstance();
        requires(arm);
        direction = 0;
    }

    public void execute() {
        if (oi.getRightButton(1)) {
            direction = 0.75;
        }
        else if (oi.getLeftButton(1)) {
            direction = -0.25;
        }
        else {
            direction = 0;
        }
        arm.setSpeed(direction);
    }

    
  @Override
  protected boolean isFinished() {
    return false;
  }
}