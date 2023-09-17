package scala3.compile.tests.generated

import io.circe.Codec
import io.circe.derivation.{Configuration, ConfiguredCodec}
import io.circe.generic.semiauto.deriveCodec

case class Generated25(name: String = "Generated25",
  a1: Generated25A = Generated25A.Generated251(),
  a2: Generated25A = Generated25A.Generated252(),
  b: Generated25B = Generated25B(),
  attr0: Int = 0,
  attr1: Int = 1,
  attr2: Int = 2,
  attr3: Int = 3,
  attr4: Int = 4,
  attr5: Int = 5,
  attr6: Int = 6,
  attr7: Int = 7,
  attr8: Int = 8,
  attr9: Int = 9,
  attr10: Int = 10,
  attr11: Int = 11,
  attr12: Int = 12,
  attr13: Int = 13,
  attr14: Int = 14,
  attr15: Int = 15,
  attr16: Int = 16,
  attr17: Int = 17,
  attr18: Int = 18,
  attr19: Int = 19,

)
object Generated25:
  given Codec[Generated25] = deriveCodec

case class Generated25B(name: String = "Generated25",
  attr0: Int = 0,
  attr1: Int = 1,
  attr2: Int = 2,
  attr3: Int = 3,
  attr4: Int = 4,
  attr5: Int = 5,
  attr6: Int = 6,
  attr7: Int = 7,
  attr8: Int = 8,
  attr9: Int = 9,
  attr10: Int = 10,
  attr11: Int = 11,
  attr12: Int = 12,
  attr13: Int = 13,
  attr14: Int = 14,
  attr15: Int = 15,
  attr16: Int = 16,
  attr17: Int = 17,
  attr18: Int = 18,
  attr19: Int = 19,

)
object Generated25B:
  given Codec[Generated25B] = deriveCodec

enum Generated25A derives ConfiguredCodec:
  case Generated251(name: String = "Generated251")
  case Generated252(firstName: String = "Generated252",
  attr0: Int = 0,
  attr1: Int = 1,
  attr2: Int = 2,
  attr3: Int = 3,
  attr4: Int = 4,
  attr5: Int = 5,
  attr6: Int = 6,
  attr7: Int = 7,
  attr8: Int = 8,
  attr9: Int = 9,
  )

