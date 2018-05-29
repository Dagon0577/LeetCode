int numJewelsInStones(char* J, char* S) {
    int i,j,t=0;
    for(i=0;J[i]!='\0';i++)
    {
        for(j=0;S[j]!='\0';j++)
        {
            if(J[i]==S[j])
            {
                t++;
            }
        }
    }
    return t;
}
