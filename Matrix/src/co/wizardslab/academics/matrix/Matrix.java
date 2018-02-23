package co.wizardslab.academics.matrix;

public class Matrix {
	int n,m;
	int matrix[][];
	public Matrix(int n,int m){
		this.n=n;
		this.m=m;
		matrix = new int[n][m];
	}
	
	public void setValue(int i,int j, int v){
		this.matrix[i][j]=v;
	}
	
	public int getRowSum(){
		int sum=0;
		for (int j=0;j<m;j++){
			for (int i=0;i<n;i++){
				sum=sum + matrix[i][j];
			}
				
		}
		return sum;
	}
	
	public int getColSum(){
		int sum=0;
		for (int i=0;i<n;i++){
			for (int j=0;j<m;j++){
				sum=sum + matrix[i][j];
			}
				
		}
		return sum;
	}
}
