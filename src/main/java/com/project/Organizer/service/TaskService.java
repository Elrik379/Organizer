package com.project.Organizer.service;

import com.project.Organizer.entity.Task;
import com.project.Organizer.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task save(Task task){
        return taskRepository.save(task);
    }

    public void delete(int id) {
        taskRepository.deleteById(id);
    }

    public List<Task> getAll() {
        return taskRepository.findAll(Sort.by(Sort.Order.asc("date"), Sort.Order.desc("priorityId")));
        //Сортировка в порядке возрастания дат и убывания приоритета
    }

}
