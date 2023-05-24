@Test
public void testExpression() {
  String expression = "10+5*4+9/3";
  int expected_result = 33;
  int actual_result = Calculator.Run(expression);
  if ( actual_result == expected_result ) {
    System.out.println("Test succeeded");
  else
    System.out.println("Test failed for expression: " + expression);
  }
}
