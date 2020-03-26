import java.util.ArrayList;
import lombok.*;

@Data
public class Students {
	private char id;
	private String name;
	private Integer phNo;
	private String address;
	private ArrayList<Teachers> professores;
	private String admin;
	private ArrayList<Classe> classes;

	public void fillAdmissionForm() {

	}

	public void getEnrolled() {

	}

	public void writeExam() {

	}

}
