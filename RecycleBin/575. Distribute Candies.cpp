int distributeCandies(int* candies, int candiesSize) {
    int max = candiesSize /2;
    
    uint8_t hash[200001] = {0};
    int t = 0;
    for (int i = 0; i < candiesSize; i++) {
        int index = candies[i] + 100000;
        if (hash[index] == 0) {
            t++;
            hash[index] = 1;
            if (t == max) return max;
        }
    }
    return t;
}