package com.handsengineering.doxtrage.controller.api.v1.model;

import org.springframework.lang.NonNull;

import jakarta.validation.constraints.Size;

public record Doclet(
    @NonNull
    @Size(min = 0, max = 500)
    String title,
    @NonNull
    @Size(min = 0, max = 2000)
    String description,
    String[] refs
) {}
