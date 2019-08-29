package engineering.papers;

/**
 * Created by WSteinle on 08.12.2017.
 */
public abstract class BasicEngineering {
    // Papers() in the template method
    public void Papers() {
        //Common Papers
        Math();
        SoftSkills();
        //Specialized Paper;
        SpecialPaper();
    }

    //Non-Abstract method Math(), SoftSkills(), are already implemented by Template class
    private void Math() {
        System.out.println("Mathematics");
    }

    private void SoftSkills() {
        System.out.println("Softskills");
    }

    //Abstract method SpecialPaper() must be implemented in derived classes
    public abstract void SpecialPaper();
}
