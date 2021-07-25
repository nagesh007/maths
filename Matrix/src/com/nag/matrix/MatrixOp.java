package com.nag.matrix;

public class MatrixOp {


	public static void displayMatrix(int [][]matrix)
	{
		System.out.println("\n");
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print("\t"+matrix[i][j]);
			}
			System.out.println("\n");
		}
		System.out.println("\n");
	}
	public static void  displayMatrix(Matrix matrixObj)
	{
		matrixObj.display();
	}

	



	/**
	 *   +++++++++++++++++++ APIs related to Matrix Operations +++++++++++++++++++++++++++++++
	 */

	/**
	 * 
	 * @param firstMatrix
	 * @param secondMatrix
	 * @return
	 *    
	 *    {@link MatrixResult} object
	 */
	public MatrixResult add(Matrix firstMatrix, Matrix secondMatrix)
	{
		// Step 1:  check whether matrix objects are null
		if(firstMatrix==null || secondMatrix==null)
		{

			MatrixResult obj=new MatrixResult(MatrixResult.ERROR_INPUT_OBJECT_NULL, "Input parameter is null", null);
			return obj;

		}

		// Step 2:  check whether matrix objects are having same order
		if(firstMatrix.getRows()!=secondMatrix.getRows() && firstMatrix.getColumns()!=secondMatrix.getColumns())
		{
			MatrixResult obj=new MatrixResult(MatrixResult.ERROR_ORDERS_MISMATCH, "Orders won't match", null);
			return obj;
		}


		// Step 3:  Add 2 matrices and return/display
		
		
			int[][] fMat = firstMatrix.getMatrix2DArray();
			int[][] sMat = secondMatrix.getMatrix2DArray();
			
			/* Create an empty matrix Object
			   Orders are same, so I am taking length/order of firstMatrix */
			
			Matrix ansMatrix = new Matrix(firstMatrix.getRows(), firstMatrix.getColumns(), new int[firstMatrix.getRows()][firstMatrix.getColumns()]);
			int[][] ans2DArray=ansMatrix.getMatrix2DArray();
	
			for(int i=0;i<fMat.length;i++)
			{
				for(int j=0;j<fMat[i].length;j++)
				{
					ans2DArray[i][j]=fMat[i][j]+sMat[i][j];
				}
			}
		
		// Step 4: 	Now answer is ready, i need to deliver it in a packaged format.
		MatrixResult obj=new MatrixResult(MatrixResult.SUCCESS, "Addition Successful", ansMatrix);
		return obj;
	}




	public MatrixResult subtract(Matrix firstMatrix, Matrix secondMatrix)
	{
		// Step 1:  check whether matrix objects are null
		if(firstMatrix==null || secondMatrix==null)
		{

			MatrixResult obj=new MatrixResult(MatrixResult.ERROR_INPUT_OBJECT_NULL, "Input parameter is null", null);
			return obj;

		}

		// Step 2:  check whether matrix objects are having same order
		if(firstMatrix.getRows()!=secondMatrix.getRows() && firstMatrix.getColumns()!=secondMatrix.getColumns())
		{
			MatrixResult obj=new MatrixResult(MatrixResult.ERROR_ORDERS_MISMATCH, "Orders won't match", null);
			return obj;
		}


		// Step 3:  Subtract 2 matrices and return/display 
		
			
			int[][] fMat2DArray = firstMatrix.getMatrix2DArray();
			int[][] sMat2DArray = secondMatrix.getMatrix2DArray();
			
			
			
			 /*	Create Empty Matrix
			  	Orders are same, so I am taking length/order of firstMatrix */
			
			Matrix ansMatrix = new Matrix(firstMatrix.getRows(), firstMatrix.getColumns(), new int[firstMatrix.getRows()][firstMatrix.getColumns()]);
			int[][] ans2DArray=ansMatrix.getMatrix2DArray();
	
			for(int i=0;i<fMat2DArray.length;i++)
			{
				for(int j=0;j<fMat2DArray[i].length;j++)
				{
					ans2DArray[i][j]=fMat2DArray[i][j]-sMat2DArray[i][j];
				}
			}
			
		// Step 4: 	Now answer is ready, i need to deliver it in a packaged format.
		MatrixResult obj=new MatrixResult(MatrixResult.SUCCESS, "Subtraction Successful", ansMatrix);
		return obj;
	}



	public MatrixResult multiply(Matrix a, Matrix b)
	{
		// Step 1:  check whether matrix objects are null
		if(a==null || b==null)
		{

			MatrixResult obj=new MatrixResult(MatrixResult.ERROR_INPUT_OBJECT_NULL, "Input parameter is null", null);
			return obj;

		}

		// Step 2:  check whether matrix objects are compatible for multiplication (favorable order)
		if(a.getColumns()!=b.getRows())
		{
			MatrixResult obj=new MatrixResult(MatrixResult.ERROR_ORDERS_MISMATCH, "Orders won't match", null);
			return obj;
		}


		// Step 3:  Multiply 2 matrices and return/display
		
			// Create empty Matrix Object
			Matrix ansMatrix = new Matrix(a.getRows(), b.getColumns(), new int[a.getRows()][b.getColumns()]);
			int [][]temp2DArray=ansMatrix.getMatrix2DArray();
			int [][]a2DArray=a.getMatrix2DArray();
			int [][]b2DArray=b.getMatrix2DArray();
			for(int i=0;i<ansMatrix.getRows();i++)
			{
				for(int j=0;j<ansMatrix.getColumns();j++)
				{
					temp2DArray[i][j]=0;
					// for limiting the k value , i can either take first matrix column length or second matrix row length.
					for(int k=0;k<a.getColumns();k++)
					{
						temp2DArray[i][j]+=(a2DArray[i][k]*b2DArray[k][j]);
					}
				}
			}
			
			
		// Step 4: Now answer is ready, i need to deliver it in a packaged format.
		
		MatrixResult obj=new MatrixResult(MatrixResult.SUCCESS, "Transpose", ansMatrix);
		return obj;
			
		
		
	}

	
	public MatrixResult transpose(Matrix a)
	{
		
		
		// Step 1:  Check whether matrix object is null
		if(a==null)
		{
			MatrixResult obj=new MatrixResult(MatrixResult.ERROR_INPUT_OBJECT_NULL, "Input parameter is null", null);
			return obj;
		}
		
		// Step 2:  Transpose 
		
			// Create empty Matrix Object
			Matrix ansMatrix=new Matrix(a.getColumns(), a.getRows(), new int[a.getColumns()][a.getRows()]);
			int [][]transpose2DArray=ansMatrix.getMatrix2DArray();
			
			
			int [][]a2DArray = a.getMatrix2DArray();
			for(int i=0;i<a2DArray.length;i++)
			{
				for(int j=0;j<a2DArray[i].length;j++)
				{
					transpose2DArray[j][i]=a2DArray[i][j];
				}
			}
		
		
		//Step 3:  Now answer is ready, i need to deliver it in a packaged format.
		MatrixResult obj=new MatrixResult(MatrixResult.SUCCESS, "Transpose", ansMatrix);
		return obj;
	}
}
