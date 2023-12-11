import Model.MyList;

public class Controller {
    MyList myList;
    public Controller(){
        this.myList = new MyList();
    }
    public double averageArray(int[] array){
        return myList.averageArray(array);
    }
    public void compareArray(double firstArray, double secondArray){
        myList.compareArray(firstArray, secondArray);
    }
    public int[] createArray() {
        return myList.createArray();
    }
}
