package com.coreJavaLabs.labB;

public interface ISalaryExpectation {
	default void salary() {
		System.out.println("USD$130,000");
	};
}
