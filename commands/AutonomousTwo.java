// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Shooter;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class AutonomousTwo extends SequentialCommandGroup {
  /** Creates a new AutonomousTwo. */
  public AutonomousTwo(DriveTrain dt, Intake i, Shooter s) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(new DriveForwardTimed (dt), new IntakeTime(i), new DriveTurn180Timed(dt), new DriveForwardTimed(dt), new ShooterTimed(s), new DriveBackwardTimed(dt));

  }
}
