package com.nag.matrix;

public class Matrix {
	
	private int rows;
	
	private int columns;
	
	private int [][] matrix2DArray;
	
	private String name;
	
	public Matrix(int rows, int columns, int[][] matrix2dArray,String name) {
		this.rows = rows;
		this.columns = columns;
		this.matrix2DArray = matrix2dArray;
		this.name=(name!=null)?name:"";
		
	}

	public Matrix(int rows, int columns, int[][] matrix2dArray) {
		this.rows = rows;
		this.columns = columns;
		this.matrix2DArray = matrix2dArray;
		this.name="";
	}
		

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public int[][] getMatrix2DArray() {
		return matrix2DArray;
	}
	
	public String getName() {
		return name;
	}

	
	private String get2DArrayString()
	{
		StringBuffer str=new StringBuffer();
		
		str.append("\n");
		for(int i=0;i<matrix2DArray.length;i++)
		{
			for(int j=0;j<matrix2DArray[i].length;j++)
			{
				str.append("\t"+matrix2DArray[i][j]);
			}
			str.append("\n");
		}
		str.append("\n");
		
		return str.toString();
	}
	
	
	@Override
	public String toString() {
		
		
		String tempStr=(getName()!="")?getName():"Matrix";
		return "\n"+ tempStr +" :\n"+ 
	
				" rows = " + rows + ", columns = " + columns + ",\n matrix2DArray = " + get2DArrayString();
				
	}

	

	public void display()
	{
		System.out.println(this.toString());
		
	}
	

	



	

}
