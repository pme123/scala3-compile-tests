package scala3.compile.tests


 @main
def mainJsoniter(): Unit =

  Range(1, numberOfTestFiles).foreach(r =>
    writeJsoniter(s"Generated$r")
  )

  os.write.over(os.pwd / "src" / "main" / "scala" / "scala3" / "compile" / "tests" / "generated" / "Tester.scala",
  s"""package scala3.compile.tests
    |import com.github.plokhotnyuk.jsoniter_scala.core.*
    |
    |
    |@main
    |def main(): Unit = {
    |${
    Range(1, numberOfTestFiles).map(r =>
      s"""println(writeToString(Generated$r()))""".stripMargin
    ).mkString("\n")}
    |}
    |""".stripMargin
  )

end mainJsoniter

def writeJsoniter(name: String) =
  os.write.over(os.pwd / "src" / "main" / "scala" / "scala3" / "compile" / "tests" / "generated" / s"$name.scala",
    data =
      s"""package scala3.compile.tests
        |
        |import com.github.plokhotnyuk.jsoniter_scala.macros.*
        |import com.github.plokhotnyuk.jsoniter_scala.core.*
        |
        |case class $name(name: String = "$name",
        |  a1: ${name}A = ${name}A.${name}1(),
        |  a2: ${name}A = ${name}A.${name}2(),
        |  e1: ${name}C = ${name}C.EnumVal1,
        |  b: ${name}B = ${name}B(),
        |  ${Range(0, numberOfClass).map(r => s"attr$r: Int = $r,").mkString("\n  ")}
        |
        |)
        |object ${name}:
        |  given JsonValueCodec[${name}] = JsonCodec
        |
        |case class ${name}B(name: String = "$name",
        |  ${Range(0, numberOfClass).map(r => s"attr$r: Int = $r,").mkString("\n  ")}
        |
        |)
        |
        |enum ${name}A:
        |  case ${name}1(name: String = "${name}1")
        |  case ${name}2(firstName: String = "${name}2",
        |  ${Range(0, numberOfClass).map(r => s"attr$r: Int = $r,").mkString("\n  ")}
        |  )
        |
        |enum ${name}C:
        |  case ${Range(0, numberOfEnum).map(r => s"EnumVal$r").mkString(", ")}
        |object ${name}C:
        |  given JsonValueCodec[${name}C] = JsonEnumCodec
        |""".stripMargin,
    createFolders = true
  )

end writeJsoniter
