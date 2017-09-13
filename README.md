# runJS
A simple Java class to Run Nashorn JS scripts 

JJS does not always handle VM args and classpath as expected, so you can use this class instead.  

To Use, compile the class,
javac runJs.java

and run like the following (no jar or packaging in this simple script runner)

java runJS test.js
