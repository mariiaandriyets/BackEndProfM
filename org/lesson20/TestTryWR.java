package com.proftelran.org.lesson20;

public class TestTryWR {
    public static void main(String[] args) {
        // try-with-resources
        // reader will close automatically

//        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            String s = reader.readLine();
//        } catch (Exception e) {
//           throw new IllegalArgumentException();
//        }

        try (CustomReader reader = new CustomReader()){
            int [] array = {12};
            System.out.println(array[5]);
            System.out.println("Hi");
        } catch (Exception e) {
           e.printStackTrace();
        }


    }
}
