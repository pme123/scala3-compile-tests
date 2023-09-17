package scala3.compile.tests

@main
def mainCirce(): Unit = {

  val numberOfTestFiles = 50
  
  Range(1, numberOfTestFiles).foreach(r =>
    writeClasses(s"Generated$r")
  )

  os.write.over(os.pwd / "src" / "main" / "scala" / "scala3" / "compile" / "tests" / "generated" / "Tester.scala",
  s"""package scala3.compile.tests.generated
    |import io.circe.syntax.*
    |import io.circe.Codec
    |import io.circe.derivation.{Configuration, ConfiguredCodec}
    |import io.circe.generic.semiauto.deriveCodec
    |
    |@main
    |def main(): Unit = {
    |${
    Range(1, numberOfTestFiles).map(r =>
      s"""println(Generated$r().asJson)""".stripMargin
    ).mkString("\n")}
    |}
    |implicit val c: Configuration = Configuration.default.withDefaults
    |  .withDiscriminator("type")
    |""".stripMargin
  )

}

def writeClasses(name: String)=
  os.write.over(os.pwd / "src" / "main" / "scala" / "scala3" / "compile" / "tests" / "generated" / s"$name.scala",
    data =
      s"""package scala3.compile.tests.generated
        |
        |import io.circe.Codec
        |import io.circe.derivation.{Configuration, ConfiguredCodec}
        |import io.circe.generic.semiauto.deriveCodec
        |
        |case class $name(name: String = "$name",
        |  a1: ${name}A = ${name}A.${name}1(),
        |  a2: ${name}A = ${name}A.${name}2(),
        |  b: ${name}B = ${name}B(),
        |  ${Range(0, 20).map(r => s"attr$r: Int = $r,").mkString("\n  ")}
        |
        |)
        |object ${name}:
        |  given Codec[${name}] = deriveCodec
        |
        |case class ${name}B(name: String = "$name",
        |  ${Range(0, 20).map(r => s"attr$r: Int = $r,").mkString("\n  ")}
        |
        |)
        |object ${name}B:
        |  given Codec[${name}B] = deriveCodec
        |
        |enum ${name}A derives ConfiguredCodec:
        |  case ${name}1(name: String = "${name}1")
        |  case ${name}2(firstName: String = "${name}2",
        |  ${Range(0, 10).map(r => s"attr$r: Int = $r,").mkString("\n  ")}
        |  )
        |
        |""".stripMargin,
    createFolders = true
  )