name := """testproject"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava,PlayEbean)

scalaVersion := "2.13.10"
Compile / playEbeanModels := Seq("models.*")

libraryDependencies += guice

libraryDependencies ++= Seq(
    javaJdbc,
    "mysql" % "mysql-connector-java" % "8.0.31",
    "ch.qos.logback" % "logback-classic" % "1.4.5",
    "ch.qos.logback" % "logback-core" % "1.4.5",
    "ch.qos.logback" % "logback-access" % "1.4.5"
)