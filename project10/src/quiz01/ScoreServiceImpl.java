package quiz01;

import java.util.List;

public interface ScoreServiceImpl {
	int menu();
	void input(List<Score> scoreList);
	void output(List<Score> scoreList);
	void modify(List<Score> scoreList);
	void delete(List<Score> scoreList);
	void clear(List<Score> scoreList);
}
