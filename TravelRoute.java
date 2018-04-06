import java.util.Objects;


public class TravelRoute {

    public static void main(String[] args) {
       
        //String [][] destinations = {{"A","B"},{"B","C"},{"C","D"}};
        //String [][] destinations = {{"A","B"},{"C","D"},{"B","C"}};
        //String [][] destinations = {{"B","C"},{"A","B"},{"C","D"}};
        //String [][] destinations = {{"B","C"},{"C","D"},{"A","B"}};
        //String [][] destinations = {{"C","D"},{"A","B"},{"B","C"}};
        String [][] destinations = {{"C","D"},{"B","C"},{"A","B"}};
        
        String [][] sortedTable = {{"a","b"},{"c","d"},{"e","f"}};
        int count = 0;
        int used = 0;
        
        for(int i =0; i<destinations.length; i++){
            for(int j = 0; j<destinations.length; j++){
                if(Objects.equals(destinations[i][0],destinations[j][1])){
                    count++;
                }
            }
                
                if (count==0){
                    used = i;
                    sortedTable[0][0]=destinations[i][0];
                    sortedTable[0][1]=destinations[i][1];
                }
                
            
                count = 0;
        }
        
        for(int i =0; i<destinations.length; i++){
            for(int j = 0; j<destinations.length; j++){
                if(Objects.equals(destinations[i][1],destinations[j][0])){
                    count++;
                }
            }
            if(count==0){
                sortedTable[2][0] = destinations[i][0];
                sortedTable[2][1] = destinations[i][1];
            }
            else if (count==1 && i != used){
                sortedTable[1][0] = destinations[i][0];
                sortedTable[1][1] = destinations[i][1];
            }
            count = 0;
        }
        
        for(int i = 0; i<sortedTable.length;i++){
            for(int j = 0; j<sortedTable[i].length;j++){
                System.out.println(sortedTable[i][j]);
            }
        }
    }    
}
