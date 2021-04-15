// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.configuration.converter;

import java.util.function.Function;
import java.util.Optional;
import javax.persistence.Converter;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import javax.persistence.AttributeConverter;

@Converter(autoApply = true)
public class LocalDateTimeConverter implements AttributeConverter<LocalDateTime, Timestamp>
{
    public Timestamp convertToDatabaseColumn(final LocalDateTime localDateTime) {
        return Optional.ofNullable(localDateTime).map((Function<? super LocalDateTime, ? extends Timestamp>)Timestamp::valueOf).orElse(null);
    }
    
    public LocalDateTime convertToEntityAttribute(final Timestamp timestamp) {
        return Optional.ofNullable(timestamp).map((Function<? super Timestamp, ? extends LocalDateTime>)Timestamp::toLocalDateTime).orElse(null);
    }
}
