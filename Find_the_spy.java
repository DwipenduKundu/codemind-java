import java.util.*;
public class Spy{
    public static int findSpy(int n,int[][] trust){
        int[] trustCount=new int[n+1];
        for(int[] relation :trust){
            int personA=relation[0];
            int personB=relation[1];
            trustCount[personA]--;
            trustCount[personB]++;
        }
        for (int i=1;i<=n;i++){
            if(trustCount[i]==n-1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int size=sc.nextInt();
        int[][] trust=new int[size][2];
        for (int i=0;i<size;i++){
            trust[i][0]=sc.nextInt();
            trust[i][1]=sc.nextInt();
        }
        int spyLabel=findSpy(n,trust);
        System.out.println(spyLabel);
        
    }
}