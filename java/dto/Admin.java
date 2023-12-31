package dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	public Long password;
	@OneToMany(mappedBy = "admin")
	private List<Librarian> librarian;

	public List<Librarian> getLibrarian() {
		return librarian;
	}

	public void setLibrarian(List<Librarian> librarian) {
		this.librarian = librarian;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPassword() {
		return password;
	}

	public void setPassword(Long password) {
		this.password = password;
	}

}
