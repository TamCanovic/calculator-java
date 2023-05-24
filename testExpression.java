@Test
public static void testExpression() {
  String expression = "10+5*4+9/3";
  String expected_result = "33";
  String actual_result = Calculator.Run(expression);
  if ( actual_result.equals(expected_result) ) {
    System.out.println("Test succeeded");
  else
    System.out.println("Test failed for expression: " + expression);
  }
}
