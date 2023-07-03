package java;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

import org.w3c.dom.Node;

public class case1 {
    final Deque<Node> visiting = new ArrayDeque<>();
    final Deque<Node> visited = new ArrayDeque<>();

    public BreadthFirstTraversal(MethodDeclaration n) {
        super(n);
    }

    public Set<BlockStmt> collectBlockStmts() {
        Set<BlockStmt> res = new HashSet<>();
        visiting.add(n);
        while (!visiting.isEmpty()) {
            Node node = visiting.pop();
            if (node instanceof BlockStmt) {
                res.add((BlockStmt) node);
            }
            node.getChildNodes().forEach(child -> {
//                if (!visited.contains(child)) {
//                    visiting.add(child);
//                }
                if (visited.add(child)) {
                    visiting.add(child);
                }
            });
        }
        return res;
    }

    public Set<IfStmt> collectIfStmts() {
        Set<IfStmt> res = new HashSet<>();
        visiting.add(n);
        while (!visiting.isEmpty()) {
            Node node = visiting.pop();
            if (node instanceof IfStmt) {
                res.add((IfStmt) node);
            }
            node.getChildNodes().forEach(child -> {
//                if (!visited.contains(child)) {
//                    visiting.add(child);
//                }
                if (visited.add(child)) {
                    visiting.add(child);
                }
            });
        }
        return res;
    }
}
