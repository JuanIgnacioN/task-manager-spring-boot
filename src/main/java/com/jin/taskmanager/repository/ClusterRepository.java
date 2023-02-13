package com.jin.taskmanager.repository;

import com.jin.taskmanager.model.Cluster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClusterRepository extends JpaRepository<Cluster, Long> {
}
