package quadtrees;

import java.io.IOException;
import java.io.Writer;

public class WhiteLeaf implements QuadTreeNode {

    @Override
    public void fillBitmap(int x, int y, int width, Bitmap bitmap) {
        for (int i = x; i < x + width; i++) {
            for (int j = y; j < y + width; j++) {
                bitmap.setBit(i, j, true);
            }
        }
    }

    @Override
    public void writeNode(Writer out) {
        try {
            out.write("01");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
