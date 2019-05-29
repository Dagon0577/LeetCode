void sort(int i,int j,int* nums){  
    int low=i;  
    int high=j;  
    int key=nums[i];  
    int temp=0;  
      
    if(i>j){  
        return ;  
    }  
    while(i<j){  
        while(nums[j]>key&&i<j){  
            j--;  
        }  
        nums[i]=nums[j];  
        while(nums[i]<=key&&i<j){  
            i++;  
              
        }  
        nums[j]=nums[i];  
          
    }  
      
    nums[i]=key;  
    sort(low,i-1,nums);  
    sort(i+1,high,nums);  
      
}  

int arrayPairSum(int* nums, int numsSize) {  
    int i=0,j=numsSize-1;  
    int sum=0;  
      
 
    sort(0,numsSize-1, nums);  
    for(i=0;i<numsSize;i+=2){
        sum+=nums[i];
    }

      
    return sum;  
}  
  
  
