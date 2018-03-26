import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String result = judge(str1);
        int count = compare(str2, result);
        float out = (float)count*100/str1.length();
        System.out.printf("%.2f%%", out);
    }

    public static int compare(String str1, String result) {
        int len = str1.length();
        int count = 0;
        for(int i = 0; i < len; i++){
            if(str1.charAt(i) == result.charAt(i)){
                count++;
            }
        }
        return count;
    }

    public static String judge(String str1) {
        int len = str1.length();
        StringBuffer sBuffer = new StringBuffer();
        char c;
        for(int i = 0; i < len; i++){
            c = str1.charAt(i);
            if(c >= 'a' && c <= 'z' || 
                    c>= 'A' && c <= 'Z' 
                    || c >= '0' && c <= '9'){
                sBuffer.append("1");
            }else{
                sBuffer.append("0");
            }
        }
        return sBuffer.toString();
    }

}

        Java 语言
//package main
//注意不要添加包名称，否则会报错。

import java.io.*;
import java.util.*;
class Test {
}
public class Main
{
    public static void main(String args[])
    {
        Scanner cin = new Scanner(System.in);
        int a, b;
        while(cin.hasNextInt())
        {
            a = cin.nextInt();
            b = cin.nextInt();
            System.out.println(a + b);
        }
    }
}
      

import java.util.*;
public class Main {

    private static Integer stockPrice(Integer temp) {
        int sum = 1, count = 1;
        while(sum <= temp) {
            count++;
            sum+=count;
        }
        return  temp == 1 ? 1 : temp - 2 * (count - 2);
    }

    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);

        while (cin.hasNextInt()) {
            Integer output= 0;
            Integer temp = cin.nextInt();
            System.out.println(stockPrice(temp));

        }

        cin.close();

    }

}



import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isReveable = isReverse(arr, len - 1);
        if (isReveable) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    private static boolean isReverse(int[] arr, int len) {
        int startIndex = 0;// 降序的开始序号
        int endIndex = 0;// 降序的结束序号
        boolean isStart = false;// 已经设置了开始序号
        int startCount = 0;// 开始序号的个数
        int endCount = 0;// 结束序号的个数
        for (int i = 0; i < len; i++) {
            int j = i + 1;
            if (isStart == false && arr[i] > arr[j] && arr[i] < arr[j+1]) {
                startIndex = i;
                startCount++;
                isStart = true;
                if (j == len) {
                    endIndex = j;
                    endCount++;
                }
            }
            if (isStart == true && arr[i] < arr[j]) {
                endIndex = i;
                endCount++;
                isStart = false;
            }
        }
        System.out.println("开始下标：" + startIndex + "-->结束下标：" + endIndex);
        System.out.println("开始下标个数：" + startCount + "-->结束下标个数：" + endCount);
        if (startCount == 1 && endCount == 1) {
            return true;
        } else {
            return false;
        }
    }
}