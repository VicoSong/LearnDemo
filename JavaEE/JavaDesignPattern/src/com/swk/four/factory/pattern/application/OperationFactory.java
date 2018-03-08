package com.swk.four.factory.pattern.application;

public class OperationFactory {
	public static Operation getOperation(String op)
	{
		if("+".equals(op))
		{
			return new AddOperation();
		}else if("-".equals(op)){
			return new SubtractOperation();
		}else if("*".equals(op))
		{
			return new MutilplyOperation();
		}else if("/".equals(op))
		{
			return new DiviveOperation();
		}else{
			
			throw new RuntimeException("不支持的操作！");
			
		}
		
		
	}
}
