name := "MongoTest1"

version := "1.0"

scalaVersion := "2.9.1"

resolvers += "Sonatype Repo" at "https://oss.sonatype.org/content/groups/scala-tools/"

libraryDependencies += "com.mongodb.casbah" % "casbah-core_2.9.1" % "2.1.5-1"

//mainClass in (Compile, run) := Some("Get")

