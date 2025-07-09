package org.example;

public record Producer(
    Sort sort,
    String country,
    String farm,
    ProcessingType processingType,
    int altitude
) {
}
