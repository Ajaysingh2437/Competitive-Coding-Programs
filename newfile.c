#include <stdio.h>
#include <limits.h>
#include <string.h>
 
// A utility function to find minimum of two numbers
int min(int a, int b)
{  return a < b ? a : b; }
 
// Recursive function to find minimum number of insersions
int findMinInsertions(char str[], int l, int h)
{
    // Base Cases
    if (l > h) return INT_MAX;
    if (l == h) return 0;
    if (l == h - 1) return (str[l] == str[h])? 0 : 1;
 
    // Check if the first and last characters are same. On the basis of the
    // comparison result, decide which subrpoblem(s) to call
    return (str[l] == str[h])? findMinInsertions(str, l + 1, h - 1):
                               (min(findMinInsertions(str, l, h - 1),
                                   findMinInsertions(str, l + 1, h)) + 1);
}
 
// Driver program to test above functions
int main()
{
int T,n;
scanf("%d",&T);  
while(T--)
    {
    scanf("%d",&n);
scanf("%s",str);  
    printf("%d", findMinInsertions(str, 0, n-1));
}
    return 0;
}