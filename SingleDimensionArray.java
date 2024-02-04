public class SingleDimensionArray {
    

int arr[] = null;
int size = 0;

public SingleDimensionArray(int size){
 this.arr= new int[size];
 for (int i = 0;i<arr.length;i++){
    arr[i] = Integer.MIN_VALUE;

 }
}

public void insert (int location,int value)  {
    if (arr[location] == Integer.MIN_VALUE){
        arr[location] = value;
        System.out.println("Successful insert");
    }else { 
        System.out.println("this cell is already occupied");
    }
}

    public void traverseArrray(){
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]+ "");
        }
    }
public void searchArray(int element){

    for (int i =0;i<arr.length;i++){
        if (arr[i] == element){
System.out.println("value is found at index  "+ i);
return;
        }
        
          
     
    }
    System.out.println("Value not found");
    
    
}


public void deleteValue (int removeElement){
try {
    arr[removeElement] = Integer.MIN_VALUE;
    System.out.println("successfully deleted");
}
catch (ArrayIndexOutOfBoundsException e){
System.out.println("Value not in range");
}


}

public static void main(String[] args) {
    SingleDimensionArray sda = new SingleDimensionArray(10);
    sda.insert(0,0);
    sda.insert(1,10);
    sda.insert(2,20);

   // int firstElement = sda.arr[0];
    //int thirdElement = sda.arr[2];
//System.out.println(firstElement);
//System.out.println(thirdElement);
    //sda.searchArray(10);
    sda.deleteValue(0);
}


}








