package com.project.Organizer.repository;

import com.project.Organizer.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> { //JpaRepository - набор методов для работы с БД
}
