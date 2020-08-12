val dottyVersion = "0.26.0-RC1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "dotty-starter",
    version := "0.1.0",

    scalaVersion := dottyVersion,

    libraryDependencies ++= Seq(
      "org.scalameta" %% "munit" % "0.7.11" % Test
    ),
    testFrameworks += new TestFramework("munit.Framework")
  )
