package contextofchoice;

import choices.IChoice;

/**
 * Created by WSteinle on 07.12.2017.
 */
public class Context {
    IChoice myC;
    //Set a Strategy or algorithm in the Context
    public void SetChoice(IChoice ic) {
        myC = ic;
    }
    public void ShowChoice(String s1, String s2) {
        myC.myChoice(s1, s2);
    }
}
