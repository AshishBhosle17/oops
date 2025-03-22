package co_variant;

interface Interviewer {
    default Object submitInterviewStatus() {
        System.out.println("Interviewer:Accept");
        return "Interviewer:Accept";
    }
}

class Manager implements Interviewer {
    @Override
    public String submitInterviewStatus() {
        System.out.println("Manager:Accept");
        return "Manager:Accept";
    }
}

public class Main {
    public static void main(String args[]) {
    	
        Interviewer interviewer = new Manager();
        interviewer.submitInterviewStatus();
        Manager mgr = new Manager();
        mgr.submitInterviewStatus();
    }
}

