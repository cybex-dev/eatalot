name := """eatalot"""
organization := "com.intelligents"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.2"

// Additional Settings
PlayKeys.playDefaultPort := 8080

// Additional Libraries
libraryDependencies += javaWs
libraryDependencies += guice

// Database support MySQL
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.44"
libraryDependencies += jdbc
libraryDependencies += javaJdbc
libraryDependencies += evolutions

// Enable browser filters e.g. CSRF Filter, etc
libraryDependencies += filters

// Testing libraries for dealing with CompletionStage...
libraryDependencies += "org.assertj" % "assertj-core" % "3.6.2" % Test
libraryDependencies += "org.awaitility" % "awaitility" % "2.0.0" % Test
libraryDependencies += "org.bgee.log4jdbc-log4j2" % "log4jdbc-log4j2-jdbc4.1" % "1.16"

// Make verbose tests
testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))

// Sending mail
libraryDependencies += "com.typesafe.play" %% "play-mailer" % "6.0.1"
libraryDependencies += "com.typesafe.play" %% "play-mailer-guice" % "6.0.1"