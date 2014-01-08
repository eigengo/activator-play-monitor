import play.Project._

name := "activator-play-monitor"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
    "org.webjars" %% "webjars-play" % "2.2.0",
    "org.webjars" % "bootstrap" % "2.3.1",
    "org.eigengo.monitor" % "agent-play" % "0.3-SNAPSHOT",
    "org.eigengo.monitor" % "output-statsd" % "0.3-SNAPSHOT"
)

playScalaSettings
