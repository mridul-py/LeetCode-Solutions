from fractions import Fraction
class Solution:
    def fractionAddition(self, expression: str) -> str:
        result=eval(expression)
        # Convert the result to a Fraction
        fraction_result = Fraction(result).limit_denominator()
        if(result.is_integer()):
            fraction_string = str(fraction_result)+"/1"
        else:
            # Convert the Fraction to a string
            fraction_string = str(fraction_result)
        return fraction_string
