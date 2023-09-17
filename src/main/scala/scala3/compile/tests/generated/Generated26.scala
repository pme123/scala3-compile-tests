package scala3.compile.tests.generated

import io.circe.Codec
import io.circe.derivation.{Configuration, ConfiguredCodec}
import io.circe.generic.semiauto.deriveCodec

case class Generated26(name: String = "Generated26",
  a1: Generated26A = Generated26A.Generated261(),
  a2: Generated26A = Generated26A.Generated262(),
  b: Generated26B = Generated26B(),
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
object Generated26:
  given Codec[Generated26] = deriveCodec

case class Generated26B(name: String = "Generated26",
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
object Generated26B:
  given Codec[Generated26B] = deriveCodec

enum Generated26A derives ConfiguredCodec:
  case Generated261(name: String = "Generated261")
  case Generated262(firstName: String = "Generated262",
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

