// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILi.b BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import lib.ProceduralRobot;

import java.util.Scanner;

import static lib.Romi.*;


public class Robot extends ProceduralRobot {
  @Override
  public void autonomousProcedure() throws InterruptedException {
    public class Joystick {
      int port = 0;
      int Up = 1;
      int Down = 2;
      int Left = 3;
      int Right = 4;
      int H = 5;
      public Joystick(int 0, int 1, int 2 int 3, int 4, int 5) {
        this.port = port;
        this.Up = Up;
        this.Down = Down;
        this.Right = Right;
        this.H = H;
      }
    }
    public class Position {
  double horizontalPosition = 0;
  double verticalPosition = 0;
  int direction = 0;

  public Postion(double horizontalPosition, double verticalPosition, String direction) {
    this.horizontalPosition = horizontalPosition;
    this.verticalPosition = verticalPosition;
    this.direction = direcition;
         public void driveUp() throws InterruptedException {
driveDistance(3);
      verticalPosition = 3 + verticalPosition;
    }

    public void driveDown() throws InterruptedException {
driveDistance(-5);
      verticalPosition = -5 + verticalPosition;
    }
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
     while (Joystick.getRawButtonPressed) { 
      if (Joystick.getRawButton(1)) {
      position.driveUp;
      } else if (Joystick.getRawButton(2)) {
      position.driveDown;
      } else if (Joystick.getRawButton(3)) {
      position.driveLeft;
      } else if (Joystick.getRawButton(4)) {
      position.driveRight;
      } else if (Joystick.getRawButton(5)) {
      position.returnToHome;
      } else {
      port = port;
      }
      
        
      }
  }
     
    }
    

    
    //create a Joystick object
    //create a Position object
    //for loop
    //if-else statement for options
    //conditional: joysticks --> buttons
    // use Joystick.getRawButton() for conditionals.
    //methods
  }
}
