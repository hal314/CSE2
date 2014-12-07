//Hao Lu
//HW11
//Program 2
//MatrixSolver Program

//set up the class
public class MatrixSorter{
  
  //constant for number of slabs
  public static final int SLAB=3;
  
  //set up the main method
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
  }
  
  //set up the buildMat3d method
  public static int[][][] buildMat3d(){
    int mat3d[][][]=new int[SLAB][][];//this matrix will be returned
    for(int s=0;s<SLAB;s++){
      mat3d[s]=new int[3+2*s][];//every slab has 3+2s rows
      for(int j=0;j<3+2*s;j++){
        mat3d[s][j]=new int[s+j+1];//every row has s+j+1 columns
        for(int i=0;i<s+j+1;i++){
          mat3d[s][j][i]=(int)Math.floor(Math.random()*100);//fill matrix with random number
        }
      }
    }
    return mat3d;
  }
  
  //set up the sort method for 2d array using insertion sort
  public static void sort(int mat2d[][]){
    for(int i=0;i<mat2d.length;i++){
      sort(mat2d[i]);//first sort each row
    }
    for(int i=1;i<mat2d.length;i++){
      int temp[]=new int[mat2d[i].length];
      System.arraycopy(mat2d[i],0,temp,0,mat2d[i].length);//store a copy of ith row in temp
      int pos=i;
      while(pos>0 && mat2d[pos-1][0]>temp[0]){//compare with first entry in a row
        mat2d[pos]=new int[mat2d[pos-1].length];
        System.arraycopy(mat2d[pos-1],0,mat2d[pos],0,mat2d[pos-1].length);//mat2d[pos-1] in mat2d[pos]
        pos--;
      }
      mat2d[pos]=new int[temp.length];
      System.arraycopy(temp,0,mat2d[pos],0,temp.length);//copy back content in temp to current position
    }
  }
  
  //set up the sort method for 1d array using selection sort
  public static void sort(int mat1d[]){
    for(int i=0;i<mat1d.length-1;i++){
      int mini=i;//set min i to first element in each row
      for(int j=i+1;j<mat1d.length;j++){
        if(mat1d[j]<mat1d[mini]){//compare each element to min i to get real min i
          mini=j;
        }
      }
      int temp=mat1d[mini];//swap min i with first element in row
      mat1d[mini]=mat1d[i];
      mat1d[i]=temp;
    }
  }
  
  //set up the findMin method
  public static int findMin(int mat3d[][][]){
    int min=mat3d[0][0][0];//set min to first element in matrix
    for(int s=0;s<mat3d.length;s++){//loop through all elements to find the real min
      for(int j=0;j<mat3d[s].length;j++){
        for(int i=0;i<mat3d[s][j].length;i++){
          if(mat3d[s][j][i]<min){
            min=mat3d[s][j][i];
          }
        }
      }
    }
    return min;
  }
  
  //set up the show method
  public static void show(int mat3d[][][]){
    for(int s=0;s<mat3d.length;s++){//print slab
      System.out.println("--------------------Slab "+(s+1));
      for(int j=0;j<mat3d[s].length;j++){//print row
        for(int i=0;i<mat3d[s][j].length;i++){//print element
          System.out.print(mat3d[s][j][i]+" ");
        }
        System.out.println();
      }
    }
  }
}
