import java.util.Scanner;
public class Prac {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
    char[][] board = {{'_','_','_'},
                      {'_','_','_'},
                      {'_','_','_'},
                                  };                   
    printBoard(board);
    userInput(board);
    }
   
    public static void printBoard(char[][] board){

        System.out.print("\n");
        for (int i=0; i<board.length;i++){
            System.out.print("\n");
            for (int j=0;j<board[i].length;j++){
                System.out.print(" " + board[i][j]);
            }
        }
    }

    public static void userInput(char[][] board){
        char turn = 's';
        for (int i=0;i<9;i++){        
            if (i%2 == 0){
              turn = 'X';
            }
            else{
              turn = 'O';
            }       
          System.out.print("\n\n" + turn + " turn: " );
          System.out.print("pick a row and collem: ");
          int rowin = input.nextInt();
          int collin = input.nextInt();
          board[rowin][collin] = turn;
          System.out.println( "\n\n" + winner(board) + " wins!"); 
          printBoard(board);
            }       
          }              
            
            
   
    public static char winner(char[][] board){   
      char result = 'a';  
      for (int i = 0; i<board.length;i++){
        for (int j=0; j < board[i].length;j++){

          if (board[i][0] == board[i][1] && board[i][0] == board[i][2]){
            result = board[i][0];
            
          }
          if (board[0][j] == board[1][j] && board[0][j]==board[2][j]){
            result = board[0][j];
            
          }
          
          if (board[0][0] == board[1][1] && board[0][0] == board[2][2]){
            result = board[0][0];
            
          }
          if (board[0][2] == board[1][1] && board[0][2] == board[2][0]){
            result = board[0][2];            
          }          
        }      
        }
        return result;
    
    }
  }






     






        
      
    
   








  

    


      

      
    
    
      

    

    
    
      
      
        


        

      
    
    
    
   

     
  
      
    

      
    
                

            
        
    
  


  
  