package com.cloudmandu.kbc;

import java.util.Scanner;

import com.cloudmandu.kbc.bank.Answers;
import com.cloudmandu.kbc.bank.Questions;
import com.cloudmandu.kbc.bank.QuestionsBank;

public class Kbc {

	private static QuestionsBank questionBank = getQuestions();

	public static void main(String[] args) {
		// salin lwagun
		boolean isCorrect = true;
		int currentQuestionNum = 0;
		while (isCorrect) {
			System.out.println("asking question number " + (currentQuestionNum + 1));
			isCorrect = askQuestion(currentQuestionNum);
			currentQuestionNum++;
			if (currentQuestionNum >= 8) {
				System.out.println("Congratulations, you are now a millionaire");
				break;
			}
		}

	}

	public static boolean askQuestion(int number) {
		String question = questionBank.getQuestion(number);

		Answers answers = new Answers();

		String[] options = answers.getAnswer(question);

		System.out.println(question);

		for (int i = 0; i < options.length - 1; i++) {

			System.out.print(i + 1 + "." + options[i] + "\t");
		}

		Scanner scanner = new Scanner(System.in);

		System.out.println();

		System.out.println("Please Select an Option");

		int select = scanner.nextInt();

		while (select > 4 || select < 1) {
			System.out.println("Invalid Input... Please select a valid input");
			select = scanner.nextInt();
		}

		String userAnswer = options[select - 1];

		System.out.println(userAnswer);

		if (userAnswer.equals(options[4])) {

			System.out.println("correct answer");
			return true;

		} else {
			System.out.println("wrong answer");
			return false;
		}
	}

	public static QuestionsBank getQuestions() {

		QuestionsBank questionBank = new QuestionsBank();

		questionBank.addQuestion(Questions.q1);
		questionBank.addQuestion(Questions.q2);
		questionBank.addQuestion(Questions.q3);
		questionBank.addQuestion(Questions.q4);
		questionBank.addQuestion(Questions.q5);
		questionBank.addQuestion(Questions.q6);
		questionBank.addQuestion(Questions.q7);
		questionBank.addQuestion(Questions.q8);

		return questionBank;
	}

}

/*
 * 1. Question Bank 2. Answers Bank 3. User Selection
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */