package quadtrees;

import java.io.IOException;
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

    public GreyNode(int x, int y, int width, Bitmap bitmap) {
        this.q1 = QTree.bitmap2QTree(x, y, width/2, bitmap);
        this.q2 = QTree.bitmap2QTree(x + width/2, y, width/2, bitmap);
        this.q3 = QTree.bitmap2QTree(x, y + width/2, width/2, bitmap);
        this.q4 = QTree.bitmap2QTree(x + width/2, y + width/2, width/2, bitmap);
    }
    
    
    private QuadTreeNode readQTree(Reader input) {
        try {
			if (input.read() == '1') {
				return new GreyNode(input);
			} else {
				if (input.read() == '1') {
					return new WhiteLeaf();
				} else {
					return new BlackLeaf();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		throw new IllegalStateException("Invalid input or unexpected condition.");
    }

    @Override
    public void fillBitmap(int x, int y, int width, Bitmap bitmap) {
        q1.fillBitmap(x, y, width/2, bitmap);
        q2.fillBitmap(x + width/2, y, width/2, bitmap);
        q3.fillBitmap(x, y + width/2, width/2, bitmap);
        q4.fillBitmap(x + width/2, y + width/2, width/2, bitmap);
    }

    @Override
    public void writeNode(Writer out) {
        try {
            out.write("1");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        q1.writeNode(out);
        q2.writeNode(out);
        q3.writeNode(out);
        q4.writeNode(out);
    }
    
}
