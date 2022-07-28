package CodeHouse.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import CodeHouse.Hrms.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer>{

	
}
