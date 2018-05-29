import java.util.*;
public class text{
    public static void main(String[] args){
    String s;
    int x=s.length();
    }
}

public class BubbleSort
{
    public void sort(int[] a)
    {
        int temp = 0;
        for (int i = a.length - 1; i > 0; --i)
        {
            for (int j = 0; j < i; ++j)
            {
                if (a[j + 1] < a[j])
                {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}

public　void　sort(int　arr[],int　low,int　high)
　{
　int　l=low;
　int　h=high;
　int　povit=arr[low];
 
　while(l<h)
　{
　while(l<h&&arr[h]>=povit)
　h--;
　if(l<h){
　int　temp=arr[h];
　arr[h]=arr[l];
　arr[l]=temp;
　l++;
　}
 
　while(l<h&&arr[l]<=povit)
　l++;
 
　if(l<h){
　int　temp=arr[h];
　arr[h]=arr[l];
　arr[l]=temp;
　h--;
　}
　}
　print(arr);
　System.out.print("l="+(l+1)+"h="+(h+1)+"povit="+povit+"\n");
　if(l>low)sort(arr,low,l-1);
　if(h<high)sort(arr,l+1,high);
　}


/*//////////////方式三：减少交换次数，提高效率/////////////////////*/
private<TextendsComparable<?superT>>
voidquickSort(T[]targetArr,intstart,intend)
{
inti=start,j=end;
Tkey=targetArr[start];
 
while(i<j)
{
/*按j--方向遍历目标数组，直到比key小的值为止*/
while(j>i&&targetArr[j].compareTo(key)>=0)
{
j--;
}
if(i<j)
{
/*targetArr[i]已经保存在key中，可将后面的数填入*/
targetArr[i]=targetArr[j];
i++;
}
/*按i++方向遍历目标数组，直到比key大的值为止*/
while(i<j&&targetArr[i].compareTo(key)<=0)
/*此处一定要小于等于零，假设数组之内有一亿个1，0交替出现的话，而key的值又恰巧是1的话，那么这个小于等于的作用就会使下面的if语句少执行一亿次。*/
{
i++;
}
if(i<j)
{
/*targetArr[j]已保存在targetArr[i]中，可将前面的值填入*/
targetArr[j]=targetArr[i];
j--;
}
}
/*此时i==j*/
targetArr[i]=key;
 
/*递归调用，把key前面的完成排序*/
this.quickSort(targetArr,start,i-1);
 
 
/*递归调用，把key后面的完成排序*/
this.quickSort(targetArr,j+1,end);
 
}





package com.company;
import java.util.*;

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



package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        int result=sum(str1,str2);
        System.out.println(result);
    }
    public static int sum(String s,String t){
        if(t.length()==0||s.length()==0||s==""||t=="") return 0;
        char[] S=s.toCharArray();
        char[] T=t.toCharArray();
        int len_s=S.length;
        int len_t=T.length;
        int count=len_s-len_t+1;
        int i,sum=0;
        for(i=0;i<count;i++){
            for(int j=0;j<len_t;j++){
                if(S[i+j]!=T[j]){
                    sum++;
                }
            }
        }
        return sum;
    }


}






package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        int result=find(str1);
        System.out.println(result);
    }
    public static int find(String s){
        char[] ch=s.toCharArray();
        int min=1;
        int[] key=new int[10];
        int i=0;
        for(;i<ch.length;i++){
            key[ch[i]-'0']++;
        }
        while(true){
                for( i=1;i<10;i++){
                if(key[i]==0) {
                    if(min==1)return i;
                    else
                    return min + i;
                }
                else if(key[i]!=0){
                    key[i]--;
                }
            }
            min=min*10;
            if(key[0]!=0)key[0]--;
            else return min;
        }

    }


}


package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int[] nums=new int[10];
        String s=in.next();
        for(int i=0;i<s.length();i++)
            nums[s.charAt(i)-'0']++;
        int index=0;
        int min=Integer.MAX_VALUE;
        for(int i=1;i<10;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
                index=i;
            }
        }
        String result=new String();
        if(min==0 && index!=0)
            System.out.println(index);

        else
        {

            if(nums[0]<min)
            {
                result+="1";
                for(int i=0;i<=nums[0];i++)
                    result+="0";
            }
            else
            {
                for(int i=0;i<=min;i++)
                    result+=(char)(index+'0');
            }
            System.out.println(result);
        }
    }
}






