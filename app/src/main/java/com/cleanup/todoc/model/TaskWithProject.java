package com.cleanup.todoc.model;

import androidx.room.Embedded;
import androidx.room.Relation;

public class TaskWithProject {

    @Embedded
    public Task task;

    @Relation(parentColumn = "projectId", entityColumn = "id")
    public Project project;

}
