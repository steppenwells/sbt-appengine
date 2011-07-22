sbtPlugin := true

name := "sbt-appengine"

organization := "com.eed3si9n"

version <<= (sbtVersion) { (sv) => "sbt" + sv + "_0.3-SNAPSHOT" }

libraryDependencies <+= (sbtVersion) { (sv) => "com.github.siasia" %% "xsbt-web-plugin" % ("0.1.0-" + sv) }

scalacOptions := Seq("-deprecation", "-unchecked")

publishArtifact in (Compile, packageBin) := true

publishArtifact in (Test, packageBin) := false

publishArtifact in (Compile, packageDoc) := false

publishArtifact in (Compile, packageSrc) := false

resolvers += "Web plugin repo" at "http://siasia.github.com/maven2"
