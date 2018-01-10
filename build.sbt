name := "morphology-model"

version := "4.0.0-SNAPSHOT"

enablePlugins(JavaAppPackaging)

resolvers += Resolver.mavenLocal

lazy val commonSettings = Seq(
  version := "4.0.0-SNAPSHOT",
  organization := "com.alphasystem.arabic",
  scalaVersion := "2.12.4",
  test in assembly := {}
)

lazy val morphology_model = (project in file(".")).
  settings(commonSettings: _*)

scalaVersion := "2.12.4"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

libraryDependencies ++= {

  Seq(
    "com.alphasystem.arabic" % "arabic-support" % "3.0.0-SNAPSHOT"
  )
}
