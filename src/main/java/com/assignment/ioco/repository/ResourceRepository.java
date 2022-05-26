package com.assignment.ioco.repository;

import com.assignment.ioco.entity.Resources;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resources, Long> {
}
