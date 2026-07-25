class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        //edge case
        if(image[sr][sc] == color){
            return image;
        }
        floodFill(image,sr,sc,color,image[sr][sc]);
        return image;
    }
    private void floodFill(int image[][],int sr,int sc,int newColor,int oldColor){
        if(sr < 0 || sr >= image.length || sc <0 || sc >= image[0].length || image[sr][sc]!= oldColor ){
            return;
        }
        image[sr][sc] = newColor;
        floodFill(image,sr+1,sc,newColor,oldColor);
        floodFill(image,sr-1,sc,newColor,oldColor);
        floodFill(image,sr,sc+1,newColor,oldColor);
        floodFill(image,sr,sc-1,newColor,oldColor);
    }
}