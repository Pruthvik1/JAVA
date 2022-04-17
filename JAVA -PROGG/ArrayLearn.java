public class ArrayLearn {
    public static void main(String[] args) {
        /**Write statements to do the following:
            a. Create an array to hold 10 double values.
            b. Assign the value 5.5 to the last element in the array.
            c. Display the sum of the first two elements.
            d. Write a loop that computes the sum of all elements in the array.
            e. Write a loop that finds the minimum element in the array.
            f. Randomly generate an index and display the element of this index in the array.
            g. Use an array initializer to create another array with the initial values 3.5, 5.5,
            4.52, and 5.6. */

            double[] arry=new double[10];
            arry[arry.length - 1]=5.5;
            System.err.println(arry[9]);
            for (int i = 0; i < arry.length; i++) {
                arry[i] = Math.random() * 100;
                System.err.println(arry[i]);
               }
            double d = 0.0;
            double sum=d;
            for(double a : arry){
                sum+=a;
            }

          System.out.println(sum    );



    }
    
}
