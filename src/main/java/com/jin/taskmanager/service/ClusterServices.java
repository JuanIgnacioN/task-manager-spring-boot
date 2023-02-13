package com.jin.taskmanager.service;

import com.jin.taskmanager.model.Cluster;
import com.jin.taskmanager.repository.ClusterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ClusterServices {

    private final ClusterRepository clusterRepository;

    @Autowired
    public ClusterServices(ClusterRepository clusterRepository){
        this.clusterRepository = clusterRepository;
    }

    public List<Cluster> getClusters(){
        return clusterRepository.findAll();
    }

    public void addCluster(@RequestBody Cluster cluster){
        clusterRepository.save(cluster);
    }

    public void deleteCluster(Long id){
        boolean exists = clusterRepository.existsById(id);
        if(!exists){
            throw new IllegalStateException("Cluster "+id+" does not exists");
        }
        clusterRepository.deleteById(id);
    }

    public void updateCluster(Cluster cluster){
        clusterRepository.save(cluster);
    }

}
