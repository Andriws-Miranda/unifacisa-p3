import java.util.ArrayList;
import java.util.HashSet;
import lombok.*;

@Data
public class Admin {
	private char id;
	private String name;
	private String password;
	private HashSet<Teachers> professores;
	private HashSet<Students> estudantes;
	private ArrayList<Subjects> subjects;
	private HashSet<Classe> classes;
	private HashSet<Divisions> divisoes;

	public String login(String givedPassword) {
		if (givedPassword.equals(this.password)) {
			return "Bem-Vindo";
		} else {
			return "Senha Incorreta";
		}
	}

	public void logout() {

	}

	public void addNewTeachers(Teachers newTeacher) {
		professores.add(newTeacher);
	}

	public void modifyTeacher(Teachers newTeacher) {
		for (Teachers s : professores) {
			if (s.hashCode() == newTeacher.hashCode()) {
				professores.remove(s);
				professores.add(newTeacher);
			}
		}
	}

	public void addNewStudent(Students newStudent) {
		estudantes.add(newStudent);
	}

	public void modifyStudent(Students newStudent) {
		for (Students s : estudantes) {
			if (s.hashCode() == newStudent.hashCode()) {
				estudantes.remove(s);
				estudantes.add(newStudent);
			}
		}
	}

	public void addNewSubject(Subjects newSubject) {
		subjects.add(newSubject);

	}

	public void modifySubject(Subjects newSubject) {
		for (Subjects s : subjects) {
			if (s.hashCode() == newSubject.hashCode()) {
				subjects.remove(s);
				subjects.add(newSubject);
			}
		}
	}

	public void addNewClasse(Classe newClasse) {
		classes.add(newClasse);
	}

	public void modifyClasse(Classe newClasse) {
		for (Classe s : classes) {
			if (s.hashCode() == newClasse.hashCode()) {
				classes.remove(s);
				classes.add(newClasse);
			}
		}
	}

	public void addNewDivision(Divisions newDivision) {
		divisoes.add(newDivision);
	}

	public void modifyDivision(Divisions newDivision) {
		for (Divisions s : divisoes) {
			if (s.hashCode() == newDivision.hashCode()) {
				divisoes.remove(s);
				divisoes.add(newDivision);
			}
		}
	}
}