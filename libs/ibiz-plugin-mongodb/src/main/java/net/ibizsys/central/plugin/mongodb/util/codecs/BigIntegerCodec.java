package net.ibizsys.central.plugin.mongodb.util.codecs;

import java.math.BigInteger;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;

public class BigIntegerCodec  implements Codec<BigInteger> {

    @Override
    public void encode(final BsonWriter writer, final BigInteger value, final EncoderContext encoderContext) {
        writer.writeInt64(value.longValue());
    }

    @Override
    public BigInteger decode(final BsonReader reader, final DecoderContext decoderContext) {
        return BigInteger.valueOf(reader.readInt64());
    }

    @Override
    public Class<BigInteger> getEncoderClass() {
        return BigInteger.class;
    }

}
