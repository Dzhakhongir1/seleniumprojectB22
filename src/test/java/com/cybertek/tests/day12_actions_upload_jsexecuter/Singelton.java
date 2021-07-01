package com.cybertek.tests.day12_actions_upload_jsexecuter;

/*
We will create similar logic we created in driver utility class
but it will be for String
 */
public class Singelton {
    private Singelton(){}

    private static String word;

    //we allow user to access the word in the way we want them to
    public static String getWord(){
        if (word==null){
            System.out.println("First time call word object is null." +"assighning value to it now ");
            word="something";
        }else {
            System.out.println("Word already has value");
        }
        return word;
    }
}
