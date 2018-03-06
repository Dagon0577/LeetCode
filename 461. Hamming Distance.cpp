int hammingDistance(int x, int y) {
    int a[32]={0},b[32]={0};
    int n,numX,numY,t;
    for(n=31,numX=0,numY=0;n>=0;n--)
    {
        if(pow(2,n)<=(x-numX))
        {
            a[n]=1;
            numX+=pow(2,n);
        }
        if(pow(2,n)<=(y-numY))
        {
            b[n]=1;
            numY+=pow(2,n);
        }
    }
    for(n=31,t=0;n>=0;n--)
    {
        if(a[n]!=b[n])
        {
            t++;
        }
    }
    return t;
}
