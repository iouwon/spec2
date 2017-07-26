name := "spec2"

version := "1.0"

scalaVersion := "2.12.2"

libraryDependencies ++= {Seq(
  "org.specs2" %% "specs2-core" % "3.9.4" % Test,
  "org.specs2" %% "specs2-mock" % "3.9.4" % Test,
  "org.mockito" % "mockito-core" % "2.8.47" % Test
)}