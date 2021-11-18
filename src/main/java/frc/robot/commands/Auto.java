package frc.robot.commands;

import edu.wpi.first.wpilibj.command.TimedCommand;
import frc.robot.OI;
import frc.robot.subsystems.Drivetrain;

public class Auto extends TimedCommand {
    private OI oi;
    private Drivetrain drivetrain;

    public Auto(double time)
    {
        super(time);
        drivetrain = Drivetrain.getInstance();
        requires(drivetrain);
    }
    protected void execute()
    {
        drivetrain.setSpeed(-0.5, -0.5);
    }
    protected void end()
    {
        drivetrain.setSpeed(0, 0);
    }
}