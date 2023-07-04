package quadtrees;

import java.io.Reader;
import java.io.Writer;

public class GreyNode implements QuadTreeNode {
    private QuadTreeNode q1;
    private QuadTreeNode q2;
    private QuadTreeNode q3;
    private QuadTreeNode q4;


    public GreyNode(Reader input) {
        this.q1 = readQTree(input);
        this.q2 = readQTree(input);
        this.q3 = readQTree(input);
        this.q4 = readQTree(input);
    }


    
    
    private QuadTreeNode readQTree(Reader input) {
        return null;
    }




    @Override
    public void fillBitmap(int x, int y, int width, Bitmap bitmap) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fillBitmap'");
    }

    @Override
    public void writeNode(Writer out) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'writeNode'");
    }
    
}
