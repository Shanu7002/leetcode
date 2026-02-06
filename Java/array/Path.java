package array;

import java.util.Arrays;
import java.util.Stack;

public class Path {
    private String currentPath;

    public Path(String path) {
        this.currentPath = path;
    }

    public String getPath() {
        return currentPath;
    }

    public void cd(String newPath) {
        if (newPath == null || newPath.isEmpty()) return;

        Stack<String> stack = new Stack<>();

        if(!newPath.startsWith("/")) {
            for (String parts : getPath().split("/")) {
                if(!parts.isEmpty()) {
                    stack.push(parts);
                }
            }
        }

        for (String part : newPath.split("/")) {
            if (part.equals(".") || part.isEmpty()) continue;

            if (part.equals("..")) {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(part);
            }
        }
        this.currentPath = "/" + String.join("/", stack);
    }

    public static void main(String[] args) {
        Path path = new Path("/a/b/c/d");
        path.cd("../x");
        System.out.println(path.getPath());
    }
}