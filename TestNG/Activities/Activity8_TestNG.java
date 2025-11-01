<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="ParallelTestSuite" parallel="tests" thread-count="2">
    <test name="FirefoxTests1">
        <classes>
            <class name="testngActivities.Activity5"/>
        </classes>
    </test>
    <test name="FirefoxTests2">
        <classes>
            <class name="testngActivities.Activity6"/>
        </classes>
    </test>
</suite>