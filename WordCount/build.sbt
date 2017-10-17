name := "Word Count"

version := "0.1"

scalaVersion := "2.10.5"

libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "1.4.0" % "provided"
libraryDependencies += "org.apache.hadoop" % "hadoop-common" % "2.7.0" exclude ("org.apache.hadoop","hadoop-yarn-server-web-proxy")