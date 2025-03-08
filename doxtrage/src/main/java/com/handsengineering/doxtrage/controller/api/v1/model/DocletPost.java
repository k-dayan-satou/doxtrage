package com.handsengineering.doxtrage.controller.api.v1.model;

import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.lang.NonNull;

public record DocletPost(
    @NonNull
    Doclet doclet,
    @DefaultValue("false")
    Boolean autoTag
) {    
}
