package CodeHouse.Hrms.entities.concretes;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// YOLLARA DİKKAT ET

@Entity
@Table(name="job_titles")
public class JobTitle {
	
	
	@Id
	@GeneratedValue
	@Column(name ="id")
	private Integer id;
	
	@Column(name ="title")
	private String title;
	
	
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public JobTitle() {}
	
	public JobTitle(Integer id, String title) {
		
		this.id = id;
		this.title = title;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
