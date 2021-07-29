package com.nag.matrix;

public class MatrixResult {
	
	
	
	
	public static int ERROR_INPUT_OBJECT_NULL=-1;
	
	public static int SUCCESS=-3;
	
	public static int ERROR_ORDERS_MISMATCH=-4;
	
	
	
	private int code;
	
	private String msg;
	
	private Matrix matrixObj;

	/**
	 * 
	 * @return 
	 *   
	 *   <br/> On {@link #SUCCESS} : Matrix object will be valid<br/>
	 */
	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	public Matrix getMatrixObj() {
		return matrixObj;
	}

	public MatrixResult(int code, String msg, Matrix matrixObj) {
		super();
		this.code = code;
		this.msg = msg;
		this.matrixObj = matrixObj;
	}

	@Override
	public String toString() {
		return "MatrixResult [code=" + code + ", msg=" + msg + ", matrixObj=" + matrixObj + "]";
	}
	
	

}
