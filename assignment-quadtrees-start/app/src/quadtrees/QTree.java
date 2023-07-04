package quadtrees;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class QTree {
	private QuadTreeNode root;

	public QTree(Reader input) {
		root = readQTree(input);
	}

	public QTree(Bitmap bitmap) {
		root = bitmap2QTree(0, 0, bitmap.getWidth(), bitmap);
	}

	public void fillBitmap(Bitmap bitmap) {
		root.fillBitmap(0, 0, bitmap.getWidth(), bitmap);
	}

	public void writeQTree(Writer sb) {
		root.writeNode(sb);
	}

	private static QuadTreeNode readQTree(Reader input) {
		try {
			if (input.read() == '1') {
				return new GreyNode(input);
			} else if (input.read() == '0') {
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

	public static QuadTreeNode bitmap2QTree(int x, int y, int width, Bitmap bitmap) {
		if (bitmap.getBit(0, 0) == false) {
			int counter = 0;
			int i = counter % width;
			int j = counter / width;
			while (bitmap.getBit(i, j) == false) {
				if (i == width -1 && j == width -1) {
					return new BlackLeaf();
				}
				counter++;
			}
			return new GreyNode(x, y, width, bitmap);
		} else {
			int counter = 0;
			int i = counter % width;
			int j = counter / width;
			while (bitmap.getBit(i, j) == true) {
				if (i == width -1 && j == width -1) {
					return new WhiteLeaf();
				}
				counter++;
			}
			return new GreyNode(x, y, width, bitmap);
		}
	}

}
