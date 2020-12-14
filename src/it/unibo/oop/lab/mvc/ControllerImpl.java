package it.unibo.oop.lab.mvc;

import java.util.ArrayList;
import java.util.List;

public class ControllerImpl implements Controller {

    //private String current;
    private String next;
    private final List<String> history;

    public ControllerImpl() {
        //this.current = null;
        this.next = null;
        this.history = new ArrayList<>();
    }

    @Override
    public void setNextPrint(final String str) throws NullValuesException {
        if (str != null) {
//            if (this.current == null) {
//                this.current = str;
//            } else {
//                this.next = str;
//            }
            this.next = str;
            history.add(str);
        } else {
            throw new NullValuesException();
        }
    }

    @Override
    public String getNextString() {
        return this.next;
    }

    @Override
    public List<String> getHistory() {
        return this.history;
    }

    @Override
    public void printCurrent() {
        if (this.next != null) {
            System.out.println(this.next);
        } else {
            throw new IllegalStateException();
        }
    }

}
