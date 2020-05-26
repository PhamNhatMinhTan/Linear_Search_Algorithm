/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearsearch;

import java.util.Scanner;

/**
 *
 * @author Minh Tan
 */
public class LinearSearch {

    /**
     * Method search value use linear search
     *
     * @param arr
     * @param findValue 
     * @return
     */
    public static int LinearSearch(int arr[], int findValue) {
        // Run each value in list until match value to find or end of list
        for (int i = 0; i < arr.length; i++) {
            //if found then return value
            if (arr[i] == findValue) {
                return i;
            }
        }
        return -1;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Init Scanner object
        Scanner cin = new Scanner(System.in);
        //declare array
        int arr[] = {2, 3, 4, 10, 40};

        //Enter value to find
        System.out.print("Please enter value want to find: ");
        int findValue = cin.nextInt();
        
        //Linear search
        int result = LinearSearch(arr, findValue);
        
        //Display result
        if (result == -1) {
            System.out.print("Not found " + findValue);
        } else {
            System.out.println(findValue + " found at index " + result);
        }
    }

}
