/**
 * Return an array of size *returnSize.
 * Note: The returned array must be malloced, assume caller calls free().
 */
char** findWords(char** words, int wordsSize, int* returnSize) {
    int lineKeys[26] = {1, 2, 2, 1, 0, 1, 1, 1, 0, 1, 1, 1, 2, 2, 0, 0, 0, 0, 1, 0, 0, 2, 0, 2, 0, 2}; /*定义26个字母所在的行位置*/
    *returnSize=0;
    char** suitableWords=NULL;
    
    for(int i=0;i<wordsSize;i++)
    {
        int k=1;
        int len=strlen(words[i]);
        for(int j=0,line=lineKeys[tolower(words[i][0])-'a'];j<len;j++) /*根据字符串首个字母所在行数，判断字符串是否存在不同行数的字母*/
        {
            if (line != lineKeys[tolower(words[i][j])-'a'])  {
                k = 0;
                break;
            }
        }
        
        if(k){
            suitableWords = realloc(suitableWords, sizeof(char*) *(*returnSize + 1));
            suitableWords[*returnSize] = words[i];
            (*returnSize)++;
        }
    }
        return suitableWords;;
}