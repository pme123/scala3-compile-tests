package scala3.compile.tests.generated

import io.circe.Codec
import io.circe.derivation.{Configuration, ConfiguredCodec}
import io.circe.generic.semiauto.deriveCodec

case class Generated22(name: String = "Generated22",
  a1: Generated22A = Generated22A.Generated221(),
  a2: Generated22A = Generated22A.Generated222(),
  b: Generated22B = Generated22B(),
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
object Generated22:
  given Codec[Generated22] = deriveCodec

case class Generated22B(name: String = "Generated22",
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
object Generated22B:
  given Codec[Generated22B] = deriveCodec

enum Generated22A derives ConfiguredCodec:
  case Generated221(name: String = "Generated221")
  case Generated222(firstName: String = "Generated222",
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

