package project11.quiz;

import java.util.Map;

public interface ScoreService {
	public int menu();
	public void input(Map<String, Score> scoreList);
	public void output(Map<String, Score> scoreList);
	public void modify(Map<String, Score> scoreList);
	public void delete(Map<String, Score> scoreList);
	public void clear(Map<String, Score> scoreList);
}