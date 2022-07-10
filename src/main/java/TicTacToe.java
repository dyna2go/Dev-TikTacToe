import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        do {
            //Board
            String[][] My2DArray = {
                    {" ", "| |", " "},
                    {"-", "|-|", "-"},
                    {" ", "| |", " "},
                    {"-", "|-|", "-"},
                    {" ", "| |", " "}};
            var TL = My2DArray[0][0];
            var TC = My2DArray[0][1];
            var TR = My2DArray[0][2];
            var G0 = My2DArray[1][0];
            var G1 = My2DArray[1][1];
            var G2 = My2DArray[1][2];
            var ML = My2DArray[2][0];
            var MC = My2DArray[2][1];
            var MR = My2DArray[2][2];
            var G3 = My2DArray[3][0];
            var G4 = My2DArray[3][1];
            var G5 = My2DArray[3][2];
            var BL = My2DArray[4][0];
            var BC = My2DArray[4][1];
            var BR = My2DArray[4][2];
            String[] XANDO = {"X", "O", "|X|", "|O|"};
            Scanner board = new Scanner(System.in);
            System.out.println("\nSelect your space on the board : ");
            String UserBoardSelection = board.nextLine();
            Scanner placeXO = new Scanner(System.in);
            System.out.println("Select X or O: ");
            String UserCharSelection = placeXO.nextLine();
            //X
            if (UserBoardSelection.equals("TL") && UserCharSelection.equals("X")) {
                TL = TL.replace(TL, XANDO[0]);
            }
            if (UserBoardSelection.equals("TC") && UserCharSelection.equals("X")) {
                TC = TC.replace(TC, XANDO[2]);
            }
            if (UserBoardSelection.equals("TR") && UserCharSelection.equals("X")) {
                TR = TR.replace(TR, XANDO[0]);
            }
            if (UserBoardSelection.equals("ML") && UserCharSelection.equals("X")) {
                ML = ML.replace(ML, XANDO[0]);
            }
            if (UserBoardSelection.equals("MR") && UserCharSelection.equals("X")) {
                MR = MR.replace(MR, XANDO[0]);
            }
            if (UserBoardSelection.equals("MC") && UserCharSelection.equals("X")) {
                MC = MC.replace(MC, XANDO[2]);
            }
            if (UserBoardSelection.equals("BL") && UserCharSelection.equals("X")) {
                BL = BL.replace(BL, XANDO[0]);
            }
            if (UserBoardSelection.equals("BC") && UserCharSelection.equals("X")) {
                BC = BC.replace(BC, XANDO[2]);
            }
            if (UserBoardSelection.equals("BR") && UserCharSelection.equals("X")) {
                BR = BR.replace(BR, XANDO[0]);
            }
            //O
            if (UserBoardSelection.equals("TL") && UserCharSelection.equals("O")) {
                TL = TL.replace(TL, XANDO[1]);
            }
            if (UserBoardSelection.equals("TC") && UserCharSelection.equals("O")) {
                TC = TC.replace(TC, XANDO[3]);
            }
            if (UserBoardSelection.equals("TR") && UserCharSelection.equals("O")) {
                TR = TR.replace(TR, XANDO[1]);
            }
            if (UserBoardSelection.equals("ML") && UserCharSelection.equals("O")) {
                ML = ML.replace(ML, XANDO[1]);
            }
            if (UserBoardSelection.equals("MR") && UserCharSelection.equals("O")) {
                MR = MR.replace(MR, XANDO[1]);
            }
            if (UserBoardSelection.equals("MC") && UserCharSelection.equals("O")) {
                MC = MC.replace(MC, XANDO[3]);
            }
            if (UserBoardSelection.equals("BL") && UserCharSelection.equals("O")) {
                BL = BL.replace(BL, XANDO[1]);
            }
            if (UserBoardSelection.equals("BC") && UserCharSelection.equals("O")) {
                BC = BC.replace(BC, XANDO[3]);
            }
            if (UserBoardSelection.equals("BR") && UserCharSelection.equals("O")) {
                BR = BR.replace(BR, XANDO[1]);
            }
            System.out.println("\n====================================");
            System.out.println("\n" + TL + TC + TR);
            System.out.println(       G0 + G1 + G2);
            System.out.println(       ML + MC + MR);
            System.out.println(       G3 + G4 + G5);
            System.out.println(       BL + BC + BR);
            System.out.println("\n====================================");
            //board.close();
            //placeXO.close();
        } while (true);
    }
}
/*
TODO 1. Where there is a char there can not be another char
TODO 2. There needs to be a way to win
TODO 3. The game needs to remember each char on the board
TODO 4. There needs to be a way to tie when no one wins
TODO 5. Lower case letters need to be anticipated
TODO 6. An explanation on how the game works needs to be there
TODO 7. There should be a menu 1.) How to Play 2.) Start game 3.) End Game B) Back
TODO 8. Your game is still in progress. Are you sure you would like to quit game? 1. Yes 2, No. Goodbye!
TODO 9. X Won the game!
TODO 10. O Won the game!
TODO 11. The game ended in a tie.
TODO 12. Please enter a valid option. when the wrong info is put inside or left empty or space
TODO 13. There should be a chart to ref at commands in game option Choose a char on the board (1. menu button)
TODO 14. The game should delete and update and only show the most recent board
TODO 15. Optional, X and O get to choose there own colors 4.) Color Picker
TODO 16. Optional Make the board look better and also be able to change its color
TODO 17. Optional Tic-Tac-Toe! Game title ascii art and also be able to change its color
TODO 18. If person places on a char let it say "That space is already taken. Please try another location."
TODO 19. Find a way to make it so that X and O go one ofter each other instead of X or O to prevent cheating
<<<<<<< HEAD
TODO 20. Show the board at the start along with the title ect. ect ect.
=======
>>>>>>> origin/main
 */