/**
 * Return an array of size *returnSize.
 * Note: The returned array must be malloced, assume caller calls free().
 */

char** fizzBuzz(int n, int* returnSize) {
    char** returnString=malloc(n*sizeof(char *));
    *returnSize=n;
    int i=1;    
    while(i<=n){
        char* c=malloc(9 * sizeof(char));
        if((i % 3 !=0) && (i % 5 !=0)){
            sprintf(c, "%d", i);
        }
        else if(i % 3 ==0)
        {
            if(i % 5==0)
            {
                sprintf(c, "FizzBuzz");
            }
            else
            {
                sprintf(c, "Fizz");
            }
        }
        else{
                sprintf(c, "Buzz");
        }
        returnString[i-1]=c;
        i++;
    }
    return returnString;
}