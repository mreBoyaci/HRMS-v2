package CodeHouse.Hrms.business.concretes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import CodeHouse.Hrms.business.abstracts.JobTitleService;
import CodeHouse.Hrms.dataAccess.abstracts.JobTitleDao;
import CodeHouse.Hrms.entities.concretes.JobTitle;



@Service
public class JobTitleManager implements JobTitleService{
	
	private JobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public List<JobTitle> getAll() {
		// TODO Auto-generated method stub
		return jobTitleDao.findAll();
	}
	
}
