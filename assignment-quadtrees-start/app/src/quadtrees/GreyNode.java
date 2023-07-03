package quadtrees;

import java.io.Writer;

public class GreyNode implements QuadTreeNode {
    private QuadTreeNode q1;
    private QuadTreeNode q2;
    private QuadTreeNode q3;
    private QuadTreeNode q4;


    public GreyNode(QuadTreeNode q1, QuadTreeNode q2, QuadTreeNode q3, QuadTreeNode q4) {
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
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
