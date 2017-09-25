package part3.ex5_3;

import java.util.ArrayList;
public interface Visitor {
    void visit(DataList list, int element);
    void visit(DataMap map, int element);
}
