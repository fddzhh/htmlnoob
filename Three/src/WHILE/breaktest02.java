package WHILE;

public class breaktest02 {
        public static void main(String[] args) {
            loop:for(int i = 0;i < 3;i++)
            //for(int i = 0 ;j < 3;j++)
            {
                for (int j = 0;j < 6;j++){
                    if(j == 4){
                        break loop;
                        //break;
                    }
                    System.out.println("i=" + i +"j=" + j);
                }
            }
        }
    }
