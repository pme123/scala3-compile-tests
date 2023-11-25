package scala3.compile.tests

import com.github.plokhotnyuk.jsoniter_scala.core.JsonValueCodec
import com.github.plokhotnyuk.jsoniter_scala.macros.{CodecMakerConfig, JsonCodecMaker}

val numberOfTestFiles = 10
val numberOfClass = 10
val numberOfEnum = 30

inline def JsonEnumCodec[A]: JsonValueCodec[A] = JsonCodecMaker.makeWithoutDiscriminator[A]
inline def JsonCodec[A]: JsonValueCodec[A] = JsonCodecMaker.make{
  CodecMakerConfig
    .withTransientDefault(false)
    .withDiscriminatorFieldName(Some("type"))
}