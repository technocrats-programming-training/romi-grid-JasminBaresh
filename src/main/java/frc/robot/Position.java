package frc.robot;

import static lib.Romi.driveDistance;
import static lib.Romi.turnDegrees;

public class Position {
  double horizontalPosition = 0;
  double verticalPosition = 0;
  int direction = 0;

  public Postion(double horizontalPosition, double verticalPosition, String direction) {
    this.horizontalPosition = horizontalPosition;
    this.verticalPosition = verticalPosition;
    this.direction = direcition;
  }


    //to drive Romi up, to record Romi's location
    public void driveUp() throws InterruptedException {
driveDistance(3);
      verticalPosition = 3 + verticalPosition;
    }

    public void driveDown() throws InterruptedException {
driveDistance(-5);
      verticalPosition = -5 + verticalPosition;
    }
// make sure Romi turns back to original position
    public void driveRight() throws InterruptedException {
turnDegrees(90);
      driveDistance(2);
      horizontalPosition = 2 + horizontalPosition;
      direction = 90 + direction;
      if (direction >= 360) {
        direction = direction - 360;
      } else {
        direction = direction;
      }
    }

    public void driveLeft() throws InterruptedException {
 turnDegrees(-90);
      driveDistance(-4);
      verticalPosition = -4 + verticalPosition;
      direction = -90 + direction;
      if (direction <= -360) {
        direction = direction + 360;
      } else {
        direction = direction;
      }
    }

    public void returnToHome() {
    }

    public String toString() {
        return "(" + horizontalPosition + ", " + verticalPosition + ")";
    }
   public String facing() {
     System.out.prinln("I am turned by " + direction + "°.");
   }
}
