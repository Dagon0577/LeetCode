int findComplement(int num) {
     int count=0,i;
    unsigned int temp;
    temp=num;
    while(num != 0){
        count++;
        num=num >> 1;
    }
    for(i=0;i<count;i++)
        temp=temp^((1<<i));
    return temp;
    
}













