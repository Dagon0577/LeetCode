int hammingDistance(int x, int y) {
    int i = x ^ y;
    int Cardinality = 0;
    while (i != 0) {
        if ((i & 1) == 1)Cardinality++;
        i = i >> 1;
    }
    return Cardinality;
}