package com.company;

public class Main {
    public static int[] Get_Min3(int []arr){
        int len=arr.length;
        int []Copy_Array=new int[len];
        for(int i=0;i<len;i++) {
            Copy_Array[i]=arr[i];
        }

        len=len-1;
        for(int i=0;i<len;i++) {
            for(int j=0;j<len-i;j++) {
                if (Copy_Array[j]>Copy_Array[j+1])
                {
                    int tmp=Copy_Array[j];
                    Copy_Array[j]=Copy_Array[j+1];
                    Copy_Array[j+1]=tmp;
                }
            }}
        int []min_3element= {Copy_Array[0],Copy_Array[1],Copy_Array[2]};
        return min_3element;
    }
    public static void get_avg(int []arr){
        int x=0;
        for(int i=0;i<arr.length;i++)
        {
            x+=arr[i];
        }
        x/=arr.length;
        System.out.println("the average is "+x);
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        get_avg(arr);
    }
}
