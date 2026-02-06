package array;

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
        // TODO: Implemente a lógica de navegação. 
        // Lide com caminhos absolutos (começam com /) e relativos.
    }

    public static void main(String[] args) {
        Path path = new Path("/a/b/c/d");
        path.cd("../x");
        System.out.println(path.getPath());
        // Esperado: /a/b/c/x
    }
}