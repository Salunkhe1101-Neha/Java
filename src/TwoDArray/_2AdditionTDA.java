package TwoDArray;

public class _2AdditionTDA {
    public static void main(String[] args) {
        operation();
    }
    public static void operation()
    {
        int [][] array={{1,2,3}, {1,2,3},{1,2,3}};
        for(int i=0;i< array.length;i++)
        {
            int rowSum=0, colSum=0;
            for(int j=0; j<array[i].length;j++)
            {
                rowSum=rowSum+array[i][j];
                colSum=colSum+array[j][i];
            }
            System.out.println("Row Sum : "+ rowSum+ " Col Sum : "+ colSum);
        }
    }
}
