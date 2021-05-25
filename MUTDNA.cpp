#include <stdio.h>
#include <algorithm>
using namespace std;
char s[1000002];

int main(void){
    int i,n,curA=0,curB=0,prevA=0,prevB=0;
    scanf("%d",&n);
    scanf("%s",s);
    for(i=0;i<n;i++){
        char c = s[i];
        if(c=='B'){
            curA = min(prevB+1,prevA+1);
            curB = min(prevB,prevA+2);
        }
        else{
            curA = min(prevA,prevB+2);
            curB = min(prevA+1,prevB+1);
        }
        prevB = curB;
        prevA = curA;
    }
    printf("%d",curA);
    return 0;
}