//携程

package com.company;
import sun.rmi.server.InactiveGroupException;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        char[] ch=str1.toCharArray();
        int n=ch.length;
        int[][] a=new int[n][n];
        System.out.print(n);
        for(int i=1;i<n;i++)
            for(int j=0;j<n;j++){
                a[i][j]=scanner.nextInt();
            }

        change(a,n);
    }
    public static void change(int[][] a,int n){
        int[][] result=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                result[i][j]=a[n-j-1][i];
            }
        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(" ");
        }
    }


}







import java.util.Scanner;

public class Main {

    public static int[][] change(int[][] b) {
        int[][] temp = new int[b[0].length][b.length];
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                temp[i][j]=b[b[i].length-j-1][i];
            }
        }
        return temp;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String ipt = sc.nextLine();
        String[] ipta = ipt.split(" ");
        int [][] a = new int[ipta.length][ipta.length];

        for (int i = 0; i < ipta.length; i++) {
            a[0][i] = Integer.valueOf(ipta[i]);
        }
        for (int i = 1; i < a.length; i++) {
            ipt = sc.nextLine();
            ipta = ipt.split(" ");
            for (int j = 0; j < a.length; j++) {
                a[i][j] = Integer.valueOf(ipta[j]);
            }
        }
        int [][]t=change(a);
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }

}



TX笔试规范


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {//注意while处理多个case
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
    }
    
}



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0, x;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                x = sc.nextInt();
                ans += x;
            }
        } 
        System.out.println(ans);
    }
}




import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //while (in.hasNextInt()) {//注意while处理多个case
            //int a = in.nextInt();
            long a=in.nextLong();
            long b=in.nextLong();
            //int b = in.nextInt();
        //}
        long sum=sum(a,b);
        System.out.print(sum);
    }
    private static long sum(long n,long m){


        return n*m/2;
    }


    import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int k=in.nextInt();
            int a = in.nextInt();
            int x = in.nextInt();
            int b = in.nextInt();
            int y = in.nextInt();
            long c=result(a,x,b,y,k);
            System.out.println(c-c/1000000007*1000000007);
            System.out.println(c);
    }
    private static long result(int a,int x,int b,int y,int k){

        int min=a>b?b:a;
        int minX=a>b?y:x;
        int maxY=x+y-minX;
        int max=a+b-min;
        int i=0;
        long answer=0;
        int sum=0;
        ArrayList<Integer> key2=new ArrayList<>();
        int typeA=0,typeB=0;
        for(i=0;i<x;i++){
            for(int j=x;j<x+y;j++){
                if(sum<k){
                    sum+=max;
                    typeB++;
                }
                else if(sum==k){
                    key2.add(typeA);
                    key2.add(typeB);
                    typeA=i;
                    typeB=0;
                    sum=i*min;
                }
                else{
                    typeA=i;
                    typeB=0;
                    sum=i*min;
                }
            }
            sum+=min;
            typeA++;
        }
        for(i=0;i<key2.size()/2;i++){
            answer+=(pailie(minX,key2.get(i*2))*pailie(maxY,key2.get(i*2+1)));
        }
        return answer;


    }
    private static long pailie(int n,int m){
        long a=1,b=1;
        for(int i=n-m+1;i<=n;i++)
           a*=i;
//        for(int i=1;i<=m;i++)
//            b*=m;
        return a;
    }

}






import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        char[] dictionary=new char[99999];
        int result=0;
        int k=0;
        while (in.hasNextLine()) {//注意while处理多个case
            String str1 = in.nextLine();
            if(str1.isEmpty())
                break;
            char[] str2=str1.toCharArray();
            for(int i=1;i<str2.length;i++){
                if(str2[i]=='/'&&str2[i-1]=='/'){
                    result++;
                    break;
                }
                if(str2[i]=='/'||str2[i]=='*'||str2[i]=='"')
                {
                    dictionary[k]=str2[i];
                    k++;
                }

            }
                 }
                 int sum=0;
                 for(int i=0,j=0;i<k;i++){
                    if(dictionary[i]=='*'&&j==0)
                        sum++;
                    if(dictionary[i]=='"')
                        if(j==0)
                            j=1;
                        else
                            j=0;
                 }
                 result+=sum/2;
        System.out.print(result);
    }
}


