

import java.util.Scanner;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

//import utilities needed such as scanner, file wrtier and IOExecption 

public class main {
    

 public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    //create scanner for user unput to quiz questions 

    String[] questions = { "Government's role in the economy \n A. Strong regulation and social programs. \n B. Limited intervention, free market. \n C. More socialist approach, control major industries. \n D. Environmental protection, sustainable economy. \n", "Taxation: \n A. Necessary for government programs. \n B. Minimal, essential services only. \n C. Heavy taxation on the wealthy, support social programs. \n D. Progressive taxation, prioritize environmental funding.", "Social issues (abortion, LGBTQ+ rights, gun control): \n A. Protect and expand rights, sensible gun control. \n B. Personal choice, limited government involvement. \n C. Restrict abortion, limit LGBTQ+ rights, promote access to firearms. \n D. Support reproductive rights, LGBTQ+ equality, and gun control." , "Environmental issues (climate change, conservation): \n A. Bold action to combat climate change, protect environment. \n B. Minimal government involvement, market forces. \n C. Economic growth over environmental protection. \n D. Strong environmental regulations, prioritize conservation." , "Foreign policy and international relations: \n A. Collaboration, diplomacy, global engagement. \n B. Non-intervention, prioritize national interests. \n C. Strong defense, assertive stance. \n D. Peaceful coexistence, international cooperation." , "Healthcare: \n A. Universal healthcare, government involvement. \n B. Private sector, limited government intervention. \n C. Market-driven, individual responsibility. \n D. Affordable and accessible healthcare for all.", "Education: \n A. Investment in public education, student loan reform. \n B. School choice, free market approach. \n C. Local control, less federal intervention. \n D. Free higher education, less standardized testing." , "Immigration: \n A. Path to citizenship for undocumented immigrants, protection for refugees. \n B. Open borders, no restrictions on immigration. \n C. Strict border control, merit-based immigration. \n D. Reform immigration system, family reunification.", "National security: \n A. Investment in diplomacy, cybersecurity, and peacekeeping. \n B. Limited government surveillance, protection of civil liberties. \n C. Strong military presence, preemptive measures against threats. \nD. Non-interventionist, reduction of military spending." , "Gun control: \n A. Universal background checks, ban on assault weapons. \n B. Minimal government intervention, protection of Second Amendment rights. \n C. Protection of Second Amendment rights, enforcement of existing laws. \nD. Ban on assault weapons, stricter regulations on firearms.", "Abortion: \nA. Protect reproductive rights, access to abortion and contraception. \n B. Personal choice, limited government involvement. \n C. Ban on abortion, protection of unborn life. \n D. Safe, legal, and rare abortions, access to healthcare.", "LGBTQ+ rights: \n A. Protection of LGBTQ+ rights, anti-discrimination laws. \n B. Personal choice, limited government involvement. \n C. Limited LGBTQ+ rights, defense of traditional values. \n D. Support for LGBTQ+ equality, anti-discrimination laws." , "Social safety net: \n A. Strong social safety net, investment in public programs. \n B. Limited government involvement, personal responsibility. \n C. Less government welfare, promote economic growth. \n D. Support for social safety net, prioritize funding for vulnerable populations." , "Climate change: \n A. Address climate change as a top priority, reduce carbon emissions. \n B. Minimal government involvement, promote market solutions. \n C. Address climate change through innovation, support natural gas and nuclear power. \n D. Reduce carbon emissions, transition to renewable energy.", "Government transparency: \n A. Increase transparency, accountability, and oversight. \n B. Limit government transparency to protect national security. \n C. Reduce regulations and bureaucracy, promote efficiency. \n D. Increase transparency, reduce corruption." , "Economic inequality: \n A. Address income inequality, implement progressive taxation. \n B. Free market solutions, promote individual success. \n C. Reduce government intervention, encourage economic growth. \n D. Implement wealth redistribution, prioritize social welfare." , "Infrastructure investment: \n A. Increase public investment in infrastructure projects. \n B. Privatize infrastructure, encourage private investment. \n C. Focus on essential infrastructure, reduce government spending. \n  D. Invest in sustainable infrastructure, prioritize green initiatives" , "Voting rights: \n A. Expand access to voting, combat voter suppression. \n B. Stricter voter ID laws, protect against voter fraud. \n C. State-level control, secure and maintain voter integrity. \n , D. Implement ranked-choice voting, promote third-party representation." , "Racial justice: \n A. Address systemic racism, promote equal opportunity and social justice. \n B. Color-blind society, focus on individual merit. \n C. Law and order, prioritize public safety. \n D. Promote diversity, cultural awareness, and affirmative action." 
 }; //quiz questions and answers in one array as a string. 

