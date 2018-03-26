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
