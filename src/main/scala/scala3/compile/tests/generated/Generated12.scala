package scala3.compile.tests.generated

import io.circe.Codec
import io.circe.derivation.{Configuration, ConfiguredCodec}
import io.circe.generic.semiauto.deriveCodec

case class Generated12(name: String = "Generated12",
  a1: Generated12A = Generated12A.Generated121(),
  a2: Generated12A = Generated12A.Generated122(),
  b: Generated12B = Generated12B(),
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
object Generated12:
  given Codec[Generated12] = deriveCodec

case class Generated12B(name: String = "Generated12",
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
object Generated12B:
  given Codec[Generated12B] = deriveCodec

enum Generated12A derives ConfiguredCodec:
  case Generated121(name: String = "Generated121")
  case Generated122(firstName: String = "Generated122",
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

