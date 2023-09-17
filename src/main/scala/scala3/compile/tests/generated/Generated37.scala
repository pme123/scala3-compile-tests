package scala3.compile.tests.generated

import io.circe.Codec
import io.circe.derivation.{Configuration, ConfiguredCodec}
import io.circe.generic.semiauto.deriveCodec

case class Generated37(name: String = "Generated37",
  a1: Generated37A = Generated37A.Generated371(),
  a2: Generated37A = Generated37A.Generated372(),
  b: Generated37B = Generated37B(),
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
object Generated37:
  given Codec[Generated37] = deriveCodec

case class Generated37B(name: String = "Generated37",
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
object Generated37B:
  given Codec[Generated37B] = deriveCodec

enum Generated37A derives ConfiguredCodec:
  case Generated371(name: String = "Generated371")
  case Generated372(firstName: String = "Generated372",
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

