char* reverseString(char* s) {
     if(s == '\0')
     {
        return "";
     }
    int len=strlen(s),i=0,j;
    //char temp;
    j=len-1;
    for(;i<j;i++,j--)
    {
        //temp=*(s+i);
        //*(s+i)=*(s+j);
        //*(s+j)=temp;
        s[i]^=s[j];
        s[j]^=s[i];
        s[i]^=s[j];
    }
    return s;
}
