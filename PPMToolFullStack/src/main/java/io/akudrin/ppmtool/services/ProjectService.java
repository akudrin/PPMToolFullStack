package io.akudrin.ppmtool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.akudrin.ppmtool.domain.Project;
import io.akudrin.ppmtool.repositories.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){

        //Logic

        return projectRepository.save(project);
    }

	
}
