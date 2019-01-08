package io.akudrin.ppmtool.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.akudrin.ppmtool.domain.ProjectTask;

@Repository
public interface ProjectTaskRepository extends CrudRepository<ProjectTask, Long> {
	 List<ProjectTask> findByProjectIdentifierOrderByPriority(String id);
}
