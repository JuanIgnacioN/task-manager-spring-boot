package com.jin.taskmanager.controller;

import com.jin.taskmanager.model.Cluster;
import com.jin.taskmanager.service.ClusterServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/cluster")
public class ClusterController {

    private final ClusterServices clusterServices;

    @Autowired
    public ClusterController(ClusterServices clusterServices){
        this.clusterServices = clusterServices;
    }

    @GetMapping
    public List<Cluster> getClusters(){
        return clusterServices.getClusters();
    }

    @PostMapping
    public void addCluster(@RequestBody Cluster cluster){
        clusterServices.addCluster(cluster);
    }

    @DeleteMapping(path="{clusterId}")
    public void deleteCluster(@PathVariable("clusterId") Long id){
        clusterServices.deleteCluster(id);
    }

    @PutMapping(path = "{clusterId}")
    public void updateCluster(
            @PathVariable("clusterId") Long id,
            @RequestParam(required = true) Cluster cluster
    ){
        clusterServices.updateCluster(id, cluster);
    }



}
