package com.niteshmishra.project.Lovable.entity;

import com.niteshmishra.project.Lovable.Enums.PreviewStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Preview {
    Long id;

    Project project;
    PreviewStatus status;

    String namespace;
    String podName;
    String previewUrl;


    Instant startedAt;
    Instant terminatedAt;

    Instant createdAt;

}
