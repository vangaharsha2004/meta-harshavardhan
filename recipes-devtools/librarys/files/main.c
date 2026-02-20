#include<stdio.h>
#include"math.h"

int main (){
	int x,y;
	printf("enter the numbers:");
	scanf("%d%d",&x,&y);

	printf("add : %d\n",add(x,y));
	printf("sub : %d\n",sub(x,y));

	return 0;
}
