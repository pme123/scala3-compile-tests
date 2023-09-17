import mill._, scalalib._

object foo extends RootModule with ScalaModule {
  def scalaVersion = "3.3.0"

  val circeVersion = "0.14.5"
  val osLibVersion = "0.9.1"
  val jsoniterVersion = "2.23.2"

  def ivyDeps = Agg(
    ivy"io.circe::circe-generic:$circeVersion",
    ivy"com.lihaoyi::os-lib:$osLibVersion",
    // Use the %%% operator instead of %% for Scala.js and Scala Native
    ivy"com.github.plokhotnyuk.jsoniter-scala::jsoniter-scala-core:$jsoniterVersion",
    // Use the "provided" scope instead when the "compile-internal" scope is not supported
    ivy"com.github.plokhotnyuk.jsoniter-scala::jsoniter-scala-macros:$jsoniterVersion"
  )

}
