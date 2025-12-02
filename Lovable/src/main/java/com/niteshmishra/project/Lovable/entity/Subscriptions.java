package com.niteshmishra.project.Lovable.entity;

import com.niteshmishra.project.Lovable.Enums.SubscriptionStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Subscriptions {
    Long id;

    User user;
    Plan plan;
    SubscriptionStatus status;

    String stripeCustomerId;
    String stripeSubscriptionId;

    Instant currentPeriodStart;
    Instant currentPeriodEnd;
    Instant cancelAtPeriodEnd;

    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;

}
