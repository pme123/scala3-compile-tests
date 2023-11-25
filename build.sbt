import sbt.Keys.scalacOptions

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.0"


lazy val root = (project in file("."))
  .settings(
    name := "scala3-compile-tests",
    libraryDependencies ++= dependencies,
    scalacOptions ++= Seq(
       "-Vprofile",

      ),
    autoImportSetting,
    javaOptions ++= Seq(
      "-Xmx3g",
      "-Xmax-inlines=100",
      "-Xss2m",
      "-XX:+UseG1GC",
      "-XX:InitialCodeCacheSize=512m",
      "-XX:ReservedCodeCacheSize=512m",
      "-Dfile.encoding=UTF8"
    ),
  )

val osLibDependency = "com.lihaoyi" %% "os-lib" % "0.9.1"

val circeVersion = "0.14.5"
val osLibVersion = "0.9.1"
val jsoniterVersion = "2.23.2"
lazy val dependencies = Seq(
  "io.circe" %% "circe-generic" % circeVersion,
  "com.lihaoyi" %% "os-lib" % osLibVersion,
  // Use the %%% operator instead of %% for Scala.js and Scala Native
  "com.github.plokhotnyuk.jsoniter-scala" %% "jsoniter-scala-core" % jsoniterVersion,
  // Use the "provided" scope instead when the "compile-internal" scope is not supported
  "com.github.plokhotnyuk.jsoniter-scala" %% "jsoniter-scala-macros" % jsoniterVersion % Provided

)

lazy val autoImportSetting =
  scalacOptions +=
    Seq(
      "java.lang",
      "scala",
      "scala.Predef",
      "io.circe",
      "io.circe.derivation"
    ).mkString(start = "-Yimports:", sep = ",", end = "")