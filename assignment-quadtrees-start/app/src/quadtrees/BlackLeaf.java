package quadtrees;

import java.io.IOException;
import java.io.Writer;

public class BlackLeaf implements QuadTreeNode {

    @Override
    public void fillBitmap(int x, int y, int width, Bitmap bitmap) {
        for (int i = x; i < i + width; i++) {
            for (int j = y; y < y + width; y++) {
                bitmap.setBit(i, j, false);
            }
        }
    }

    @Override
    public void writeNode(Writer out) {
        try {
            out.write("00");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
