public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();

        int[] array1 = controller.createArray();
        double firstArray = controller.averageArray(array1);

        int[] array2 = controller.createArray();
        double secondArray = controller.averageArray(array2);

        controller.compareArray(firstArray, secondArray);
    }
}
