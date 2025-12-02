package com.niteshmishra.project.Lovable.entity;

import com.niteshmishra.project.Lovable.Enums.ProjectRoles;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

public class ProjectMember {

    ProjectMemberId id;
    Project project;
    User user;
    ProjectRoles projectRole;

    Instant invitedAt;
    Instant acceptedAt;
}
