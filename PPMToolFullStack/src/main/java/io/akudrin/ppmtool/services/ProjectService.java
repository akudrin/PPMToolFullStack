package io.akudrin.ppmtool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.akudrin.ppmtool.domain.Project;
import io.akudrin.ppmtool.exceptions.ProjectIdException;
import io.akudrin.ppmtool.repositories.ProjectRepository;

@Service
public class ProjectService {

	@Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){

    	try{
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            return projectRepository.save(project);
        }catch (Exception e){
            throw new ProjectIdException("Project ID '"+project.getProjectIdentifier().toUpperCase()+"' already exists");
}
    }

    public Project findProjectByIdentifier(String projectId){

        Project project = projectRepository.findByProjectIdentifier(projectId.toUpperCase());

        if(project == null){
            throw new ProjectIdException("Project ID '"+projectId+"' does not exist");

        }


        return project;
}
	
}
