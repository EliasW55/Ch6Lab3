import java.util.Scanner;


public class IntegerList{


    int[] list; //values in the list

    Scanner scan = new Scanner(System.in);


    //-------------------------------------------------------

    //create a list of the given size

    //-------------------------------------------------------

    public IntegerList(int size)

    {

        list = new int[size];

    }



    //-------------------------------------------------------

    //fill array with integers between 1 and 100, inclusive

    //-------------------------------------------------------

    public void randomize()

    {

        for (int i=0; i<list.length; i++)

            list[i] = (int)(Math.random() * 100) + 1;

    }

    public void increaseSize() {
        int[] newArray = new int[list.length*2];
        
        for(int i=0; i<list.length; i++) {
            newArray[i] = list[i];
        }
        list=newArray;
    }

    //-------------------------------------------------------

    //print array elements with indices

    //-------------------------------------------------------

    public void print()

    {

        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);

    }

    public void addElement(int newVal) {
        if(search(0) == -1) {
            increaseSize();
        }
        int loc=search(0);
        list[loc]=newVal;
    }

    //-------------------------------------------------------

    //return the index of the first occurrence of target in the list.

    //return -1 if target does not appear in the list

    //-------------------------------------------------------

    public int search(int target)

    {

        return 0;

    }


    //-------------------------------------------------------

    //sort the list into ascending order using the selection sort algorithm

    //-------------------------------------------------------

    public void selectionSort()

    {

        int minIndex;

        for (int i=0; i < list.length-1; i++)

            {

                //find smallest element in list starting at location i

                


                //swap list[i] with smallest element

                

            }

    }

}


