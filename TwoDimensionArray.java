import java.util.Arrays;

public class TwoDimensionArray {
int arr[][]= null;

public TwoDimensionArray(int numOfRows,int numOfCols){
    this.arr = new int[numOfRows][numOfCols];
    for (int row = 0; row<arr.length;row++){
        for(int col=0;col<arr.length;col++){
        arr[row][col] = Integer.MIN_VALUE;

        }
    }
}

public void insertValue (int row,int col,int value){
try{
if (arr[row][col] == Integer.MIN_VALUE){

arr[row][col] = value;
System.out.println("the value is successfully inserted");

}
else { 
    System.out.println("This cell is already occupied");
}
}
catch (ArrayIndexOutOfBoundsException e){


}

}

public void accessCell(int row,int col){
System.out.println("\nAcessing Row#" + row + ", Col#" +col);
try {
System.out.println("Cell value is :"+ arr[row][col]);
}
catch (ArrayIndexOutOfBoundsException e){
    System.out.println("Invalid index for 2D array");
}
}


public void traverse2DArray(){

    for (int row=0;row<arr.length;row++){
        for (int col=0;col<arr.length;col++){
            System.out.println(arr[row][col]+ " ");

        }
        System.out.println();
    }
}


public void search2DArray(int value){
for (int row=0;row<arr.length;row++){
    for (int col=0;col<arr[0].length;col++){
if (arr[row][col] ==value){
System.out.println("Value is found at row: "
+row+"," +"Col: "+ col);
return;
}

    }
}
System.out.println("Value is not found");
}

public void deleteValue2DArray (int row,int col){
try{
    arr[row][col] = Integer.MIN_VALUE;
    System.out.println("Successfully deleted"+ arr[row][col]);

}
catch (ArrayIndexOutOfBoundsException e){
    System.out.println("This index is not valid for array");
}
}
    public static void main (String[]args){

int TwoDArray[][];
TwoDArray = new int[2][2];
TwoDArray [0][0]= 1;
TwoDArray [0][1] = 2;
TwoDArray [1][0] = 3;
TwoDArray [1][1] = 4;

System.out.println(Arrays.deepToString(TwoDArray));

String s2Darray[][] = {{"a","b"},{"c","d"}};

System.out.println(Arrays.deepToString(s2Darray));

TwoDimensionArray twoDa = new TwoDimensionArray (3,3);

twoDa.insertValue(0,0,10);

System.out.println(Arrays.deepToString(twoDa.arr));


twoDa.insertValue(0,0,10);
twoDa.insertValue(0,1,20);
twoDa.accessCell(0,1);

twoDa.search2DArray(20);

twoDa.deleteValue2DArray(0, 0);
System.out.println(Arrays.deepToString(twoDa.arr));
}
}