 int[] answerCount = new int[4];

 // create array to assign answers 

    for (int i = 0; i <questions.length; i++) { 
        System.out.println(questions[i] + ""); 
        String userAnswer = scanner.nextLine().toUpperCase();
        switch (userAnswer) {
            case "A":
                answerCount[0]++;
                break;
            case "B":
                answerCount[1]++;
                break;
            case "C":
                answerCount[2]++;
                break;
            case "D":
                answerCount[3]++;
                break;
            default:
                System.out.println("Invalid choice!");
        }

        //assign quiz choice to array placement 

        System.out.println();
    }

   
    scanner.close();

     // Close the scanner

    for (int i = 0; i <answerCount.length; i++) { 
        System.out.println(answerCount[i] + ""); 

    System.out.println(""); 
    

 



 } 


        int maxIndex = 0;
        int maxValue = answerCount[0];

        for (int i = 1; i < answerCount.length; i++) {
            if (answerCount[i] > maxValue) {
                maxIndex = i;
                maxValue = answerCount[i];
            }
        }

        switch (maxIndex) {
            case 0:
                System.out.println("Your answers indicate you allign to the Democratic party the most! \n You have received what we believe is your political party association. As political views are personal we have scored what your answers align to what party. 1st place is how many questions are aligned to the Democratic party, second is the Libertarian, third is Republican, and fourth is the green party. A text file has been saved with your results.");
                // Democratic party prompt given
                break;
            case 1:
                System.out.println("TYour answers indicate you allign to the Libertarian party the most! \n You have received what we believe is your political party association. As political views are personal we have scored what your answers align to what party. 1st place is how many questions are aligned to the Democratic party, second is the Libertarian, third is Republican, and fourth is the green party. A text file has been saved with your results.");
                // Libertarian party prompt given
                break;
            case 2:
                System.out.println("Your answers indicate you allign to the Republican party the most! \n You have received what we believe is your political party association. As political views are personal we have scored what your answers align to what party. 1st place is how many questions are aligned to the Democratic party, second is the Libertarian, third is Republican, and fourth is the green party. A text file has been saved with your results.");
                // Republican party prompt given
                break;
            case 3:
                System.out.println("Your answers indicate you allign to the Green party the most! \n You have received what we believe is your political party association. As political views are personal we have scored what your answers align to what party. 1st place is how many questions are aligned to the Democratic party, second is the Libertarian, third is Republican, and fourth is the green party. A text file has been saved with your results.");
                // Green party prompt given
                break;
            default:
                System.out.println("Invalid index.");
                // No prompt given error
        }

        switch (maxIndex) {
            case 0:
            try (FileWriter writer = new FileWriter("Democratic party.txt")) {
                for (int number : answerCount) {
                    writer.write(Integer.toString(number));
                    writer.write(System.lineSeparator()); // Write a new line after each element
                }
                
            } catch (IOException e) {
                System.out.println("An error occurred while saving the array to file.");
                e.printStackTrace();

                
        
            }


                break;
            case 1:
            try (FileWriter writer = new FileWriter("Libertarian party.txt")) {
                for (int number : answerCount) {
                    writer.write(Integer.toString(number));
                    writer.write(System.lineSeparator()); // Write a new line after each element
                }
                
            } catch (IOException e) {
                System.out.println("An error occurred while saving the array to file.");
                e.printStackTrace();
        
            }
                break;
            case 2:
            try (FileWriter writer = new FileWriter("Republican party")) {
                for (int number : answerCount) {
                    writer.write(Integer.toString(number));
                    writer.write(System.lineSeparator()); // Write a new line after each element
                }
                
            } catch (IOException e) {
                System.out.println("An error occurred while saving the array to file.");
                e.printStackTrace();
        
            }
                break;
            case 3:
            try (FileWriter writer = new FileWriter("Green party .txt")) {
                for (int number : answerCount) {
                    writer.write(Integer.toString(number));
                    writer.write(System.lineSeparator()); // Write a new line after each element
                }
                
            } catch (IOException e) {
                System.out.println("An error occurred while saving the array to file.");
                e.printStackTrace();
        
            }
                break;
            default:
                System.out.println("Invalid index.");
                // Handle any invalid index scenarios
        }
    }
 

} 
 

 
    
        





