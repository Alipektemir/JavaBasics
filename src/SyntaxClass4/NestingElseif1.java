package SyntaxClass4;

public class NestingElseif1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* if student Completed the quiz will check for a score
		 * if score>= great job
		 * if score>80=well done
		 */
		boolean quizCompleted=true;
		int score=30;
				if(quizCompleted) {
					System.out.println("Let's Check Your Score");
					if(score>90) {
						System.out.println("Great job");
					}
				} else if (score>60) {
					System.out.println("Doing better");
				} else if (score>40) {
					System.out.println("You failed");
				}else {
						System.out.println("Do your hw on time");
					}
				}

	}


