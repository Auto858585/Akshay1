package org.qsp.test_Ng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Litner_2prog implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getStatus());
		System.out.println(result.SKIP);

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getStatus());
		System.out.println(result.SKIP);

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println(result.getStatus());
		System.out.println(result.getName());

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getStartDate() + "sc");
		System.out.println(context.getAllTestMethods() + "sc");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getEndDate() + "fc");
		System.out.println(context.getPassedTests() + "fc");
		System.out.println(context.getFailedTests() + "fc");
		System.out.println(context.getSkippedTests() + "fc");

	}

}
