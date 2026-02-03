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
        // TODO: Implemente a lógica de mudança de diretório aqui
        // Dica: Use stack para lidar com '..' e ignore '.'
    }

    public static void main(String[] args) {
        Path path = new Path("/a/b/c/d");
        path.cd("../x");
        System.out.println(path.getPath());
        // Esperado: /a/b/c/x
    }
}