package com.bitlabs.demo.Repository;

import org.springframework.stereotype.Repository;

import com.bitlabs.demo.entity.Task;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}