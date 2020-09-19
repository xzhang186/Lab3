//assignment 03 Xiaocheng Zhang
import java.util.ArrayList;
import java.util.List;

public class DeleteColumnsToSort {

    public List<Integer> minDeletionSize(String [] A){
        List<Integer> myList = new ArrayList<Integer>();
        //This loop is for go through every string
        for(int i=0; i< A.length-1; i++){
            if(A[i].length() < A[i+1].length()){
                //Show "-1" when the rows contain columns of unequal length
                myList.add(-1);
            }
        }

        for(int i=0;i<A[0].length();i++){

            for(int j=0;j<A.length-1;j++){
                //If the current column string's length is equal to the one next to it
                if(A[j].length()==A[j+1].length()){
                    //If current column character is greater than the one next to it
                    if(A[j].charAt(i)>A[j+1].charAt(i)){
                        myList.add(i);
                        break;
                    }
                } 
            }
        }
        return myList;
    }

    public static void main(String[] args) {
        DeleteColumnsToSort dcs = new DeleteColumnsToSort();
        String [] x = {"a","b","c"};
        System.out.println(dcs.minDeletionSize(x));

        String [] y = {"zxc","wje","fzx"};
        System.out.println(dcs.minDeletionSize(y));

        String [] z = {"Captain","Marvel","saved", "the", "Avengers"};
        System.out.println(dcs.minDeletionSize(z));



    }

}
