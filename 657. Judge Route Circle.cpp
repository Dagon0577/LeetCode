bool judgeCircle(char* moves) { 
    int x=0,y=0,i;
    char c;
    for(i=0;moves[i]!='\0';i++)
    {
        if(moves[i]=='R')
        {
            x++;
        }
        if(moves[i]=='L')
        {
            x--;
        }
        if(moves[i]=='U')
        {
            y++;
        }
        if(moves[i]=='D')
        {
            y--;
        }
    }
    if(x!=0||y!=0)
    {
        return false;
    }
    else
    {
        return true;
    }
}
