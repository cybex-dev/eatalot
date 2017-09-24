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

lazy val myProject = (project in file("."))
  .enablePlugins(PlayJava, PlayEbean)