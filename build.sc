// build.sc

import mill._, scalalib._
import coursier.maven.MavenRepository

object VelocityScala extends ScalaModule {
	def scalaVersion = "3.0.0-RC1"

	def repositories = super.repositories ++ Seq(
		MavenRepository("https://repo.velocitypowered.com/releases/"),
		MavenRepository("https://libraries.minecraft.net/"),
		MavenRepository("https://repo.spongepowered.org/maven"),

	)

	def ivyDeps = Agg(
		ivy"com.velocitypowered:velocity-api:1.1.4"
	)

	object test extends Tests {
		def ivyDeps = Agg(
			ivy"org.scalactic:scalactic_3.0.0-RC1:3.2.5",
			ivy"org.scalatest:scalatest_3.0.0-RC1:3.2.5"
		)
		def testFrameworks = Seq("org.scalatest.tools.Framework")
	}
}
