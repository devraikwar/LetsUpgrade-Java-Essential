package com.Day5.QuizProject;

public class Game {

    Question[] questions = new Question[3];
    Player player = new Player();

//    String[] questionData = {"Who is the strongest avengers ?","What is the closest planet to sun ? ","What is the capital of Australia ? "};
//    String[] option1= {"Ironman","Earth","Sydney"};
//    String[] option2 = {"Thor","Venus","Melbourne"};
//    String[] option3 = {"Hulk","Mercury","Canberra"};
//    String[] option4 = {"Captain America","Mars","Perth"};
//    int[] answers = {1,3,3};

    public void initGame() {
//        created 3 objects

        for (int i = 0; i < 3; i++) {
            questions[i] = new Question();
        }

//        applying values to the variables of the object

        questions[0].question = "Who is the strongest avengers ? ";
        questions[0].option1 = "Ironman";
        questions[0].option2 = "Thor";
        questions[0].option3 = "Hulk";
        questions[0].option4 = "Captain America";
        questions[0].correctAnswer = 1;

        questions[1].question = "What is the closest planet to sun ? ";
        questions[1].option1 = "Earth";
        questions[1].option2 = "Venus";
        questions[1].option3 = "Mercury";
        questions[1].option4 = "Mars";
        questions[1].correctAnswer = 3;

        questions[2].question = "What is the capital of Australia ? ";
        questions[2].option1 = "Sydney";
        questions[2].option2 = "Melbourne";
        questions[2].option3 = "Canberra";
        questions[2].option4 = "Perth";
        questions[2].correctAnswer = 3;

//        for(int i=0;i<3;i++){
//            questions[i].question = questionData[i];
//            questions[i].option1 = option1[i];
//            questions[i].option2 = option2[i];
//            questions[i].option3 = option3[i];
//            questions[i].option4 = option4[i];
//            questions[i].correctAnswer = answers[i];
//        }

    }

    public void play() {

        player.getDetails();
        for (int j = 0; j < 3; j++) {
            boolean status = questions[j].askQuestion();

            if (status == true) {
                System.out.println("Congratulation, Your answer is right");
                player.score = player.score + 10;
                System.out.println(" ");
            }
            else{
                System.out.println("Sorry, Your answer is wrong");
                player.score = player.score - 5;
                System.out.println(" ");
            }
        }
        System.out.println("");
        System.out.println(player.name + " Your total score is " + player.score);
    }
}
