// Project Information
name := """EatAloT"""
organization := "net.ddns.intelligents"

// Version Information
version := "1.0-SNAPSHOT"
scalaVersion := "2.12.2"

// Project Settings
lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

// Additional Settings
PlayKeys.playDefaultPort := 8080

// LIBRARIES

// Test Database
libraryDependencies += jdbc
libraryDependencies += javaJdbc
libraryDependencies += evolutions

libraryDependencies += "com.typesafe.play" %% "play-mailer" % "6.0.1"
libraryDependencies += "com.typesafe.play" %% "play-mailer-guice" % "6.0.1"

// Testing libraries for dealing with CompletionStage...
libraryDependencies += "org.assertj" % "assertj-core" % "3.6.2" % Test
libraryDependencies += "org.awaitility" % "awaitility" % "2.0.0" % Test

// Make verbose tests
testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))

// Additional Libraries
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.41"
libraryDependencies += javaWs
libraryDependencies += guice