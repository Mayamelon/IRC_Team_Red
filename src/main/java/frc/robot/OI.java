package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {
  // singleton
  private static OI instance;
  public static OI getInstance() {
    if (instance == null)
      instance = new OI();
      return instance;
  }

  // Initialize joysticks
  private static Joystick leftJoy, rightJoy;
  /*private static Button leftTrigger, rightTrigger;

  public boolean leftPressed = false;
  public boolean rightPressed = false;*/

  // Set joystick ports
  private OI(){
    leftJoy = new Joystick(1);
    rightJoy = new Joystick(0);

    /*leftTrigger = new JoystickButton(leftJoy, 0);
    rightTrigger = new JoystickButton(rightJoy, 0);

leftTrigger.whenPressed(new pressButton(0, true));
rightTrigger.whenPressed(new pressButton(1, true));

leftTrigger.whenPressed(new pressButton(0, false));
rightTrigger.whenPressed(new pressButton(1, false));*/
  }

  public double getLeftJoy() {
    return leftJoy.getY();
  }

  public double getRightJoy() {
    return rightJoy.getY();
  }

  /*private boolean pressButton(boolean leftButton, boolean pressed)
  {
    if (leftButton)
    {
      leftPressed = pressed;
    }
    else {
      rightPressed = pressed;
    }
    return(true);
  }*/

  public boolean getRightButton(int x) {
    return rightJoy.getRawButton(x);
    
  }

  public boolean getLeftButton(int x) {
    return leftJoy.getRawButton(x);
  }
}
