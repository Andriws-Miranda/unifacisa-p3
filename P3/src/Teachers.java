import java.util.HashSet;
import java.util.Stack;

import lombok.*;

@Data
public class Teachers {
	private char id;
	private String name;
	private Integer phNo;
	private String address;
	private String adminContratante;
	private Stack<TestPaper> provas;
	private HashSet<Students> alunos;

	public TestPaper prepareTestPaper(TestPaper newTestPaper) {
		provas.add(newTestPaper);
	}

	public void markAttendance() {

	}

	public boolean checkPapers(TestPaper newTestPaper) {
		boolean var = true;
		if (provas.contains(newTestPaper)) {
			return var;
		} else {
			return false;
		}
	}

	public void prepareReportCards() {

	}

	public void declareResults() {

	}
}
