package com.nag.maths_app;

import com.nag.matrix.Matrix;
import com.nag.matrix.MatrixOp;
import com.nag.matrix.MatrixResult;

public class MyMain {

	public static void main(String[] args) {
	
		
		
		/*
		 *   I need to read values from user and fill it inside matrix
		 *   
		 *   As of now, I am hard-coding values
		 * 
		 */
		
		int [][] first2DArray= {{1,2,3},{4,5,6},{7,8,9}};
		int [][] second2DArray= {{10,11,12},{13,14,15},{16,17,18}};
		
		
		Matrix a=new Matrix(3, 3, first2DArray,"A");
		Matrix b=new Matrix(3, 3, second2DArray,"B");
		
		MatrixOp obj=new MatrixOp();
		
		System.out.println("First Matrix");
		MatrixOp.displayMatrix(first2DArray);
		
		System.out.println("Second Matrix");
		MatrixOp.displayMatrix(second2DArray);
		
		
		MatrixResult addResult = obj.add(a, b);
		if(addResult.getCode()==MatrixResult.SUCCESS)
		{
			System.out.println("After addition : ");
			addResult.getMatrixObj().display();
		}
		
		
		MatrixResult subResult = obj.subtract(a, b);
		if(subResult.getCode()==MatrixResult.SUCCESS)
		{
			System.out.println("After Subtraction : ");
			subResult.getMatrixObj().display();
		}
		
		
		MatrixResult mulResult = obj.multiply(a, b);
		if(mulResult.getCode()==MatrixResult.SUCCESS)
		{
			System.out.println("After Mul : ");
			mulResult.getMatrixObj().display();
		}

	}

}
