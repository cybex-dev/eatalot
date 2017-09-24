name := """eatalot"""
organization := "com.intelligents"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.2"

libraryDependencies += guice
//libraryDependencies += "mysql" % "mysql-connector-java" % "5.7.18"
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.36"
libraryDependencies += jdbc
libraryDependencies += javaJdbc
libraryDependencies += filters
libraryDependencies += evolutions

libraryDependencies += "com.typesafe.play" %% "play-mailer" % "6.0.1"
libraryDependencies += "com.typesafe.play" %% "play-mailer-guice" % "6.0.1"

// Testing libraries for dealing with CompletionStage...
libraryDependencies += "org.assertj" % "assertj-core" % "3.6.2" % Test
libraryDependencies += "org.awaitility" % "awaitility" % "2.0.0" % Test
libraryDependencies += "org.bgee.log4jdbc-log4j2" % "log4jdbc-log4j2-jdbc4.1" % "1.16"

// Make verbose tests
testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))

// Additional Libraries
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.41"
libraryDependencies += javaWs
libraryDependencies += guice
