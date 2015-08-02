#include<stdio.h>
int N;
 
bool solveMazeUtil(int maze[N][N], int x, int y, int sol[N][N]);
 
void printSolution(int sol[N][N])
{
    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < N; j++)
            printf(" %d ", sol[i][j]);
        printf("\n");
    }
}
 
bool isSafe(int maze[N][N], int x, int y)
{
    // if (x,y outside maze) return false
    if(x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1)
        return true;
 
    return false;
}
 
bool solveMaze(int maze[N][N])
{
    int sol[N][N] = { {0, 0, 0, 0},
        {0, 0, 0, 0},
        {0, 0, 0, 0},
        {0, 0, 0, 0}
    };
 
    if(solveMazeUtil(maze, 0, 0, sol) == false)
    {
        printf("Solution doesn't exist");
        return false;
    }
 
    printSolution(sol);
    return true;
}
 
bool solveMazeUtil(int maze[N][N], int x, int y, int sol[N][N])
{
    // if (x,y is goal) return true
    if(x == N-1 && y == N-1)
    {
        sol[x][y] = 1;
        return true;
    }
 
    if(isSafe(maze, x, y) == true)
    {
        sol[x][y] = 1;
 
        if (solveMazeUtil(maze, x+1, y, sol) == true)
            return true;
 
        if (solveMazeUtil(maze, x, y+1, sol) == true)
            return true;
 
        sol[x][y] = 0;
        return false;
    }   
 
    return false;
}
 
int main()
{
    int T,maze[50][50],i,j;
scanf("%d",&T);  
    while(T--)
    {
        scanf("%d",&N);  
        for(i=0;i<N;i++)
    for(j=0;j<N;j++)
scanf("%d",&maze[i][j]);
 
    solveMaze(maze);
    getchar();
}
    return 0;
}