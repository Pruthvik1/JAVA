class Exception{
    public static void main (String args[]) {
        int arr[] = new int[10];
        try {
            arr[10]=2;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBound occured  " + e);
        }
        
    }
}