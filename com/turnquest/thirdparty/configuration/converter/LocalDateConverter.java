// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.configuration.converter;

import java.util.function.Function;
import java.util.Optional;
import javax.persistence.Converter;
import java.sql.Date;
import java.time.LocalDate;
import javax.persistence.AttributeConverter;

@Converter(autoApply = true)
public class LocalDateConverter implements AttributeConverter<LocalDate, Date>
{
    public Date convertToDatabaseColumn(final LocalDate LocalDate) {
        return Optional.ofNullable(LocalDate).map((Function<? super LocalDate, ? extends Date>)Date::valueOf).orElse(null);
    }
    
    public LocalDate convertToEntityAttribute(final Date date) {
        return Optional.ofNullable(date).map((Function<? super Date, ? extends LocalDate>)Date::toLocalDate).orElse(null);
    }
}
