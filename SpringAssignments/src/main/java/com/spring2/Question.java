package com.spring2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {
	private int questionId;
	private String question;
	List<String> answers;
	Set<String> answers2;
	Map answer3;
	
	public Map getAnswer3() {
		System.out.println("Answer:"+answer3);
		return answer3;
	}
	public void setAnswer3(Map answer3) {
		this.answer3 = answer3;
	}
	public Set<String> getAnswers2() {
		return answers2;
	}
	public void setAnswers2(Set<String> answers2) {
		this.answers2 = answers2;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question
				+ ", answers=" + answers + "]";
	}
	
}
