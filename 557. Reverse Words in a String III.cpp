void reverse(int left, int right, char *s){
    while(left < right) {
        s[left]^=s[right];
        s[right]^=s[left];
        s[left]^=s[right];
        left++;
        right--;
    }
}

char* reverseWords(char* s) {
    int i,len=strlen(s),index = 0;
    
    for(i=0;i<=len;i++) {
        if((s[i] == ' ') || (s[i] == '\0')){
            reverse(index, i - 1, s);
            index = i + 1;
        }
    }
    return s;
}