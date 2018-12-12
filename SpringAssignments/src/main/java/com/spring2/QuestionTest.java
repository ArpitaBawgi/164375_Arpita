package com.spring2;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuestionTest {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring2.xml");
		Question question= context.getBean(Question.class);
		
		System.out.println("questionId: "+question.getQuestionId());
		System.out.println("question: "+question.getQuestion());
		
		System.out.println("==============================");
		System.out.println("This is for List:");
		
		for(String q:question.getAnswers()){
			System.out.println("Answers: "+q);
		}

		System.out.println("========================");
		System.out.println("This is for Set: ");
		for(String q1:question.getAnswers2()){
			System.out.println("Answer: "+q1);
		}
	
		System.out.println("========================");
	 System.out.println("This is for Map: ");
	  question.getAnswer3();
		   
	   }
	
	}


