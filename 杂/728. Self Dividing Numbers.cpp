/**
 * Return an array of size *returnSize.
 * Note: The returned array must be malloced, assume caller calls free().
 */
int IsSelfDividingNumber(int x) {
    int a = x % 10;
    int b = x;
    while (a != 0 && a != b) {
        if (x % a != 0)
            return 0;
        b = b / 10;
        a = b % 10;
    }
    if (a == 0 || (a == b && x % a != 0))
        return 0;
    return 1;
}

int* selfDividingNumbers(int left, int right, int* returnSize) {
    int MAXSIZE = right - left + 1;
    int t = 0;
    int a[MAXSIZE];
    for (int i = left; i <= right; i++) {
        if (IsSelfDividingNumber(i)) {
            a[t] = i;
            t++;
        }
    }
    int * b = malloc(t * sizeof(int));
    for (int i = 0; i < t; i++) {
        b[i] = a[i];
    }
    *returnSize = t;
    return b;
}