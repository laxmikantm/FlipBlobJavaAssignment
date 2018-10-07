# FlipBlobJavaAssignment
/**
 * Text blob generator takes an instruction string
 *
 * Generates a blob of text using the characters a to f, (should loop back to a if number of letters to be generated is more than 6)
 *
 * Then pads the blob with dashes to either the left or right depending on the padding style,
 *
 * or no padding if no padding style defined
 *
 * eg. if input instruction string:
 * 		addLettersFor:3-loops,padLeftFor:5-loops,padRightFor:6-loops,paddingStyle:left
 * output should be:
 * 		-----abc
 *
 * eg. if input instruction string:
 * 		addLettersFor:8-loops,padLeftFor:5-loops,padRightFor:7-loops,paddingStyle:right
 * output should be:
 * 		abcdefab-------
 *
 * eg. if input instruction string:
 * 		addLettersFor:8-loops,padLeftFor:5-loops,padRightFor:7-loops
 * output should be:
 * 		abcdefab
 *
 * 1) fix the compile issues and run the main method
 *
 * 2) correct any mistakes in logic
 *
 * 3) Make the code cleaner (refactor and simplify classes)
 *
 * 4) test that it works as intended
 */
