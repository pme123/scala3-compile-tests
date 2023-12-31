package scala3.compile.tests

import com.github.plokhotnyuk.jsoniter_scala.core.JsonValueCodec
import com.github.plokhotnyuk.jsoniter_scala.macros.{CodecMakerConfig, JsonCodecMaker}

val numberOfTestFiles = 100
val numberOfClass = 50
val numberOfEnum = 50

inline def JsonEnumCodec[A]: JsonValueCodec[A] = JsonCodecMaker.makeWithoutDiscriminator[A]
inline def JsonCodec[A]: JsonValueCodec[A] = JsonCodecMaker.make{
  CodecMakerConfig
    .withTransientDefault(false)
    .withDiscriminatorFieldName(Some("type"))
}