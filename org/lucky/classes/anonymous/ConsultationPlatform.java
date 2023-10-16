package org.lucky.classes.anonymous;

public class ConsultationPlatform {
    public static void main(String[] args) {
        Consultation con = new Test();
        con.feedback();

        Consultation con2 = new Consultation() {
            @Override
            void feedback() {
                feedbackCustom();
                System.out.println("anonymous class feedback");
            }
            public void feedbackCustom() {
                System.out.println("This was an excellent consultation session feedbackCustom!");
            }

        };
        con2.feedback();
        Consultation con3 = new Test();
        con3.feedback();
        ConsultationFeedback cf = new ConsultationFeedback() {
            @Override
            public void provideFeedback() {
                System.out.println("anonymous class provideFeedback from ConsultationFeedback");
            }
        };
        cf.provideFeedback();
A a= new A(){

};
a.add();

    }


}


class Test extends  Consultation{

    /**
     *
     */
    @Override
    void feedback() {
        System.out.println("feedback");
    }

    public void feedbackCustom() {
        System.out.println("This was an excellent consultation session feedbackCustom!");
    }
}

class A{
    void add(){
        System.out.println("add ");
    }
}