package com.caplin.example;

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

public class TextBlobGenerator {

//    public static final String INPUT_INSTRUCTION = "addLettersFor:9-loops,padLeftFor:99-loops,padRightFor:999-loops,paddingStyle:left";
    public static final String INPUT_INSTRUCTION = "addLettersFor:3-loops,padLeftFor:5-loops,padRightFor:6-loops,paddingStyle:left";
    private String[] letterss = new String[6];



        private String letters;


    private  String  addLettersFor=null;
    private String padLeftFor=null;
    private String padRightFor=null;

    protected  String paddingStyle;

    private  String blob;

    public String getBlob() {
        return blob;
    }

    public TextBlobGenerator(DataWrapper dataWrapper) {

        letterss[0] = "a";
        letterss[1] = "b";
        letterss[2] = "c";
        letterss[3] = "d";
        letterss[4] = "e";
        letterss[5] = "f";

        String instructions = dataWrapper.getInstruction();

        addLettersFor = instructions.split(",")[0];
        padLeftFor = instructions.split(",")[1];
        padRightFor = instructions.split(",")[2];


        {
             if(instructions.contains("paddingStyle:left")) {
                 paddingStyle = "left";
             }
             if (instructions.contains("paddingStyle:right")){
                 paddingStyle = "right";
             }
        }

        if(paddingStyle== "left")
        {
            blob = "";

            int i=0;
            int j=5;
            for(j=i; i<addLettersFor.length(); i++,j++){
                if(j>=letterss.length-1){
                    j=0;
                }
                 blob=letterss[j] + blob;

            }

                System.err.println("-------------DD-------------");

            for(; i<padRightFor.length(); i++);
                blob = "" + blob;

        } else {

            String blob = "";

            int j=0;
            for(; j<addLettersFor.length(); j++){
                blob=letterss[j] + blob;
            }


            for(; j<padLeftFor.length(); j++);
            blob = blob + "";
        }

    }





    public static void main(String[] args) {
        DataWrapper dataWrapper = new DataWrapper();
        dataWrapper.instruction = INPUT_INSTRUCTION;
        TextBlobGenerator textBlobGenerator = new TextBlobGenerator(dataWrapper);

        System.out.println(textBlobGenerator.getBlob());

    }

}
