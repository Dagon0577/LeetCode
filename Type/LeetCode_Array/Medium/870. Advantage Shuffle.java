class Temp implements Comparable<Temp >{
	int num, index;         //存储B数组的值和下标
	public Temp(int num, int index) {
		this.index = index;
		this.num = num;
	}
	@Override
	public int compareTo(Temp o) {
		return this.num - o.num;
	}
}
class Solution {
    public int[] advantageCount(int[] A, int[] B) {
        
        //从小到大排序，若R1<R2 则比较找到一个A中靠左小于B值，与R2匹配
    	Temp[] arry = new Temp[B.length];
        
    	for(int i = 0; i < B.length; ++i) {     //复制B的值
    		arry[i] = new Temp(B[i], i);
    	}
    	Arrays.sort(A); //从小到大排序
        Arrays.sort(arry);
    	int L1 = 0;
        int R1 = A.length - 1;
    	int L2 = 0;
        int R2 = B.length - 1;

    	while(L1 <= R1) {
    		if(A[R1] > arry[R2].num) {  
    			B[arry[R2].index] = A[R1];
    			R1--;
                R2--;
    		}
    		else if(A[R1] < arry[R2].num) {     //若R1 <= R2,就需要在A中找一个无用值与B最大的值匹配，田忌赛马
    			B[arry[R2].index] = A[L1];
    			R2--;
                L1++;
    		}
    		else {
    			if(A[L1] > arry[L2].num) {
    				B[arry[L2].index] = A[L1];
    				L1++;
                    L2++;
    			}
    			else {
    				B[arry[R2].index] = A[L1];
    				R2--;
                    L1++;
    			}
    		}
    	}
        return B;
    }
}